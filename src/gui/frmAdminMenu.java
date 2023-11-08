
package gui;

/**
 *
 * @author ASUS
 */
public class frmAdminMenu extends javax.swing.JFrame {

    
    
    public frmAdminMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelControl = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        barMenu = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Motor = new javax.swing.JLabel();
        Statictise = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        out = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanelControl.setBackground(new java.awt.Color(204, 255, 204));
        JPanelControl.setLayout(new java.awt.BorderLayout());

        jpMenu.setBackground(new java.awt.Color(255, 255, 255));

        barMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bars.jpg"))); // NOI18N
        barMenu.setText("jLabel1");
        barMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barMenuMouseClicked(evt);
            }
        });

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/TrangChu-home.jpg"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        Motor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/motor-admin.jpg"))); // NOI18N
        Motor.setText("jLabel3");
        Motor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MotorMouseClicked(evt);
            }
        });

        Statictise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/statistic-home.jpg"))); // NOI18N

        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/employee-admin.jpg"))); // NOI18N
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/setting.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help-home.jpg"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/imgEmployee-home.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel1.setText("----------");

        jLabel9.setText("----------");

        jLabel10.setText("----------");

        out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout-home.jpg"))); // NOI18N
        out.setText("jLabel2");
        out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Home)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Motor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(barMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Statictise)
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barMenu)
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(Home)
                .addGap(18, 18, 18)
                .addComponent(Motor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Employee)
                .addGap(24, 24, 24)
                .addComponent(Statictise)
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(out)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMenuMouseClicked
        // TODO add your handling code here:
        
        JPanelControl.removeAll();
        frmMenuAdminItem frm = new frmMenuAdminItem();
        JPanelControl.add(frm);
        validate();
        
    }//GEN-LAST:event_barMenuMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        JPanelControl.removeAll();
        frmAdminMotor frm = new frmAdminMotor();
        JPanelControl.add(frm);
        validate();
    }//GEN-LAST:event_HomeMouseClicked

    private void outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outMouseClicked
        // TODO add your handling code here:
        frmLogin loginFrame = new frmLogin();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_outMouseClicked

    private void MotorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotorMouseClicked
        // TODO add your handling code here:
        JPanelControl.removeAll();
        frmAdminMotor frm = new frmAdminMotor();
        JPanelControl.add(frm);
        validate();
    }//GEN-LAST:event_MotorMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        // TODO add your handling code here:
        JPanelControl.removeAll();
        frmAdminEmployee frm = new frmAdminEmployee();
        JPanelControl.add(frm);
        validate();
    }//GEN-LAST:event_EmployeeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel JPanelControl;
    private javax.swing.JLabel Motor;
    private javax.swing.JLabel Statictise;
    private javax.swing.JLabel barMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel out;
    // End of variables declaration//GEN-END:variables
}
