package view;

import BanHangDAO.HTTT_DAO;
import BanHangDAO.HoaDonDAO;
import BanHangDAO.TrangThaiHoaDonDAO;
import ModelBanHang.hinhThucThanhToan;
import ModelBanHang.trangThaiHoaDon;
import dao.ProductDAO;
import dao.ProductDetaisDAO;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.HoaDonModel_manh;
import model.Ispct;
import model.KhachHang;
import model.NhanVien;
import service.KhachHangService;
import service.NhanVien_Service;
import utility.MsgBox;

public class JPHoaDon extends javax.swing.JPanel {
    
    public JPHoaDon() {
        initComponents();
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_HD = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cbb_searchHttt = new swingStyle.Combobox();
        txt_searchHD = new javax.swing.JTextField();
        cbb_searchnvpt = new swingStyle.Combobox();
        btn_boLoc = new swingStyle.btn();
        btn_xuatExcel = new swingStyle.btn();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_SPCT = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_maKH = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_tenKH = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_diaChi = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_tongTienDua = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_tienThua = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_tongGTHD = new javax.swing.JTextField();

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel1.setForeground(new java.awt.Color(163, 241, 245));
        jPanel1.setEnabled(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Hóa đơn tại quầy", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tbl_HD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "STT", "Mã hóa đơn", "tên khách hàng", "Số điện thoại","Tiền mặt","Chuyển khoản", "Đơn giá", "Trạng thái", "Ngày tạo" , "Người tạo"
            }
        )
        {

            public boolean isCellEditable(int row, int column){
                return false;
            }

        }
    );
    tbl_HD.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbl_HDMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tbl_HD);

    cbb_searchHttt.setMaximumRowCount(8);
    cbb_searchHttt.setLabeText("Hình thức thanh toán");
    cbb_searchHttt.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbb_searchHtttActionPerformed(evt);
        }
    });

    txt_searchHD.setBackground(new java.awt.Color(242, 242, 242));
    txt_searchHD.setForeground(java.awt.Color.gray);
    txt_searchHD.setText("Tìm kiếm hóa đơn theo mã , tên khách hàng, SĐT ....");
    txt_searchHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 255)));
    txt_searchHD.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            txt_searchHDFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            txt_searchHDFocusLost(evt);
        }
    });
    txt_searchHD.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txt_searchHDKeyReleased(evt);
        }
    });

    cbb_searchnvpt.setMaximumRowCount(8);
    cbb_searchnvpt.setLabeText("Nhân viên phụ trách");
    cbb_searchnvpt.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbb_searchnvptActionPerformed(evt);
        }
    });

    btn_boLoc.setText("Bỏ lọc");
    btn_boLoc.setIconTextGap(10);
    btn_boLoc.setRadius(19);
    btn_boLoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_boLocActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(txt_searchHD, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cbb_searchHttt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(cbb_searchnvpt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btn_boLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbb_searchHttt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbb_searchnvpt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_boLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txt_searchHD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 6, Short.MAX_VALUE))
    );

    btn_xuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Statistics_Images/excel.png"))); // NOI18N
    btn_xuatExcel.setText("Xuất Excel hóa đơn");
    btn_xuatExcel.setIconTextGap(10);
    btn_xuatExcel.setRadius(19);
    btn_xuatExcel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_xuatExcelActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addComponent(jScrollPane1)
                    .addGap(17, 17, 17)))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_xuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(62, 62, 62))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(10, 10, 10)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(9, 9, 9)
            .addComponent(btn_xuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm của hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

    tbl_SPCT.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null}
        },
        new String [] {
            "STT", "Mã SPCT", "Tên SP", "Thương hiệu", "Size", "Màu sắc", "Số lượng", "Giá bán", "Tổng Tiền"
        }
    ));
    jScrollPane3.setViewportView(tbl_SPCT);

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGap(16, 16, 16))
    );

    jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

    jLabel2.setText("Mã khách hàng :");
    jLabel2.setPreferredSize(new java.awt.Dimension(100, 25));

    txt_maKH.setBackground(new java.awt.Color(242, 242, 242));
    txt_maKH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 255)));
    txt_maKH.setDoubleBuffered(true);
    txt_maKH.setEnabled(false);
    txt_maKH.setOpaque(true);
    txt_maKH.setPreferredSize(new java.awt.Dimension(200, 25));

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(txt_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(18, Short.MAX_VALUE))
    );
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_maKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 15, Short.MAX_VALUE))
    );

    jLabel5.setText("Tên khach hàng : ");
    jLabel5.setPreferredSize(new java.awt.Dimension(100, 25));

    txt_tenKH.setBackground(new java.awt.Color(242, 242, 242));
    txt_tenKH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 255)));
    txt_tenKH.setDoubleBuffered(true);
    txt_tenKH.setEnabled(false);
    txt_tenKH.setOpaque(true);
    txt_tenKH.setPreferredSize(new java.awt.Dimension(200, 25));

    javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
    jPanel13.setLayout(jPanel13Layout);
    jPanel13Layout.setHorizontalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(txt_tenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel13Layout.setVerticalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel13Layout.createSequentialGroup()
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_tenKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 15, Short.MAX_VALUE))
    );

    jLabel6.setText("Số điện thoại : ");
    jLabel6.setPreferredSize(new java.awt.Dimension(100, 25));

    txt_sdt.setBackground(new java.awt.Color(242, 242, 242));
    txt_sdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 255)));
    txt_sdt.setDoubleBuffered(true);
    txt_sdt.setEnabled(false);
    txt_sdt.setOpaque(true);
    txt_sdt.setPreferredSize(new java.awt.Dimension(200, 25));

    javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
    jPanel14.setLayout(jPanel14Layout);
    jPanel14Layout.setHorizontalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel14Layout.setVerticalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel14Layout.createSequentialGroup()
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_sdt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 15, Short.MAX_VALUE))
    );

    jLabel7.setText("Email : ");
    jLabel7.setPreferredSize(new java.awt.Dimension(100, 25));

    txt_email.setBackground(new java.awt.Color(242, 242, 242));
    txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 255)));
    txt_email.setDoubleBuffered(true);
    txt_email.setEnabled(false);
    txt_email.setOpaque(true);
    txt_email.setPreferredSize(new java.awt.Dimension(200, 25));

    javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
    jPanel15.setLayout(jPanel15Layout);
    jPanel15Layout.setHorizontalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel15Layout.setVerticalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 15, Short.MAX_VALUE))
    );

    jLabel8.setText("Địa Chỉ : ");
    jLabel8.setPreferredSize(new java.awt.Dimension(100, 25));

    txt_diaChi.setBackground(new java.awt.Color(242, 242, 242));
    txt_diaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 255)));
    txt_diaChi.setDoubleBuffered(true);
    txt_diaChi.setEnabled(false);
    txt_diaChi.setOpaque(true);
    txt_diaChi.setPreferredSize(new java.awt.Dimension(200, 25));

    javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
    jPanel16.setLayout(jPanel16Layout);
    jPanel16Layout.setHorizontalGroup(
        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel16Layout.setVerticalGroup(
        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel16Layout.createSequentialGroup()
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_diaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 15, Short.MAX_VALUE))
    );

    jLabel9.setText("Tổng tiền đưa : ");
    jLabel9.setPreferredSize(new java.awt.Dimension(100, 25));

    txt_tongTienDua.setBackground(new java.awt.Color(242, 242, 242));
    txt_tongTienDua.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 255)));
    txt_tongTienDua.setDoubleBuffered(true);
    txt_tongTienDua.setEnabled(false);
    txt_tongTienDua.setOpaque(true);
    txt_tongTienDua.setPreferredSize(new java.awt.Dimension(200, 25));

    javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
    jPanel17.setLayout(jPanel17Layout);
    jPanel17Layout.setHorizontalGroup(
        jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(txt_tongTienDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel17Layout.setVerticalGroup(
        jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel17Layout.createSequentialGroup()
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_tongTienDua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 15, Short.MAX_VALUE))
    );

    jLabel10.setText("Tiền thừa : ");
    jLabel10.setPreferredSize(new java.awt.Dimension(100, 25));

    txt_tienThua.setBackground(new java.awt.Color(242, 242, 242));
    txt_tienThua.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 255)));
    txt_tienThua.setDoubleBuffered(true);
    txt_tienThua.setEnabled(false);
    txt_tienThua.setOpaque(true);
    txt_tienThua.setPreferredSize(new java.awt.Dimension(200, 25));

    javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
    jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(txt_tienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel18Layout.setVerticalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_tienThua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 15, Short.MAX_VALUE))
    );

    jLabel11.setText("Tổng HĐ : ");
    jLabel11.setPreferredSize(new java.awt.Dimension(100, 25));

    txt_tongGTHD.setBackground(new java.awt.Color(242, 242, 242));
    txt_tongGTHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 255)));
    txt_tongGTHD.setDoubleBuffered(true);
    txt_tongGTHD.setEnabled(false);
    txt_tongGTHD.setOpaque(true);
    txt_tongGTHD.setPreferredSize(new java.awt.Dimension(200, 25));

    javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
    jPanel19.setLayout(jPanel19Layout);
    jPanel19Layout.setHorizontalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(txt_tongGTHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel19Layout.setVerticalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel19Layout.createSequentialGroup()
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txt_tongGTHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 15, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 21, Short.MAX_VALUE))
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 62, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(8, 8, 8))
    );

    jTabbedPane1.addTab("Hóa Đơn Tại Quầy", jPanel1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 1352, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap()))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 826, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap()))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_HDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_HDMouseClicked
        int maHD = Integer.valueOf(tbl_HD.getValueAt(tbl_HD.getSelectedRow(), 1).toString().substring(2));
        fillSPCT_By_IdHD(maHD);//Fill spct
        fill_TTKH(maHD);
    }//GEN-LAST:event_tbl_HDMouseClicked

    private void txt_searchHDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchHDFocusGained
        //Sự kiện xảy ra khi thành phần txt_timKiemSP UI nhận đc trạng thái focus.
        if (txt_searchHD.getText().equals("Tìm kiếm hóa đơn theo mã , tên khách hàng, SĐT ....")) {
            txt_searchHD.setText(null);
            txt_searchHD.requestFocus(); //Yêu cầu tập trung Focus vào 1 component nào đó.
            //remove placeholder style
            removePlaceholderStyle(txt_searchHD);
        }
    }//GEN-LAST:event_txt_searchHDFocusGained

    private void txt_searchHDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchHDFocusLost
        //Sự kiện xảy ra khi thành phần txt_timKiemSP UI nhận đc trạng thái focusLost.
        if (txt_searchHD.getText().length() == 0) {
            //add Placeholder style
            addPlaceholderStyle(txt_searchHD);
            txt_searchHD.setText("Tìm kiếm sản phẩm theo mã sản phẩm , tên ....");
        }
    }//GEN-LAST:event_txt_searchHDFocusLost

    private void txt_searchHDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchHDKeyReleased
        String searchString = txt_searchHD.getText();
        dtmHD = (DefaultTableModel) this.tbl_HD.getModel();
        search(searchString, dtmHD, this.tbl_HD);
    }//GEN-LAST:event_txt_searchHDKeyReleased

    private void cbb_searchHtttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_searchHtttActionPerformed
        //Search HD BY HTTT
        int httt = 0;
        if (dcb_HTTT.getSelectedItem().equals("Tiền Mặt")) {
            httt = 1;
        } else if (dcb_HTTT.getSelectedItem().equals("Chuyển Khoản")) {
            httt = 2;
        } else {
            httt = 3;
        }
        if (hdd.getListHD_By_HTTT_1And2(httt) != null || hdd.getListHD_By_HTTT_3(httt) != null) {//Fill hóa đơn
            if (httt != 3) {
                fillHD(hdd.getListHD_By_HTTT_1And2(httt));//Fill hóa đơn đã thanh toán thành công.
            } else {
                fillHD(hdd.getListHD_By_HTTT_3(httt));
            }
        } else {
            dtmHD.setRowCount(0);
        }
    }//GEN-LAST:event_cbb_searchHtttActionPerformed
    //Search HD BY Ngày tạo
    private void cbb_searchnvptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_searchnvptActionPerformed
        //Search HD BY nvpt
        String nvpt = cbb_searchnvpt.getSelectedItem().toString().trim();
        if (hdd.getListHD_By_NVPT(nvpt) != null) {//Fill hóa đơn
            fillHD(hdd.getListHD_By_NVPT(nvpt));//Fill hóa đơn đã thanh toán thành công.
        } else {
            dtmHD.setRowCount(0);
        }
    }//GEN-LAST:event_cbb_searchnvptActionPerformed

    private void btn_xuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatExcelActionPerformed
        //Xuất file excel
    }//GEN-LAST:event_btn_xuatExcelActionPerformed

    private void btn_boLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_boLocActionPerformed
        //Bỏ lọc
        if (hdd.getListHD() != null) {//Fill hóa đơn
            fillHD(hdd.getListHD());//Fill hóa đơn đã thanh toán thành công.
        } else {
            MsgBox.alter(this, "Chưa có hóa đơn nào được thanh toán");
        }
    }//GEN-LAST:event_btn_boLocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swingStyle.btn btn_boLoc;
    private swingStyle.btn btn_xuatExcel;
    private swingStyle.Combobox cbb_searchHttt;
    private swingStyle.Combobox cbb_searchnvpt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_HD;
    private javax.swing.JTable tbl_SPCT;
    private javax.swing.JTextField txt_diaChi;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_maKH;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_searchHD;
    private javax.swing.JTextField txt_tenKH;
    private javax.swing.JTextField txt_tienThua;
    private javax.swing.JTextField txt_tongGTHD;
    private javax.swing.JTextField txt_tongTienDua;
    // End of variables declaration//GEN-END:variables

    //Cho bảng Hóa đơn
    HoaDonDAO hdd = new HoaDonDAO();
    DefaultTableModel dtmHD;

    //Truy vấn cho bảng sản phẩm
    ProductDetaisDAO prdd = new ProductDetaisDAO();
    DefaultTableModel dtmSCPT;
    //
    KhachHangService khs = new KhachHangService();

    //Model TTHĐ
    DefaultComboBoxModel dcb_HTTT;
    DefaultComboBoxModel dcb_NVPT;

    //service lấy dữ liệu
    HTTT_DAO hhttd = new HTTT_DAO();
    NhanVien_Service nvs = new NhanVien_Service();
    
    public final void init() {
        fill_HTTT();
        fill_NVPT();
        if (hdd.getListHD() != null) {//Fill hóa đơn
            fillHD(hdd.getListHD());//Fill hóa đơn đã thanh toán thành công.
        } else {
            MsgBox.alter(this, "Chưa có hóa đơn nào được thanh toán");
        }
    }
    
    private void fillHD(List<HoaDonModel_manh> listHD) {
        dtmHD = (DefaultTableModel) this.tbl_HD.getModel();
        dtmHD.setRowCount(0);
        int i = 0;
        for (HoaDonModel_manh hd : listHD) {
            Object[] row = new Object[]{
                i++,
                "HĐ" + hd.getMaHD(),
                (hd.getTenKH() == null) ? "Khách vãng lai" : hd.getTenKH(),
                (hd.getSdt() == null) ? "Trống" : hd.getSdt(),
                hdd.getTienMatByIDHD(hd.getMaHD(), 1),//Tiền mặt
                hdd.getTienMatByIDHD(hd.getMaHD(), 2),//CK
                hd.getDonGia(),//Tổng GT hóa đơn đó
                hd.getTrangThai(),//Trạng thái hóa đơn
                hd.getNgayTao(),
                hd.getTenNguoiTao()
            };
            dtmHD.addRow(row);
        }
    }
    
    private void fill_HTTT() {//Fill hình thức thanh toán
        dcb_HTTT = (DefaultComboBoxModel) cbb_searchHttt.getModel();
        dcb_HTTT.removeAllElements();
        List<hinhThucThanhToan> listHTTT = hhttd.selectAll_HTTT();
        for (hinhThucThanhToan httt : listHTTT) {
            dcb_HTTT.addElement(httt.getTenHinhThucThanhToan());
        }
    }
    
    private void fill_NVPT() {
        dcb_NVPT = (DefaultComboBoxModel) cbb_searchnvpt.getModel();
        dcb_NVPT.removeAllElements();
        List<NhanVien> listnvpt = nvs.getNVPT_ChoHoaDon();
        if (!listnvpt.isEmpty()) {
            for (NhanVien nvpt : listnvpt) {
                dcb_NVPT.addElement(nvpt.getHoTen());
            }
        }
    }

    //----------------------------------
    public void fillSPCT_By_IdHD(int idHD) {//fill SPCT
        dtmSCPT = (DefaultTableModel) tbl_SPCT.getModel();
        dtmSCPT.setRowCount(0);
        if (tbl_HD.getSelectedRow() != - 1) {
            List<Ispct> listSPCT = prdd.selectAll_By_ID_MaHD(idHD);
            int i = 0;
            for (Ispct spct : listSPCT) {
                Object[] row = new Object[]{
                    i++,
                    "SPCT-" + spct.getId(),
                    spct.getNametenGiay(),
                    spct.getNamethuongHieu(),
                    spct.getNamekichCo(),
                    spct.getNamemauSac(),
                    spct.getSoLuong(),//SL mua
                    spct.getGiaBan(),
                    spct.getGiaBan().multiply(new BigDecimal(spct.getSoLuong()))//Giá bán * SL mua
                };
                dtmSCPT.addRow(row);
            }
        }
    }
    
    public void fill_TTKH(int idHD) {
        KhachHang kh = khs.get_TTKH_In_HD(idHD);
        txt_maKH.setText(kh.getMaKH());
        txt_tenKH.setText(kh.getName());
        
        txt_sdt.setText((kh.getPhone() == null) ? "Trống" : kh.getPhone());
        txt_email.setText((kh.getEmail() == null) ? "Trống" : kh.getEmail());
        txt_diaChi.setText((kh.getAddress() == null) ? "Trống" : kh.getAddress());
        
        txt_tongGTHD.setText(String.valueOf(kh.getTongGTHD()));
        txt_tongTienDua.setText(String.valueOf(kh.getTongTienTra()));
        txt_tienThua.setText(String.valueOf(kh.getTienThua()));
    }

    //-----------------------------------------
    //Utility
    private void removePlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }
    
    public void addPlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();//Lấy font hiện tại của JTextField
        font = font.deriveFont(Font.ITALIC);//Tạo 1 bản sao mới của Font với kiểu in nghiêng ( Italic )
        textField.setFont(font); //Đặt font mới cho JTextField
        textField.setForeground(Color.GRAY); //Đặt màu chữ là Gray ( Xám ) 
    }
    
    public void search(String str, DefaultTableModel dtmTable, JTable table) {
        dtmTable = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(dtmTable); //Tạo 1 TablerowSorter và liên kết với bảng DTM. TableRowSoft : Quản lý việc sắp xếp và lọc các hàng trong JTable.
        table.setRowSorter(trs); //Gán TableRowSorter vừa tạo cho JTable. -> Kích hoạt việc sắp xếp và lọc cho JTable. 
        //Sử dụng biểu thức chính quy để không phân biệt chữ hoa chữ thường
        Pattern pattern = Pattern.compile(Pattern.quote(str), Pattern.CASE_INSENSITIVE);
//        trs.setRowFilter(RowFilter.regexFilter(str));//Đặc bộ lọc cho TableRowSorter để thực hiện tìm kiếm dựa trên biểu thức chính quy ( Regex ). Nó sẽ tạo 1 bộ lọc dựa trên chuỗi str.
        trs.setRowFilter(new RowFilter<DefaultTableModel, Object>() {
            @Override
            public boolean include(RowFilter.Entry<? extends DefaultTableModel, ? extends Object> entry) {
                // Duyệt qua từng cột trong hàng
                for (int i = entry.getValueCount() - 1; i >= 0; i--) {
                    Object value = entry.getValue(i);
                    if (value != null) {
                        // Kiểm tra nếu giá trị của cột chứa ký tự tìm kiếm
                        Matcher matcher = pattern.matcher(value.toString());
                        if (matcher.find()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        });
    }
}