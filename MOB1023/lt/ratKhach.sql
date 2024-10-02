CREATE DATABASE KhachHangOK;
USE KhachHangOK;

-- Tạo bảng KhachHang
CREATE TABLE KhachHang (
    MaKhachHang INT PRIMARY KEY,
    HoTen VARCHAR(100) NOT NULL,
    SoDienThoai VARCHAR(15),
    Email VARCHAR(100),
    DiaChi VARCHAR(255)
);

-- Tạo bảng SanPham
CREATE TABLE SanPham (
    MaSanPham INT PRIMARY KEY,
    TenSanPham VARCHAR(100) NOT NULL,
    Gia DECIMAL(10, 2) NOT NULL,
    SoLuongTonKho INT DEFAULT 0,
    MoTa TEXT
);

-- Tạo bảng HoaDon
CREATE TABLE HoaDon (
    MaHoaDon INT PRIMARY KEY,
    MaKhachHang INT NOT NULL,
    NgayLap DATE NOT NULL,
    TongTien DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang)
);

-- Tạo bảng ChiTietHoaDon
CREATE TABLE ChiTietHoaDon (
    MaHoaDon INT NOT NULL,
    MaSanPham INT NOT NULL,
    SoLuong INT NOT NULL,
    GiaBan DECIMAL(10, 2) NOT NULL,
    ThanhTien DECIMAL(10, 2),
    PRIMARY KEY (MaHoaDon, MaSanPham),
    FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
    FOREIGN KEY (MaSanPham) REFERENCES SanPham(MaSanPham)
);

INSERT KhachHang VALUES
(1, 'Nguyen Van A', '0983343782', 'a@mail.a', 'Ha Noi'),
(2, 'Nguyen Van B', '0983343783', 'b@mail.a', 'Thanh Hoa'),
(3, 'Nguyen Van C', '0983343784', 'c@mail.a', 'Ha Noi'),
(4, 'Nguyen Van D', '0983343785', 'd@mail.a', 'Ha Noi'),
(5, 'Nguyen Van E', '0983343786', 'e@mail.a', 'Ha Noi')

INSERT SanPham VALUES
(11, 'PC Cua tao', 1000, 1, 'Chat'),
(12, 'TV', 2000, 2, 'Chat'),
(13, 'Pin', 3000, 3, 'Chat'),
(14, 'Iphone 99', 4000, 4, 'Chat'),
(15, 'Cai ban hoc', 5000, 20, 'Chat')

INSERT HoaDon VALUES
(21, 1, '09-09-2020', 1000),
(22, 2, '09-09-2020', 2000),
(23, 3, '09-08-2020', 3000),
(24, 4, '09-08-2020', 4000),
(25, 5, '09-08-2020', 5000)

INSERT ChiTietHoaDon VALUES
(21, 11, 1, 1000, 1000),
(22, 12, 2, 2000, 2000),
(23, 13, 3, 3000, 3000),
(24, 14, 4, 4000, 4000),
(25, 15, 5, 5000, 5000)

SELECT * FROM KhachHang;
SELECT * FROM SanPham;
SELECT * FROM HoaDon;
SELECT * FROM ChiTietHoaDon;


-- Tạo view hiển thị thông tin chi tiết hóa đơn bao gồm tên sản phẩm và tổng tiền của từng dòng chi tiết 1đ
CREATE VIEW HoaDonChiTietView AS
SELECT SanPham.TenSanPham, ChiTietHoaDon.ThanhTien FROM ChiTietHoaDon
INNER JOIN SanPham ON ChiTietHoaDon.MaSanPham = SanPham.MaSanPham

SELECT * FROM HoaDonChiTietView;


-- Tạo view hiển thị thông tin hóa đơn kèm theo thông tin khách hàng
CREATE VIEW ThongTinHoaDon_KhacHang AS
SELECT HoaDon.MaHoaDon, HoaDon.NgayLap, HoaDon.TongTien, KhachHang.HoTen, KhachHang.Email, KhachHang.DiaChi 
FROM KhachHang
INNER JOIN HoaDon ON KhachHang.MaKhachHang = HoaDon.MaKhachHang

SELECT * FROM ThongTinHoaDon_KhacHang;

-- Tạo view hiển thị danh sách sản phẩm còn tồn kho dưới 10 đơn vị
CREATE VIEW DanhSachSanPhamTonKho_View AS
SELECT TenSanPham, SoLuongTonKho 
FROM SanPham
WHERE SoLuongTonKho < 10

SELECT * FROM DanhSachSanPhamTonKho_View

-- Tạo view hiển thị tổng doanh thu theo từng khách hàng

-- Tạo view hiển thị các hóa đơn đã lập trong tháng hiện tại


DROP VIEW HoaDonChiTietView
DROP VIEW ThongTinHoaDon_KhacHang
DROP VIEW DanhSachSanPhamTonKho_View

DROP TABLE HoaDon;
DROP TABLE KhachHang;
DROP TABLE SanPham;
DROP TABLE ChiTietHoaDon;