-- Câu 1: Tạo cơ sở dữ liệu QUANLYNHANSU gồm 3 bảng. (1.5 điểm)
CREATE DATABASE QUANLYNHANSU1;
USE QUANLYNHANSU1;


-- PHONGBAN(MAPB,TENPB)
Create TABLE PhongBan(
    MaPB int PRIMARY KEY not NULL,
    TenPB VARCHAR(100) not NULL
)
-- NHANVIEN(MANV, HOTEN, GIOITINH, LUONG, MAPB)
Create TABLE NhanVien(
    MaNV int PRIMARY KEY not NULL,
    hoTen VARCHAR(100) not NULL,
    Luong int not NULL,
    MaPB int not NULL,
    FOREIGN KEY (MaPB) REFERENCES PhongBan(MaPB)
)
-- CHAMCONG(MACONG, MANV, THANG, SONGAYLV, NGPHEP, NGKPHEP)
CREATE table ChamCong(
    maCong int PRIMARY KEY not NULL,
    MaNV int not NULL,
    SoNgayLv int not null,
    NgPhep int not NULL,
    NgkPhep int not NULL,
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
)

INSERT PhongBan (MaPB, TenPB) VALUES
(1, 'RD1'),
(2, 'RD2'),
(3, 'RD3')

INSERT NhanVien (MaNV, hoTen, Luong, MaPB) VALUES
(11, 'Van A', 900, 1),
(12, 'Van B', 1000, 2),
(13, 'Van C', 1100, 3)

INSERT ChamCong VALUES
(21, 11, 28, 1, 1),
(22, 12, 27, 2, 1),
(23, 13, 26, 1, 2)


SELECT * FROM PhongBan;
SELECT * FROM NhanVien;
SELECT * FROM ChamCong;

-- Câu 2: Chèn thông tin vào các bảng (3 điểm)
-- - Tạo Stored Procedure (SP) với các tham số đầu vào phù hợp PHONGBAN, NHANVIEN, CHAMCONG
-- - Yêu cầu mỗi SP phải kiểm tra tham số đầu vào. Với các cột không chấp nhận thuộc tính Null.
-- Với mỗi SP viết 3 lời gọi thành công.

-- Câu 3: Viết hàm các tham số đầu vào tương ứng với các cột của bảng NHANVIEN.
-- Hàm này trả về MaNV thỏa mãn các giá trị được truyền tham số. (2 điểm)
CREATE FUNCTION RMaNV(
    @hoTen VARCHAR(100),
    @Luong INT,
    @MaPB INT
)
RETURNS INT AS
BEGIN
    DECLARE @MaNV INT;
    SELECT @MaNV = MaNV FROM NhanVien WHERE hoTen = @hoTen AND Luong = @Luong AND MaPB = @MaPB;
    RETURN @MaNV;
END;

SELECT RMaNV('Van A', 900, 1) AS MaNV;

-- Câu 4: Tạo View lưu thông tin của TOP 2 có giá trị số lượng nhân viên đông nhất gồm các thông tin sau:
-- Mapb, tenpb, số lượng nhân viên. (1.5 điểm)

-- Câu 5: Viết một SP nhận một tham số đầu vào là số ngày phép
-- SP này thực hiện thao tác xóa thông tin chấm công và nhân viên tương ứng nếu tổng số ngày phép lớn hơn giá trị tham số đầu vào. (2 điểm)
CREATE PROCEDURE XoaThongTin
    @NgayPhep INT
AS
BEGIN
    DELETE FROM NhanVien
    WHERE MaNV IN (
        SELECT MaNV FROM ChamCong
        WHERE NgPhep + NgkPhep > @NgayPhep 
    );

    DELETE FROM ChamCong
    WHERE NgPhep + NgkPhep > @NgayPhep;
END

EXEC XoaThongTin 1;

DROP TABLE NhanVien;
DROP TABLE PhongBan;
DROP TABLE ChamCong;
