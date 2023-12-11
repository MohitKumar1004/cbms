
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
public class Deposit_Withdraw extends javax.swing.JFrame {

    /**
     * Creates new form Deposit
     */
    public Deposit_Withdraw() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblAccount = new javax.swing.JLabel();
        btnDW = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAccountNo = new javax.swing.JTextField();
        optDeposit = new javax.swing.JRadioButton();
        optWithdraw = new javax.swing.JRadioButton();
        cob1000 = new javax.swing.JComboBox();
        cob500 = new javax.swing.JComboBox();
        lbl1000 = new javax.swing.JLabel();
        lbl500 = new javax.swing.JLabel();
        cob200 = new javax.swing.JComboBox();
        lbl200 = new javax.swing.JLabel();
        cob100 = new javax.swing.JComboBox();
        lbl100 = new javax.swing.JLabel();
        cob50 = new javax.swing.JComboBox();
        lbl50 = new javax.swing.JLabel();
        cob20 = new javax.swing.JComboBox();
        lbl20 = new javax.swing.JLabel();
        cob10 = new javax.swing.JComboBox();
        lbl10 = new javax.swing.JLabel();
        cob5 = new javax.swing.JComboBox();
        lbl5 = new javax.swing.JLabel();
        cob2 = new javax.swing.JComboBox();
        lbl2 = new javax.swing.JLabel();
        cob1 = new javax.swing.JComboBox();
        lbl1 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        cob2000 = new javax.swing.JComboBox();
        lbl2000 = new javax.swing.JLabel();
        lblDWHeading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        lblAccount.setForeground(new java.awt.Color(0, 102, 51));
        lblAccount.setText("Account No.");

        btnDW.setForeground(new java.awt.Color(102, 102, 0));
        btnDW.setText("Deposit\\Withdraw");
        btnDW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDWActionPerformed(evt);
            }
        });

        btnBack.setForeground(new java.awt.Color(102, 102, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblName.setForeground(new java.awt.Color(0, 102, 51));
        lblName.setText("Name");

        lblPassword.setForeground(new java.awt.Color(0, 102, 51));
        lblPassword.setText("Password");

        buttonGroup1.add(optDeposit);
        optDeposit.setForeground(new java.awt.Color(0, 102, 51));
        optDeposit.setText("Deposit");

        buttonGroup1.add(optWithdraw);
        optWithdraw.setForeground(new java.awt.Color(0, 102, 51));
        optWithdraw.setText("Withdraw");

        cob1000.setForeground(new java.awt.Color(153, 0, 0));
        cob1000.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cob1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob1000ActionPerformed(evt);
            }
        });

        cob500.setForeground(new java.awt.Color(153, 0, 0));
        cob500.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cob500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob500ActionPerformed(evt);
            }
        });

        lbl1000.setForeground(new java.awt.Color(0, 102, 51));
        lbl1000.setText("Rs 1000");

        lbl500.setForeground(new java.awt.Color(0, 102, 51));
        lbl500.setText("Rs 500");

        cob200.setForeground(new java.awt.Color(153, 0, 0));
        cob200.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cob200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob200ActionPerformed(evt);
            }
        });

        lbl200.setForeground(new java.awt.Color(0, 102, 51));
        lbl200.setText("Rs 200");

        cob100.setForeground(new java.awt.Color(153, 0, 0));
        cob100.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cob100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob100ActionPerformed(evt);
            }
        });

        lbl100.setForeground(new java.awt.Color(0, 102, 51));
        lbl100.setText("Rs 100");

        cob50.setForeground(new java.awt.Color(153, 0, 0));
        cob50.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cob50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob50ActionPerformed(evt);
            }
        });

        lbl50.setForeground(new java.awt.Color(0, 102, 51));
        lbl50.setText("Rs 50");

        cob20.setForeground(new java.awt.Color(153, 0, 0));
        cob20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cob20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob20ActionPerformed(evt);
            }
        });

        lbl20.setForeground(new java.awt.Color(0, 102, 51));
        lbl20.setText("Rs 20");

        cob10.setForeground(new java.awt.Color(153, 0, 0));
        cob10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "10", "20", "30", "40", "50" }));
        cob10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob10ActionPerformed(evt);
            }
        });

        lbl10.setForeground(new java.awt.Color(0, 102, 51));
        lbl10.setText("Rs 10");

        cob5.setForeground(new java.awt.Color(153, 0, 0));
        cob5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "5", "10", "15", "20" }));
        cob5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob5ActionPerformed(evt);
            }
        });

        lbl5.setForeground(new java.awt.Color(0, 102, 51));
        lbl5.setText("Rs 5");

        cob2.setForeground(new java.awt.Color(153, 0, 0));
        cob2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cob2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob2ActionPerformed(evt);
            }
        });

        lbl2.setForeground(new java.awt.Color(0, 102, 51));
        lbl2.setText("Rs 2");

        cob1.setForeground(new java.awt.Color(153, 0, 0));
        cob1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob1ActionPerformed(evt);
            }
        });

        lbl1.setForeground(new java.awt.Color(0, 102, 51));
        lbl1.setText("Rs 1");

        lblAmount.setForeground(new java.awt.Color(0, 102, 51));
        lblAmount.setText("Amount");

        txtAmount.setForeground(new java.awt.Color(153, 0, 0));
        txtAmount.setText("0");

        cob2000.setForeground(new java.awt.Color(153, 0, 0));
        cob2000.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cob2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob2000ActionPerformed(evt);
            }
        });

        lbl2000.setForeground(new java.awt.Color(0, 102, 51));
        lbl2000.setText("Rs 2000");

        lblDWHeading.setFont(new java.awt.Font("Snap ITC", 2, 17)); // NOI18N
        lblDWHeading.setForeground(new java.awt.Color(204, 102, 0));
        lblDWHeading.setText("Deposit\\Withdraw Your Money Here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnDW, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDWHeading, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName)
                                    .addComponent(txtAccountNo)
                                    .addComponent(txtPassword)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl500, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl200, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl1000, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl2000, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cob2000, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob1000, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob500, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob200, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob100, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob50, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob20, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob10, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cob2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAmount))))))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblDWHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob2000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2000))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1000))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl500))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl200))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cob2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optDeposit)
                    .addComponent(optWithdraw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDW)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int a1000 = 0, a500 = 0, a200 = 0, a100 = 0, a50 = 0, a20 = 0, a2000 = 0, a10 = 0, a5 = 0, a2 = 0, a1 = 0, amt = 0;
    private void btnDWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDWActionPerformed
        String accountno = txtAccountNo.getText(), Amt = txtAmount.getText(), name = txtName.getText(), pin = JOptionPane.showInputDialog(null, "Please enter your Account PIN"),
                msg = " ";
        if (pin != null) {
            char[] password = txtPassword.getPassword();
            String pass = String.valueOf(password);
            try {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject?&useSSL=false", "root", "");
                Statement stmt = (Statement) con.createStatement();
                String query1 = "UPDATE accountdetails SET TotalAmount=TotalAmount+" + Amt + ",DateLastUsed=sysdate() where Name='" + name + "' and AccountNo='" + accountno + "' and Password='" + pass + "' and PIN='" + pin + "' and Status='Active';", query2 = "UPDATE accountdetails SET TotalAmount=TotalAmount-" + Amt + ",DateLastUsed=sysdate() where Name='" + name + "' and AccountNo='" + accountno + "' and Password='" + pass + "' and PIN='" + pin + "' and Status='Active';", query4 = "INSERT INTO deposit_withdrawaldetails VALUES('" + name + "','" + Amt + "','Deposited',sysdate(),'" + accountno + "');", query5 = "INSERT INTO deposit_withdrawaldetails VALUES('" + name + "','" + Amt + "','Withdrawn',sysdate(),'" + accountno + "');";
                if (optDeposit.isSelected()) {
                    stmt.executeUpdate(query1);
                    stmt.executeUpdate(query4);
                    msg = "Rs " + Amt + " is Deposited!";
                } else if (optWithdraw.isSelected()) {
                    stmt.executeUpdate(query2);
                    stmt.executeUpdate(query5);
                    msg = "Rs " + Amt + " is Withdrawn!";
                }
                JOptionPane.showMessageDialog(null, msg + "\nThank You!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnDWActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cob500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob500ActionPerformed
        if (cob500.getSelectedItem() == "None") {
            a500 = 0;
        } else {
            a500 = 500 * (Integer.parseInt((String) cob500.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob500ActionPerformed

    private void cob200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob200ActionPerformed
        if (cob200.getSelectedItem() == "None") {
            a200 = 0;
        } else {
            a200 = 200 * (Integer.parseInt((String) cob200.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob200ActionPerformed

    private void cob100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob100ActionPerformed
        if (cob100.getSelectedItem() == "None") {
            a100 = 0;
        } else {
            a100 = 100 * (Integer.parseInt((String) cob100.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob100ActionPerformed

    private void cob50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob50ActionPerformed
        if (cob50.getSelectedItem() == "None") {
            a50 = 0;
        } else {
            a50 = 50 * (Integer.parseInt((String) cob50.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob50ActionPerformed

    private void cob20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob20ActionPerformed
        if (cob20.getSelectedItem() == "None") {
            a20 = 0;
        } else {
            a20 = 20 * (Integer.parseInt((String) cob20.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob20ActionPerformed

    private void cob10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob10ActionPerformed
        if (cob10.getSelectedItem() == "None") {
            a10 = 0;
        } else {
            a10 = 10 * (Integer.parseInt((String) cob10.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob10ActionPerformed

    private void cob5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob5ActionPerformed
        if (cob5.getSelectedItem() == "None") {
            a5 = 0;
        } else {
            a5 = 5 * (Integer.parseInt((String) cob5.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob5ActionPerformed

    private void cob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob2ActionPerformed
        if (cob2.getSelectedItem() == "None") {
            a2 = 0;
        } else {
            a2 = 2 * (Integer.parseInt((String) cob2.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob2ActionPerformed

    private void cob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob1ActionPerformed
        if (cob1.getSelectedItem() == "None") {
            a1 = 0;
        } else {
            a1 = 1 * (Integer.parseInt((String) cob1.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob1ActionPerformed

    private void cob1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob1000ActionPerformed
        if (cob1000.getSelectedItem() == "None") {
            a1000 = 0;
        } else {
            a1000 = 1000 * (Integer.parseInt((String) cob1000.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob1000ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        txtAmount.setEditable(false);
        optDeposit.setSelected(true);
    }//GEN-LAST:event_formWindowGainedFocus

    private void cob2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob2000ActionPerformed
        if (cob2000.getSelectedItem() == "None") {
            a2000 = 0;
        } else {
            a2000 = 2000 * (Integer.parseInt((String) cob2000.getSelectedItem()));
        }
        amt = a1000 + a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1 + a2000;
        txtAmount.setText(" " + amt);
    }//GEN-LAST:event_cob2000ActionPerformed

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
            java.util.logging.Logger.getLogger(Deposit_Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit_Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit_Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit_Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit_Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDW;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cob1;
    private javax.swing.JComboBox cob10;
    private javax.swing.JComboBox cob100;
    private javax.swing.JComboBox cob1000;
    private javax.swing.JComboBox cob2;
    private javax.swing.JComboBox cob20;
    private javax.swing.JComboBox cob200;
    private javax.swing.JComboBox cob2000;
    private javax.swing.JComboBox cob5;
    private javax.swing.JComboBox cob50;
    private javax.swing.JComboBox cob500;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl100;
    private javax.swing.JLabel lbl1000;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl200;
    private javax.swing.JLabel lbl2000;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl500;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDWHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JRadioButton optDeposit;
    private javax.swing.JRadioButton optWithdraw;
    private javax.swing.JTextField txtAccountNo;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
