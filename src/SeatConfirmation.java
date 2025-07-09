
package bookmyshow;


import static bookmyshow.BookIngFrame.total_seat_price;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeatConfirmation extends javax.swing.JFrame {
  
    public static String seat_price,seat_count,total_seat_price,amount_str,food_name,food_amt,seatType_str,foodCount_str,selectSeatCombo,numOfSeatcCombo,foodCombo,foodQuantityCombo;
    String movie_count ;
    public static int movie_number;
    public static JFrame frame1;
    public SeatConfirmation() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1 = this;
        movie_number = (BookIngFrame.movie_number);
        seat_price = (BookIngFrame.seat_price); 
        seat_count = (BookIngFrame.seat_count);
        amount_str = (BookIngFrame.amount_str ); 
        total_seat_price = (BookIngFrame.total_seat_price);
        food_name = (BookIngFrame.food_name );
        food_amt = (BookIngFrame.food_amt);
        seatType_str = (BookIngFrame.seatType_str); 
        foodCount_str = (BookIngFrame.foodCount_str); 
        selectSeatCombo = (BookIngFrame.selectSeatCombo); 
        numOfSeatcCombo = (BookIngFrame.numOfSeatcCombo);
        foodCombo = (BookIngFrame.foodCombo); 
        foodQuantityCombo = (BookIngFrame.foodQuantityCombo);
        
        tickt_count.setText(seat_count);
        tickt_amt.setText(amount_str);
        nameFood.setText(food_name);
        foodCost.setText(food_amt);
        count_label.setText(seat_count);
        //movie_label.setText(food_amt);
        setMovie();
        
       
    }
    void setMovie()
    {
        
        if(BookIngFrame.movie_number == 1)
        {
            movie_name.setText("RAVANASURA");
            
            movie_label.setIcon(new ImageIcon(new ImageIcon("images/moviePic1_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        }
        else if(BookIngFrame.movie_number == 2)
        {
            movie_name.setText("PATHAN");
            
            movie_label.setIcon(new ImageIcon(new ImageIcon("images/moviePic2_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        }
        else if(BookIngFrame.movie_number == 3)
        {
            movie_name.setText("ADHIPURUSH");
            
            movie_label.setIcon(new ImageIcon(new ImageIcon("images/Adipurush-5-322x403.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        }
        else if(BookIngFrame.movie_number == 4)
        {
            movie_name.setText("VED");
            
            movie_label.setIcon(new ImageIcon(new ImageIcon("images/moviePic4_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        movie_name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        movie_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        count_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nameFood = new javax.swing.JLabel();
        foodCost = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tickt_count = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tickt_amt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_label.setText("X");
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

        jPanel1.setBackground(new java.awt.Color(246, 246, 238));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

        movie_name.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jPanel1.add(movie_name);
        movie_name.setBounds(290, 40, 390, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("Phone - 22557896");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 320, 380, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setText("12:00 pm | Sun, 1 Aug ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 260, 310, 50);

        movie_label.setBackground(new java.awt.Color(255, 102, 102));
        movie_label.setOpaque(true);
        jPanel1.add(movie_label);
        movie_label.setBounds(40, 40, 209, 325);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel4.setText("CityPride, Karvand Naka, Shirpur");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 290, 380, 50);

        count_label.setBackground(new java.awt.Color(255, 255, 255));
        count_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count_label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 5, 5), 1, true));
        jPanel1.add(count_label);
        count_label.setBounds(290, 120, 80, 70);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tickets");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 200, 80, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 710, 410));

        jPanel2.setBackground(new java.awt.Color(246, 246, 238));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(21, 5, 5));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(246, 246, 238));
        jButton1.setText("Proceed To Payment");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(500, 250, 180, 40);

        back_btn.setBackground(new java.awt.Color(21, 5, 5));
        back_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(246, 246, 238));
        back_btn.setText("Back");
        back_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel2.add(back_btn);
        back_btn.setBounds(30, 250, 160, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(21, 5, 5));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("ORDER SUMMARY");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 10, 240, 30);

        jPanel3.setBackground(new java.awt.Color(246, 246, 238));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        nameFood.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(nameFood);
        nameFood.setBounds(10, 40, 280, 30);

        foodCost.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        foodCost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(foodCost);
        foodCost.setBounds(480, 40, 160, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("FOOD & BEVERAGES");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 10, 310, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(30, 150, 650, 80);

        jPanel5.setBackground(new java.awt.Color(246, 246, 238));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(null);

        tickt_count.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tickt_count.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(tickt_count);
        tickt_count.setBounds(480, 40, 160, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("TICKET AMOUNT ");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(10, 10, 160, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("QUANTITY");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(10, 40, 160, 30);

        tickt_amt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tickt_amt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(tickt_amt);
        tickt_amt.setBounds(480, 10, 160, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(30, 50, 650, 80);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 660, 710, 310));

        jLabel5.setBackground(new java.awt.Color(246, 246, 238));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 57)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(246, 246, 238));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirm Your Booking");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 930, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gitan\\OneDrive\\Documents\\NetBeansProjects\\BookMyShow\\images\\seat_bgimg_blur.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_exit_labelMouseClicked

    private void exit_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseEntered
        exit_label.setBackground(Color.red);// TODO add your handling code here:
    }//GEN-LAST:event_exit_labelMouseEntered

    private void exit_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseExited
        exit_label.setBackground(Color.lightGray);// TODO add your handling code here:
    }//GEN-LAST:event_exit_labelMouseExited

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        //seat_count = tickt_count.getText();
        BookIngFrame.frame.setVisible(true);
        dispose();
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_back_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PaymentFrame().show();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SeatConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatConfirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel count_label;
    private javax.swing.JLabel exit_label;
    private javax.swing.JLabel foodCost;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel movie_label;
    private javax.swing.JLabel movie_name;
    private javax.swing.JLabel nameFood;
    private javax.swing.JLabel tickt_amt;
    private javax.swing.JLabel tickt_count;
    // End of variables declaration//GEN-END:variables
}
