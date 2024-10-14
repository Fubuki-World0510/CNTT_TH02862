Create database Spham;
use Spham;

-- Bảng Sản phẩm
CREATE TABLE SanPham (
    MaSP INT PRIMARY KEY,
    TenSP NVARCHAR(100),
    SoLuong INT,
    GiaBan DECIMAL(18, 2)
);

-- Bảng Giỏ hàng
CREATE TABLE GioHang (
    MaGH INT PRIMARY KEY,
    NguoiMua NVARCHAR(100),
    NgayMua DATE
);

-- Bảng Chi tiết giỏ hàng
CREATE TABLE ChiTietGioHang (
    MaGH INT,
    MaSP INT,
    SoLuongMua INT,
    PRIMARY KEY (MaGH, MaSP),
    FOREIGN KEY (MaGH) REFERENCES GioHang(MaGH),
    FOREIGN KEY (MaSP) REFERENCES SanPham(MaSP)
);
-- Insert vào bảng SanPham
INSERT INTO SanPham (MaSP, TenSP, SoLuong, GiaBan) VALUES
(1, 'Sản phẩm A', 50, 200000),
(2, 'Sản phẩm B', 30, 300000),
(3, 'Sản phẩm C', 20, 150000);

-- Insert vào bảng GioHang
INSERT INTO GioHang (MaGH, NguoiMua, NgayMua) VALUES
(1, 'Nguyen Van A', '2024-10-10'),
(2, 'Tran Thi B', '2024-10-11'),
(3, 'Le Van C', '2024-10-12');

-- Insert vào bảng ChiTietGioHang
INSERT INTO ChiTietGioHang (MaGH, MaSP, SoLuongMua) VALUES
(1, 1, 10),
(2, 2, 5),
(3, 3, 8);

BEGIN

--C1
CREATE PROCEDURE sp_InsertSanPham
    @MaSP INT,
    @TenSP NVARCHAR(100),
    @SoLuong INT,
    @GiaBan DECIMAL(18, 2)
AS
BEGIN
    IF EXISTS (SELECT 1 FROM SanPham WHERE MaSP = @MaSP)
    BEGIN
        PRINT 'Sản phẩm đã tồn tại';
    END
    ELSE
    BEGIN
        INSERT INTO SanPham (MaSP, TenSP, SoLuong, GiaBan)
        VALUES (@MaSP, @TenSP, @SoLuong, @GiaBan);
    END
END;
EXEC sp_InsertSanPham 4, 'Sản phẩm D', 40, 250000;
EXEC sp_InsertSanPham 1, 'Sản phẩm A', 50, 200000; -- Đã tồn tại
EXEC sp_InsertSanPham 5, 'Sản phẩm E', 60, 180000;

--C2
CREATE PROCEDURE sp_InsertGioHang
    @MaGH INT,
    @NguoiMua NVARCHAR(100),
    @NgayMua DATE
AS
BEGIN
    INSERT INTO GioHang (MaGH, NguoiMua, NgayMua)
    VALUES (@MaGH, @NguoiMua, @NgayMua);
END;
EXEC sp_InsertGioHang 4, 'Pham Thi D', '2024-10-13';
EXEC sp_InsertGioHang 5, 'Nguyen Van E', '2024-10-14';
EXEC sp_InsertGioHang 6, 'Le Thi F', '2024-10-15';

--C3
CREATE PROCEDURE sp_InsertChiTietGioHang
    @MaGH INT,
    @MaSP INT,
    @SoLuongMua INT
AS
BEGIN
    DECLARE @SoLuongTon INT;
    SELECT @SoLuongTon = SoLuong FROM SanPham WHERE MaSP = @MaSP;

    IF @SoLuongMua > @SoLuongTon
    BEGIN
        PRINT 'Số lượng mua vượt quá số lượng tồn, vui lòng nhập lại';
    END
    ELSE
    BEGIN
        INSERT INTO ChiTietGioHang (MaGH, MaSP, SoLuongMua)
        VALUES (@MaGH, @MaSP, @SoLuongMua);

        -- Cập nhật lại số lượng sản phẩm
        UPDATE SanPham
        SET SoLuong = SoLuong - @SoLuongMua
        WHERE MaSP = @MaSP;
    END
END;
EXEC sp_InsertChiTietGioHang 1, 1, 5;  -- Thành công, cập nhật số lượng
EXEC sp_InsertChiTietGioHang 2, 2, 35; -- Số lượng mua vượt quá
EXEC sp_InsertChiTietGioHang 3, 3, 15; -- Thành công, cập nhật số lượng

--C4
CREATE VIEW vw_SanPhamNhieuLuotMuaNhat AS
SELECT TOP 1 SP.MaSP, SP.TenSP, SUM(CTGH.SoLuongMua) AS TongSoLuongMua
FROM SanPham SP
JOIN ChiTietGioHang CTGH ON SP.MaSP = CTGH.MaSP
GROUP BY SP.MaSP, SP.TenSP
ORDER BY TongSoLuongMua DESC;

Select * from vw_SanPhamNhieuLuotMuaNhat
--C5
CREATE FUNCTION fn_GetSoLuongDaBan
(
    @MaSP INT
)
RETURNS INT
AS
BEGIN
    DECLARE @SoLuongDaBan INT;

    SELECT @SoLuongDaBan = SUM(SoLuongMua)
    FROM ChiTietGioHang
    WHERE MaSP = @MaSP;

    RETURN ISNULL(@SoLuongDaBan, 0);
END;
SELECT dbo.fn_GetSoLuongDaBan(1); -- Số lượng đã bán của sản phẩm 1

--C6
CREATE VIEW vw_ThongTinSanPham AS
SELECT SP.TenSP, CTGH.SoLuongMua, SP.GiaBan, (CTGH.SoLuongMua * SP.GiaBan) AS ThanhTien
FROM SanPham SP
JOIN ChiTietGioHang CTGH ON SP.MaSP = CTGH.MaSP;

Select * from vw_SanPhamNhieuLuotMuaNhat

--C7
CREATE VIEW vw_TopSanPhamSoLuongNhieuNhat AS
SELECT TOP 2 MaSP, TenSP, SoLuong
FROM SanPham
ORDER BY SoLuong DESC;

Select * from vw_TopSanPhamSoLuongNhieuNhat

END