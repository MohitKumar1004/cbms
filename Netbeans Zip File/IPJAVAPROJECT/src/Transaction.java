
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Transaction extends javax.swing.JFrame {

    /**
     * Creates new form Transaction
     */
    public Transaction() {
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

        lblPasswordSender = new javax.swing.JLabel();
        txtPasswordSender = new javax.swing.JPasswordField();
        lblNameSender = new javax.swing.JLabel();
        txtNameSender = new javax.swing.JTextField();
        txtAccountNoSender = new javax.swing.JTextField();
        lblAccountSender = new javax.swing.JLabel();
        lblNameReciever = new javax.swing.JLabel();
        txtNameReciever = new javax.swing.JTextField();
        lblAccountReceiver = new javax.swing.JLabel();
        txtAccountNoReciever = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnTransfer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblTHeading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPasswordSender.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPasswordSender.setForeground(new java.awt.Color(51, 102, 255));
        lblPasswordSender.setText("Password of Sender");

        lblNameSender.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblNameSender.setForeground(new java.awt.Color(51, 102, 255));
        lblNameSender.setText("Name of the Sender");

        lblAccountSender.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAccountSender.setForeground(new java.awt.Color(51, 102, 255));
        lblAccountSender.setText("Account No. of Sender");

        lblNameReciever.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblNameReciever.setForeground(new java.awt.Color(51, 102, 255));
        lblNameReciever.setText("Name of the Reciever");

        lblAccountReceiver.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAccountReceiver.setForeground(new java.awt.Color(51, 102, 255));
        lblAccountReceiver.setText("Account No. of Reciever");

        lblAmount.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(51, 102, 255));
        lblAmount.setText("Total Amount To Be Transferred");

        btnTransfer.setForeground(new java.awt.Color(102, 0, 102));
        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnBack.setForeground(new java.awt.Color(102, 0, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTHeading.setFont(new java.awt.Font("Ravie", 2, 14)); // NOI18N
        lblTHeading.setForeground(new java.awt.Color(0, 153, 102));
        lblTHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTHeading.setText("Transfer Your Money From One Account To Another Here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblAccountSender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(lblNameSender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPasswordSender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAccountNoSender, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtNameSender)
                            .addComponent(txtPasswordSender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(lblAccountReceiver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNameReciever, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtAccountNoReciever)
                            .addComponent(txtNameReciever)))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblTHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameSender)
                    .addComponent(txtNameSender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameReciever)
                    .addComponent(txtNameReciever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountNoSender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountSender)
                    .addComponent(lblAccountReceiver)
                    .addComponent(txtAccountNoReciever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPasswordSender)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPasswordSender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAmount)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransfer)
                    .addComponent(btnBack))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        String namS = txtNameSender.getText(), namR = txtNameReciever.getText(), accnoS = txtAccountNoSender.getText(), accnoR = txtAccountNoReciever.getText(), amnt = txtAmount.getText(), pin = JOptionPane.showInputDialog(null, "Please enter your Account PIN");
        char[] password = txtPasswordSender.getPassword();
        String pass = String.valueOf(password);
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject?&useSSL=false", "root", "gta54321");
            Statement stmt = (Statement) con.createStatement();
            String query1 = "SET AUTOCOMMIT=0;", query2 = "UPDATE accountdetails SET TotalAmount=TotalAmount-" + amnt + ",DateLastUsed=sysdate() where Name='" + namS + "' and AccountNo='" + accnoS + "' and Password='" + pass + "' and PIN='" + pin + "' and Status='Active';", query3 = "UPDATE accountdetails SET TotalAmount=TotalAmount+" + amnt + ",DateLastUsed=sysdate() where Name='" + namR + "' and AccountNo='" + accnoR + "' and Status='Active';", query4 = "INSERT INTO transactiondetails VALUES('" + accnoS + "','" + accnoR + "','" + namS + "','" + namR + "','" + amnt + "',sysdate());", queryRb = "Rollback;", queryCo = "Commit;";
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
            stmt.executeUpdate(query3);
            stmt.executeUpdate(query4);
            int rbco = JOptionPane.showConfirmDialog(null, "Are you Sure you want to Transfer Rs. " + amnt + " to Account No." + accnoR + " of " + namR + "?");
            if (rbco == 0) {
                stmt.executeUpdate(queryCo);
            } else {
                stmt.executeUpdate(queryRb);
            }
            JOptionPane.showMessageDialog(null, "Transaction is Successfull!\nThank You!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel lblAccountReceiver;
    private javax.swing.JLabel lblAccountSender;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblNameReciever;
    private javax.swing.JLabel lblNameSender;
    private javax.swing.JLabel lblPasswordSender;
    private javax.swing.JLabel lblTHeading;
    private javax.swing.JTextField txtAccountNoReciever;
    private javax.swing.JTextField txtAccountNoSender;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtNameReciever;
    private javax.swing.JTextField txtNameSender;
    private javax.swing.JPasswordField txtPasswordSender;
    // End of variables declaration//GEN-END:variables
}