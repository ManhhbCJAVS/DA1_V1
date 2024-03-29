--DROP DATABASE  DB_DA1_Final 
--GO
--use master
Create Database DB_DA1_Final 
GO	   
USE DB_DA1_Final
GO
/****** Object:  Table [dbo].[tbl_tenGiay]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_tenGiay](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[tenGiay] [nvarchar](50) NULL,
	[trangThai] [nvarchar](50) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_tenGiay] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
--GO
/****** Object:  Table [dbo].[tbl_anh]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_anh](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_SPCT] [int] NULL,
	[TenAnh] [nvarchar](150) NULL,
	[TrangThai] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NgaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_anh] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_chatLieu]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_chatLieu](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[TenCL] [nvarchar](50) NULL,
	[trangThai] [nvarchar](50) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_chatLieu] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_dayGiay]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_dayGiay](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[TenDayGiay] [nvarchar](50) NULL,
	[trangThai] [nvarchar](150) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_dayGiay] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_deGiay]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_deGiay](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[loaiDeGiay] [nvarchar](150) NULL,
	[trangThai] [nvarchar](50) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_deGiay] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_kichCo]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_kichCo](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[kichCo] [int] NULL,
	[trangThai] [nvarchar](50) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_kichCo] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_mauSac]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_mauSac](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[tenMauSac] [nvarchar](50) NULL,
	[trangThai] [nvarchar](50) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_mauSac] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_thuongHieu]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_thuongHieu](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[tenThuongHieu] [nvarchar](50) NULL,
	[trangThai] [nvarchar](50) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_thuongHieu] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

/****** Object:  Table [dbo].[tbl_spct]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_spct](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_tenGiay] [int] NULL,
	[ID_chatLieu] [int] NULL,
	[ID_dayGiay] [int] NULL,
	[ID_deGiay] [int] NULL,
	[ID_mauSac] [int] NULL,
	[ID_kichCo] [int] NULL,
	[ID_thuongHieu] [int] NULL,
	[ID_anh] [int] NULL,
	[soLuong] [int] NULL,
	[giaBan] [decimal](25) NULL,
	[moTa] [nvarchar](255) NULL,
	[QRCode] [nvarchar](255) NULL,
	[trangThai] [nvarchar](50) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
	[xoaMem] [bit] NULL, --0 là  chưa xóa = false , 1 là đã xóa = true
 CONSTRAINT [PK_tbl_spct] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



/****** Object:  Table [dbo].[tbl_khachHang]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_khachHang](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[maKH] [nvarchar](50) NULL,
	[hoTen] [nvarchar](50) NULL,
	[gioiTinh] [bit] NULL,
	[soDT] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[diaChi] [nvarchar](max) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_khachHang] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

/****** Object:  Table [dbo].[tbl_nhanVien]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_nhanVien](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[maNhanVien] [nvarchar](50) NULL,
	[chucVu] [bit] NULL,
	[hoTen] [nvarchar](50) NULL,
	[gioiTinh] [bit] NULL,
	[ngaySinh] [date] NULL,
	[soDT] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[matKhau] [nvarchar](50) NULL,
	[diaChi] [nvarchar](max) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
	[deleted] [bit] NULL,
 CONSTRAINT [PK_tbl_nhanVien] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_hinhThucThanhToan]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_hinhThucThanhToan](
	[ID_HTTT] [int] IDENTITY(1,1) NOT NULL,
	[tenHinhThucThanhToan] [nvarchar](150) NULL,
	[moTa] [nvarchar](max) NULL,
	[trangThai] [int] NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_hinhThucThanhToan_1] PRIMARY KEY CLUSTERED 
(
	[ID_HTTT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

/****** Object:  Table [dbo].[tbl_thanhToan]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_thanhToan](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[id_hoaDon] [int] NULL,
	[id_HTTT] [int] NULL,
	[soTienThanhToan] [decimal](18, 3) NULL,
	[maGiaoDich] [nvarchar](max) NULL,
	[moTa] [nvarchar](100) NULL,
	[trangThai] [nvarchar](100) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTaoThanhToan] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_thanhToan] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

/****** Object:  Table [dbo].[tbl_trangThaiHoaDon]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_trangThaiHoaDon](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[tenTTHD] [nvarchar](100) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
	[xoaMem] [int] NULL,
 CONSTRAINT [PK_tbl_trangThaiHoaDon] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_trangThaiThanhToan]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_trangThaiThanhToan](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[tenTrangThaiThanhToan] [nvarchar](max) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
	[xoaMem] [int] NULL,
 CONSTRAINT [PK_tbl_trangThaiThanhToan] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_hoaDon]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_hoaDon](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_khachHang] [int] NULL,
	[ID_nhanVien] [int] NULL,
	[ID_ThanhToan] [int] NULL,
	[ID_voucher] [int] NULL,
	[ID_trangThaiHoaDon] [int] NULL,
	[ID_trangThaiThanhToan] [int] NULL,

	[loaiHoaDon] [nvarchar](150) NULL,
	[tongGiaTriHoaDon] [decimal](18, 0) NULL,
	[giamGiaHD] [decimal](18, 0) NULL,
	[thanhToan] [decimal](18, 0) NULL,
	[tienThua] [decimal](18) NULL,
	[tenNguoiNhan] [nvarchar](150) NULL,
	[sdtNguoiNhan] [nvarchar](50) NULL,
	[diaChiNguoiNhan] [nvarchar](max) NULL,
	[nguoiShip] [nvarchar](100) NULL,
	[sdtNguoiShip] [nvarchar](50) NULL,
	[phiShip] [decimal](18, 0) NULL,
	[ghiChuShip] [nvarchar](max) NULL,
	[ngayMuonNhanHang] [datetime] NULL,
	[tienKhachDua] [decimal](18) NULL,
	[tienKhachCK] [decimal](18) NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
 CONSTRAINT [PK_tbl_hoaDon] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_hoaDonChiTiet]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_hoaDonChiTiet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_hoaDon] [int] NULL,
	[ID_sanPhamChiTiet] [int] NULL,
	[soLuong] [int] NULL,
	[giaTienTra] [decimal](18, 0) NULL,
	[donGia] [decimal](18, 0) NULL,
 CONSTRAINT [PK_tbl_hoaDonChiTiet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_voucher]    Script Date: 12/6/2023 10:15:08 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_voucher](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[maVoucher] [nvarchar](100) NULL,
	[moTaVoucher] [nvarchar](100) NULL,
	[hinhThucVoucher] [nvarchar](255) NULL,
	[giaTriVoucher] [decimal](18) NULL,
	[giaTriToiDaVoucher] [decimal](18) NULL,
	[soLuongVoucher] [int] NULL,
	[ngayBatDau] [datetime] NULL,
	[ngayKetThuc] [datetime] NULL,
	[trangThai] [int] NULL,
	[nguoiTao] [int] NULL,
	[nguoiSua] [int] NULL,
	[ngayTao] [datetime] NULL,
	[ngaySua] [datetime] NULL,
	[giaTriApDungVoucher] [decimal](18) NULL,
	[deleted] [bit] NULL,	 -- 0 ( false ) là đã xóa. 1 ( true ) chưa xóa.
 CONSTRAINT [PK_tbl_voucher] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tbl_anh] ON 
INSERT [dbo].[tbl_anh] ([ID], [ID_SPCT], [TenAnh], [TrangThai], [NguoiTao], [NguoiSua], [NgayTao], [NgaySua]) VALUES (1, 1, N'giay-puma-pwrframe-tr-2-nam-den-xanh-01-200x400.png', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:48:31.463' AS DateTime), CAST(N'2023-12-03T11:48:31.463' AS DateTime))
INSERT [dbo].[tbl_anh] ([ID], [ID_SPCT], [TenAnh], [TrangThai], [NguoiTao], [NguoiSua], [NgayTao], [NgaySua]) VALUES (2, 2, N'giay-puma-court-star-sl-nam-trang-den-01-200x400.png', N'Đang Áp Dụng', 1, 1, CAST(N'2023-12-03T11:48:31.463' AS DateTime), CAST(N'2023-12-03T11:48:31.463' AS DateTime))
INSERT [dbo].[tbl_anh] ([ID], [ID_SPCT], [TenAnh], [TrangThai], [NguoiTao], [NguoiSua], [NgayTao], [NgaySua]) VALUES (3, 3, N'Asics200x400.png', N'Đang Áp Dụng', 1, 1, CAST(N'2023-12-03T11:48:31.463' AS DateTime), CAST(N'2023-12-03T11:48:31.463' AS DateTime))
INSERT [dbo].[tbl_anh] ([ID], [ID_SPCT], [TenAnh], [TrangThai], [NguoiTao], [NguoiSua], [NgayTao], [NgaySua]) VALUES (4, 4, N'Nike200x400.png', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:48:31.463' AS DateTime), CAST(N'2023-12-03T11:48:31.463' AS DateTime))
INSERT [dbo].[tbl_anh] ([ID], [ID_SPCT], [TenAnh], [TrangThai], [NguoiTao], [NguoiSua], [NgayTao], [NgaySua]) VALUES (5, 5, N'Adidas200x400.jpg', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:48:31.463' AS DateTime), CAST(N'2023-12-03T11:48:31.463' AS DateTime))
SET IDENTITY_INSERT [dbo].[tbl_anh] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_chatLieu] ON 

INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (1, N'Da', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (2, N'Vải', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (3, N'Nỉ', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (4, N'Cao Su', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (5, N'mesh', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (6, N'Polyester', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (7, N'EVA Foam', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (8, N'Knit Fabric', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (9, N'Neoprene', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
INSERT [dbo].[tbl_chatLieu] ([ID], [TenCL], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (10, N'Phylon Foam', N'Đang áp dụng', 1, 1, CAST(N'2023-12-06T17:43:21.880' AS DateTime), CAST(N'2023-12-06T17:43:21.880' AS DateTime))
SET IDENTITY_INSERT [dbo].[tbl_chatLieu] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_dayGiay] ON 

INSERT [dbo].[tbl_dayGiay] ([ID], [TenDayGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (1, N'Dây Giày Thể Thao', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.183' AS DateTime), CAST(N'2023-12-03T11:47:44.183' AS DateTime))
INSERT [dbo].[tbl_dayGiay] ([ID], [TenDayGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (2, N'Dây Giày Da', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.183' AS DateTime), CAST(N'2023-12-03T11:47:44.183' AS DateTime))
INSERT [dbo].[tbl_dayGiay] ([ID], [TenDayGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (3, N'Dây Giày Dù', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.183' AS DateTime), CAST(N'2023-12-03T11:47:44.183' AS DateTime))
INSERT [dbo].[tbl_dayGiay] ([ID], [TenDayGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (4, N'Dây Giày Thủ Công', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.183' AS DateTime), CAST(N'2023-12-03T11:47:44.183' AS DateTime))
INSERT [dbo].[tbl_dayGiay] ([ID], [TenDayGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (5, N'Dây Giày Phản Quang', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.183' AS DateTime), CAST(N'2023-12-03T11:47:44.183' AS DateTime))
INSERT [dbo].[tbl_dayGiay] ([ID], [TenDayGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (6, N'Dây Giày F26_New', N'Dừng áp dụng', 3, 4, NULL, NULL)
SET IDENTITY_INSERT [dbo].[tbl_dayGiay] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_deGiay] ON 

INSERT [dbo].[tbl_deGiay] ([ID], [loaiDeGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (1, N'Cao Su', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.223' AS DateTime), CAST(N'2023-12-03T11:47:44.223' AS DateTime))
INSERT [dbo].[tbl_deGiay] ([ID], [loaiDeGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (2, N'Da', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.223' AS DateTime), CAST(N'2023-12-03T11:47:44.223' AS DateTime))
INSERT [dbo].[tbl_deGiay] ([ID], [loaiDeGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (3, N'Ðinh', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.223' AS DateTime), CAST(N'2023-12-03T11:47:44.223' AS DateTime))
INSERT [dbo].[tbl_deGiay] ([ID], [loaiDeGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (4, N'EVA', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.223' AS DateTime), CAST(N'2023-12-03T11:47:44.223' AS DateTime))
INSERT [dbo].[tbl_deGiay] ([ID], [loaiDeGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (5, N'PU', N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.223' AS DateTime), CAST(N'2023-12-03T11:47:44.223' AS DateTime))
INSERT [dbo].[tbl_deGiay] ([ID], [loaiDeGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (6, N'Vải nguyên chất', N'Dừng áp dụng', 2, 3, NULL, NULL)
SET IDENTITY_INSERT [dbo].[tbl_deGiay] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_hinhThucThanhToan] ON 

INSERT [dbo].[tbl_hinhThucThanhToan] ([ID_HTTT], [tenHinhThucThanhToan], [moTa], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (1, N'Tiền Mặt', N'Là tiền mặt nhân viên nhận khi khách hàng đưa', 1, 1, NULL, NULL, NULL)
INSERT [dbo].[tbl_hinhThucThanhToan] ([ID_HTTT], [tenHinhThucThanhToan], [moTa], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (2, N'Chuyển Khoản', N'Là tiền mặt nhân viên nhận khi khách hàng đưa', 1, 2, NULL, NULL, NULL)
INSERT [dbo].[tbl_hinhThucThanhToan] ([ID_HTTT], [tenHinhThucThanhToan], [moTa], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (3, N'Kết Hợp', N'Là tiền mặt nhân viên nhận khi khách hàng đưa', 1, 3, NULL, NULL, NULL)
SET IDENTITY_INSERT [dbo].[tbl_hinhThucThanhToan] OFF
GO

GO
INSERT [dbo].[tbl_khachHang] ( [maKH] , [hoTen] ) VALUES ( N'KH001', N'Khách Vãng Lai');
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH002', N'Hoàng Thu Trang', 1, N'0382302383', N'tranghtph40450@gmail.com', N'Hồ Chí Minh', 1, 1);
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH003', N'Nguyễn Hồng Ánh', 0, N'0373928312', N'anhnhph40387@gmail.com', N'Vĩnh Phúc', 2, 2);			  
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH004', N'Nguyễn Tuấn Anh', 0, N'0329723892', N'anhntph41928@gmail.com', N'Hà Nội', 2, 3)		  ;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH005', N'Nguyễn Hồng Nhung', 1, N'0376182192', N'nhungnhph30238@gmail.com', N'Hà Nam', 1, 2	  );
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH006', N'Nguyễn Thị Hoa', 1, N'0384727912', N'hoantph39238@gmail.com', N'Quảng Ninh', 2, 2 );
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH007', N'Nguyễn Mạnh Huy', 0, N'0372847261', N'huynhph30272@gmail.com', N'Thanh Hoá', 1, 3) ;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH008', N'Trần Duy Hùng', 0, N'0318304829', N'hungtdph39127@gmail.com', N'Ninh Bình', 2, 2) 	;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH009', N'Mai Thuỳ Linh', 1, N'0323819382', N'linhmtph58271@gmail.com', N'Hải Dương', 2, 3) 	;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH010', N'Trần Ngọc Linh', 1, N'0928371827', N'linhtnph28237@gmail.com', N'Hải Phòng', 1, 4)	;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH011', N'Trần Văn Đức', 0, N'0374018392', N'ductvph39832@gmail.com', N'Hồ Chí Minh', 2, 5)	 ;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH012', N'Nguyễn Ngọc Lan', 1, N'0312738291', N'lannnph39381@gmail.com', N'Ninh Bình', 3, 3)	 ;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH013', N'Nguyễn Văn Mạnh', 0, N'0371623827', N'manhnvph29182@gmail.com', N'Hải Dương', 4, 3)	 ;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH014', N'Nguyễn Trung Kiên', 0, N'0312739472', N'kiennvph17293@gmail.com', N'Quảng Ninh', 2, 2) ;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH015', N'Nguyễn Ánh Ngọc', 1, N'0322381028', N'ngocnaph39182@gmail.com', N'Hà Nội', 2, 2)	 ;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH016', N'Nguyễn Công Ninh', 0, N'0384937294', N'ninhncph39831@gmail.com', N'Hà Nội', 3, 1)	  ;
INSERT [dbo].[tbl_khachHang] ( [maKH], [hoTen], [gioiTinh], [soDT], [email], [diaChi], [nguoiTao], [nguoiSua]) VALUES ( N'KH0011', N'Hoàng Thu Trang', 1, N'0382302385', N'tranghtph40450@gmail.com', N'Hồ Chí Minh', 2, 2 );

GO
SET IDENTITY_INSERT [dbo].[tbl_kichCo] ON 

INSERT [dbo].[tbl_kichCo] ([ID], [kichCo], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (1, 35, N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.257' AS DateTime), CAST(N'2023-12-03T11:47:44.257' AS DateTime))
INSERT [dbo].[tbl_kichCo] ([ID], [kichCo], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (2, 36, N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.257' AS DateTime), CAST(N'2023-12-03T11:47:44.257' AS DateTime))
INSERT [dbo].[tbl_kichCo] ([ID], [kichCo], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (3, 37, N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.257' AS DateTime), CAST(N'2023-12-03T11:47:44.257' AS DateTime))
INSERT [dbo].[tbl_kichCo] ([ID], [kichCo], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (4, 38, N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.257' AS DateTime), CAST(N'2023-12-03T11:47:44.257' AS DateTime))
INSERT [dbo].[tbl_kichCo] ([ID], [kichCo], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (5, 39, N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.257' AS DateTime), CAST(N'2023-12-03T11:47:44.257' AS DateTime))
INSERT [dbo].[tbl_kichCo] ([ID], [kichCo], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (6, 40, N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.257' AS DateTime), CAST(N'2023-12-03T11:47:44.257' AS DateTime))
INSERT [dbo].[tbl_kichCo] ([ID], [kichCo], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (7, 41, N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.257' AS DateTime), CAST(N'2023-12-03T11:47:44.257' AS DateTime))
INSERT [dbo].[tbl_kichCo] ([ID], [kichCo], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (8, 42, N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.257' AS DateTime), CAST(N'2023-12-03T11:47:44.257' AS DateTime))
INSERT [dbo].[tbl_kichCo] ([ID], [kichCo], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (9, 43, N'Đang áp dụng', 1, 1, CAST(N'2023-12-03T11:47:44.257' AS DateTime), CAST(N'2023-12-03T11:47:44.257' AS DateTime))
SET IDENTITY_INSERT [dbo].[tbl_kichCo] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_mauSac] ON 

INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (1, N'Đen', N'Đang áp dụng', 1, 2, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (2, N'Trắng', N'Đang áp dụng', 3, 1, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (3, N'Đỏ', N'Đang áp dụng', 4, 2, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (4, N'Xanh Dương', N'Đang áp dụng', 3, 4, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (5, N'Xanh Lá', N'Đang áp dụng', 3, 4, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (6, N'Vàng', N'Đang áp dụng', 4, 1, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (7, N'Nâu', N'Đang áp dụng', 5, 2, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (8, N'Hồng', N'Đang áp dụng', 4, 4, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (9, N'Cam', N'Đang áp dụng', 4, 3, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (10, N'Tím', N'Đang áp dụng', 6, 5, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
INSERT [dbo].[tbl_mauSac] ([ID], [tenMauSac], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (11, N'Lục Cầu', N'Đang áp dụng', 2, 1, CAST(N'2023-12-03T11:47:44.273' AS DateTime), CAST(N'2023-12-03T11:47:44.273' AS DateTime))
SET IDENTITY_INSERT [dbo].[tbl_mauSac] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_nhanVien] ON 

INSERT [dbo].[tbl_nhanVien] ([ID], [maNhanVien], [chucVu], [hoTen], [gioiTinh], [ngaySinh], [soDT], [email], [matKhau], [diaChi], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [deleted]) VALUES (1, N'NV01', 1, N'Hoàng Thu Trang', 1, CAST(N'2002-04-29' AS Date), N'0867224231', N'thutrang29204@gmail.com', N'29042002', N'Thạch Hòa', 5, 2, CAST(N'2020-12-15T00:00:00.000' AS DateTime), CAST(N'2020-12-25T00:00:00.000' AS DateTime), 1)
INSERT [dbo].[tbl_nhanVien] ([ID], [maNhanVien], [chucVu], [hoTen], [gioiTinh], [ngaySinh], [soDT], [email], [matKhau], [diaChi], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [deleted]) VALUES (2, N'NV02', 1, N'Nguyễn Hoài Thu', 1, CAST(N'2004-10-22' AS Date), N'0376558965', N'nguyenhoaithu22102004@gmail.com', N'22102004', N'Tân Xã', 3, 5, CAST(N'2021-04-10T00:00:00.000' AS DateTime), CAST(N'2021-07-18T00:00:00.000' AS DateTime), 1)
INSERT [dbo].[tbl_nhanVien] ([ID], [maNhanVien], [chucVu], [hoTen], [gioiTinh], [ngaySinh], [soDT], [email], [matKhau], [diaChi], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [deleted]) VALUES (3, N'NV03', 0, N'Nguyễn Hồng Ánh', 0, CAST(N'2005-12-15' AS Date), N'0988955601', N'anhnhph40378@fpt.edu.vn', N'12122005', N'Hạ Bằng', 2, 3, CAST(N'2020-10-20T00:00:00.000' AS DateTime), CAST(N'2020-11-21T00:00:00.000' AS DateTime), 1)
INSERT [dbo].[tbl_nhanVien] ([ID], [maNhanVien], [chucVu], [hoTen], [gioiTinh], [ngaySinh], [soDT], [email], [matKhau], [diaChi], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [deleted]) VALUES (4, N'NV04', 1, N'mạnh', 0, CAST(N'2023-12-08' AS Date), N'0123456789', N'mahhbph40818@gmail.com', N'26102001', N'Hà Nội', 0, 0, NULL, NULL, 1)
INSERT [dbo].[tbl_nhanVien] ([ID], [maNhanVien], [chucVu], [hoTen], [gioiTinh], [ngaySinh], [soDT], [email], [matKhau], [diaChi], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [deleted]) VALUES (5, N'NV05', 1, N'Ngô Mạnh Cường', 0, CAST(N'2000-07-15' AS Date), N'0374779766', N'cuongnmph40460@fpt.edu.vn', N'18072000', N'Quốc Oai', 2, 6, CAST(N'2023-08-05T00:00:00.000' AS DateTime), CAST(N'2023-10-09T00:00:00.000' AS DateTime), 1)
INSERT [dbo].[tbl_nhanVien] ([ID], [maNhanVien], [chucVu], [hoTen], [gioiTinh], [ngaySinh], [soDT], [email], [matKhau], [diaChi], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [deleted]) VALUES (6, N'NV06', 0, N'Nguyễn Thùy Trang', 1, CAST(N'1980-03-10' AS Date), N'0335076103', N'thutrang204201@gmail.com', N'10031980', N'Cầu Giấy', 3, 6, CAST(N'2020-10-10T00:00:00.000' AS DateTime), CAST(N'2023-10-09T00:00:00.000' AS DateTime), 1)
INSERT [dbo].[tbl_nhanVien] ([ID], [maNhanVien], [chucVu], [hoTen], [gioiTinh], [ngaySinh], [soDT], [email], [matKhau], [diaChi], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [deleted]) VALUES (7, N'NV07', 1, N'Đặng Văn Huy', 0, CAST(N'1999-10-12' AS Date), N'0374779766', N'huydv1999@gmail.com', N'12101999', N'Hà Đông', 3, 2, CAST(N'2021-11-10T00:00:00.000' AS DateTime), CAST(N'2021-12-15T00:00:00.000' AS DateTime), 1)
INSERT [dbo].[tbl_nhanVien] ([ID], [maNhanVien], [chucVu], [hoTen], [gioiTinh], [ngaySinh], [soDT], [email], [matKhau], [diaChi], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [deleted]) VALUES (8, N'NV08', 1, N'Nguyễn Văn Hưng', 0, CAST(N'2003-10-11' AS Date), N'0989003821', N'hungnv203@gmail.com', N'11102003', N'Thạch Thất', 4, 2, CAST(N'2023-03-10T00:00:00.000' AS DateTime), CAST(N'2023-04-11T00:00:00.000' AS DateTime), 1)
INSERT [dbo].[tbl_nhanVien] ([ID], [maNhanVien], [chucVu], [hoTen], [gioiTinh], [ngaySinh], [soDT], [email], [matKhau], [diaChi], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [deleted]) VALUES (9, N'NV09', 1, N'mạnh', 0, CAST(N'2023-12-08' AS Date), N'0123456789', N'mahhbph40818@gmail.com', NULL, N'Hà Nội', 0, 0, NULL, NULL, 1)
SET IDENTITY_INSERT [dbo].[tbl_nhanVien] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_spct] ON 

INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (1, 2, 1, 1, 2, 2, 2, 2, 1, 12, CAST(230.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và đinh', N'QR101', N'Ðang Kinh Doanh', 1, 4, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (2, 2, 3, 1, 1, 1, 1, 1, 2, 10, CAST(340.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da', N'QR123', N'Ðang Kinh Doanh', 2, 1, CAST(N'2023-11-28T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (3, 2, 2, 2, 2, 2, 2, 2, 3, 15, CAST(430.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải', N'QR456', N'Ðang Kinh Doanh', 3, 1, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (4, 2, 3, 3, 3, 3, 3, 3, 4, 20, CAST(250.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 4, 1, CAST(N'2023-12-01T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (5, 2, 4, 4, 5, 3, 3, 3, 5, 20, CAST(564.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 5, 4, CAST(N'2023-12-02T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (6, 2, 5, 2, 1, 3, 3, 3, 4, 8, CAST(234.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải và PU', N'QR202', N'Ðang Kinh Doanh', 6, 3, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (7, 2, 6, 1, 2, 2, 2, 2, 5, 12, CAST(443.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và đinh', N'QR101', N'Ðang Kinh Doanh', 3, 2, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (8, 2, 7, 1, 1, 1, 1, 1, 3, 10, CAST(579.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da', N'QR123', N'Ðang Kinh Doanh', 1, 1, CAST(N'2023-11-28T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (9, 2, 8, 2, 2, 2, 2, 2, 2, 15, CAST(877.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải', N'QR456', N'Ðang Kinh Doanh', 4, 3, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (10, 2, 9, 3, 3, 3, 3, 3, 1, 20, CAST(1200.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 5, 2, CAST(N'2023-12-01T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (11, 2, 10, 4, 5, 3, 3, 3, 3, 20, CAST(3400.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 4, 3, CAST(N'2023-12-02T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (12, 3, 3, 2, 1, 3, 3, 3, 5, 8, CAST(450.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải và PU', N'QR202', N'Ðang Kinh Doanh', 1, 1, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (13, 2, 4, 1, 2, 2, 2, 2, 1, 12, CAST(600.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và đinh', N'QR101', N'Ðang Kinh Doanh', 1, 4, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (14, 1, 3, 1, 1, 1, 1, 1, 2, 10, CAST(650.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da', N'QR123', N'Ðang Kinh Doanh', 2, 1, CAST(N'2023-11-28T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (15, 2, 2, 2, 2, 2, 2, 2, 3, 15, CAST(760.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải', N'QR456', N'Ðang Kinh Doanh', 3, 1, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (16, 2, 6, 3, 3, 3, 3, 3, 4, 20, CAST(750.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 4, 1, CAST(N'2023-12-01T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (17, 2, 7, 4, 5, 3, 3, 3, 5, 20, CAST(456.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 5, 4, CAST(N'2023-12-02T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (18, 2, 8, 2, 1, 3, 3, 3, 4, 8, CAST(880.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải và PU', N'QR202', N'Ðang Kinh Doanh', 6, 3, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (19, 2, 3, 1, 2, 2, 2, 2, 5, 12, CAST(790.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và đinh', N'QR101', N'Ðang Kinh Doanh', 3, 2, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (20, 1, 9, 1, 1, 1, 1, 1, 3, 10, CAST(900.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da', N'QR123', N'Ðang Kinh Doanh', 1, 1, CAST(N'2023-11-28T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (21, 2, 5, 2, 2, 2, 2, 2, 2, 15, CAST(680.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải', N'QR456', N'Ðang Kinh Doanh', 4, 3, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (22, 2, 8, 3, 3, 3, 3, 3, 1, 20, CAST(990.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 5, 2, CAST(N'2023-12-01T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (23, 3, 5, 4, 5, 3, 3, 3, 3, 20, CAST(879.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 4, 3, CAST(N'2023-12-02T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (24, 3, 4, 2, 1, 3, 3, 3, 5, 8, CAST(980.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải và PU', N'QR202', N'Ðang Kinh Doanh', 1, 1, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (25, 3, 5, 4, 5, 3, 3, 3, 3, 20, CAST(390.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 4, 3, CAST(N'2023-12-02T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (26, 3, 6, 2, 1, 3, 3, 3, 5, 8, CAST(440.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải và PU', N'QR202', N'Ðang Kinh Doanh', 1, 1, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (27, 2, 7, 1, 2, 2, 2, 2, 1, 12, CAST(554.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và đinh', N'QR101', N'Ðang Kinh Doanh', 1, 4, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (28, 1, 8, 1, 1, 1, 1, 1, 2, 10, CAST(555.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da', N'QR123', N'Ðang Kinh Doanh', 2, 1, CAST(N'2023-11-28T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (29, 2, 8, 2, 2, 2, 2, 2, 3, 15, CAST(666.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải', N'QR456', N'Ðang Kinh Doanh', 3, 1, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (30, 3, 5, 3, 3, 3, 3, 3, 4, 20, CAST(777.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 4, 1, CAST(N'2023-12-01T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (31, 3, 4, 4, 5, 3, 3, 3, 5, 20, CAST(888.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 5, 4, CAST(N'2023-12-02T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (32, 3, 5, 2, 1, 3, 3, 3, 4, 8, CAST(999.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải và PU', N'QR202', N'Ðang Kinh Doanh', 6, 3, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (33, 2, 6, 1, 2, 2, 2, 2, 5, 12, CAST(984.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và đinh', N'QR101', N'Ðang Kinh Doanh', 3, 2, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (34, 1, 7, 1, 1, 1, 1, 1, 3, 10, CAST(1450.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da', N'QR123', N'Ðang Kinh Doanh', 1, 1, CAST(N'2023-11-28T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (35, 2, 8, 2, 2, 2, 2, 2, 2, 15, CAST(2000.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải', N'QR456', N'Ðang Kinh Doanh', 4, 3, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (36, 3, 3, 3, 3, 3, 3, 3, 1, 20, CAST(3500.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 5, 2, CAST(N'2023-12-01T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (37, 3, 5, 4, 5, 3, 3, 3, 3, 20, CAST(4300.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu da và vải', N'QR789', N'Ðang Kinh Doanh', 4, 3, CAST(N'2023-12-02T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
INSERT [dbo].[tbl_spct] ([ID], [ID_tenGiay], [ID_chatLieu], [ID_dayGiay], [ID_deGiay], [ID_mauSac], [ID_kichCo], [ID_thuongHieu], [ID_anh], [soLuong], [giaBan], [moTa], [QRCode], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (38, 3, 6, 2, 1, 3, 3, 3, 5, 8, CAST(6500.000 AS Decimal(25, 3)), N'Giày thể thao chất liệu vải và PU', N'QR202', N'Ðang Kinh Doanh', 1, 1, CAST(N'2023-12-03T11:48:26.777' AS DateTime), CAST(N'2023-12-03T11:48:26.777' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[tbl_spct] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_tenGiay] ON 

INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (1, N'Nike Air Force', N'Đang Kinh Doanh', 2, 1, CAST(N'2023-11-29T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (2, N'Adidas Stan Smith', N'Đang Kinh Doanh', 3, 2, CAST(N'2023-12-01T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (3, N'Jordan Retro', N'Đang Kinh Doanh', 3, 4, CAST(N'2023-11-29T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (4, N'Converse Chuck Taylor All Star', N'Dừng Kinh Doanh', 1, 1, CAST(N'2023-12-02T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (5, N'Nike Air Max ', N'Dừng Kinh Doanh', 2, 5, CAST(N'2023-11-28T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (6, N'Adidas Ultraboost', N'Dừng Kinh Doanh', 3, 2, CAST(N'2023-11-26T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (7, N'Vans Old Skool', N'Dừng Kinh Doanh', 4, 5, CAST(N'2023-11-26T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (8, N'New Balance', N'Dừng Kinh Doanh', 1, 4, CAST(N'2023-12-02T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (9, N'Puma Suede Classic', N'Dừng Kinh Doanh', 5, 4, CAST(N'2023-12-03T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (10, N'Reebok Classic Leather', N'Dừng Kinh Doanh', 6, 3, CAST(N'2023-12-03T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (11, N'Nike Air Sky', N'Dừng Kinh Doanh', 1, 2, CAST(N'2023-12-03T11:47:44.353' AS DateTime), CAST(N'2023-12-03T11:47:44.353' AS DateTime))
INSERT [dbo].[tbl_tenGiay] ([ID], [tenGiay], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (12, N'Nike Air Blue', N'Dừng Kinh Doanh', 1, 1, CAST(N'2023-12-03T11:47:44.357' AS DateTime), CAST(N'2023-12-03T11:47:44.357' AS DateTime))
SET IDENTITY_INSERT [dbo].[tbl_tenGiay] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_thuongHieu] ON 

INSERT [dbo].[tbl_thuongHieu] ([ID], [tenThuongHieu], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (1, N'Nike', N'Đang Áp Dụng', 1, 1, CAST(N'2023-12-03T11:47:44.527' AS DateTime), CAST(N'2023-12-03T11:47:44.527' AS DateTime))
INSERT [dbo].[tbl_thuongHieu] ([ID], [tenThuongHieu], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (2, N'Adidas', N'Đang Áp Dụng', 1, 1, CAST(N'2023-12-03T11:47:44.527' AS DateTime), CAST(N'2023-12-03T11:47:44.527' AS DateTime))
INSERT [dbo].[tbl_thuongHieu] ([ID], [tenThuongHieu], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (3, N'Converse', N'Đang Áp Dụng', 1, 1, CAST(N'2023-12-03T11:47:44.527' AS DateTime), CAST(N'2023-12-03T11:47:44.527' AS DateTime))
INSERT [dbo].[tbl_thuongHieu] ([ID], [tenThuongHieu], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (4, N'Vans', N'Đang Áp Dụng', 1, 1, CAST(N'2023-12-03T11:47:44.527' AS DateTime), CAST(N'2023-12-03T11:47:44.527' AS DateTime))
INSERT [dbo].[tbl_thuongHieu] ([ID], [tenThuongHieu], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (5, N'New Balance', N'Đang Áp Dụng', 1, 1, CAST(N'2023-12-03T11:47:44.527' AS DateTime), CAST(N'2023-12-03T11:47:44.527' AS DateTime))
INSERT [dbo].[tbl_thuongHieu] ([ID], [tenThuongHieu], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (6, N'Puma', N'Đang Áp Dụng', 1, 1, CAST(N'2023-12-03T11:47:44.527' AS DateTime), CAST(N'2023-12-03T11:47:44.527' AS DateTime))
INSERT [dbo].[tbl_thuongHieu] ([ID], [tenThuongHieu], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua]) VALUES (7, N'FILA', N'Đang Áp Dụng', 1, 1, CAST(N'2023-12-03T11:47:44.527' AS DateTime), CAST(N'2023-12-03T11:47:44.527' AS DateTime))
SET IDENTITY_INSERT [dbo].[tbl_thuongHieu] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_trangThaiHoaDon] ON 

INSERT [dbo].[tbl_trangThaiHoaDon] ([id], [tenTTHD], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (1, N'Chờ Thanh Toán', 1, NULL, NULL, NULL, NULL)
INSERT [dbo].[tbl_trangThaiHoaDon] ([id], [tenTTHD], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (2, N'Thanh Toán Thành Công', 1, NULL, NULL, NULL, NULL)
INSERT [dbo].[tbl_trangThaiHoaDon] ([id], [tenTTHD], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (3, N'Hủy Bỏ', 1, NULL, NULL, NULL, NULL)
SET IDENTITY_INSERT [dbo].[tbl_trangThaiHoaDon] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_trangThaiThanhToan] ON 
select * from tbl_voucher
INSERT [dbo].[tbl_trangThaiThanhToan] ([ID], [tenTrangThaiThanhToan], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (1, N'thanh toán trước', 1, NULL, NULL, NULL, NULL)
INSERT [dbo].[tbl_trangThaiThanhToan] ([ID], [tenTrangThaiThanhToan], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [xoaMem]) VALUES (2, N'thanh toán khi nhận hàng', 1, NULL, NULL, NULL, NULL)
SET IDENTITY_INSERT [dbo].[tbl_trangThaiThanhToan] OFF
GO																																																											  
SET IDENTITY_INSERT [dbo].[tbl_voucher] ON 																																																	 
INSERT [dbo].[tbl_voucher] ([ID], [maVoucher], [moTaVoucher], [hinhThucVoucher], [giaTriVoucher], [giaTriToiDaVoucher], [soLuongVoucher], [ngayBatDau], [ngayKetThuc], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [giaTriApDungVoucher] , [deleted] ) VALUES (1, N'VC01', N'Giảm 20% cho hóa đơn từ 400.000đ', N'phần trăm', CAST(20.000 AS Decimal(18, 3)), CAST(150.000 AS Decimal(18, 3)), 50, CAST(N'2023-12-01T00:00:00.000' AS DateTime), CAST(N'2023-12-31T00:00:00.000' AS DateTime), 2, 1, NULL, CAST(N'2023-12-01T17:43:22.073' AS DateTime), CAST(N'2023-12-06T17:43:22.073' AS DateTime), CAST(400.000 AS Decimal(18, 3)) , 1)
INSERT [dbo].[tbl_voucher] ([ID], [maVoucher], [moTaVoucher], [hinhThucVoucher], [giaTriVoucher], [giaTriToiDaVoucher], [soLuongVoucher], [ngayBatDau], [ngayKetThuc], [trangThai], [nguoiTao], [nguoiSua], [ngayTao], [ngaySua], [giaTriApDungVoucher] , [deleted] ) VALUES (2, N'VC03', N'Giảm 100.000đ cho đơn hàng từ 500.000đ', N'tiền mặt', CAST(100.000 AS Decimal(18, 3)), CAST(100.000 AS Decimal(18, 3)), 12, CAST(N'2023-12-01T00:00:00.000' AS DateTime), CAST(N'2023-12-31T00:00:00.000' AS DateTime), 2, 2, NULL, CAST(N'2023-11-26T17:43:22.073' AS DateTime), CAST(N'2023-12-06T17:43:22.073' AS DateTime), CAST(500.000 AS Decimal(18, 3)) , 1)
SET IDENTITY_INSERT [dbo].[tbl_voucher] OFF
GO
ALTER TABLE [dbo].[tbl_anh] ADD  CONSTRAINT [DF_tbl_anh_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[tbl_anh] ADD  CONSTRAINT [DF_tbl_anh_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[tbl_chatLieu] ADD  CONSTRAINT [DF_tbl_chatLieu_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_chatLieu] ADD  CONSTRAINT [DF_tbl_chatLieu_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_dayGiay] ADD  CONSTRAINT [DF_tbl_dayGiay_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_dayGiay] ADD  CONSTRAINT [DF_tbl_dayGiay_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_deGiay] ADD  CONSTRAINT [DF_tbl_deGiay_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_deGiay] ADD  CONSTRAINT [DF_tbl_deGiay_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_hinhThucThanhToan] ADD  CONSTRAINT [DF_tbl_hinhThucThanhToan_ngayTao_1]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_hinhThucThanhToan] ADD  CONSTRAINT [DF_tbl_hinhThucThanhToan_ngaySua_1]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_hoaDon] ADD  CONSTRAINT [DF_tbl_hoaDon_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_hoaDon] ADD  CONSTRAINT [DF_tbl_hoaDon_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_khachHang] ADD  CONSTRAINT [DF_tbl_khachHang_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_khachHang] ADD  CONSTRAINT [DF_tbl_khachHang_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_kichCo] ADD  CONSTRAINT [DF_tbl_kichCo_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_kichCo] ADD  CONSTRAINT [DF_tbl_kichCo_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_mauSac] ADD  CONSTRAINT [DF_tbl_mauSac_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_mauSac] ADD  CONSTRAINT [DF_tbl_mauSac_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_nhanVien] ADD  CONSTRAINT [DF_tbl_nhanVien_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_nhanVien] ADD  CONSTRAINT [DF_tbl_nhanVien_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_spct] ADD  CONSTRAINT [DF_tbl_spct_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_spct] ADD  CONSTRAINT [DF_tbl_spct_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_tenGiay] ADD  CONSTRAINT [DF_tbl_tenGiay_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_tenGiay] ADD  CONSTRAINT [DF_tbl_tenGiay_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_thanhToan] ADD  CONSTRAINT [DF_tbl_thanhToan_ngayTao]  DEFAULT (getdate()) FOR [ngayTaoThanhToan]
GO
ALTER TABLE [dbo].[tbl_thanhToan] ADD  CONSTRAINT [DF_tbl_thanhToan_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_thuongHieu] ADD  CONSTRAINT [DF_tbl_thuongHieu_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_thuongHieu] ADD  CONSTRAINT [DF_tbl_thuongHieu_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_trangThaiHoaDon] ADD  CONSTRAINT [DF_tbl_trangThaiHoaDon_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_trangThaiHoaDon] ADD  CONSTRAINT [DF_tbl_trangThaiHoaDon_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_trangThaiThanhToan] ADD  CONSTRAINT [DF_tbl_trangThaiThanhToan_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_trangThaiThanhToan] ADD  CONSTRAINT [DF_tbl_trangThaiThanhToan_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
--ALTER TABLE [dbo].[tbl_voucher] ADD  CONSTRAINT [DF_tbl_voucher_ngayBatDau]  DEFAULT (getdate()) FOR [ngayBatDau]
--GO
ALTER TABLE [dbo].[tbl_voucher] ADD  CONSTRAINT [DF_tbl_voucher_ngayTao]  DEFAULT (getdate()) FOR [ngayTao]
GO
ALTER TABLE [dbo].[tbl_voucher] ADD  CONSTRAINT [DF_tbl_voucher_ngaySua]  DEFAULT (getdate()) FOR [ngaySua]
GO
ALTER TABLE [dbo].[tbl_anh]  WITH CHECK ADD  CONSTRAINT [FK_tbl_anh_tbl_spct] FOREIGN KEY([ID_SPCT])
REFERENCES [dbo].[tbl_spct] ([ID])
GO
ALTER TABLE [dbo].[tbl_anh] CHECK CONSTRAINT [FK_tbl_anh_tbl_spct]
GO
ALTER TABLE [dbo].[tbl_hoaDon]  WITH CHECK ADD  CONSTRAINT [FK_tbl_hoaDon_tbl_khachHang] FOREIGN KEY([ID_khachHang])
REFERENCES [dbo].[tbl_khachHang] ([ID])
GO
ALTER TABLE [dbo].[tbl_hoaDon] CHECK CONSTRAINT [FK_tbl_hoaDon_tbl_khachHang]
GO
ALTER TABLE [dbo].[tbl_hoaDon]  WITH CHECK ADD  CONSTRAINT [FK_tbl_hoaDon_tbl_nhanVien] FOREIGN KEY([ID_nhanVien])
REFERENCES [dbo].[tbl_nhanVien] ([ID])
GO
ALTER TABLE [dbo].[tbl_hoaDon] CHECK CONSTRAINT [FK_tbl_hoaDon_tbl_nhanVien]
GO
ALTER TABLE [dbo].[tbl_hoaDon]  WITH CHECK ADD  CONSTRAINT [FK_tbl_hoaDon_tbl_trangThaiHoaDon] FOREIGN KEY([ID_trangThaiHoaDon])
REFERENCES [dbo].[tbl_trangThaiHoaDon] ([id])
GO
ALTER TABLE [dbo].[tbl_hoaDon] CHECK CONSTRAINT [FK_tbl_hoaDon_tbl_trangThaiHoaDon]
GO
ALTER TABLE [dbo].[tbl_hoaDon]  WITH CHECK ADD  CONSTRAINT [FK_tbl_hoaDon_tbl_trangThaiThanhToan] FOREIGN KEY([ID_trangThaiThanhToan])
REFERENCES [dbo].[tbl_trangThaiThanhToan] ([ID])
GO
ALTER TABLE [dbo].[tbl_hoaDon] CHECK CONSTRAINT [FK_tbl_hoaDon_tbl_trangThaiThanhToan]
GO
ALTER TABLE [dbo].[tbl_hoaDon]  WITH CHECK ADD  CONSTRAINT [FK_tbl_hoaDon_tbl_voucher] FOREIGN KEY([ID_voucher])
REFERENCES [dbo].[tbl_voucher] ([ID])
GO
ALTER TABLE [dbo].[tbl_hoaDon] CHECK CONSTRAINT [FK_tbl_hoaDon_tbl_voucher]
GO
ALTER TABLE [dbo].[tbl_hoaDonChiTiet]  WITH NOCHECK ADD  CONSTRAINT [FK_tbl_hoaDonChiTiet_tbl_hoaDon] FOREIGN KEY([ID_hoaDon])
REFERENCES [dbo].[tbl_hoaDon] ([ID])
GO
ALTER TABLE [dbo].[tbl_hoaDonChiTiet] NOCHECK CONSTRAINT [FK_tbl_hoaDonChiTiet_tbl_hoaDon]
GO
ALTER TABLE [dbo].[tbl_hoaDonChiTiet]  WITH NOCHECK ADD  CONSTRAINT [FK_tbl_hoaDonChiTiet_tbl_spct] FOREIGN KEY([ID_sanPhamChiTiet])
REFERENCES [dbo].[tbl_spct] ([ID])
GO
ALTER TABLE [dbo].[tbl_hoaDonChiTiet] NOCHECK CONSTRAINT [FK_tbl_hoaDonChiTiet_tbl_spct]
GO
ALTER TABLE [dbo].[tbl_spct]  WITH CHECK ADD  CONSTRAINT [FK_tbl_spct_tbl_chatLieu] FOREIGN KEY([ID_chatLieu])
REFERENCES [dbo].[tbl_chatLieu] ([ID])
GO
ALTER TABLE [dbo].[tbl_spct] CHECK CONSTRAINT [FK_tbl_spct_tbl_chatLieu]
GO
ALTER TABLE [dbo].[tbl_spct]  WITH CHECK ADD  CONSTRAINT [FK_tbl_spct_tbl_dayGiay] FOREIGN KEY([ID_dayGiay])
REFERENCES [dbo].[tbl_dayGiay] ([ID])
GO
ALTER TABLE [dbo].[tbl_spct] CHECK CONSTRAINT [FK_tbl_spct_tbl_dayGiay]
GO
ALTER TABLE [dbo].[tbl_spct]  WITH CHECK ADD  CONSTRAINT [FK_tbl_spct_tbl_deGiay] FOREIGN KEY([ID_deGiay])
REFERENCES [dbo].[tbl_deGiay] ([ID])
GO
ALTER TABLE [dbo].[tbl_spct] CHECK CONSTRAINT [FK_tbl_spct_tbl_deGiay]
GO
ALTER TABLE [dbo].[tbl_spct]  WITH CHECK ADD  CONSTRAINT [FK_tbl_spct_tbl_kichCo] FOREIGN KEY([ID_kichCo])
REFERENCES [dbo].[tbl_kichCo] ([ID])
GO
ALTER TABLE [dbo].[tbl_spct] CHECK CONSTRAINT [FK_tbl_spct_tbl_kichCo]
GO
ALTER TABLE [dbo].[tbl_spct]  WITH CHECK ADD  CONSTRAINT [FK_tbl_spct_tbl_mauSac] FOREIGN KEY([ID_mauSac])
REFERENCES [dbo].[tbl_mauSac] ([ID])
GO
ALTER TABLE [dbo].[tbl_spct] CHECK CONSTRAINT [FK_tbl_spct_tbl_mauSac]
GO
ALTER TABLE [dbo].[tbl_spct]  WITH CHECK ADD  CONSTRAINT [FK_tbl_spct_tbl_tenGiay] FOREIGN KEY([ID_tenGiay])
REFERENCES [dbo].[tbl_tenGiay] ([ID])
GO
ALTER TABLE [dbo].[tbl_spct] CHECK CONSTRAINT [FK_tbl_spct_tbl_tenGiay]
GO
ALTER TABLE [dbo].[tbl_spct]  WITH CHECK ADD  CONSTRAINT [FK_tbl_spct_tbl_thuongHieu] FOREIGN KEY([ID_thuongHieu])
REFERENCES [dbo].[tbl_thuongHieu] ([ID])
GO
ALTER TABLE [dbo].[tbl_spct] CHECK CONSTRAINT [FK_tbl_spct_tbl_thuongHieu]
GO
ALTER TABLE [dbo].[tbl_thanhToan]  WITH CHECK ADD  CONSTRAINT [FK_tbl_thanhToan_tbl_hinhThucThanhToan] FOREIGN KEY([id_HTTT])
REFERENCES [dbo].[tbl_hinhThucThanhToan] ([ID_HTTT])
GO
ALTER TABLE [dbo].[tbl_thanhToan] CHECK CONSTRAINT [FK_tbl_thanhToan_tbl_hinhThucThanhToan]
GO
ALTER TABLE [dbo].[tbl_thanhToan]  WITH CHECK ADD  CONSTRAINT [FK_tbl_thanhToan_tbl_hoaDon] FOREIGN KEY([id_hoaDon])
REFERENCES [dbo].[tbl_hoaDon] ([ID])
GO
ALTER TABLE [dbo].[tbl_thanhToan] CHECK CONSTRAINT [FK_tbl_thanhToan_tbl_hoaDon]
GO
select * from tbl_hoaDon
select * from tbl_kichCo
select * from tbl_khachHang

SELECT * FROM tbl_anh
SELECT * FROM tbl_chatLieu
SELECT * FROM tbl_dayGiay
SELECT * FROM tbl_deGiay

SELECT * FROM tbl_hoaDon
SELECT * FROM tbl_hoaDonChiTiet
SELECT * FROM tbl_thanhToan 

SELECT * FROM tbl_khachHang
SELECT * FROM tbl_nhanVien

SELECT * FROM tbl_voucher


select * from tbl_spct
select * from tbl_tenGiay

SELECT * FROM tbl_trangThaiHoaDon
SELECT * FROM tbl_trangThaiThanhToan   --Thanh toán trước / thanh toán khi nhận hàng
select * from tbl_trangThaiHoaDon --Chờ thanh toán / Thanh toán thành công / Hủy bỏ
SELECT * FROM tbl_hinhThucThanhToan --
SELECT * FROM tbl_thanhToan 
