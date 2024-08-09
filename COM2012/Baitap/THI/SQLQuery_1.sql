CREATE DATABASE th02862;
USE th02862;


-- b1: Tạo CSDL theo yêu cầu
CREATE table GiangVien (
    MaGiangVien int not NULL PRIMARY KEY,
    TenGiangVien nchar(20) not null,
    Email VARCHAR(40),
    SoDienThoai VARCHAR(20) not NULL
)

CREATE table NhomDATN (
    MaNhom int not NULL PRIMARY KEY,
    TenDeTai nchar(20) not NULL,
    SoLuongThanhVien int,
    HocKy nchar(20)
)

CREATE TABLE PhanCongHuongDan(
    MaGiangVien int not null, 
    MaNhom int not null, 
    NgayHop date not null, 
    GhiChu nchar(50),
    PRIMARY KEY(MaGiangVien, MaNhom),
    FOREIGN KEY (MaGiangVien) REFERENCES GiangVien(MaGiangVien),
    FOREIGN KEY (MaNhom) REFERENCES NhomDATN(MaNhom)
)


-- b2: Thêm Dữ liệu
INSERT INTO GiangVien VALUES
(1, N'Nguyễn Quỳnh Trang', 'trangth@gmail.com', '123132424'),
(2, N'Nguyễn Việt Hùng', 'hung12@gmail.com', '456546476'),
(3, N'Hoàng Cửu Bảo', 'hoangmv@gmail.com', '354654765'),
(4, N'Chung Xe Nô', null, '867865675')

INSERT INTO NhomDATN VALUES
(11, N'Cây Xanh', 2, 'Summer 2023'),
(12, N'Thiết kế đồ họa', 2, 'Summer 2024'),
(13, N'Tuyên truyền', 2, 'Summer 2023')

INSERT INTO PhanCongHuongDan VALUES
(1, 12, '2024-09-08', N'Triển khai dự án quy mô lớn'),
(2, 11, '2023-03-20', N'Họp thành công'),
(3, 13, '2023-12-08', null)

SELECT * FROM GiangVien
SELECT * FROM NhomDATN
SELECT * FROM PhanCongHuongDan

-- b3: Hiện danh sách giảng viên, email, sdt
SELECT TenGiangVien, Email, SoDienThoai FROM GiangVien

-- b4: Hiện tên đề tài, mã nhóm, số lượng thành viên
SELECT MaNhom, TenDeTai, SoLuongThanhVien
FROM NhomDATN WHERE HocKy = N'Summer 2023'

-- b5: cập nhật sdt giảng viên theo mã
SELECT * FROM GiangVien
UPDATE GiangVien
SET SoDienThoai = '0983343782'
WHERE MaGiangVien = 2
SELECT * FROM GiangVien

-- b6: Xóa các giảng viên không có mail
SELECT * FROM GiangVien
DELETE FROM GiangVien
WHERE Email is NULL
SELECT * FROM GiangVien

-- b7:
-- Mục tiêu: Giảng viên tốt nghiệp
-- Query: MaGiangVien, TenGiangVien, Số nhóm đang hướng dẫn
-- DB: GiangVien(MaGiangVien), GiangVien(TenGiangVien), Số nhóm đang hướng dẫn

SELECT GiangVien.MaGiangVien, GiangVien.TenGiangVien, NhomDATN.MaNhom FROM GiangVien 
INNER JOIN PhanCongHuongDan ON GiangVien.MaGiangVien = PhanCongHuongDan.MaGiangVien
INNER JOIN NhomDATN ON NhomDATN.MaNhom = PhanCongHuongDan.MaNhom

DROP TABLE PhanCongHuongDan
DROP TABLE GiangVien
DROP TABLE NhomDATN
