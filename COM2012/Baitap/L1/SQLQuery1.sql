CREATE DATABASE th02862;
use th02862;

CREATE TABLE NGOAINGU (
MANN INT not null primary key,
TenNN NCHAR(20) not null,
MUC INT not null,
NOICAP CHAR(10) not null
)

CREATE TABLE SINHVIEN (
MASV int not null primary key,
TENSV nchar(50) not null,
TAIKHOAN varchar(20),
SODT varchar(20) not null
)

CREATE TABLE QUATRINH (
MANN int not null,
MASV int not null,
NGAYCAP date not null,
TIENDV int,
primary key (MANN,MASV),
foreign key (MANN) references NGOAINGU(MANN),
foreign key (MASV) references SINHVIEN(MASV)
)

drop table NGOAINGU;
drop table SINHVIEN;
drop table QUATRINH;

INSERT into NGOAINGU values
(01, 'ANH', 7, 'BC'),
(02, N'PHÁP', 2, 'HN'),
(03, N'HÀN QUỐC', 4, 'HN')

INSERT into SINHVIEN values
(1, N'Ma Mai', 'maima', '0912378888'),
(2, N'Đỗ Vân', 'vandtt', '1248990000'),
(3, N'NGuyễn Hòa', 'Hoamn', '3289000000'),
(4, N'Ma Lan', 'Lanma', '2487900988')

insert into QUATRINH values
(01, 1, '02-16-2020', 3000000),
(02, 2, '01-17-2020', 1000000),
(03, 2, '01-18-2020', 2000000),
(02, 4, '02-03-2024', 3200000)

SELECT * FROM NGOAINGU;
SELECT * FROM SINHVIEN;
SELECT * FROM QUATRINH;

-- Bai3:
SELECT MANN, TenNN, NOICAP
FROM NGOAINGU
-- Bai4:
SELECT MASV, TENSV, TAIKHOAN
FROM SINHVIEN
WHERE SODT like '%88%'

-- Bai5:
SELECT QUATRINH.MANN, QUATRINH.MASV, QUANTRINH.NGAYCAP 
FROM QUATRINH JOIN NGOAINGU 
ON QUATRINH.MANN = NGOAINGU.MANN 
WHERE NGOAINGU.NOICAP = 'BC'