package view;

import Repository.Login_Repo;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.GetChucVu;
import model.Login_Model;

public class Login extends javax.swing.JPanel {

    private static Login_Repo lgRepo = new Login_Repo();

    public Login() {
        initComponents();
    }

    public void login() {
        txtUser.grabFocus();
    }

    public void addEventRegister(ActionListener event) {
        cmdRegister.addActionListener(event);
    }

    // 1 = NV , 2 = QL
    public String returnChucVu() { //dựa vào id_chức vụ mà alter 
        Login_Model lg = lgRepo.getDangnhap(txtUser.getText(), txtPass.getText());
        if (lg.getChucVu() == 0) {
            return "Quản lí";
        } else if (lg.getChucVu() == 1) {
            return "Nhân viên";
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new swing.MyPassword();
        jLabel3 = new javax.swing.JLabel();
        myButton1 = new swing.MyButton();
        cmdRegister = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        txtUser.setText("NV01");

        jLabel1.setText("Mã Nhân Viên");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 68, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        txtPass.setText("29042002");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        jLabel3.setText("Password");

        myButton1.setBackground(new java.awt.Color(125, 229, 251));
        myButton1.setForeground(new java.awt.Color(40, 40, 40));
        myButton1.setText("Đăng Nhập");
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        cmdRegister.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        cmdRegister.setForeground(new java.awt.Color(30, 122, 236));
        cmdRegister.setText("Quên Mật Khẩu");
        cmdRegister.setContentAreaFilled(false);
        cmdRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("hiện mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(myButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(8, 8, 8)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(cmdRegister)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        if (txtUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập vào tài khoản!");
            return;
        }
        if (txtPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập vào mật khẩu!");
            return;
        }
        Login_Model lg = lgRepo.getDangnhap(txtUser.getText(), txtPass.getText());
        if (lg == null) {//chek xem dựa vào TK + MK : có lấy ra đối tượng nào ko.
            JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại! Vui lòng xem lại thông tin!");
            txtUser.setText("");
            txtPass.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công với tư cách: " + returnChucVu());
            GetChucVu.setId(lg.getId_NV());
            GetChucVu.setManv(lg.getManv());
            GetChucVu.setMatkhau(lg.getMatkhau());
            GetChucVu.setChucvu(lg.getChucVu());
            System.out.println("ID :" + lg.getId_NV() + " maNV :" + lg.getManv() + " MK :" + lg.getMatkhau() + " Chức.Vụ :" + lg.getChucVu());

            MainJFrame mjfarme = new MainJFrame();
            mjfarme.setVisible(true);
            // Đóng JFrame hoặc JPanel hiện tại
            SwingUtilities.getWindowAncestor(this).dispose();

        }
    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == 10) {
            if (txtUser.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nhập vào tài khoản!");
                return;
            }
            if (txtPass.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nhập vào mật khẩu!");
                return;
            }
            Login_Model lg = lgRepo.getDangnhap(txtUser.getText(), txtPass.getText());
            if (lg == null) {
                JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại! Vui lòng xem lại thông tin!");
                txtUser.setText("");
                txtPass.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công với tư cách: " + returnChucVu());
                GetChucVu.setChucvu(lg.getChucVu()); //Thông qua đối tượng đăng nhập vào lấy chức vụ của nó.
                MainJFrame mjfarme = new MainJFrame();
                mjfarme.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtPassKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdRegister;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private swing.MyButton myButton1;
    private swing.MyPassword txtPass;
    private swing.MyTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
