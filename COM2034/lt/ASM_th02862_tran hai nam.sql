CREATE DATABASE QLNHATRO_TH02862;
USE QLNHATRO_TH02862;

CREATE TABLE LOAINHA
(
    canHo NVARCHAR(100) not NULL,
    maCanHo int not NULL PRIMARY KEY,
)

CREATE TABLE NGUOIDUNG
(
    UserID int not NULL PRIMARY KEY,
    UserName NVARCHAR(100) not NULL,
    GioiTinh NVARCHAR(100),
    SDT NVARCHAR(100) NOT NULL,
    DiaChi NVARCHAR(100) not NULL,
    Quan NVARCHAR(100) not NULL,
    Email NVARCHAR(100) not NULL
)

CREATE TABLE NHATRO
(
    NhaTroID int not null PRIMARY KEY,
    LoaiHinh int not NULL,
    DienTich FLOAT not NULL,
    Gia int not NULL,
    Quan NVARCHAR(100) not NULL,
    MoTa NVARCHAR(200),
    NgayDang DATE not NULL,
    NguoiLienHe int not NULL,
    FOREIGN KEY (LoaiHinh) REFERENCES LOAINHA(maCanHo),
    FOREIGN KEY (NguoiLienHe) REFERENCES NGUOIDUNG(UserID)
)

CREATE TABLE DANHGIA
(
    NguoiDanhGia int not NULL PRIMARY KEY,
    RateNhaTro NVARCHAR(20) NOT NULL,
    NhaTro int not null,
    FOREIGN KEY(NhaTro) REFERENCES NHATRO(NhaTroID)
);


INSERT INTO LOAINHA
    (canHo, maCanHo)
VALUES
    (N'Căn hộ chung cư', 211),
    (N'Nhà riêng', 212),
    (N'Phòng trọ', 213);


INSERT INTO NGUOIDUNG
    (UserID, UserName, GioiTinh, SDT, DiaChi, Quan, Email)
VALUES
    (11, N'Nguyễn Văn A', N'Nam', '0901234567', N'123 Đường ABC', N'Quận 1', 'nguyenvana@email.com'),
    (12, N'Trần Thị B', N'Nữ', '0912345678', N'456 Đường XYZ', N'Quận 2', 'tranthib@email.com'),
    (13, N'Lê Văn C', N'Nam', '0923456789', N'789 Đường DEF', N'Quận 3', 'levanc@email.com'),
    (14, N'Phạm Thị D', N'Nữ', '0934567890', N'101 Đường GHI', N'Quận 4', 'phamthid@email.com'),
    (15, N'Hoàng Văn E', N'Nam', '0945678901', N'202 Đường JKL', N'Quận 5', 'hoangvane@email.com'),
    (16, N'Ngô Thị F', N'Nữ', '0956789012', N'303 Đường MNO', N'Quận 6', 'ngothif@email.com'),
    (17, N'Đặng Văn G', N'Nam', '0967890123', N'404 Đường PQR', N'Quận 7', 'dangvang@email.com'),
    (18, N'Vũ Thị H', N'Nữ', '0978901234', N'505 Đường STU', N'Quận 8', 'vuthih@email.com'),
    (19, N'Bùi Văn I', N'Nam', '0989012345', N'606 Đường VWX', N'Quận 9', 'buivani@email.com'),
    (111, N'Đỗ Thị K', N'Nữ', '0990123456', N'707 Đường YZA', N'Quận 10', 'dothik@email.com');


INSERT INTO NHATRO
    (NhaTroID, LoaiHinh, DienTich, Gia, Quan, MoTa, NgayDang, NguoiLienHe)
VALUES
    (1, 211, 50.5, 5000000, N'Quận 1', N'Phòng trọ view đẹp', '2023-01-15', 11),
    (2, 212, 80.0, 8000000, N'Quận 2', N'Phòng trọ yên tĩnh, gần trường học', '2023-02-20', 12),
    (3, 213, 20.0, 2000000, N'Quận 3', N'Phòng trọ tiện nghi, gần chợ', '2023-03-10', 13),
    (4, 211, 60.0, 6000000, N'Quận 4', N'Phòng trọ cao cấp, full nội thất', '2023-04-05', 14),
    (5, 212, 100.0, 10000000, N'Quận 5', N'Phòng trọ rộng rãi, có sân vườn', '2023-05-12', 15),
    (6, 213, 25.0, 2500000, N'Quận 6', N'Phòng trọ mới sửa, an ninh tốt', '2023-06-18', 16),
    (7, 211, 55.0, 5500000, N'Quận 7', N'Phòng trọ 1mm full function', '2023-07-22', 17),
    (8, 212, 90.0, 9000000, N'Quận 8', N'Phòng trọ 1cm có giường ngủ nhà bếp', '2023-08-30', 18),
    (9, 213, 22.0, 2200000, N'Quận 9', N'Phòng trọ gần khu công nghiệp', '2023-09-14', 19),
    (10, 211, 65.0, 6500000, N'Quận 10', N'Phòng trọ có gái alimi', '2023-10-25', 111);


INSERT INTO DANHGIA
    (NguoiDanhGia, RateNhaTro, NhaTro)
VALUES
    (11, N'LIKE', 1),
    (12, N'LIKE', 2),
    (13, N'LIKE', 3),
    (14, N'DISLIKE', 4),
    (15, N'LIKE', 5),
    (16, N'LIKE', 6),
    (17, N'LIKE', 7),
    (18, N'DISLIKE', 8),
    (19, N'LIKE', 9),
    (111, N'LIKE', 10);


SELECT *
FROM LOAINHA;
SELECT *
FROM NGUOIDUNG;
SELECT *
FROM NHATRO;
SELECT *
FROM DANHGIA;


-- y3.1
GO
CREATE PROCEDURE sp_NhaTro
    @NhaTroID int,
    @LoaiHinh int,
    @DienTich FLOAT,
    @Gia int,
    @Quan NVARCHAR(100),
    @MoTa NVARCHAR(200),
    @NgayDang DATE,
    @NguoiLienHe int
AS
BEGIN
    IF (
        @NhaTroID IS NULL OR
        @LoaiHinh IS NULL OR
        @DienTich IS NULL OR
        @Gia IS NULL OR
        @Quan IS NULL OR
        @NgayDang IS NULL OR
        @NguoiLienHe IS NULL
        )
    BEGIN
        PRINT 'Các thông tin cần nhập là BẮT BUỘC';
    END
    ELSE
    BEGIN
        INSERT INTO NHATRO
            (NhaTroID, LoaiHinh, DienTich, Gia, Quan, MoTa, NgayDang, NguoiLienHe)
        VALUES
            (@NhaTroID, @LoaiHinh, @DienTich, @Gia, @Quan, @MoTa, @NgayDang, @NguoiLienHe);
        PRINT N'Đã thêm dữ liệu';
    END
END
GO

GO
CREATE PROCEDURE sp_DanhGia
    @NguoiDanhGia int,
    @RateNhaTro NVARCHAR(20)
AS
BEGIN
    IF (
        @NguoiDanhGia IS NULL OR
        @RateNhaTro IS NULL
        )
    BEGIN
        PRINT 'Các thông tin cần nhập là BẮT BUỘC';
    END
    ELSE
    BEGIN
        INSERT INTO DANHGIA
            (NguoiDanhGia, RateNhaTro)
        VALUES
            (@NguoiDanhGia, @RateNhaTro);
        PRINT N'Đã thêm dữ liệu';
    END
END
GO

CREATE PROCEDURE sp_ThemNguoiDung
    @UserID INT,
    @UserName NVARCHAR(50),
    @GioiTinh NVARCHAR(10),
    @SDT VARCHAR(15),
    @DiaChi NVARCHAR(100),
    @Quan NVARCHAR(50),
    @Email VARCHAR(50)
AS
BEGIN
    IF (
        @UserName IS NULL OR
        @SDT IS NULL OR
        @DiaChi IS NULL OR
        @Quan IS NULL OR
        @Email IS NULL
        )
    BEGIN
        PRINT 'Các thông tin cần nhập là BẮT BUỘC';
    END
    ELSE
    BEGIN
        INSERT INTO NGUOIDUNG
            (UserID, UserName, GioiTinh, SDT, DiaChi, Quan, Email)
        VALUES
            (@UserID, @UserName, @GioiTinh, @SDT, @DiaChi, @Quan, @Email);
        PRINT N'Đã thêm dữ liệu';
    END
END
GO

EXEC sp_ThemNguoiDung 
    @UserID = 11,
    @UserName = N'Nguyễn Thị L', 
    @GioiTinh = N'Nữ', 
    @SDT = '0901234567', 
    @DiaChi = N'808 Đường BCD', 
    @Quan = N'Quận 11', 
    @Email = 'nguyenthil@email.com'

EXEC sp_NhaTro
    @NhaTroID = 9,
    @LoaiHinh = 2,
    @DienTich = 50.5,
    @Gia = 5000000,
    @Quan = N'Quận 1',
    @MoTa = N'Nhà trọ tiện nghi, gần trung tâm',
    @NgayDang = '2023-06-15',
    @NguoiLienHe = 11

EXEC sp_DanhGia
    @NguoiDanhGia = 11,
    @RateNhaTro = N'LIKE'

-- END SCRIPT

-- y3.2
-- A [=========================]
-- Chịu thua

-- C [=========================]
GO
CREATE FUNCTION SomeLike (@NhaTroID INT)
RETURNS TABLE
AS
RETURN (
    SELECT
    SUM(CASE WHEN RateNhaTro = N'LIKE' THEN 1 ELSE 0 END) AS TongLike,
    SUM(CASE WHEN RateNhaTro = N'DISLIKE' THEN 1 ELSE 0 END) AS TongDislike
FROM DANHGIA INNER JOIN NHATRO ON NHATRO.NhaTroID = NhaTroID
);
GO


DECLARE @NhaTroID INT = 1;
SELECT *
FROM SomeLike(@NhaTroID);

-- B [=========================]
GO
CREATE FUNCTION FindNguoiDung
(
    @UserID INT = NULL,
    @UserName NVARCHAR(100) = NULL,
    @GioiTinh NVARCHAR(100) = NULL,
    @SDT NVARCHAR(100) = NULL,
    @DiaChi NVARCHAR(100) = NULL,
    @Quan NVARCHAR(100) = NULL,
    @Email NVARCHAR(100) = NULL
)
RETURNS INT
AS
BEGIN
    DECLARE @MaNguoiDung INT;

    SELECT @MaNguoiDung = UserID
    FROM NGUOIDUNG
    WHERE (@UserID IS NULL OR UserID = @UserID)
        AND (@UserName IS NULL OR UserName = @UserName)
        AND (@GioiTinh IS NULL OR GioiTinh = @GioiTinh)
        AND (@SDT IS NULL OR SDT = @SDT)
        AND (@DiaChi IS NULL OR DiaChi = @DiaChi)
        AND (@Quan IS NULL OR Quan = @Quan)
        AND (@Email IS NULL OR Email = @Email);

    RETURN @MaNguoiDung;
END;
GO

-- E [=========================]
GO
CREATE PROCEDURE sp_ThongTinDanhGiaNhaTro
    @MaNhaTro INT
AS
BEGIN
    SELECT
        NT.NhaTroID AS MaNhaTro,
        ND.UserName AS TenNguoiDanhGia,
        DG.RateNhaTro AS TrangThaiDanhGia,
        NT.MoTa AS NoiDungDanhGia
    FROM NHATRO NT
        INNER JOIN DANHGIA DG ON NT.NhaTroID = DG.NhaTro
        INNER JOIN NGUOIDUNG ND ON DG.NguoiDanhGia = ND.UserID
    WHERE NT.NhaTroID = @MaNhaTro
END
GO

EXEC sp_ThongTinDanhGiaNhaTro @MaNhaTro = 1;

-- D [=========================]
GO
CREATE VIEW Top96NhaTro
AS
    SELECT TOP 10
        NT.DienTich,
        NT.Gia AS GiaPhong,
        NT.MoTa AS MoTaPhong,
        NT.NgayDang,
        ND.UserName AS TenNguoiLienHe,
        ND.DiaChi,
        ND.SDT AS DienThoai,
        ND.Email,
        COUNT(DG.NguoiDanhGia) AS SoLuongLike
    FROM NHATRO NT
        INNER JOIN NGUOIDUNG ND ON NT.NguoiLienHe = ND.UserID
        INNER JOIN DANHGIA DG ON NT.NhaTroID = DG.NhaTro
    WHERE DG.RateNhaTro = 'LIKE'
    GROUP BY NT.NhaTroID, NT.DienTich, NT.Gia, NT.MoTa, NT.NgayDang, ND.UserName, ND.DiaChi, ND.SDT, ND.Email
    ORDER BY SoLuongLike DESC;
GO

SELECT *
FROM Top96NhaTro;

-- Y3.3.1
GO
CREATE PROCEDURE sp_XoaMeDi
    @SoLuongDISLIKE INT
AS
BEGIN
    BEGIN TRY
        CREATE TABLE #NhaTroCanXoa
    (NhaTroID INT)
        INSERT INTO #NhaTroCanXoa
        (NhaTroID)
    SELECT NT.NhaTroID
    FROM NHATRO NT
        INNER JOIN DANHGIA DG ON NT.NhaTroID = DG.NhaTro
    WHERE DG.RateNhaTro = 'DISLIKE'
    GROUP BY NT.NhaTroID
    HAVING COUNT(*) > @SoLuongDISLIKE

        DELETE FROM DANHGIA
        WHERE NhaTro IN (SELECT NhaTroID
    FROM #NhaTroCanXoa)

        DELETE FROM NHATRO
        WHERE NhaTroID IN (SELECT NhaTroID
    FROM #NhaTroCanXoa)

        DROP TABLE #NhaTroCanXoa

        PRINT N'Xóa thành CÔNG bác ... ->' + CAST(@SoLuongDISLIKE AS NVARCHAR(10))
    END TRY
    BEGIN CATCH
        PRINT N'Lúc nào cũng lỗi thôi ...'
        PRINT ERROR_MESSAGE()
    END CATCH
END
GO

EXEC sp_XoaMeDi @SoLuongDISLIKE = 5;
-- Y3.3.2
GO
CREATE PROCEDURE sp_NhaTroThoiGianTroiDi
    @NgayBatDau DATE,
    @NgayKetThuc DATE
AS
BEGIN
    SET NOCOUNT ON;
    BEGIN TRY
        DELETE FROM DANHGIA
        WHERE NhaTro IN (
            SELECT NhaTroID
    FROM NHATRO
    WHERE NgayDang BETWEEN @NgayBatDau AND @NgayKetThuc
        );

        DELETE FROM NHATRO
        WHERE NgayDang BETWEEN @NgayBatDau AND @NgayKetThuc;

        PRINT N'Xóa các nhà trọ và đánh giá trong khoảng thời gian từ ' + 
              CONVERT(NVARCHAR, @NgayBatDau, 103) + N' đến ' + CONVERT(NVARCHAR, @NgayKetThuc, 103);
    END TRY
    BEGIN CATCH
        PRINT N'Lúc nào cũng lỗi thôi:';
    END CATCH
END
GO

EXEC sp_NhaTroThoiGianTroiDi @NgayBatDau = '2023-01-01', @NgayKetThuc = '2023-12-31';


DROP PROCEDURE sp_ThemNguoiDung;
DROP PROCEDURE sp_NhaTro;
DROP PROCEDURE sp_XoaMeDi;
DROP PROCEDURE sp_NhaTroThoiGianTroiDi;

DROP TABLE DANHGIA;
DROP TABLE NHATRO;
DROP TABLE NGUOIDUNG;
DROP TABLE LOAINHA;


-- ===== LOGIN =====
CREATE LOGIN PassDbbr WITH PASSWORD = '1tthaamn';
CREATE LOGIN PassDeptrai WITH PASSWORD = 'doanvantay7';
CREATE USER UserDbbr FOR LOGIN PassDbbr
CREATE USER MEMBER FOR LOGIN PassDeptrai

-- Full quyền user nhé ...//
ALTER ROLE db_owner ADD MEMBER UserDbbr;

-- Chỉ quyền thao tác bảng và Stored Procedure, thật ko ..., k bt
GRANT SELECT, INSERT, UPDATE, DELETE ON SCHEMA::dbo TO MEMBER;
GRANT EXECUTE ON SCHEMA::dbo TO MEMBER;