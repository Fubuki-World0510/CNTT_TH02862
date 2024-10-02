create database baiONL2;
use baiONL2;

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

select * from NhanVien;
select * from KhachHang;
select * from SanPham;

--1 Viết câu truy vấn để tách phần họ và phần tên từ cột HoTen trong bảng NhanVien
SELECT HoTen,
LEFT(HoTen, CHARINDEX(' ', HoTen) - 1) AS Ho,
RIGHT(HoTen, LEN(HoTen) - CHARINDEX(' ', HoTen ) ) AS Ten
FROM NhanVien;

--2 Viết câu truy vấn để ghép họ tên và email thành một chuỗi theo định dạng sau: "Họ và tên <email>" cho tất cả các nhân viên trong bảng NhanVien.

SELECT HoTen + ' <' + Email + '>' AS HoTenEmail
FROM NhanVien;


--3 Viết câu truy vấn để đếm số ký tự trong mô tả sản phẩm (MoTaSanPham) của từng sản phẩm trong bảng SanPham   
SELECT TenSanPham,
LEN(CAST(MoTaSanPham AS VARCHAR(MAX))) AS SoKyTuMoTa
FROM SanPham;


--4 Viết câu truy vấn để tìm tất cả các khách hàng có địa chỉ chứa từ "Ha Noi" trong bảng KhachHang.

SELECT * FROM KhachHang
WHERE DiaChi LIKE '%Ha Noi%';


--5 Viết câu truy vấn để chuyển đổi tất cả các tên sản phẩm trong bảng SanPham thành chữ hoa.
SELECT 
UPPER(TenSanPham) AS TenSanPhamHoa
FROM SanPham;


--6 Viết câu truy vấn để thay thế từ "gia re" bằng từ "ưu đãi" trong cột MoTaSanPham của bảng SanPham. 
UPDATE SanPham SET MoTaSanPham = REPLACE(CAST(MoTaSanPham AS VARCHAR(MAX)), 'gia re', 'ưu đãi');
select * from SanPham 



--7 Viết câu truy vấn để trích xuất phần tên miền của email từ cột Email trong bảng NhanVien.
SELECT Email,
SUBSTRING(Email, CHARINDEX('@', Email) + 1, LEN(Email)) AS TenMien
FROM NhanVien;


--8 Viết câu truy vấn để chuyển đổi ngày bắt đầu công việc trong bảng NhanVien thành chuỗi có định dạng "dd-mm-yyyy".
SELECT HoTen,
CONVERT(VARCHAR, NgayBatDau, 105) AS 'NgayBatDau_DD-MM-YYYY'
FROM NhanVien;


--9 Viết câu truy vấn để đếm số từ trong cột MoTaSanPham của bảng SanPham. 
SELECT ID, TenSanPham, MoTaSanPham, 
(LEN(CAST(MoTaSanPham AS VARCHAR(MAX))) - LEN(REPLACE(CAST(MoTaSanPham AS VARCHAR(MAX)), ' ', '')) + 1) AS SoTu
FROM SanPham;


--10 Viết câu truy vấn để tìm tất cả các khách hàng có số điện thoại dài hơn 10 ký tự trong bảng KhachHang.
SELECT * FROM KhachHang WHERE LEN(SoDienThoai) > 10;