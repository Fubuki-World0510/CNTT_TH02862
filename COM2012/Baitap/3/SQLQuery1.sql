USE BAITAP1
select Ho_NV from NHAN_VIEN
-- Đưa ra họ của các nhân viên loại bỏ các dòng trùng nhau
select distinct Ho_NV from NHAN_VIEN
--Hiện tên nhân viên có lương từ 500 đến 700
select * from NHAN_VIEN
--c1
SELECT Ten_NV
FROM NHAN_VIEN
WHERE luong>=800 AND Luong<=1000
--c2
SELECT Ten_NV 
FROM NHAN_VIEN
WHERE luong between 800 AND 1000
-- Đưa ra nhân viên có  họ của nhân viên bắt đầu bằng chữ N
SELECT * FROM NHAN_VIEN
SELECT * FROM NHAN_VIEN
WHERE Ho_NV LIKE 'N%'

SELECT Ho_NV, Ten_NV, Luong
FROM NHAN_VIEN
--ghép họ và tên nv thành HTNV
SELECT Ho_NV+Ten_NV as Ho_Ten_NV, luong
FROM NHAN_VIEN
insert into NHAN_VIEN values(4,'Nguyen', 'An','1/1/1980','12 TVB',1,3200,'PB001')
--Hiện 2 nhân viên đầu tiên
SELECT TOP 2 * from NHAN_VIEN
--Hiện 10% đầu tiên
SELECT TOP 10 percent * from NHAN_VIEN
-- Hiện tên và mã phòng của nhân viên 
SELECT Ten_NV, PHG
FROM NHAN_VIEN
--Đưa ra tên phòng và mã trưởng phòng
SELECT TEN_PB, MA_TRUONG_PHONG
FROM PHONG_BAN