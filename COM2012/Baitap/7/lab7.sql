CREATE DATABASE Quanlybanhang;
USE Quanlybanhang;

Drop table [HoaDonChiTiet]
go
Drop table [HoaDon]
go
Drop table [SanPham]
go
Drop table [KhachHang]
go

CREATE TABLE [KhachHang] (
    [maKhachHang] CHAR(5) NOT NULL,
    [hoVaTenLot] NVARCHAR(50) NULL,
    [Ten] NVARCHAR(50) NULL,
    [diaChi] NVARCHAR(255) NULL,
    [Email] VARCHAR(50) NULL,
    [dienThoai] VARCHAR(13) NULL,
    PRIMARY KEY ([maKhachHang])
);

INSERT INTO KhachHang VALUES
('KH001', N'Nguyễn Thị', N'Nga', N'15 Quang Trung TP Đà Nẵng', 'ngant@gmail.com', '0912345670'),
('KH002', N'Trần Công', N'Thành', N'234 Lê Lợi Quảng Nam', 'thanhtc@gmail.com', '16109423443'),
('KH003', N'Lê Hoàng', N'Nam', N'23 Trần Phú TP Huế', 'namlt@yahoo.com', '0989354556'),
('KH004', N'Vũ Ngọc', N'Hiền', N'37 Nguyễn Thị Thập TP Đà Nẵng', 'hienvn@gmail.com', '0894545435');

CREATE TABLE [SanPham] (
    [maSanPham] INT NOT NULL,
    [moTa] NVARCHAR(255) NULL,
    [soLuong] INT NULL,
    [donGia] MONEY NULL,
    [tenSP] NVARCHAR(50) NULL,
    PRIMARY KEY ([maSanPham])
);

INSERT INTO SanPham VALUES
(1, N'Samsung Galaxy J7 Pro là một chiếc smartphone phù hợp với những người yêu thích một sản phẩm pin tốt, thích hệ điều hành mới cùng những tính năng đi kèm độc quyền', 800, 6600000, N'Samsung Galaxy J7 Pro'),
(2, N'iPhone 6 là một trong những smartphone được yêu thích nhất. Lắng nghe nhu cầu về thiết kế, khả năng lưu trữ và giá cả, iPhone 6 32GB được chính thức phân phối chính hãng tại Việt Nam hứa hẹn sẽ là một sản phẩm rất "Hot"', 500, 8990000, N'iphone 6 32GB'),
(3, N'Dell Inspiron 3467 i3 7100U/4GB/1TB/Win10/(M20NR21)', 507, 11290000, N'Laptop Dell Inspiron 3467'),
(4, N'Pin sạc dự phòng Polymer 5.000mAh eSaver JP85', 600, 200000, N'Pin sạc dự phòng'),
(5, N'Nokia 3100 phù hợp với SINH VIÊN', 100, 700000, N'Nokia 3100');

CREATE TABLE [HoaDon] (
    [maHoaDon] INT NOT NULL,
    [maKhachHang] CHAR(5) NOT NULL,
    [ngayMuaHang] DATETIME NULL,
    [trangThai] NVARCHAR(30) NULL,
    PRIMARY KEY ([maHoaDon])
);

INSERT INTO HoaDon ([maHoaDon], [maKhachHang], [ngayMuaHang], [trangThai]) VALUES
(120954, 'KH001', '2016-03-23', N'Đã thanh toán'),
(120955, 'KH002', '2016-04-02', N'Đã thanh toán'),
(120956, 'KH001', '2016-07-12', N'chưa thanh toán'),
(125957, 'KH004', '2016-12-04', N'chưa thanh toán');

CREATE TABLE [HoaDonChiTiet] (
    [maHoaDonChiTiet] INT NOT NULL,
    [maHoaDon] INT NOT NULL,
    [maSanPham] INT NOT NULL,
    [soLuong] INT NULL,
    PRIMARY KEY ([maHoaDonChiTiet])
);

INSERT INTO HoaDonChiTiet ([maHoaDonChiTiet], [maHoaDon], [maSanPham], [soLuong]) VALUES
(1, 120954, 3, 40),
(2, 120954, 1, 20),
(3, 120955, 2, 100),
(4, 120956, 4, 6),
(5, 120956, 2, 60),
(6, 120956, 1, 10),
(7, 125957, 2, 50);

SELECT * FROM KhachHang;
SELECT * FROM SanPham;
SELECT * FROM HoaDon;
SELECT * FROM HoaDonChiTiet;

-- Phần 2

-- 1
SELECT HoaDon.maHoaDon, HoaDon.maKhachHang, HoaDon.trangThai, HoaDonChiTiet.maSanPham, HoaDonChiTiet.soLuong, HoaDon.ngayMuaHang
FROM HoaDon
JOIN HoaDonChiTiet ON HoaDon.maHoaDon = HoaDonChiTiet.maHoaDon;

-- 2
SELECT HoaDon.maHoaDon, HoaDon.maKhachHang, HoaDon.trangThai, HoaDonChiTiet.maSanPham, HoaDonChiTiet.soLuong, HoaDon.ngayMuaHang
FROM HoaDon
JOIN HoaDonChiTiet ON HoaDon.maHoaDon = HoaDonChiTiet.maHoaDon
WHERE HoaDon.maKhachHang = 'KH001';

-- 3
SELECT HoaDon.maHoaDon, HoaDon.ngayMuaHang, SanPham.tenSP, SanPham.donGia, HoaDonChiTiet.soLuong, 
(SanPham.donGia * HoaDonChiTiet.soLuong) AS thanhTien
FROM HoaDon
JOIN HoaDonChiTiet ON HoaDon.maHoaDon = HoaDonChiTiet.maHoaDon
JOIN SanPham ON HoaDonChiTiet.maSanPham = SanPham.maSanPham;

-- 4
SELECT KhachHang.hoVaTenLot + ' ' + KhachHang.Ten AS hoVaTen, KhachHang.Email, KhachHang.dienThoai, HoaDon.maHoaDon, HoaDon.trangThai, SUM(SanPham.donGia * HoaDonChiTiet.soLuong) AS tongTien
FROM KhachHang
JOIN HoaDon ON KhachHang.maKhachHang = HoaDon.maKhachHang
JOIN HoaDonChiTiet ON HoaDon.maHoaDon = HoaDonChiTiet.maHoaDon
JOIN SanPham ON HoaDonChiTiet.maSanPham = SanPham.maSanPham
WHERE HoaDon.trangThai = N'chưa thanh toán'
GROUP BY KhachHang.hoVaTenLot + ' ' + KhachHang.Ten, KhachHang.Email, KhachHang.dienThoai, HoaDon.maHoaDon, HoaDon.trangThai;

-- 5
SELECT HoaDon.maHoaDon, HoaDon.ngayMuaHang, 
SUM(SanPham.donGia * HoaDonChiTiet.soLuong) AS TongTien
FROM HoaDon
JOIN HoaDonChiTiet ON HoaDon.maHoaDon = HoaDonChiTiet.maHoaDon
JOIN SanPham ON HoaDonChiTiet.maSanPham = SanPham.maSanPham
GROUP BY HoaDon.maHoaDon, HoaDon.ngayMuaHang
HAVING SUM(SanPham.donGia * HoaDonChiTiet.soLuong) >= 500000
ORDER BY TongTien DESC;

-- Phần 2

-- 1
SELECT KhachHang.maKhachHang, KhachHang.hoVaTenLot + ' ' + KhachHang.Ten AS hoVaTen, KhachHang.diaChi, KhachHang.Email, KhachHang.dienThoai
FROM KhachHang
LEFT JOIN HoaDon ON KhachHang.maKhachHang = HoaDon.maKhachHang AND HoaDon.ngayMuaHang >= '2016-01-01'
WHERE HoaDon.maHoaDon IS NULL;

-- 2
SELECT TOP 1 SanPham.maSanPham, SanPham.tenSP, SUM(HoaDonChiTiet.soLuong) AS MuaNhieuNhat
FROM HoaDon
JOIN HoaDonChiTiet ON HoaDon.maHoaDon = HoaDonChiTiet.maHoaDon
JOIN SanPham ON HoaDonChiTiet.maSanPham = SanPham.maSanPham
WHERE YEAR(HoaDon.ngayMuaHang) = 2016 AND MONTH(HoaDon.ngayMuaHang) = 12
GROUP BY SanPham.maSanPham, SanPham.tenSP
ORDER BY MuaNhieuNhat DESC;

-- 3
SELECT TOP 5 KhachHang.maKhachHang, KhachHang.hoVaTenLot + ' ' + KhachHang.Ten AS hoVaTen, KhachHang.diaChi, KhachHang.Email, KhachHang.dienThoai, 
SUM(SanPham.donGia * HoaDonChiTiet.soLuong) AS TongTien
FROM KhachHang
JOIN HoaDon ON KhachHang.maKhachHang = HoaDon.maKhachHang
JOIN HoaDonChiTiet ON HoaDon.maHoaDon = HoaDonChiTiet.maHoaDon
JOIN SanPham ON HoaDonChiTiet.maSanPham = SanPham.maSanPham
WHERE YEAR(HoaDon.ngayMuaHang) = 2016
GROUP BY KhachHang.maKhachHang, KhachHang.hoVaTenLot, KhachHang.Ten, KhachHang.diaChi, KhachHang.Email, KhachHang.dienThoai
ORDER BY TongTien DESC;

-- 4
SELECT KhachHang.maKhachHang, KhachHang.hoVaTenLot + ' ' + KhachHang.Ten AS hoVaTen, KhachHang.diaChi, KhachHang.Email, KhachHang.dienThoai
FROM KhachHang
JOIN HoaDon ON KhachHang.maKhachHang = HoaDon.maKhachHang
JOIN HoaDonChiTiet ON HoaDon.maHoaDon = HoaDonChiTiet.maHoaDon
JOIN SanPham ON HoaDonChiTiet.maSanPham = SanPham.maSanPham
WHERE KhachHang.diaChi LIKE '%Đà Nẵng%' AND SanPham.tenSP = N'iphone 6 32GB'
AND HoaDon.ngayMuaHang = '2016-12-31';

-- 5
SELECT SanPham.tenSP
FROM SanPham
JOIN HoaDonChiTiet ON SanPham.maSanPham = HoaDonChiTiet.maSanPham
GROUP BY SanPham.tenSP
HAVING SUM(HoaDonChiTiet.soLuong) < (SELECT AVG(totalQuantity) FROM (SELECT SUM(soLuong) AS totalQuantity FROM HoaDonChiTiet GROUP BY maSanPham) AS SubQuery);



-- PHẦN 1: LAB 8

-- a
CREATE UNIQUE INDEX idx_KhachHang_dienThoai
ON KhachHang (dienThoai);
-- b
CREATE UNIQUE INDEX idx_KhachHang_Email
ON KhachHang (Email);

-- PHẦN 2: LAB 8
BACKUP DATABASE QuanLyBanHang
TO DISK = 'D:\Real\FTW\Backup\QuanLyBanHang.bak'
WITH FORMAT, MEDIANAME = 'Z_SQLServerBackups',
NAME = 'Full Backup of QuanLyBanHang';