-- Câu 1: Tạo cơ sở dữ liệu QLVT gồm 3 bảng. (1.5 điểm)
-- VATTU (MaVT, TenVT, DVTinh)
-- PHIEUXUAT (SoPX, NgayXuat)
-- CTPXUAT(SoPX, MaVT, SLXuat, DonGia)
CREATE DATABASE Shirakami_Fubuki;
USE Shirakami_Fubuki;

CREATE TABLE VATTU
(
    MaVT int not NULL PRIMARY KEY,
    TenVT NVARCHAR(100) not NULL,
    DVTinh NVARCHAR(20) not NULL
)

CREATE TABLE PHIEUXUAT
(
    SoPX int not NULL PRIMARY KEY,
    NgayXuat DATE not NULL
)

CREATE TABLE CTPXUAT
(
    SoPX int not NULL PRIMARY KEY,
    MaVT int not null,
    SLXuat int not NULL,
    DonGia MONEY not NULL
        FOREIGN KEY (SoPX) REFERENCES PHIEUXUAT(SoPX),
    FOREIGN KEY (MaVT) REFERENCES VATTU(MaVT)
)

INSERT VATTU
VALUES
    (1, 'TIVI', 'Cai'),
    (2, 'Tu Lanh', 'Cai'),
    (3, 'Ban', 'Cai')

INSERT PHIEUXUAT
VALUES
    (11, '2023-09-20'),
    (12, '2022-08-20'),
    (13, '2021-07-20')

INSERT CTPXUAT
VALUES
    (11, 1, 1, 9999),
    (12, 2, 2, 9998),
    (13, 3, 1, 9997)


-- Câu 2: Chèn thông tin vào các bảng (3 điểm)
-- - Tạo Stored Procedure (SP) với các tham số đầu vào phù hợp vào bảng VATTU, PHIEUXUAT, CTPXUAT.
-- - Yêu cầu mỗi SP phải kiểm tra tham số đầu vào. Với các cột không chấp nhận thuộc tính Null.
-- - Với mỗi SP viết 3 lời gọi thành công.
GO
CREATE PROC addNow
    @MaVT INT,
    @TenVT NVARCHAR(100),
    @DVTinh NVARCHAR(100)
AS
BEGIN
    IF(@MaVT IS NULL OR @TenVT IS NULL OR @DVTinh IS NULL)
    BEGIN
        PRINT('DIES')
    END
    BEGIN
        INSERT INTO VATTU
            (MaVT, TenVT, DVTinh)
        VALUES
            (@MaVT, @TenVT, @DVTinh)
    END
END

GO
CREATE PROC addNow2
    @SoPX INT,
    @NgayXuat DATE
AS
BEGIN
    IF(@SoPX IS NULL OR @NgayXuat IS NULL)
    BEGIN
        PRINT('Dies2')
    END
    BEGIN
        INSERT INTO PHIEUXUAT
            (SoPX, NgayXuat)
        VALUES
            (@SoPX, @NgayXuat)
    END
END

GO
CREATE PROC addNow3
    @SoPX INT,
    @MaVT int,
    @SLXuat int,
    @DonGIa MONEY
AS
BEGIN
    IF(@SoPX is Null or @MaVT is NULL or @SLXuat is NULL or @DonGIa is null) 
    BEGIN
        PRINT('ngo')
    END

    BEGIN
        INSERT INTO CTPXUAT
            (SoPX, MaVT, SLXuat, DonGia)
        VALUES
            (@SoPX, @MaVT, @SLXuat, @DonGIa)
    END
END

EXEC addNow @MaVT = 4, @TenVT = 'Ngu lon', @DVTinh = '3 que'
EXEC addNow2 14, '2022-09-08'
EXEC addNow3 14, 4, 1, 9990

SELECT *
FROM VATTU;
SELECT *
FROM PHIEUXUAT;
SELECT *
FROM CTPXUAT;

-- Câu 3: Viết hàm các tham số đầu vào tương ứng với các cột của bảng VATTU
-- Hàm này trả về MaVT thỏa mãn các giá trị được truyền tham số. (2 điểm)
GO
CREATE FUNCTION GetMAVT(@TenVT NVARCHAR(100), @DVTinh NVARCHAR(50)) RETURNS INT
AS
BEGIN
    DECLARE @MaVT int
    SELECT @MaVT = MaVT
    FROM VATTU
    WHERE TenVT = @TenVT AND DVTinh = @DVTinh

    RETURN @MaVT
END
GO
SELECT dbo.GetMAVT('Tu lanh', 'Cai');

GO
DROP FUNCTION getMaVT;


-- Câu 4: Tạo View lưu thông tin của TOP 2 phiếu xuất có giá trị lớn nhất,
-- gồm các thông tin sau: MaVT, TenVT, NgayXuat, SLXuat, DonGia, "Gia Tri Max". (1.5 điểm)
GO
CREATE VIEW Top2PhieuXuat AS
SELECT TOP 2 
    v.MaVT,
    v.TenVT,
    p.NgayXuat,
    c.SLXuat,
    c.DonGia,
    c.SLXuat * c.DonGia AS 'Gia Tri Max'
FROM VATTU v
JOIN CTPXUAT c ON v.MaVT = c.MaVT
JOIN PHIEUXUAT p ON c.SoPX = p.SoPX
ORDER BY c.SLXuat * c.DonGia DESC

GO
SELECT * FROM Top2PhieuXuat
DROP VIEW view_Top2;

-- Câu 5: Viết một SP nhận một tham số đầu vào là SLXuat.
-- SP này thực hiện thao tác xóa thông tin vật tư và phiếu xuất tương ứng. (2 điểm)

GO
CREATE PROC sp_Xoa @SLXuat INT
as
BEGIN
  DECLARE @MaVT_temp INT
  DECLARE @SoPX_temp INT

  SELECT @MaVT_temp = MaVT, @SoPX_temp = SoPX FROM CTPXUAT WHERE SLXuat = @SLXuat;
  DELETE CTPXUAT WHERE SLXuat = @SLXuat
  DELETE VATTU WHERE MaVT = @MaVT_temp
  DELETE PHIEUXUAT WHERE SoPX = @SoPX_temp
END

SELECT * FROM CTPXUAT
EXEC sp_Xoa 2

GO
DROP PROC IF EXISTS sp_Xoa;
GO
DROP VIEW IF EXISTS Top2PhieuXuat;
GO
DROP FUNCTION IF EXISTS getMaVT;
GO
DROP TABLE IF EXISTS CTPXUAT;
GO
DROP TABLE IF EXISTS PHIEUXUAT;
GO
DROP TABLE IF EXISTS VATTU;
