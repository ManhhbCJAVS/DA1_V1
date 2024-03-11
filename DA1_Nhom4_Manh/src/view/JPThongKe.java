package view;

import com.raven.chart.ModelChart;
import java.awt.Color;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.ThongKe;
import model.modelCart;
import service.ThongKeService;
import java.sql.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JPThongKe extends javax.swing.JPanel {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPThongKe spview = new JPThongKe();
        jf.add(spview);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
    private DefaultTableModel model = new DefaultTableModel();
    private int index = -1;
    DecimalFormat df = new DecimalFormat("###.###");
    private ThongKeService ser = new ThongKeService();

    public JPThongKe() {
        initComponents();
        fillTable(ser.getAll());
// phương thức truy vẫn để tìm số lượng sp
        try (Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DB_DA1_Final", "sa", "123")) {
            // truy vẫn tìm sp đã bán
            String sql = """
                         SELECT SUM(soluong ) AS tong_sp_daban
                         FROM tbl_hoaDonChiTiet;""";
            try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {
                // Hiển thị dữ liệu lên các cart
                // Hiển thị dữ liệu lên cart1
                if (resultSet.next()) {
                    int tongSPDaBan = resultSet.getInt("tong_sp_daban");
                    cart2.setData(new modelCart(new ImageIcon(getClass().getResource("/Statistics_Images/sneaker.png")), "SP Đã Bán", tongSPDaBan));
                }
//            
            }
            //truy vẫn tìm tổng sp
            String sql1 = """
                          SELECT SUM(soluong ) AS tong_sp
                          FROM tbl_spct;""";
            try (PreparedStatement statement = connection.prepareStatement(sql1); ResultSet resultSet = statement.executeQuery()) {
                // Hiển thị dữ liệu lên các cart
                // Hiển thị dữ liệu lên cart1
                if (resultSet.next()) {
                    int tongSP = resultSet.getInt("tong_sp");
                    cart1.setData(new modelCart(new ImageIcon(getClass().getResource("/Statistics_Images/sneaker.png")), "Tổng Số SP ", tongSP));
                }
//            
            }
            //truy vẫn tìm sp tồn 
            String sql2 = """
                          SELECT 
                              (SELECT SUM(soluong) FROM tbl_spct) - 
                              (SELECT SUM(soluong) FROM tbl_hoadonchitiet) AS sp_ton""";
            try (PreparedStatement statement = connection.prepareStatement(sql2); ResultSet resultSet = statement.executeQuery()) {
                // Hiển thị dữ liệu lên các cart
                // Hiển thị dữ liệu lên cart1
                if (resultSet.next()) {
                    int SPton = resultSet.getInt("sp_ton");
                    cart3.setData(new modelCart(new ImageIcon(getClass().getResource("/Statistics_Images/sneaker.png")), "SP Tồn", SPton));
                }
//            
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Thiết lập màu cho các cột.
        chart.addLegend("Số SP", new Color(245, 189, 135));
        chart.addLegend("Số Hóa Đơn", new Color(135, 189, 245));
        chart.addLegend("Doanh Thu", new Color(189, 135, 245));
        chart.addLegend("Kinh Tế", new Color(189, 135, 245));
//        chart.addLegend("Cost", new Color(139, 229, 222));
        //Thiết lập : Tiêu đề + Giá trị cho các cột.
        chart.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        chart.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        chart.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        chart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        chart.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
    }

    public void fillTable(List<ThongKe> list) {
        model = (DefaultTableModel) tbl_doanhthusp.getModel();
        model.setRowCount(0);
        int i = 1;
        for (ThongKe nv : list) {
            Object[] row = {
                i++,
                nv.getId_sp(),
                nv.getGiasp(),
                nv.getSoluongdaban(),
                nv.getDoanhthu(),};
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tbp_ThongKe = new javax.swing.JPanel();
        chua2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_doanhthusp = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        cblocthang = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        cblocnam = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datetu = new com.toedter.calendar.JDateChooser();
        dateden = new com.toedter.calendar.JDateChooser();
        btnloc = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cart1 = new Component.Cart();
        cart2 = new Component.Cart();
        cart3 = new Component.Cart();
        jPanel11 = new javax.swing.JPanel();
        cbhieusuat = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cblocbaocao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnlich = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        datengay = new com.toedter.calendar.JDateChooser();
        jPanel15 = new javax.swing.JPanel();
        rbtsanpham = new javax.swing.JRadioButton();
        rbthoadon = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        tbp_BieuDo = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        chart = new com.raven.chart.Chart();
        jPanel16 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel17 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1075, 735));

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        chua2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chua2.setFocusCycleRoot(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Doanh Thu Theo Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tbl_doanhthusp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "SP01", "2.200", "4", "8.800"},
                {"2", "SP02", "3.400", "4", "13.600"},
                {"3", "SP03", "6.999", "2", "13.998"},
                {"4", "SP04", "4.999", "5", "24.995"}
            },
            new String [] {
                "STT", "Mã SP", "Giá", "Số Lượng Bán", "Doanh Thu"
            }
        ));
        jScrollPane1.setViewportView(tbl_doanhthusp);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Lọc Theo Tháng"));

        cblocthang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cblocthang, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cblocthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Lọc Theo Năm"));

        cblocnam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cblocnam, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cblocnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Lọc Theo Khoảng Thời Gian"));

        jLabel1.setText("Từ");

        jLabel2.setText("Đến");

        btnloc.setText("Lọc");
        btnloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datetu, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateden, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnloc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dateden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datetu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1))))
                    .addComponent(btnloc))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        cart1.setColor1(new java.awt.Color(142, 142, 250));
        cart1.setColor2(new java.awt.Color(123, 123, 245));

        cart2.setColor1(new java.awt.Color(186, 123, 247));
        cart2.setColor2(new java.awt.Color(167, 94, 236));

        cart3.setColor1(new java.awt.Color(241, 208, 62));
        cart3.setColor2(new java.awt.Color(211, 184, 61));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cart1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cart2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cart3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cart1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(cart3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cart2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Hiệu Suất"));

        cbhieusuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Số SP Bán Chạy Nhất", "Số SP Bán Chậm Nhất" }));
        cbhieusuat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbhieusuatItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbhieusuat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbhieusuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Doanh Thu Theo Ngày", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel3.setText("Loại Thời Gian ");

        cblocbaocao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Báo Cáo Theo Ngày", "Báo Cáo Theo Tháng", "Báo Cáo Theo Năm" }));

        jLabel4.setText("Chọn Ngày");

        btnlich.setText("Lịch");
        btnlich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlichActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã HĐ", "Tên NV", "Hình Thức", "Tiền Mặt", "Chuyển Khoản", "Tổng Tiền"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel18.setBackground(new java.awt.Color(0, 153, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tổng Doanh Thu Theo Ngày : ");

        jTextField4.setBackground(new java.awt.Color(0, 153, 51));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField4.setText("44.502.000Đ");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datengay, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlich))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cblocbaocao, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cblocbaocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(btnlich))
                    .addComponent(datengay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rbtsanpham.setText("Sản Phẩm");

        rbthoadon.setText("Hóa Đơn");

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setText("Export(Excel)");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(rbtsanpham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbthoadon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtsanpham)
                    .addComponent(rbthoadon)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout chua2Layout = new javax.swing.GroupLayout(chua2);
        chua2.setLayout(chua2Layout);
        chua2Layout.setHorizontalGroup(
            chua2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chua2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chua2Layout.createSequentialGroup()
                .addContainerGap(738, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        chua2Layout.setVerticalGroup(
            chua2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chua2Layout.createSequentialGroup()
                .addGroup(chua2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(chua2Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(chua2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout tbp_ThongKeLayout = new javax.swing.GroupLayout(tbp_ThongKe);
        tbp_ThongKe.setLayout(tbp_ThongKeLayout);
        tbp_ThongKeLayout.setHorizontalGroup(
            tbp_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbp_ThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chua2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tbp_ThongKeLayout.setVerticalGroup(
            tbp_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbp_ThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống Kê", tbp_ThongKe);

        tbp_BieuDo.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setPreferredSize(new java.awt.Dimension(400, 600));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Loại Thời Gian"));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "Năm" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox6, 0, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Chọn Thời Gian Cụ Thể"));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, 0, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.setPreferredSize(new java.awt.Dimension(400, 72));

        jButton4.setBackground(new java.awt.Color(102, 255, 255));
        jButton4.setText("Tải Lại Thống Kê");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tbp_BieuDoLayout = new javax.swing.GroupLayout(tbp_BieuDo);
        tbp_BieuDo.setLayout(tbp_BieuDoLayout);
        tbp_BieuDoLayout.setHorizontalGroup(
            tbp_BieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbp_BieuDoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbp_BieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tbp_BieuDoLayout.setVerticalGroup(
            tbp_BieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbp_BieuDoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Biểu Đồ", tbp_BieuDo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("1075");
        getAccessibleContext().setAccessibleDescription("375");
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        chart.start();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        chart.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
//        chart.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
//        chart.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
//        chart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
//        chart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
//        chart.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        chart.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbhieusuatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbhieusuatItemStateChanged
        // TODO add your handling code here:
        String ten;
        if (cbhieusuat.getSelectedItem().equals("Tất cả")) {
            ten = null;
            fillTable(ser.getAll());
        }
        if (cbhieusuat.getSelectedItem().equals("Số SP Bán Chạy Nhất")) {

            fillTable(ser.spbanchaynhat());

        } else if (cbhieusuat.getSelectedItem().equals("Số SP Bán Chậm Nhất")) {

            fillTable(ser.spbancham());

        }

    }//GEN-LAST:event_cbhieusuatItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (rbtsanpham.isSelected() || rbthoadon.isSelected()) {
            if (rbtsanpham.isSelected()) {
                int option = JOptionPane.showConfirmDialog(this, "Bạn có đồng xuất danh sách?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    try {
                        ArrayList<ThongKe> listHD = (ArrayList<ThongKe>) ser.getAll();
                        XSSFWorkbook workbook = new XSSFWorkbook();
                        XSSFSheet sheet = workbook.createSheet("Doanh thu sp");
                        XSSFSheet sheet2 = workbook.createSheet("Hóa Đơn Chi Tiết");
                        XSSFSheet sheet3 = workbook.createSheet("Lịch Sử Hóa Đơn");
                        XSSFRow row = null;
                        XSSFRow row2 = null;
                        XSSFRow row3 = null;
                        Cell cell = null;
                        Cell cell2 = null;
                        Cell cell3 = null;

                        // Xuất phần doanh thu sản phẩm
                        row = sheet.createRow(0);
                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("STT");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("ID_SP");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Giá");

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue("Số Lượng Bán");

                        cell = row.createCell(4, CellType.STRING);
                        cell.setCellValue("Doanh Thu");

                        for (int i = 0; i < listHD.size(); i++) {
                            ThongKe hoaDon = listHD.get(i);
                            row = sheet.createRow(i + 1);

                            cell = row.createCell(0, CellType.NUMERIC);
                            cell.setCellValue(i + 1);

                            cell = row.createCell(1, CellType.NUMERIC);
                            cell.setCellValue(hoaDon.getId_sp());

                            cell = row.createCell(2, CellType.NUMERIC);
                            cell.setCellValue(hoaDon.getGiasp().toString());

                            cell = row.createCell(3, CellType.NUMERIC);
                            cell.setCellValue(hoaDon.getSoluongdaban());
// ép kiểu để phù hợp với kiểu dữ liệu 
                            cell = row.createCell(4, CellType.NUMERIC);
                            cell.setCellValue(hoaDon.getDoanhthu().toString());

//                    cell = row.createCell(5, CellType.STRING);
//                    cell.setCellValue(date2String(hoaDon.getNgaytaohoadon()));
//
//                    cell = row.createCell(6, CellType.STRING);
//                    cell.setCellValue(date2String(hoaDon.getNgaythanhtoan()));
//
//                    cell = row.createCell(7, CellType.NUMERIC);
//                    cell.setCellValue(NumberFormat.getInstance().format(hoaDon.getTongTienHoaDon().doubleValue()));
//
//                    cell = row.createCell(8, CellType.STRING);
//                    cell.setCellValue(hoaDon.getThanhToan().getTenhinhthuc());
//
//                    cell = row.createCell(9, CellType.STRING);
//                    cell.setCellValue(hoaDon.getTinhTrang());
//
//                    cell = row.createCell(10, CellType.STRING);
//                    cell.setCellValue(hoaDon.getGhichu());
                        }

//                List<HoaDonChiTiet> listHDCT = reponHDCT.getInHoaDonCT();
//                for (int i = 0; i < listHDCT.size(); i++) {
//                    HoaDonChiTiet hoaDonCT = listHDCT.get(i);
//                    row = sheet2.createRow(i + 1);
//
//                    cell2 = row2.createCell(0, CellType.NUMERIC);
//                    cell2.setCellValue(i + 1);
//
//                    cell2 = row2.createCell(1, CellType.STRING);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getMa());
//
//                    cell2 = row2.createCell(2, CellType.STRING);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenSanPham().getTenSP());
//
//                    cell2 = row2.createCell(3, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getSoLuong());
//
//                    cell2 = row2.createCell(4, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenMauSac().getTenMauSac());
//
//                    cell2 = row2.createCell(5, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenNhanHieu().getTen());
//
//                    cell2 = row2.createCell(6, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenChatlieu().getTen());
//
//                    cell2 = row2.createCell(7, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenKichCo().getTenKichCo());
//
//                    cell2 = row2.createCell(8, CellType.NUMERIC);
//                    cell2.setCellValue(NumberFormat.getInstance().format(hoaDonCT.getIdSPCT().getGiaBan1().doubleValue()));
//
//                    cell2 = row2.createCell(9, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getHoaDon().getTongTienHoaDon().doubleValue());
//
//                }
//
//                List<LichSuHoaDon> listLSHD = reponLSHD.getListHD();
//                for (int i = 0; i < listLSHD.size(); i++) {
//                    LichSuHoaDon lshd = listLSHD.get(i);
//                    row = sheet3.createRow(i + 1);
//
//                    cell = row.createCell(0, CellType.NUMERIC);
//                    cell.setCellValue(i + 1);
//
//                    cell = row.createCell(1, CellType.STRING);
//                    cell.setCellValue(lshd.getNhanVien().getMaNV());
//
//                    cell = row.createCell(2, CellType.STRING);
//                    cell.setCellValue(lshd.getHoaDon().getNgaytaohoadon());
//
//                    cell = row.createCell(3, CellType.STRING);
//                    cell.setCellValue(lshd.getHanhdong());
//                }
                        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\cuong\\OneDrive\\Sách");
                        workbook.write(fileOut);
                        fileOut.close();
                        workbook.close();
                        JOptionPane.showMessageDialog(this, "Xuất danh sách thành công");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    // Xử lý khi người dùng không đồng ý thêm
                    JOptionPane.showMessageDialog(this, "Đã hủy xuất danh sách", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if (rbthoadon.isSelected()) {

                int option = JOptionPane.showConfirmDialog(this, "Bạn có đồng xuất danh sách?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    try {
                        ArrayList<ThongKe> listHD = (ArrayList<ThongKe>) ser.getAll();
                        XSSFWorkbook workbook = new XSSFWorkbook();
                        XSSFSheet sheet = workbook.createSheet("Doanh thu sp");
//                    XSSFSheet sheet2 = workbook.createSheet("Hóa Đơn Chi Tiết");
//                    XSSFSheet sheet3 = workbook.createSheet("Lịch Sử Hóa Đơn");
                        XSSFRow row = null;
                        XSSFRow row2 = null;
                        XSSFRow row3 = null;
                        Cell cell = null;
                        Cell cell2 = null;
                        Cell cell3 = null;

                        // Xuất phần hóa đơn
                        row = sheet.createRow(0);
                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("STT");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("ID_SP");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Giá");

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue("Số Lượng Bán");

                        cell = row.createCell(4, CellType.STRING);
                        cell.setCellValue("Doanh Thu");

                        for (int i = 0; i < listHD.size(); i++) {
                            ThongKe hoaDon = listHD.get(i);
                            row = sheet.createRow(i + 1);

                            cell = row.createCell(0, CellType.NUMERIC);
                            cell.setCellValue(i + 1);

                            cell = row.createCell(1, CellType.STRING);
                            cell.setCellValue(hoaDon.getId_sp());

                            cell = row.createCell(2, CellType.STRING);
                            cell.setCellValue(hoaDon.getGiasp().toString());

                            cell = row.createCell(3, CellType.STRING);
                            cell.setCellValue(hoaDon.getSoluongdaban());

                            cell = row.createCell(4, CellType.STRING);
                            cell.setCellValue(hoaDon.getDoanhthu().toString());

//                    cell = row.createCell(5, CellType.STRING);
//                    cell.setCellValue(date2String(hoaDon.getNgaytaohoadon()));
//
//                    cell = row.createCell(6, CellType.STRING);
//                    cell.setCellValue(date2String(hoaDon.getNgaythanhtoan()));
//
//                    cell = row.createCell(7, CellType.NUMERIC);
//                    cell.setCellValue(NumberFormat.getInstance().format(hoaDon.getTongTienHoaDon().doubleValue()));
//
//                    cell = row.createCell(8, CellType.STRING);
//                    cell.setCellValue(hoaDon.getThanhToan().getTenhinhthuc());
//
//                    cell = row.createCell(9, CellType.STRING);
//                    cell.setCellValue(hoaDon.getTinhTrang());
//
//                    cell = row.createCell(10, CellType.STRING);
//                    cell.setCellValue(hoaDon.getGhichu());
                        }

//                List<HoaDonChiTiet> listHDCT = reponHDCT.getInHoaDonCT();
//                for (int i = 0; i < listHDCT.size(); i++) {
//                    HoaDonChiTiet hoaDonCT = listHDCT.get(i);
//                    row = sheet2.createRow(i + 1);
//
//                    cell2 = row2.createCell(0, CellType.NUMERIC);
//                    cell2.setCellValue(i + 1);
//
//                    cell2 = row2.createCell(1, CellType.STRING);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getMa());
//
//                    cell2 = row2.createCell(2, CellType.STRING);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenSanPham().getTenSP());
//
//                    cell2 = row2.createCell(3, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getSoLuong());
//
//                    cell2 = row2.createCell(4, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenMauSac().getTenMauSac());
//
//                    cell2 = row2.createCell(5, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenNhanHieu().getTen());
//
//                    cell2 = row2.createCell(6, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenChatlieu().getTen());
//
//                    cell2 = row2.createCell(7, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getIdSPCT().getTenKichCo().getTenKichCo());
//
//                    cell2 = row2.createCell(8, CellType.NUMERIC);
//                    cell2.setCellValue(NumberFormat.getInstance().format(hoaDonCT.getIdSPCT().getGiaBan1().doubleValue()));
//
//                    cell2 = row2.createCell(9, CellType.NUMERIC);
//                    cell2.setCellValue(hoaDonCT.getHoaDon().getTongTienHoaDon().doubleValue());
//
//                }
//
//                List<LichSuHoaDon> listLSHD = reponLSHD.getListHD();
//                for (int i = 0; i < listLSHD.size(); i++) {
//                    LichSuHoaDon lshd = listLSHD.get(i);
//                    row = sheet3.createRow(i + 1);
//
//                    cell = row.createCell(0, CellType.NUMERIC);
//                    cell.setCellValue(i + 1);
//
//                    cell = row.createCell(1, CellType.STRING);
//                    cell.setCellValue(lshd.getNhanVien().getMaNV());
//
//                    cell = row.createCell(2, CellType.STRING);
//                    cell.setCellValue(lshd.getHoaDon().getNgaytaohoadon());
//
//                    cell = row.createCell(3, CellType.STRING);
//                    cell.setCellValue(lshd.getHanhdong());
//                }
                        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\cuong\\OneDrive\\Máy tính\\XuatExcel");
                        workbook.write(fileOut);
                        fileOut.close();
                        workbook.close();
                        JOptionPane.showMessageDialog(this, "Xuất danh sách thành công");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    // Xử lý khi người dùng không đồng ý thêm
                    JOptionPane.showMessageDialog(this, "Đã hủy xuất danh sách", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "hãy chọn 1 bản để xuất ");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnlichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlichActionPerformed

    private void btnlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlich;
    private javax.swing.JButton btnloc;
    private Component.Cart cart1;
    private Component.Cart cart2;
    private Component.Cart cart3;
    private javax.swing.JComboBox<String> cbhieusuat;
    private javax.swing.JComboBox<String> cblocbaocao;
    private javax.swing.JComboBox<String> cblocnam;
    private javax.swing.JComboBox<String> cblocthang;
    private com.raven.chart.Chart chart;
    private javax.swing.JPanel chua2;
    private com.toedter.calendar.JDateChooser dateden;
    private com.toedter.calendar.JDateChooser datengay;
    private com.toedter.calendar.JDateChooser datetu;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton rbthoadon;
    private javax.swing.JRadioButton rbtsanpham;
    private javax.swing.JTable tbl_doanhthusp;
    private javax.swing.JPanel tbp_BieuDo;
    private javax.swing.JPanel tbp_ThongKe;
    // End of variables declaration//GEN-END:variables
}
