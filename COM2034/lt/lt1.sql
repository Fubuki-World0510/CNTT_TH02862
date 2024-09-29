Create database hocsinh;

use hocsinh;

CREATE TABLE
    nganh_hoc (
        id INT PRIMARY KEY not NULL,
        ten_nganh VARCHAR(100) not NULL,
        ma_nganh VARCHAR(50) not NULL,
        trang_thai TINYINT not NULL
    );

CREATE TABLE
    lop (
        id INT PRIMARY KEY not NULL,
        ten_lop VARCHAR(100) not NULL,
        ma_lop VARCHAR(50) not NULL,
        trang_thai TINYINT not NULL,
        nganh_hoc INT not NULL,
        FOREIGN KEY (nganh_hoc) REFERENCES nganh_hoc (id)
    );

CREATE TABLE
    sinh_vien (
        id INT PRIMARY KEY not NULL,
        ho_ten VARCHAR(100) not NULL,
        dia_chi VARCHAR(255) not NULL,
        nam_sinh Int not NULL,
        lop INT not NULL,
        trang_thai TINYINT not NULL,
        FOREIGN KEY (lop) REFERENCES lop (id)
    );

CREATE TABLE
    mon_hoc (
        id INT PRIMARY KEY not NULL,
        ten_mon VARCHAR(100) not NULL,
        ma_mon VARCHAR(50) not NULL,
        trang_thai TINYINT not NULL
    );

CREATE TABLE
    diem (
        ma_sinh_vien INT not NULL,
        mon_hoc INT not NULL,
        diem FLOAT not NULL,
        PRIMARY KEY (ma_sinh_vien, mon_hoc),
        FOREIGN KEY (ma_sinh_vien) REFERENCES sinh_vien (id),
        FOREIGN KEY (mon_hoc) REFERENCES mon_hoc (id)
    );

INSERT INTO nganh_hoc VALUES
(1, 'cong nghe thong tin', 'CNTT', 1),
(2, 'ke toan', 'KT', 1),
(3, 'quan tri kinh doanh', 'QTKD', 1);

INSERT INTO lop VALUES
(1, 'lop 12a1', '12A1', 1, 1),
(2, 'lop 12b1', '12B1', 1, 2),
(3, 'lop 12c1', '12C1', 1, 3);

INSERT INTO sinh_vien VALUES
(1, 'nguyen van a', '123 duong a', 2000, 1, 1),
(2, 'tran thi b', '456 duong b', 2001, 2, 1),
(3, 'le van c', '789 duong c', 2000, 3, 1);

INSERT INTO mon_hoc VALUES
(1, 'toan', 'TOAN', 1),
(2, 'van', 'VAN', 1),
(3, 'anh van', 'ANHVAN', 1);

INSERT INTO diem VALUES
(1, 1, 8.5),
(1, 2, 7.0),
(2, 1, 6.5),
(2, 3, 9.0),
(3, 2, 5.5),
(3, 3, 8.0);


SELECT * FROM sinh_vien;
SELECT * FROM lop;
SELECT * FROM mon_hoc;
SELECT * FROM nganh_hoc;
SELECT * FROM diem;

-- Thêm 1 dữ liệu sinh viên
INSERT INTO sinh_vien VALUES
(4, 'Lo Van B', '0998 Duong CB', 2001, 3, 1)
SELECT * FROM sinh_vien;

-- Xóa bản ghi môn học
DELETE FROM diem 
WHERE mon_hoc = 1;

-- Cập nhật trang thái của 1 sinh viên
UPDATE sinh_vien
SET trang_thai = 2
WHERE id = 2
SELECT id, ho_ten, trang_thai FROM sinh_vien;

-- Lấy ra lớp học và sĩ số của lớp đó
SELECT lop.ten_lop, COUNT(sinh_vien.lop) as Si_so
FROM lop
INNER JOIN sinh_vien 
ON lop.id = sinh_vien.lop
GROUP BY lop.ten_lop, sinh_vien.lop

-- Lấy ra các ngành học và số lượng sinh viên của từng ngành
-- Lấy ra thông tin sinh viên và tên lớp của 1 lớp bất kì
SELECT sinh_vien.ho_ten, sinh_vien.dia_chi, sinh_vien.id, sinh_vien.nam_sinh, sinh_vien.trang_thai, lop.ten_lop
FROM sinh_vien
INNER JOIN lop
ON lop.id = sinh_vien.lop
WHERE lop.id = 1

-- Hiển thị thông tin môn học và số lượng sinh viên có điểm môn học đó
-- Hiển thị lớp có điểm trung bình cao nhất

-- Ngành học nào có sinh viên là thủ khoa
-- Môn học nào có điểm trung bình cao nhất
-- Hiển thị số lượng sinh viên pass/fail theo từng lớp (>5 => pass)
-- Môn học có số lượng trượt cao nhất

DELETE FROM mon_hoc
WHERE id = 1
SELECT * FROM mon_hoc;

DROP TABLE IF EXISTS diem;
DROP TABLE IF EXISTS sinh_vien;
DROP TABLE IF EXISTS mon_hoc;
DROP TABLE IF EXISTS lop;
DROP TABLE IF EXISTS nganh_hoc;