DECLARE @hoTen varchar(255)
SET @hoTen = 'Nguyen Van A'
SELECT @hoTen

DECLARE @tuoi int
SET @tuoi = 100
SELECT @tuoi

DECLARE @ChieuDai int, @ChieuRong int, @DienTich int
SET @ChieuDai=10 -- Gán cho biến ChieuDai là 10
SET @ChieuRong=6 -- Gán cho biến Chiẻuong là 6
SET @DienTich=@ChieuDai*@ChieuRong -- Tính giá trị của DienTich
SELECT @DienTich -- Hiển thị kết quả

DECLARE @Max_Luong float
SELECT @Max_Luong=MAX(luong)
FROM NHANVIEN

PRINT 'Nhan vien co luong lon nhat: ' + CONVERT(CHAR(12),@Max_Luonng)
GO

SELECT * FROM SINHVIEN


DECLARE @SinhVien Table(masv varchar(255), trangThai int, namsinh int)
insert into @sinhVien
SELECT ID_SinhVien, Lop from SINHVIEN WHERE Lop = 'L003'
SELECT * FROM @sinhVien

begin
DECLARE @kq int;
DECLARE @V_a int = 50;
DECLARE @V_b int = 150;
print 'v_a: ' + cast(@v_a as varchar(255));
print 'v_b: ' + cast(@v_b as varchar(255));
SET @kq = @V_a + @V_b;
print 'ket qua: '+cast (@kq as varchar(255));
end

SELECT CAST ('123,4' as decimal) 
SELECT CAST (123 as decimal(6,2))
SELECT CAST (2.78128 AS integer)
SELECT CAST ('11/11/72' as smalldatetime)
SELECT CAST ('123' AS int)
SELECT CAST ('1994-02-01 14:16:26' AS varchar)
SELECT Name, CAST(ID AS VarChar(5))

Begin
DECLARE @ngaySinh DATETIME = '1990/9/10';
SELECT @ngaySinh as 'ngay sinh',
CAST(@ngaySinh as varchar(255)) as 'ngay sinh varchar',
CONVERT(Varchar, @ngaySinh, 103) as 'ngaySinh 103',
CONVERT(Varchar, @ngaySinh, 101) as 'ngaySinh 101',
CONVERT(Varchar, @ngaySinh, 105) as 'ngaySinh 105',
CONVERT(Varchar, @ngaySinh, 110) as 'NgaySinh 110',
CONVERT(Varchar, @ngaySinh, 110) as 'NgaySinh 107'
End

