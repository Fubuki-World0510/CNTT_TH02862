create database SU23_COM2034_TH02862;
use SU23_COM2034_TH02862;

create table SanPham(
    MaSanPham int not null PRIMARY KEY,
    TenSanPham nchar(20) not null,
    GiaHienHanh int not NULL,
    SoLuongTon int not NULL
)

CREATE TABLE HoaDon(
    MaHoaDon nchar(10) NOT NULL PRIMARY KEY,
    NgayLap date NOT NULL,
    SoDienThoai nchar(10)
)

CREATE TABLE HoaDonChiTiet(
    MaSanPham int not NULL,
    MaHoaDon nchar(10) not NULL,
    SoLuongMua int,
    GiaMua int,
    PRIMARY KEY(MaSanPham, MaHoaDon),
    FOREIGN KEY(MaSanPham) REFERENCES SanPham(MaSanPham),
    FOREIGN KEY(MaHoaDon) REFERENCES HoaDon(MaHoaDon),
)

INSERT INTO SanPham VALUES
(1, N'Dầu gội', 39000, 10),
(2, N'Giấy vệ sinh', 10000, 20),
(3, N'Chuột Logitech G102', 500000, 5),
(4, N'Pad chuột razer', 50000, 0)

INSERT INTO HoaDon VALUES 
('HD01', '2024-09-12', null),
('HD02', '2024-07-23', '1234557687'),
('HD03', '2024-09-10', '1232434323')

INSERT INTO HoaDonChiTiet VALUES
(1, 'HD03', 10, 39000),
(2, 'HD01', 4, 10000),
(3, 'HD02', 2, 500000)

SELECT * FROM SanPham
SELECT * FROM HoaDon
SELECT * FROM HoaDonChiTiet

-- b3:
SELECT TenSanPham, GiaHienHanh
FROM SanPham

-- b4:
SELECT * FROM HoaDon WHERE SoDienThoai is NULL

-- b5:
SELECT * FROM SanPham
UPDATE SanPham
SET SoLuongTon = 10
WHERE MaSanPham = 3
SELECT * FROM SanPham

-- b6:
SELECT * FROM SanPham
DELETE FROM SanPham WHERE SoLuongTon = 0;
SELECT * FROM SanPham

-- b7:
-- Hiển thị: MaHoaDon, TenSanPham, SoLuongMua, GiaMua, ThanhTien
-- Từ database: HoaDonChiTiet(SoluongMua, GiaMua), SanPham(TenSanPham), HoaDon(MaHoaDon)
SELECT HoaDon.MaHoaDon, HoaDonChiTiet.SoLuongMua, HoaDonChiTiet.GiaMua, SanPham.TenSanPham, HoaDonChiTiet.SoLuongMua * HoaDonChiTiet.GiaMua AS ThanhTien
FROM HoaDonChiTiet 
INNER JOIN HoaDon ON HoaDonChiTiet.MaHoaDon = HoaDon.MaHoaDon
INNER JOIN SanPham ON SanPham.MaSanPham = HoaDonChiTiet.MaSanPham


DELETE FROM SanPham;
DELETE FROM HoaDon;
DELETE FROM HoaDonChiTiet;

DROP TABLE SanPham;
DROP TABLE HoaDon;
DROP TABLE HoaDonChiTiet;