CREATE DATABASE EmployeesManager;
USE EmployeesManager;

CREATE TABLE Employees
(
    EmployeeID INT PRIMARY KEY,
    Name NVARCHAR(100),
    Position NVARCHAR(50),
    Salary DECIMAL(10, 2)
);

-- Chèn dữ liệu mẫu vào bảng Employees
INSERT INTO Employees
    (EmployeeID, Name, Position, Salary)
VALUES
    (1, N'Nguyễn Văn A', N'Manager', 10000),
    (2, N'Trần Thị B', N'Staff', 5000),
    (3, N'Lê Văn C', N'Staff', 5500),
    (4, N'Phạm Thị D', N'Manager', 12000),
    (5, N'Hoàng Văn E', N'Intern', 2000);



CREATE TABLE Customers
(
    CustomerID INT PRIMARY KEY,
    CustomerName NVARCHAR(100),
    PhoneNumber NVARCHAR(20),
    Email NVARCHAR(100)
);

-- Chèn dữ liệu mẫu vào bảng Customers
INSERT INTO Customers
    (CustomerID, CustomerName, PhoneNumber, Email)
VALUES
    (1, N'Nguyễn Khánh', '0901234567', 'khanh@gmail.com'),
    (2, N'Trần Long', '0912345678', 'long@gmail.com'),
    (3, N'Lê Thảo', '0923456789', 'thao@gmail.com');


CREATE TABLE Products
(
    ProductID INT PRIMARY KEY,
    ProductName NVARCHAR(100),
    Price DECIMAL(10, 2),
    StockQuantity INT
);

-- Chèn dữ liệu mẫu vào bảng Products
INSERT INTO Products
    (ProductID, ProductName, Price, StockQuantity)
VALUES
    (1, N'Máy tính xách tay', 15000, 50),
    (2, N'Điện thoại di động', 8000, 100),
    (3, N'Tai nghe', 500, 200);


CREATE TABLE Orders
(
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    OrderDate DATE,
    TotalAmount DECIMAL(10, 2),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Chèn dữ liệu mẫu vào bảng Orders
INSERT INTO Orders
    (OrderID, CustomerID, OrderDate, TotalAmount)
VALUES
    (1, 1, '2023-09-01', 15500),
    (2, 2, '2023-09-15', 8000),
    (3, 3, '2023-09-20', 550);



CREATE TABLE OrderDetails
(
    OrderDetailID INT PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    Price DECIMAL(10, 2),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

-- Chèn dữ liệu mẫu vào bảng OrderDetails
INSERT INTO OrderDetails
    (OrderDetailID, OrderID, ProductID, Quantity, Price)
VALUES
    (1, 1, 1, 1, 15000),
    -- 1 Máy tính xách tay
    (2, 2, 2, 1, 8000),
    -- 1 Điện thoại di động
    (3, 3, 3, 1, 500);    -- 1 Tai nghe




-- B1: Thêm nhân viên
GO
Create PROCEDURE sp_AddEmployee
    @EmployeeID int,
    @Name NVARCHAR(200),
    @Position NVARCHAR(50),
    @Salary DECIMAL(10, 2)
AS
BEGIN
    INSERT INTO Employees
        ( EmployeeID, Name, [Position], Salary )
    VALUES
        ( @EmployeeID, @Name, @Position, @Salary)
END

EXEC sp_AddEmployee
@EmployeeID = 6,
@Name = 'Gravity',
@Position = N'Manager',
@Salary = 100000

SELECT *
FROM Employees



-- B2: Cập nhật lương
GO
Create PROCEDURE sp_UpdateEmployeeSalary
    @EmployeeID INT,
    @NewSalary DECIMAL(10, 2)
AS
BEGIN
    UPDATE Employees
SET Salary = @NewSalary
WHERE EmployeeID = @EmployeeID
END

EXEC sp_UpdateEmployeeSalary
@EmployeeID = 1,
@NewSalary = 198300
SELECT *
FROM Employees

-- B3: Xóa nhân viên
GO
CREATE PROC sp_DeleteEmployee
    @EmployeeID INT
AS
BEGIN
    DELETE FROM Employees
    WHERE EmployeeID = @EmployeeID
END

EXEC sp_DeleteEmployee @EmployeeID = 1
SELECT * FROM Employees



-- B4: 
GO
CREATE PROC sp_GetOrderDetails
@OrderID DECIMAL(10, 2)
AS
BEGIN
 SELECT OrderDetails.Price as OrderPrice, OrderDetails.Quantity as OrderQuantity, 
 Products.ProductID as ProductID, Products.ProductName as ProductName
 FROM OrderDetails INNER JOIN Products ON OrderDetails.ProductID = Products.ProductID
 WHERE OrderDetails.OrderID = @OrderID
END

EXEC sp_GetOrderDetails 1;

-- B5:
-- Bài tập 5: Tạo Stored Procedure thêm đơn hàng và chi tiết đơn hàng
-- Viết một Stored Procedure có tên sp_AddOrder để thêm một đơn hàng mới vào bảng Orders và các chi tiết đơn hàng vào bảng OrderDetails.

-- Tham số đầu vào:
-- @CustomerID: ID của khách hàng.
-- @OrderDate: Ngày đặt hàng.
-- @TotalAmount: Tổng số tiền đơn hàng.
-- @ProductID: ID của sản phẩm.
-- @Quantity: Số lượng sản phẩm.
GO
CREATE PROC sp_AddOrder
@OrderID Int,
@CustomerID INT,
@OrderDate DATE,
@TotalAmount DECIMAL(10, 2),
@ProductID INT,
@Quantity INT
as
BEGIN
 INSERT INTO Orders (OrderID, CustomerID, OrderDate, TotalAmount)
 VALUES (@OrderID, @CustomerID, @OrderDate, @TotalAmount)

 INSERT INTO OrderDetails ()
END