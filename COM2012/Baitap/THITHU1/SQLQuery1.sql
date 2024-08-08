create database thithu1;
use thithu1

create table GiangVien (
MaGiangVien int not null primary key,
TenGiangVien nchar(20) not null,
TenTaiKhoan varchar(15),
SoDienThoai varchar(20) not null
)

create table ChungChi (
MaChungChi int not null primary key,
TenChungChi nchar(20) not null,
BenCap nchar(10),
LinhVuc nchar(20) not null
)

create table LichSuHocTap (
MaGiangVien int not null,
MaChungChi int not null,
NgayCap varchar(20) not null,
GhiChu nchar(50),
primary key(MaGiangVien, MaChungChi),
foreign key (MaGiangVien) references GiangVien(MaGiangVien),
foreign key (MaChungChi) references ChungChi(MaChungChi)
)

Drop table LichSuHocTap
Drop table GiangVien
Drop table ChungChi

insert into GiangVien values
(1, N'Trần Thị Giang', 'giang12', '123456729'),
(2, N'Nguyễn Thị Hà', 'ha09', '1345678954'),
(3, N'Trần Thu Ngân', 'ngan96', '123456729')

insert into ChungChi values
(01, 'Ien', 'Coursera', 'English'),
(02, 'Imath', 'Golden', 'Math'),
(03, 'Iphy', 'Coursera', N'Xử lý dữ liệu')

insert into LichSuHocTap values
(1, 01, '20-10-2013', null),
(3, 03, '12-05-2014', null),
(2, 01, '21-03-2015', N'Rất tốt')

SELECT * FROM LichSuHocTap
SELECT * FROM ChungChi
SELECT * FROM GiangVien

-- 3:
SELECT MaChungChi, TenChungChi, LinhVuc FROM ChungChi

-- 4:
SELECT TenGiangVien, TenTaiKhoan, MaGiangVien FROM GiangVien WHERE SoDienThoai LIKE '%29%'

-- 5:
UPDATE ChungChi
SET BenCap = 'Iron'
WHERE MaChungChi = 01
SELECT * from ChungChi

-- 6: 
