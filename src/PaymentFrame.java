
package bookmyshow;

import static bookmyshow.SeatConfirmation.movie_number;
import java.awt.Color;
import java.util.Random;


public class PaymentFrame extends javax.swing.JFrame {
    
    private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMERICS = "0123456789";
    String date;
    
    

    String amount_str;
    public PaymentFrame() {
        initComponents();
        
        jPanel1.setVisible(false);
       
        jPanel2.setBackground(new Color(255,255,255));
        jPanel2.setForeground(new Color(59, 47, 43));
       
        pay_btn.setBackground(new Color(21,5,5));
        pay_btn.setForeground(new Color(246, 246, 238));
        cancel_btn.setBackground(new Color(21,5,5));
        cancel_btn.setForeground(new Color(246, 246, 238));
        jPanel1.setBackground(new Color(255,255,255));
        jPanel1.setForeground(new Color(59, 47, 43));
        
        //movie_number = (BookMyShow_fram.movie_number);
        amount_str = BookMyShow_fram.amount_str;
        amt_label.setText(amount_str);
        amt_label2.setText(amount_str);
        
        uniqueIdGenerate();
        String dd = dd_combo.getSelectedItem().toString();
        String mm = mm_combo.getSelectedItem().toString();
        String yy = yy_combo.getSelectedItem().toString();
       
        email_txt.setText(LoginFrame.email_str);
       
        
  //      String data = "Programming language Selected: "   
  // + cb.getItemAt(cb.getSelectedIndex());  
     
    }
    void uniqueIdGenerate()
    {
     
        Random random = new Random();

        // Generate 3 random alphabets
        StringBuilder alphabetsPart1 = new StringBuilder(3);
        for (int i = 0; i < 3; i++) {
            alphabetsPart1.append(ALPHABETS.charAt(random.nextInt(ALPHABETS.length())));
        }

        // Generate 5 random numerals
        StringBuilder numericsPart1 = new StringBuilder(5);
        for (int i = 0; i < 5; i++) {
            numericsPart1.append(NUMERICS.charAt(random.nextInt(NUMERICS.length())));
        }
         StringBuilder alphabetsPart2 = new StringBuilder(2);
        for (int i = 0; i < 3; i++) {
            alphabetsPart2.append(ALPHABETS.charAt(random.nextInt(ALPHABETS.length())));
        }
        StringBuilder numericsPart2 = new StringBuilder(3);
        for (int i = 0; i < 3; i++) {
            numericsPart2.append(NUMERICS.charAt(random.nextInt(NUMERICS.length())));
        }
        
        String customUUID = alphabetsPart1.toString() + numericsPart1.toString() + alphabetsPart2.toString() + numericsPart2.toString();

        
        transaction_label.setText(customUUID);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        credit_radio = new javax.swing.JRadioButton();
        debit_radio = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        pay_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        cancel_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        amt_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        card_number = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dd_combo = new javax.swing.JComboBox<>();
        mm_combo = new javax.swing.JComboBox<>();
        yy_combo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        amt_label2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        transaction_label = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        exit_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 246, 238));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("---------------Pay With---------------");

        buttonGroup1.add(credit_radio);
        credit_radio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        credit_radio.setText("Credit Card");
        credit_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credit_radioActionPerformed(evt);
            }
        });

        buttonGroup1.add(debit_radio);
        debit_radio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        debit_radio.setText("Debit Card");
        debit_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debit_radioActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bank", "SBI", "Bank of Baroda", "ICIC ", "Panjab National Bank" }));

        pay_btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pay_btn.setText("Pay Now");
        pay_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("How would you lilke to pay ? ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Email Id");

        email_txt.setEditable(false);
        email_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });

        cancel_btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));

        amt_label.setBackground(new java.awt.Color(102, 0, 102));
        amt_label.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        amt_label.setForeground(new java.awt.Color(255, 255, 255));
        amt_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(amt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(amt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Card Number");

        card_number.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Date");

        dd_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        mm_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" }));

        yy_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YY", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cancel_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(73, 73, 73)
                            .addComponent(dd_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mm_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(yy_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(113, 113, 113)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(card_number, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(credit_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(debit_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pay_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(credit_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debit_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card_number, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dd_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mm_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yy_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pay_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 680, 740));

        jPanel1.setBackground(new java.awt.Color(246, 246, 238));

        jLabel4.setBackground(new java.awt.Color(0, 153, 51));
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\gitan\\OneDrive\\Documents\\NetBeansProjects\\BookMyShow\\images\\pay_symbol.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Payment Done Successfully");

        date_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date_label.setForeground(new java.awt.Color(255, 255, 255));
        date_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_label.setText("Date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        amt_label2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        amt_label2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        amt_label2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(210, 210, 210), 2, true));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Transaction ID");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Amount Paid");

        transaction_label.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        transaction_label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(210, 210, 210), 2, true));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\gitan\\OneDrive\\Documents\\NetBeansProjects\\BookMyShow\\images\\paytm-googlepay.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amt_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transaction_label, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transaction_label, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amt_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 280, 450, 610));

        exit_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exit_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_label.setText("x");
        exit_label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        exit_label.setOpaque(true);
        exit_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_labelMouseExited(evt);
            }
        });
        getContentPane().add(exit_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 0, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gitan\\OneDrive\\Documents\\NetBeansProjects\\BookMyShow\\images\\seat_bgimg123.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void debit_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debit_radioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debit_radioActionPerformed

    private void credit_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credit_radioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credit_radioActionPerformed

    private void pay_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_btnActionPerformed
        
        jPanel1.setVisible(true);
        String date = dd_combo.getItemAt(dd_combo.getSelectedIndex()) +" "+ mm_combo.getItemAt(mm_combo.getSelectedIndex()) +" "+ yy_combo.getItemAt(yy_combo.getSelectedIndex());
        date_label. setText(date);// TODO add your handling code here:
    }//GEN-LAST:event_pay_btnActionPerformed

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exit_labelMouseClicked

    private void exit_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseEntered
        exit_label.setBackground(Color.red);// TODO add your handling code here:
    }//GEN-LAST:event_exit_labelMouseEntered

    private void exit_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseExited
        exit_label.setBackground(Color.lightGray);// TODO add your handling code here:
    }//GEN-LAST:event_exit_labelMouseExited

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        SeatConfirmation.frame1.setVisible(true);        
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_cancel_btnActionPerformed


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
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amt_label;
    private javax.swing.JLabel amt_label2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JTextField card_number;
    private javax.swing.JRadioButton credit_radio;
    private javax.swing.JLabel date_label;
    private javax.swing.JComboBox<String> dd_combo;
    private javax.swing.JRadioButton debit_radio;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel exit_label;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> mm_combo;
    private javax.swing.JButton pay_btn;
    private javax.swing.JLabel transaction_label;
    private javax.swing.JComboBox<String> yy_combo;
    // End of variables declaration//GEN-END:variables
}
