-- Tạo CSDL Quản lý thư viện QLThuVien
CREATE DATABASE QLThuVien;

-- Sử dụng CSDL QLThuVien
USE QLThuVien;

-- Tạo bảng SinhVien
CREATE TABLE SinhVien (
    MaSV VARCHAR(10) NOT NULL PRIMARY KEY,
    TenSV VARCHAR(50) NOT NULL,
    NgayHetHan DATE NOT NULL,
    ChuyenNganh VARCHAR(50),
    Email VARCHAR(50) NOT NULL,
    SoDT VARCHAR(15) NOT NULL
);

-- Tạo bảng LoaiSach
CREATE TABLE LoaiSach (
    MaLoai VARCHAR(10) NOT NULL PRIMARY KEY,
    TenLoai VARCHAR(50) NOT NULL
);

-- Tạo bảng Sach
CREATE TABLE Sach (
    MaSach VARCHAR(10) NOT NULL PRIMARY KEY,
    TenSach VARCHAR(50) NOT NULL,
    NXB VARCHAR(50) NOT NULL,
    Tacgia VARCHAR(50),
    SLbansao INT NOT NULL,
    Giatien FLOAT NOT NULL,
    Vitri VARCHAR(50) NOT NULL,
    MaLoai VARCHAR(10) NOT NULL,
    NgayNhapKho DATE NOT NULL,
    FOREIGN KEY (MaLoai) REFERENCES LoaiSach(MaLoai)
);

-- Tạo bảng Phiếu mượn
CREATE TABLE PhieuMuon (
    MaPM VARCHAR(10) NOT NULL PRIMARY KEY,
    Ngaymuon DATE NOT NULL,
    Ngaytra DATE,
    MaSV VARCHAR(10) NOT NULL,
    TrangThaiTra VARCHAR(10),
    FOREIGN KEY (MaSV) REFERENCES SinhVien(MaSV)
);

-- Tạo bảng Chi tiết phiếu mượn
CREATE TABLE ChitietPhieuMuon (
    MaPM VARCHAR(10) NOT NULL,
    MaSach VARCHAR(10) NOT NULL,
    Ghichu VARCHAR(50) NOT NULL,
    PRIMARY KEY (MaPM, MaSach),
    FOREIGN KEY (MaPM) REFERENCES PhieuMuon(MaPM),
    FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
);

INSERT INTO Sinhvien (MaSV, TenSV, NgayHetHan, ChuyenNganh, Email, SoDT) VALUES
('TH01345', 'Nam 2 chan', '2024-11-20', 'Cong nghe thong tin', 'nam2chan@gmail.com', '0546113315'),
('TH04249', 'Tran Hai Nam', '2024-12-21', 'Cong nghe thong tin', 'tranhai@gmail.com', '0239345429'),
('TH03942', 'Hai Nam Tran', '2024-12-22', 'Quan tri khach san', 'haitran@gmail.com', '0347898557'),
('TH03449', 'Nam Hai Tran', '2024-12-23', 'Thiet ke do hoa', 'namhai94@gmail.com', '0234484881'),
('TH023451', 'Tran Quoc Toan', '2024-12-24', 'Thiet ke do hoa', 'toan70@gmail.com', '0745358249');

INSERT INTO LoaiSach (MaLoai, TenLoai) VALUES
('IT', 'Cong nghe thong tin'),
('DM', 'Digital Marketing'),
('HT', 'Quan ly khach san'),
('GD', 'Thiet ke do hoa'),
('MAT', 'Toan');

INSERT INTO Sach (MaSach, TenSach, NXB, Tacgia, SLbansao, Giatien, Vitri, MaLoai, NgayNhapKho) VALUES
('B1909', 'Co so du lieu SQL', 'NXB Giao Duc', 'GD&DT', 15, 500000, 'A1', 'IT', '2013-01-01'),
('B3503', 'Chuyen lap trinh JavaScript', 'NXB Tre', 'Cao Phan Hanh Tuc', 10, 300000, 'A2', 'IT', '2016-10-01'),
('B9201', 'Thuong mai dien tu', 'NXB Kinh Te', 'Tran Hai Nam', 3, 450000, 'B1', 'DM', '2019-05-01'),
('B4561', 'Cong nghe may vi tinh', 'NXB Nam Hai', 'Tran Nam Hai', 20, 600000, 'C1', 'GD', '2017-01-01'),
('B8911', 'Windows 10 bookmark', 'NXB Win10dabest', 'Xiaomi Worker', 7, 550000, 'A3', 'IT', '2013-03-01');

-- Dữ liệu PhieuMuon
INSERT INTO PhieuMuon (MaPM, Ngaymuon, Ngaytra, MaSV, TrangThaiTra) VALUES
('PM001', '2003-10-15', '2017-01-15', 'TH023451', 'Da tra'),
('PM002', '2003-10-20', '2017-01-20', 'TH03449', 'Da tra'),
('PM003', '2024-10-01', '2024-11-30', 'TH03942', 'Da tra'),
('PM004', '2024-04-10', NULL, 'TH04249', 'Chua tra'),
('PM005', '2024-05-15', '2024-11-20', 'TH01345', 'Da tra');

INSERT INTO ChitietPhieumuon (MaPM, MaSach, Ghichu) VALUES
('PM001', 'B1909', 'Muon sach ve doc'),
('PM002', 'B3503', 'Muon sach ve doc'),
('PM003', 'B9201', 'Muon sach ve doc'),
('PM004', 'B4561', 'Muon sach ve doc'),
('PM005', 'B8911', 'Muon sach ve doc');

Select * from SinhVien
Select * from LoaiSach
Select * from Sach
Select * from PhieuMuon
Select * from ChitietPhieuMuon

-- 6.1
SELECT TenSach, MaSach, Giatien, Tacgia
FROM Sach
WHERE MaLoai = 'IT';

-- 6.2
  SELECT PhieuMuon.MaPM, ChitietPhieumuon.MaSach, PhieuMuon.Ngaymuon, PhieuMuon.MaSV
  FROM PhieuMuon
  JOIN ChitietPhieumuon ON PhieuMuon.MaPM = ChitietPhieumuon.MaPM
  WHERE MONTH(PhieuMuon.Ngaymuon) = 1 AND YEAR(PhieuMuon.Ngaymuon) = 2017;

-- 6.3
SELECT *
FROM PhieuMuon
WHERE Ngaytra IS NULL
ORDER BY Ngaymuon ASC;

-- 6.4
SELECT LoaiSach.MaLoai, LoaiSach.TenLoai, COUNT(Sach.MaSach) AS TongSoLuongSach
FROM LoaiSach
JOIN Sach ON LoaiSach.MaLoai = Sach.MaLoai
GROUP BY LoaiSach.MaLoai, LoaiSach.TenLoai;

-- 6.5
SELECT COUNT(DISTINCT MaSV) AS SoSinhVienMuon
FROM PhieuMuon;

-- 6.6
SELECT *
FROM Sach
WHERE TenSach LIKE '%SQL%';

-- 6.7
SELECT PhieuMuon.MaSV, SinhVien.TenSV, PhieuMuon.MaPM, Sach.TenSach, PhieuMuon.Ngaymuon, PhieuMuon.Ngaytra
FROM PhieuMuon
JOIN SinhVien ON PhieuMuon.MaSV = SinhVien.MaSV
JOIN ChitietPhieumuon ON PhieuMuon.MaPM = ChitietPhieumuon.MaPM
JOIN Sach ON ChitietPhieumuon.MaSach = Sach.MaSach
ORDER BY PhieuMuon.Ngaymuon ASC;

-- 6.8
SELECT Sach.MaSach, Sach.TenSach, COUNT(ChitietPhieumuon.MaSach) AS SoLanMuon
FROM ChitietPhieumuon
JOIN Sach ON ChitietPhieumuon.MaSach = Sach.MaSach
GROUP BY Sach.MaSach, Sach.TenSach
HAVING COUNT(ChitietPhieumuon.MaSach) > 20;

-- 6.9
UPDATE Sach
SET Giatien = Giatien * 0.7
WHERE NgayNhapKho < '2014-01-01';
Select * from Sach

-- 6.10
UPDATE PhieuMuon
SET TrangThaiTra = 'Da tra'
WHERE MaSV = 'TH04249';
Select * from PhieuMuon

-- 6.11
SELECT PhieuMuon.MaPM, SinhVien.TenSV, SinhVien.Email, Sach.TenSach AS DanhSachDaMuon, PhieuMuon.Ngaymuon
FROM PhieuMuon
JOIN SinhVien ON PhieuMuon.MaSV = SinhVien.MaSV
JOIN ChitietPhieumuon ON PhieuMuon.MaPM = ChitietPhieumuon.MaPM
JOIN Sach ON ChitietPhieumuon.MaSach = Sach.MaSach
WHERE PhieuMuon.Ngaytra IS NULL AND PhieuMuon.Ngaymuon < GETDATE();

-- 6.12
UPDATE Sach
SET SLbansao = SLbansao + 5
WHERE MaSach IN (
    SELECT MaSach
    FROM ChitietPhieumuon
    GROUP BY MaSach
    HAVING COUNT(MaSach) > 10
);
Select * from Sach

-- 6.13
DELETE FROM PhieuMuon
WHERE Ngaymuon < '2010-01-01' AND Ngaytra < '2010-01-01';

-- 