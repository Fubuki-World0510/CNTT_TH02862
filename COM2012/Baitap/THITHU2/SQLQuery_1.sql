create database THI_CSDL;
use THI_CSDL;

create table GIAOVIEN(
MaGiaoVien nchar(10) not null primary key,
TenGiaoVien nchar(20) not null,
Email varchar(30),
SoDienThoai varchar(20) not null
)

create table CUOCTHI(
MaNhom int not null primary key,
TenDeTai nchar(30) not null,
SoLuongThanhVien int,
Chude nchar(30) not null
)

create table HUONGDAN(
MaGiaoVien nchar(10) not null,
MaNhom int not null,
NgayNop date not null,
GhiChu nchar(50),
primary key(MaGiaoVien, MaNhom),
foreign key(MaGiaoVien) references GIAOVIEN(MaGiaoVien),
foreign key(MaNhom) references CUOCTHI(MaNhom)
)

insert into GIAOVIEN values
('GV001', N'Trần Thị Nga', 'nga01@gmail.com', '012345678'),
('GV002', N'Trần Bạch Hà', 'ha02@gmail.com', '023423444'),
('GV003', N'Ngô Bá Khá', 'kha03@gmail.com', '234343244')

insert into CUOCTHI values
(01, N'Cây xanh', 3, N'LANDINGPAGE'),
(02, N'Các thiêt bị điện', 5, N'LANDINGPAGE'),
(03, N'Sơn thiên nhiên', 0, N'Nhà ở')

insert into HUONGDAN values
('GV001', 02, '2019-08-29', null),
('GV002', 01, '2019-08-19', N'Đã hoàn thành thao tác'),
('GV003', 03, '2019-08-09', null)

select * from GIAOVIEN
select * from CUOCTHI
select * from HUONGDAN

-- 3:
SELECT TenGiaoVien, Email, SoDienThoai FROM GIAOVIEN

SELECT KhachHang.TenKH, DonHang.NgayLap, ChiTietDonHang.MaSP, ChiTietDonHang.SoLuong
FROM KhachHang
INNER JOIN DonHang ON KhachHang.MaKH = DonHang.MaKH
INNER JOIN ChiTietDonHang ON DonHang.MaDH = ChiTietDonHang.MaDH; 1 

-- 4:
SELECT TenDeTai, MaNhom, SoLuongThanhVien
FROM CUOCTHI
WHERE Chude = 'LANDINGPAGE';

--CAU5
SELECT * FROM GIAOVIEN
SELECT GIAOVIEN.MaGiaoVien,TenGiaoVien, COUNT(HUONGDAN.MaNhom) AS SONHOMDANGHUONGDAN
FROM GiaoVien
JOIN HUONGDAN ON HUONGDAN.MaGiaoVien = GIAOVIEN.MAGIAOVIEN
JOIN CUOCTHI ON CUOCTHI.MANHOM = HUONGDAN.MANHOM
WHERE CHUDE='LANDINGPAGE'
GROUP BY GIAOVIEN.MAGIAOVIEN,TENGIAOVIEN

--CAU6
SELECT 
    HUONGDAN.NGAYNOP,
    COUNT(HUONGDAN.MANHOM) AS SOLUONGNHOM,
    SUM(CUOCTHI.SOLUONGTHANHVIEN) AS TONGSOTHANHVIEN
FROM HUONGDAN
JOIN CUOCTHI ON HUONGDAN.MANHOM = CUOCTHI.MANHOM
WHERE DAY(HUONGDAN.NGAYNOP) IN (7, 1) 
GROUP BY HUONGDAN.NGAYNOP;

Drop table HUONGDAN
Drop table GIAOVIEN
Drop table CUOCTHI