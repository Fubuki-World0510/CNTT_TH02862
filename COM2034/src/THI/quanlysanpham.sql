CREATE Database QuanLyNhanVien;
USE QuanLyNhanVien

-- Bảng NhanVien
CREATE TABLE NhanVien (
    ID INT PRIMARY KEY,
    HoTen VARCHAR(255),
    Email VARCHAR(255),
    Luong DECIMAL(10, 2),
    NgayBatDau DATE
);

-- Bảng KhachHang
CREATE TABLE KhachHang (
    ID INT PRIMARY KEY,
    HoTen VARCHAR(255),
    SoDienThoai VARCHAR(20),
    DiaChi TEXT,
    NgayDangKy DATE
);

-- Bảng SanPham
CREATE TABLE SanPham (
    ID INT PRIMARY KEY,
    TenSanPham VARCHAR(255),
    MoTaSanPham TEXT,
    Gia DECIMAL(10, 2)
);

-- Dữ liệu mẫu cho bảng NhanVien
INSERT INTO NhanVien (ID, HoTen, Email, Luong, NgayBatDau) VALUES 
(1, 'Nguyen Van A', 'nguyenvana@gmail.com', 1000.00, '2023-01-01'),
(2, 'Tran Thi B', 'tranthib@yahoo.com', 1200.00, '2022-05-15'),
(3, 'Le Van C', 'levanc@oldmail.com', 1100.00, '2023-03-10'),
(4, 'Pham Thi D', 'phamthid@oldmail.com', 1050.00, '2021-11-20'),
(5, 'Hoang Van E', 'hoangvane@gmail.com', 1250.00, '2022-07-05');

-- Dữ liệu mẫu cho bảng KhachHang
INSERT INTO KhachHang (ID, HoTen, SoDienThoai, DiaChi, NgayDangKy) VALUES 
(1, 'Nguyen Van F', '0901234567', '123 Phan Chu Trinh, Ha Noi', '2023-09-01'),
(2, 'Tran Thi G', '0912233445', '456 Tran Hung Dao, Ho Chi Minh', '2022-12-10'),
(3, 'Le Van H', '0909876543', '789 Ly Tu Trong, Da Nang', '2023-05-20'),
(4, 'Pham Thi I', '0932456789', '12 Hai Ba Trung, Hue', '2023-08-15'),
(5, 'Hoang Van J', '0923456789', '34 Nguyen Trai, Hai Phong', '2022-11-25');

-- Dữ liệu mẫu cho bảng SanPham
INSERT INTO SanPham (ID, TenSanPham, MoTaSanPham, Gia) VALUES 
(1, 'Ban', 'Ban gia re, chất lượng cao', 500.00),
(2, 'Ghe', 'Ghế gỗ bền đẹp', 300.00),
(3, 'Tu', 'Tủ gỗ tự nhiên', 700.00),
(4, 'Giường', 'Giường sắt chắc chắn', 900.00),
(5, 'Tủ lạnh', 'Tủ lạnh 2 cửa, tiết kiệm điện', 1500.00);

SELECT * FROM NhanVien
SELECT * FROM KhachHang
SELECT * FROM SanPham

--1 
SELECT
LEFT(HoTen, CHARINDEX(' ', HoTen) - 1) as Ho,
RIGHT(HoTen, LEN(HoTen) - CHARINDEX(' ', HoTen)) as Ten
FROM NhanVien

--2
SELECT
CONCAT(HoTen, '-', Email) as HoTenVaEmail
FROM NhanVien;

--3 
SELECT ID, LEN(CAST(MoTaSanPham AS varchar(max))) as Dem_ky_tu
FROM SanPham

--4
SELECT * FROM KhachHang
WHERE DiaChi LIKE '%Ha Noi'

--5
SELECT UPPER(TenSanPham) as VanLaNoNhungChuHoa
FROM SanPham;

--6
UPDATE SanPham
SET MoTaSanPham = CAST(REPLACE(CAST(MoTaSanPham AS VARCHAR(MAX)), 'gia re', 'uu dai') AS TEXT)
SELECT * FROM SanPham

--7
SELECT SUBSTRING(Email, CHARINDEX('@', Email) + 1, LEN(Email)) as Mien
FROM NhanVien

--8
SELECT CONVERT(VARCHAR(10), NgayBatDau, 103) as DinhDang
FROM NhanVien

--10
SELECT * FROM KhachHang WHERE LEN(SoDienThoai) > 10