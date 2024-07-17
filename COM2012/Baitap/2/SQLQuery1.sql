---Bài tập 1
Create database BAITAP1;
use BAITAP1;
CREATE TABLE PHONG_BAN(
Ma_PB nchar(20) primary key not null,
Ten_PB nchar(30) null,
Ma_Truong_phong smallint not null
);
CREATE TABLE NHAN_VIEN(
ID_NhanVien smallint primary key not null,
Ho_NV nchar(10) not null,
Ten_NV nchar(25) not null,
NamSinh datetime,
DiaChi nchar(100),
GioiTinh tinyint,
Luong money,
PHG nchar(20) not null FOREIGN KEY references PHONG_BAN (Ma_PB)
);
-- Chèn dữ liệu vào bảng
INSERT INTO PHONG_BAN VALUES ('PB001', 'San xuat 1',1),
                             ('PB002', 'San xuat 2',2),
                             ('PB003', 'Quan Ly Chat Luong',5),
                             ('PB004', 'Thiet Ke',7),
                             ('PB005', 'Nghien Cuu Cong Nghe',8)
--Xem dữ liệu toàn bộ bảng
SELECT * from PHONG_BAN
INSERT INTO NHAN_VIEN VALUES (1,' Nguyen', 'A', '1/1/1987', '15 Quang Trung Da Nang', 1,1000, 'PB001'),
                             (2,' Le', 'B', '2/3/1982', '16 Le Loi', 0,800, 'PB002'),
                             (3,' Tran', 'C', '5/6/1988', '24 Tran Cao Van',1,1200, 'PB001')
SELECT * from NHAN_VIEN