create database DA_VPP
use DA_VPP
-- Tạo bảng CTHOADON
CREATE TABLE CTHOADON (
  MACTHD INT IDENTITY(1,1) PRIMARY KEY,
  MaHD INT,
  MaSP INT,
  SoLuong INT,
  ThanhTien INT,
  NgayBan INT,

);

-- Tạo bảng HOADON
CREATE TABLE HOADON (
  MaHD INT IDENTITY(1,1) PRIMARY KEY,
  MaKH INT,
  MaNV INT,
  ThanhTien INT,
  NgayBan DATE,
  TrangThai NVARCHAR(100),

);

-- Tạo bảng KHACHHANG
CREATE TABLE KHACHHANG (
  MaKH INT IDENTITY(1,1) PRIMARY KEY,
  TenKH NVARCHAR(100),
  Phai NVARCHAR(10),
  SDT NVARCHAR(20),
  DiaChi NVARCHAR(100)
);

-- Tạo bảng LOAISANPHAM
CREATE TABLE LOAISANPHAM (
  MaLoai INT IDENTITY(1,1) PRIMARY KEY,
  TenLoai NVARCHAR(100)
);

-- Tạo bảng NCC
CREATE TABLE NCC (
  MaNCC INT IDENTITY(1,1) PRIMARY KEY,
  TrangThai NVARCHAR(10),
  TenNCC NVARCHAR(100),
  DiaChi NVARCHAR(100),
  SDT NVARCHAR(20)
);

-- Tạo bảng NHANVIEN
CREATE TABLE NHANVIEN (
  MaNV INT IDENTITY(1,1) PRIMARY KEY,
  Hoten NVARCHAR(50),
  TaiKhoan NVARCHAR(100),
  MatKhau NVARCHAR(100),
  SDT NVARCHAR(20),
  DiaChi NVARCHAR(100),
  Hinh NVARCHAR(100),
  TrangTrai NVARCHAR(100),
  Quyen NVARCHAR(50)
);

-- Tạo bảng SANPHAM
CREATE TABLE SANPHAM (
  MaSP INT IDENTITY(1,1) PRIMARY KEY,
  MaLoai INT,
  TenSP NVARCHAR(100),
  Mau NVARCHAR(10),
  SoLuong INT,
  DonGia INT,
  Hinh VARCHAR(100),
  MaNCC INT,
  TrangThai NVARCHAR(50),
);

-- Tạo bảng PHIEUNHAP
CREATE TABLE PHIEUNHAP (
    MAPHIEUNHAP INT NOT NULL IDENTITY,
    MaNV INT NOT NULL,
    NGAYNHAP DATETIME,
    TONGTIEN INT,
    PRIMARY KEY CLUSTERED (MAPHIEUNHAP ASC),
    CONSTRAINT FK_PHIEUNHAP_NHANVIEN FOREIGN KEY (MaNV) REFERENCES NHANVIEN (MaNV)
);

-- Tạo bảng CTPHIEUNHAP
CREATE TABLE CTPHIEUNHAP (
	MACTPN INT NOT NULL IDENTITY,
	MAPHIEUNHAP INT,
	MaSP INT,
	SOLUONGNHAP INT,
	DVT NVARCHAR(50),
	GIANHAP INT,
	THANHTIEN INT,
	PRIMARY KEY CLUSTERED (MACTPN ASC),
	CONSTRAINT FK_CTPHIEUNHAP_SANPHAM FOREIGN KEY(MaSP) REFERENCES SANPHAM (MaSP),
	CONSTRAINT FK_CTPHIEUNHAP_PHIEUNHAP FOREIGN KEY(MAPHIEUNHAP) REFERENCES PHIEUNHAP (MAPHIEUNHAP)
);

-- Thêm ràng buộc mặc định cho trường TrangThai trong bảng NCC
ALTER TABLE [dbo].[NCC]
ADD DEFAULT (N'Hiện') FOR [TrangThai]
GO

-- Thêm ràng buộc mặc định cho trường SoLuong trong bảng SANPHAM
ALTER TABLE [dbo].[SANPHAM]
ADD DEFAULT ((0)) FOR [SoLuong]
GO

-- Thêm ràng buộc mặc định cho trường Hinh trong bảng SANPHAM
ALTER TABLE [dbo].[SANPHAM]
ADD DEFAULT ('./Images/addphoto.png') FOR [Hinh]
GO

-- Thêm ràng buộc mặc định cho trường TrangThai trong bảng SANPHAM
ALTER TABLE [dbo].[SANPHAM]
ADD DEFAULT (N'Đang kinh doanh') FOR [TrangThai]
GO

-- Thêm ràng buộc khóa ngoại cho bảng CTHOADON tham chiếu đến bảng SANPHAM
ALTER TABLE [dbo].[CTHOADON]
WITH CHECK ADD CONSTRAINT [FK_CTHOADON_SANPHAM] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SANPHAM] ([MaSP])
GO
ALTER TABLE [dbo].[CTHOADON]
CHECK CONSTRAINT [FK_CTHOADON_SANPHAM]
GO

-- Thêm ràng buộc khóa ngoại cho bảng CTHOADON tham chiếu đến bảng HOADON
ALTER TABLE [dbo].[CTHOADON]
WITH CHECK ADD CONSTRAINT [FK_HOADON_CTHOADON] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HOADON] ([MaHD])
GO
ALTER TABLE [dbo].[CTHOADON]
CHECK CONSTRAINT [FK_HOADON_CTHOADON]
GO

-- Thêm ràng buộc khóa ngoại cho bảng HOADON tham chiếu đến bảng KHACHHANG
ALTER TABLE [dbo].[HOADON]
WITH CHECK ADD CONSTRAINT [FK_HOADON_KHACHHANG] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KHACHHANG] ([MaKH])
GO
ALTER TABLE [dbo].[HOADON]
CHECK CONSTRAINT [FK_HOADON_KHACHHANG]
GO

-- Thêm ràng buộc khóa ngoại cho bảng HOADON tham chiếu đến bảng NHANVIEN
ALTER TABLE [dbo].[HOADON]
WITH CHECK ADD CONSTRAINT [FK_HOADON_NHANVIEN] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NHANVIEN] ([MaNV])
GO
ALTER TABLE [dbo].[HOADON]
CHECK CONSTRAINT [FK_HOADON_NHANVIEN]
GO

-- Thêm ràng buộc khóa ngoại cho bảng SANPHAM tham chiếu đến bảng LOAISANPHAM
ALTER TABLE [dbo].[SANPHAM]
WITH CHECK ADD CONSTRAINT [FK_SANPHAM_LOAISANPHAM] FOREIGN KEY([MaLoai])
REFERENCES [dbo].[LOAISANPHAM] ([MaLoai])
GO
ALTER TABLE [dbo].[SANPHAM]
CHECK CONSTRAINT [FK_SANPHAM_LOAISANPHAM]
GO

-- Thêm ràng buộc khóa ngoại cho bảng SANPHAM tham chiếu đến bảng NCC
ALTER TABLE [dbo].[SANPHAM]
WITH CHECK ADD CONSTRAINT [FK_SANPHAM_NCC] FOREIGN KEY([MaNCC])
REFERENCES [dbo].[NCC] ([MaNCC])
GO
ALTER TABLE [dbo].[SANPHAM]
CHECK CONSTRAINT [FK_SANPHAM_NCC]
GO

-- Thêm ràng buộc kiểm tra cho trường TrangThai trong bảng NCC
ALTER TABLE [dbo].[NCC]
WITH CHECK ADD CONSTRAINT [chk_TrangThai] CHECK (([TrangThai]=N'Hiện' OR [TrangThai]=N'Ẩn'))
GO
ALTER TABLE [dbo].[NCC]
CHECK CONSTRAINT [chk_TrangThai]
GO

-- Thêm ràng buộc kiểm tra cho trường TrangThai trong bảng SANPHAM
ALTER TABLE [dbo].[SANPHAM]
WITH CHECK ADD CONSTRAINT [chk_TrangThaiNCC] CHECK (([TrangThai]=N'Ngừng kinh doanh' OR [TrangThai]=N'Đang kinh doanh'))
GO
ALTER TABLE [dbo].[SANPHAM]
CHECK CONSTRAINT [chk_TrangThaiNCC]
GO

SET IDENTITY_INSERT [dbo].[CTHOADON] ON 

INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (4, 34, 2, 3, 21000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (5, 34, 5, 4, 21000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (6, 35, 3, 3, 21000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (7, 35, 3, 4, 21000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (8, 38, 2, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (9, 39, 4, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (10, 41, 3, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (11, 41, 5, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (12, 41, 5, 1, 3000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (13, 43, 3, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (14, 43, 4, 2, 6000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (15, 44, 3, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (16, 44, 4, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (17, 46, 1, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (18, 46, 4, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (19, 46, 5, 2, 6000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (20, 47, 2, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (21, 47, 6, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (22, 49, 2, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (23, 51, 2, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (24, 51, 4, 5, 15000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (25, 51, 5, 5, 15000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (26, 51, 6, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (27, 51, 3, 5, 15000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (28, 52, 5, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (29, 52, 3, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (30, 52, 5, 5, 15000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (31, 52, 2, 5, 15000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (32, 53, 3, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (33, 53, 4, 5, 15000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (34, 57, 3, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (35, 57, 5, 5, 15000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (36, 57, 3, 10, 30000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (37, 59, 2, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (38, 59, 5, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (39, 59, 5, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (40, 60, 3, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (41, 60, 6, 5, 15000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (42, 60, 3, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (43, 62, 10, 5, 150000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (44, 65, 3, 5, 15000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (45, 65, 3, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (46, 66, 3, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (47, 66, 2, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (48, 67, 3, 3, 9000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (49, 68, 6, 4, 12000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (50, 69, 2, 8, 24000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (51, 69, 3, 1, 3000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (52, 70, 2, 2, 6000, NULL)
INSERT [dbo].[CTHOADON] ([MACTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [NgayBan]) VALUES (53, 70, 5, 5, 15000, NULL)
SET IDENTITY_INSERT [dbo].[CTHOADON] OFF
GO
SET IDENTITY_INSERT [dbo].[HOADON] ON 

INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (19, 1, 2, 10000, CAST(N'2023-05-12' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (20, 1, 2, 10000, CAST(N'2023-05-12' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (21, 1, 2, 10000, CAST(N'2023-05-12' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (22, NULL, 2, 10000, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (23, NULL, 2, 10000, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (24, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (25, 1, 2, 0, CAST(N'2023-05-13' AS Date), N'Chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (26, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (27, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (28, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (29, 1, 2, 0, CAST(N'2023-05-13' AS Date), N'Chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (30, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (31, 4, 2, 0, CAST(N'2023-05-13' AS Date), N'Chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (32, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (33, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (34, 2, 2, 0, CAST(N'2023-05-13' AS Date), N'Chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (35, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (36, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (37, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (38, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (39, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (40, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (41, 2, 2, 0, CAST(N'2023-05-13' AS Date), N'Chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (42, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (43, 2, 2, 0, CAST(N'2023-05-13' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (44, NULL, 2, 18000, CAST(N'2023-05-13' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (45, NULL, 2, NULL, CAST(N'2023-05-13' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (46, 2, 2, 27000, CAST(N'2023-05-13' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (47, 5, 2, 18000, CAST(N'2023-05-14' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (48, NULL, 2, NULL, CAST(N'2023-05-14' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (49, 1, 2, 9000, CAST(N'2023-05-14' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (50, 1, 2, 0, CAST(N'2023-05-15' AS Date), N'Chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (51, 4, 2, 63000, CAST(N'2023-05-15' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (52, 6, 3, 51000, CAST(N'2023-05-15' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (53, 4, 3, 27000, CAST(N'2023-05-15' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (57, 1, 3, 57000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (59, 7, 3, 30000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (60, NULL, 3, 12000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (62, 3, 3, 150000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (63, NULL, 3, NULL, CAST(N'2023-05-17' AS Date), N'chua thanh toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (65, 5, 3, 27000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (66, 4, 2, 21000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (67, 3, 3, 9000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (68, 2, 2, 12000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (69, 8, 3, 27000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (70, NULL, 2, 21000, CAST(N'2023-05-17' AS Date), N'Ðã Thanh Toán')
INSERT [dbo].[HOADON] ([MaHD], [MaKH], [MaNV], [ThanhTien], [NgayBan], [TrangThai]) VALUES (71, NULL, 2, NULL, CAST(N'2023-05-17' AS Date), N'chua thanh toán')
SET IDENTITY_INSERT [dbo].[HOADON] OFF
GO
SET IDENTITY_INSERT [dbo].[KHACHHANG] ON 

INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [Phai], [SDT], [DiaChi]) VALUES (1, N'Nguyen Bach Long', N'Nam', N'1111', N'Vung tàu')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [Phai], [SDT], [DiaChi]) VALUES (2, N'Long', N'Nữ', N'0303003', N'Phus yeuen')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [Phai], [SDT], [DiaChi]) VALUES (3, N'chau', N'Nam', N'0330303003', N'Vung tau')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [Phai], [SDT], [DiaChi]) VALUES (4, N'nghuyen', N'Nữ', N'2323', N'sdsd')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [Phai], [SDT], [DiaChi]) VALUES (5, N'Nguyen Bach Long', N'Nam', N'0366734760', N'Hufi')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [Phai], [SDT], [DiaChi]) VALUES (6, N'Nguyen Bach Long', N'Nam', N'03555', N'Tuy An Phu Yen')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [Phai], [SDT], [DiaChi]) VALUES (7, N'Dang thi minh Chau', N'Nữ', N'0303030', N'Sai gon')
INSERT [dbo].[KHACHHANG] ([MaKH], [TenKH], [Phai], [SDT], [DiaChi]) VALUES (8, N'Nguyen Duc An', N'Nam', N'03667346', N'Sai Gon')
SET IDENTITY_INSERT [dbo].[KHACHHANG] OFF
GO
SET IDENTITY_INSERT [dbo].[LOAISANPHAM] ON 

INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (1, N'Giấy in')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (2, N'Bìa đựng')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (3, N'Bút lông')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (4, N'Kẹp ')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (5, N'Sổ ')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (6, N'Gôm/bút tẩy xóa')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (7, N'băng keo')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (8, N' bút highlight')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (9, N'bút bi')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (10, N'bút chì')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (11, N'Giấy in')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (12, N'Bìa đựng')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (13, N'Bút lông')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (14, N'Kẹp ')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (15, N'Sổ ')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (16, N'Gôm/bút tẩy xóa')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (17, N'băng keo')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (18, N' bút highlight')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (19, N'bút bi')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (20, N'bút chì')
INSERT [dbo].[LOAISANPHAM] ([MaLoai], [TenLoai]) VALUES (21, N'hehe')
SET IDENTITY_INSERT [dbo].[LOAISANPHAM] OFF
GO
SET IDENTITY_INSERT [dbo].[NCC] ON 

INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (1, N'Hiện', N'Thiên Long', N'Hà Nội', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (2, N'Hiện', N'Officexinh', N'Hà Nội', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (3, N'Hiện', N'Bến Nghé', N'Hà Nội', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (4, N'Hiện', N'Campus ', N'Nhật Bản', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (5, N'Hiện', N'Bavico', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (6, N'Hiện', N'Deli', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (7, N'Hiện', N'Staedtler', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (8, N'Hiện', N'WinQ', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (9, N'Hiện', N'Pentel ', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (10, N'Hiện', N'Thiên Long', N'Hà Nội', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (11, N'Hiện', N'Officexinh', N'Hà Nội', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (12, N'Hiện', N'Bến Nghé', N'Hà Nội', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (13, N'Hiện', N'Campus ', N'Nhật Bản', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (14, N'Hiện', N'Bavico', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (15, N'Hiện', N'Deli', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (16, N'Hiện', N'Staedtler', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (17, N'Hiện', N'WinQ', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (18, N'Hiện', N'Pentel ', N'TP.HCM', N'0987654321')
INSERT [dbo].[NCC] ([MaNCC], [TrangThai], [TenNCC], [DiaChi], [SDT]) VALUES (19, N'Hiện', N'ừddf', N'fsdf', N'sdfsdf')
SET IDENTITY_INSERT [dbo].[NCC] OFF
GO
SET IDENTITY_INSERT [dbo].[NHANVIEN] ON 

INSERT [dbo].[NHANVIEN] ([MaNV], [Hoten], [TaiKhoan], [MatKhau], [SDT], [DiaChi], [Hinh], [TrangTrai], [Quyen]) VALUES (2, N'Long nguyen', N'Admin', N'123', N'Admin', N'Hh', N'null', N'Bình Thường', N'Admin')
INSERT [dbo].[NHANVIEN] ([MaNV], [Hoten], [TaiKhoan], [MatKhau], [SDT], [DiaChi], [Hinh], [TrangTrai], [Quyen]) VALUES (3, N'Chau', N'NVChau', N'1234', N'NVChau', N'sdsdsd', N'null', N'Bình Thường', N'Nhân viên')
INSERT [dbo].[NHANVIEN] ([MaNV], [Hoten], [TaiKhoan], [MatKhau], [SDT], [DiaChi], [Hinh], [TrangTrai], [Quyen]) VALUES (4, N'Nguyen Bach Long', N'khss', N'123', N'123', N'sdsd', N'null', N'Bình Thường', N'Admin')
INSERT [dbo].[NHANVIEN] ([MaNV], [Hoten], [TaiKhoan], [MatKhau], [SDT], [DiaChi], [Hinh], [TrangTrai], [Quyen]) VALUES (5, N'An', N'NVan', N'123', N'033', N'', N'', N'BT', N'Nhân Viên')
SET IDENTITY_INSERT [dbo].[NHANVIEN] OFF
GO
SET IDENTITY_INSERT [dbo].[SANPHAM] ON 

INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (1, 9, N'Bút Bi Thiên Long', N'Đen', 100, 3000, N'./Images/addphoto.png', 1, N'Đang kinh doanh')
INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (2, 9, N'Bút Máy', N'Đen', 0, 3000, N'./Images/addphoto.png', 1, N'Đang kinh doanh')
INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (3, 9, N'Bút Chì', N'Đen', 0, 3000, N'./Images/butbi1.jpg', 1, N'Đang kinh doanh')
INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (4, 9, N'Bút Bi Thiên Long', N'Đen', 100, 3000, N'./src/Images/', 1, N'Ngừng kinh doanh')
INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (5, 9, N'Bút Máy', N'Đen', 0, 3000, N'./src/Images/', 1, N'Đang kinh doanh')
INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (6, 9, N'Bút Chì', N'Đen', 26, 3000, N'./Images/addphoto.png', 1, N'Đang kinh doanh')
INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (7, 11, N'Long hehe', N'Đen', 0, NULL, N'./src/Images/', 10, N'Đang kinh doanh')
INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (8, 19, N'Bút Chì', N'Đen', 0, NULL, N'./src/Images/', 10, N'Đang kinh doanh')
INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (9, 19, N'sdsd', N'sdsd', 233, NULL, N'./src/Images/', 10, N'Đang kinh doanh')
INSERT [dbo].[SANPHAM] ([MaSP], [MaLoai], [TenSP], [Mau], [SoLuong], [DonGia], [Hinh], [MaNCC], [TrangThai]) VALUES (10, 19, N'zxcx', N'sdsd', 323, 30000, N'./src/Images/', 10, N'Đang kinh doanh')
SET IDENTITY_INSERT [dbo].[SANPHAM] OFF

CREATE TRIGGER trg_UpdateSoLuongSanPham
ON CTHOADON
AFTER INSERT
AS
BEGIN
    -- Lấy thông tin sản phẩm từ bảng CTHOADON và số lượng sản phẩm bán
    DECLARE @MaSP INT;
    DECLARE @SoLuongBan INT;

    SELECT @MaSP = inserted.MaSP, @SoLuongBan = inserted.SoLuong
    FROM inserted;

    -- Cập nhật số lượng sản phẩm trong bảng SANPHAM
    UPDATE SANPHAM
    SET SoLuong = SoLuong - @SoLuongBan
    WHERE MaSP = @MaSP;
END;

create trigger capnhattongtien_phieunhap_khithemctphieunhap on CTPHIEUNHAP 
after insert 
as
begin
	update PHIEUNHAP
	set TONGTIEN=TONGTIEN+(
	select THANHTIEN
	from inserted
	where MAPHIEUNHAP=PHIEUNHAP.MAPHIEUNHAP
	)
	from PHIEUNHAP
	join inserted on PHIEUNHAP.MAPHIEUNHAP=inserted.MAPHIEUNHAP
end
go
create trigger capnhattongtien_phieunhap_khixoactphieunhap on CTPHIEUNHAP 
after delete 
as
begin
	update PHIEUNHAP
	set TONGTIEN=TONGTIEN-(
	select THANHTIEN
	from deleted
	where MAPHIEUNHAP=PHIEUNHAP.MAPHIEUNHAP
	)
	from PHIEUNHAP
	join deleted on PHIEUNHAP.MAPHIEUNHAP=deleted.MAPHIEUNHAP
end

CREATE TRIGGER CapNhatSoLuong ON CTPHIEUNHAP
AFTER INSERT 
AS
BEGIN
    -- Lấy thông tin sản phẩm từ bảng CTPHIEUNHAP và số lượng sản phẩm nhập
    DECLARE @MaSP INT;
    DECLARE @SoLuongNhap INT;

    SELECT @MaSP = inserted.MaSP, @SoLuongNhap = inserted.SOLUONGNHAP
    FROM inserted;

    -- Cập nhật số lượng sản phẩm trong bảng SANPHAM
    UPDATE SANPHAM
    SET SoLuong = SoLuong + @SoLuongNhap
    WHERE MaSP = @MaSP;
END;

CREATE TRIGGER CapNhatDonGia ON CTPHIEUNHAP
AFTER INSERT 
AS
BEGIN
    -- Lấy thông tin sản phẩm từ bảng CTPHIEUNHAP và đơn giá nhập
    DECLARE @MaSP INT;
    DECLARE @dongianhap INT;

    SELECT @MaSP = inserted.MaSP, @dongianhap = inserted.GIANHAP
    FROM inserted;

    -- Cập nhật số lượng sản phẩm trong bảng SANPHAM
    UPDATE SANPHAM
    SET DonGia = @dongianhap * 1.3
    WHERE MaSP = @MaSP;
END;