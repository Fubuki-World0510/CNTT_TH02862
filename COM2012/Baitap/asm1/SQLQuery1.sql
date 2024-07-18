CREATE DATABASE ASM1_REAL_TH02862;
USE ASM1_REAL_TH02862;
CREATE TABLE SINHVIEN (
    MASV VARCHAR(10) PRIMARY KEY,
    HO VARCHAR(50),
    TEN VARCHAR(50),
    NAMSINH INT,
    GT CHAR(1),
    QUE VARCHAR(100),
    MALOP VARCHAR(10),
    MAMH VARCHAR(10),
    TENMH VARCHAR(100),
    DIEM DECIMAL(3, 1)
);
INSERT INTO SINHVIEN (MASV, HO, TEN, NAMSINH, GT, QUE, MALOP, MAMH, TENMH, DIEM)
VALUES 
('TH001', 'Tran', 'Hai Nam', 2000, 'M', 'Vinh Phuc', 'SD2109', 'MAT102', 'Toan', 9.5),
('TH002', 'Nguyen', 'Thanh Tai', 2002, 'M', 'Bac Ninh', 'SD2103', 'LIT206', 'Van', 6),
('TH004', 'Nguyen', 'Tien Thanh', 2002, 'M', 'Nghe An', 'SD1808', 'COM2012', 'Co so du lieu', 8.5),
('TH005', 'Bui', 'Duc Hoc', 2001, 'M', 'Nghe An', 'SD2113', 'LIT206', 'Van', 7),
('TH034', 'Ton', 'Hoa Sen', 2004, 'W', 'Binh Thuan', 'SD1808', 'MAT102', 'Toan', 3),
('TH099', 'Luong', 'The Vinh', 2007, 'M', 'Thai Binh', 'SD1808', 'COM2012', 'Co so du lieu', 9.5),
('TH100', 'Tran', 'Nam Anh', 2007, 'M', 'Ha Noi', 'SD2198', 'COM1013', '.NET Framework', 5.5),
('TH007', 'Nguyen', 'Khanh Xuan', 2007, 'W', 'Ha Noi', 'SD2234', 'NODE01', 'Lap trinh node web', 10),
('TH080', 'Trinh', 'Hai Anh', 2005, 'M', 'Vinh Phuc', 'SD2567', 'ELE189', 'Lap trinh ElectronJS', 8.8),
('TH090', 'Nguyen', 'Khanh Linh', 2004, 'W', 'Thanh Hoa', 'SD1993', 'IOT103', 'Lap trinh nhung', 9.7);
-- Bai 1: A
SELECT * FROM SINHVIEN;
-- Bai 2: B
SELECT HO, TEN, TENMH, DIEM FROM SINHVIEN;
-- Bai 3: C
SELECT TEN, MALOP FROM SINHVIEN;
-- Bai 4: D
SELECT TOP 3 * from SINHVIEN;
-- Bai 5: E
SELECT HO, TEN, TENMH FROM SINHVIEN WHERE DIEM BETWEEN 7 AND 9;
-- Bai 6: F
SELECT MAMH FROM SINHVIEN WHERE MAMH LIKE 'COM%';
-- Bai 7: G
SELECT TEN, MALOP, 2024 - NAMSINH AS TUOI FROM SINHVIEN;
-- Bai 8: H
SELECT TENMH FROM SINHVIEN WHERE DIEM > 9;
-- Bai 9: I
SELECT * FROM SINHVIEN WHERE MALOP = 'SD1808' AND MAMH = 'COM2012' AND DIEM > 8;
-- Bai 10: J
SELECT TENMH, COUNT(*) AS SSV FROM SINHVIEN GROUP BY TENMH;