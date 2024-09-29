Create database th02862;

use th02862;

CREATE table
    San_Pham (
        id int not null PRIMARY KEY,
        ten_san_pham NVARCHAR (100) not null,
        ma_san_pham NVARCHAR (100) not null,
        trang_thai VARCHAR(100) not null,
    )
CREATE table
    san_pham_chi_tiet (
        id int not null PRIMARY KEY,
        ten_san_pham_chi_tiet NVARCHAR (100) not null,
        ma_sac NVARCHAR (100) not null,
        size VARCHAR(100) not null,
        so_luong int not null,
        san_pham int not null,
        gia_ban FLOAT not null,
        FOREIGN KEY (san_pham) REFERENCES San_Pham (id)
    )
CREATE TABLE
    hoa_don (
        id int not null PRIMARY KEY,
        ma_hoa_don int not null,
        khach_hang NVARCHAR (100) not NULL,
        trang_thai NVARCHAR (20) not NULL,
        ngay_tao DATE not NULL
    )
CREATE TABLE
    khach_hang (
        id int not null PRIMARY KEY,
        ten_khach_hang NVARCHAR (100) not NULL,
        sdt NVARCHAR (12) not NULL,
        trang_thai NVARCHAR (100) not NULL
    )
CREATE TABLE
    hoa_don_chi_tiet (
        id_san_pham_chi_tiet int not NULL PRIMARY KEY,
        id_hoa_don int not NULL,
        FOREIGN KEY (id_san_pham_chi_tiet) REFERENCES san_pham_chi_tiet (id),
        FOREIGN KEY (id_hoa_don) REFERENCES hoa_don (id),
    )

Insert San_Pham VALUES
(1, 'Laptop Toshiba', 'LAP01', 'OK'),
(2, 'May giat panasonic', 'DEVI01', 'OK'),
(3, 'PC 5 cu cua toi', 'PC01', 'NO'),
(4, 'TV Logitech 100', 'TV01', 'OK'),
(5, 'RTX4090 TI SUPER', 'RTX01', 'OK')

INSERT INTO san_pham_chi_tiet VALUES
(1, 'Laptop Toshiba', 'Black', '90', 100, 1, 1),
(2, 'May giat panasonic', 'White', '1000', 20, 2, 2),
(3, 'PC 5 cu cua toi', 'RGB', '1020', 1, 3, 3),
(4, 'TV Logitech 100', 'Black', '100', 40, 4, 4),
(5, 'RTX4090 TI SUPER', 'White', '100', 49, 5, 5)

INSERT INTO hoa_don VALUES
(1, 01, 10, 'OK', '2024-01-09'),
(2, 02, 012, 'OK', '2022-01-09'),
(3, 03, 013, 'OK', '2021-01-09'),
(4, 04, 014, 'OK', '2025-01-09'),
(5, 05, 015, 'OK', '2020-01-09')

INSERT INTO khach_hang VALUES
(10, 'Van A', '099999', 'OK'),
(012, 'Van B', '039999', 'OK'),
(013, 'Van C', '049999', 'OK'),
(014, 'Van D', '095999', 'OK'),
(015, 'Van E', '099699', 'OK')

INSERT INTO hoa_don_chi_tiet VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5)


SELECT * FROM San_Pham
SELECT * FROM hoa_don
SELECT * FROM hoa_don_chi_tiet
SELECT * FROM san_pham_chi_tiet
SELECT * FROM khach_hang


-- Cập nhật tên của khách hàng có id = 10 1đ
SELECT ten_khach_hang FROM khach_hang
UPDATE khach_hang
SET ten_khach_hang = 'Van B1'
WHERE id = 10
SELECT ten_khach_hang FROM khach_hang

-- Hiển thị thông tin hoá đơn + tên khách hàng 1đ
SELECT hoa_don.id, khach_hang.ten_khach_hang
FROM khach_hang JOIN hoa_don ON khach_hang.id = hoa_don.khach_hang

-- Hiển thị số lượng của từng sản phẩm
SELECT ten_san_pham_chi_tiet, SUM(so_luong) AS so_luong
FROM san_pham_chi_tiet
GROUP BY ten_san_pham_chi_tiet

-- Hiển thị hoá đơn có giá trị lớn nhất trong 1 ngày bất kì 1đ
-- Hiển thị thông tin sản phẩm bán được nhiều nhất 1đ

DROP TABLE khach_hang
DROP TABLE hoa_don_chi_tiet
DROP TABLE san_pham_chi_tiet
DROP TABLE San_Pham  
DROP TABLE hoa_don