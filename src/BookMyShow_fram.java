package bookmyshow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import static bookmyshow.SeatConfirmation.amount_str;
import static bookmyshow.SeatConfirmation.foodCombo;
import static bookmyshow.SeatConfirmation.foodCount_str;
import static bookmyshow.SeatConfirmation.foodQuantityCombo;
import static bookmyshow.SeatConfirmation.food_amt;
import static bookmyshow.SeatConfirmation.food_name;
import static bookmyshow.SeatConfirmation.movie_number;
import static bookmyshow.SeatConfirmation.numOfSeatcCombo;
import static bookmyshow.SeatConfirmation.seatType_str;
import static bookmyshow.SeatConfirmation.seat_count;
import static bookmyshow.SeatConfirmation.seat_price;
import static bookmyshow.SeatConfirmation.selectSeatCombo;

public class BookMyShow_fram extends javax.swing.JFrame {

    int seat_cost = 0,food_cost = 0;
    String movie_label;
    public static String seat_price,seat_count,total_seat_price,amount_str,food_name,food_amt,seatType_str,foodCount_str,selectSeatCombo,numOfSeatcCombo,foodCombo,foodQuantityCombo;
    public static int movie_number = 0;
    public static JFrame frame;
    
    public BookMyShow_fram() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame = this;
        setValueToCombobox();
        movie_number = (SeatConfirmation.movie_number);
        seat_price = (SeatConfirmation.seat_price); 
        seat_count = (SeatConfirmation.seat_count);
        total_seat_price = (SeatConfirmation.total_seat_price);
        amount_str = (SeatConfirmation.amount_str ); 
        food_name = (SeatConfirmation.food_name );
        food_amt = (SeatConfirmation.food_amt);
        seatType_str = (SeatConfirmation.seatType_str); 
        foodCount_str = (SeatConfirmation.foodCount_str); 
        selectSeatCombo = (SeatConfirmation.selectSeatCombo); 
        numOfSeatcCombo = (SeatConfirmation.numOfSeatcCombo);
        foodCombo = (SeatConfirmation.foodCombo); 
        foodQuantityCombo = (SeatConfirmation.foodQuantityCombo);
        
        
        select_seatCombo.setEnabled(false);
        no_ofSeat_combo.setEnabled(false);
        food_combo.setEnabled(false);
        foodQuantity_combo.setEnabled(false);
        
        //select_seatCombo.setSelectedItem(SeatConfirmation.);
        selectSeat_txt.setText(SeatConfirmation.seatType_str);
        //no_ofSeat_combo.setSelectedItem(SeatConfirmation.seat_count);
        noOfSeat_txt.setText(SeatConfirmation.total_seat_price);
        //food_combo.setSelectedItem(SeatConfirmation.food_name);
        selectFood_txt.setText(SeatConfirmation.food_name);
        //foodQuantity_combo.setSelectedItem(SeatConfirmation.foodCount_str);
        foodQuantity_txt.setText(SeatConfirmation.food_amt);
        total_amount_txt.setText(SeatConfirmation.amount_str);
        
        
         
    }
    void setValueToCombobox()
    {
        
         //Combobox 
         //Select Seat Type
         select_seatCombo.addItem("Select Seat Type");
         select_seatCombo.addItem("Platinum - Rs.200");
         select_seatCombo.addItem("Diamond - Rs.150");
         select_seatCombo.addItem("Gold - Rs.100");
         select_seatCombo.addItem("Silver - Rs.70");        
         select_seatCombo.setBackground(new Color(246, 246, 238));
         select_seatCombo.setForeground(new Color(25, 0, 0));
         //Select No of Seat 
         no_ofSeat_combo.addItem("Select No. of Seats");
         no_ofSeat_combo.addItem("1");
         no_ofSeat_combo.addItem("2");
         no_ofSeat_combo.addItem("3");
         no_ofSeat_combo.addItem("4");
         no_ofSeat_combo.addItem("5");
         no_ofSeat_combo.addItem("6");
         no_ofSeat_combo.addItem("7");
         no_ofSeat_combo.addItem("8");
         no_ofSeat_combo.setBackground(new Color(246, 246, 238));
         no_ofSeat_combo.setForeground(new Color(59, 47, 43));
         
         //Food and Beverage 
         food_combo.addItem("Select Food and Beverage");
         food_combo.addItem("Samosa - Rs.70");
         food_combo.addItem("PopCorn - Rs.50");
         food_combo.addItem("Cake - Rs.100");
         food_combo.addItem("Samosa PopCorn Combo - Rs.110");
         food_combo.addItem("Samosa Cake Combo - Rs.150");
         food_combo.setBackground(new Color(246, 246, 238));
         food_combo.setForeground(new Color(59, 47, 43));
         
         //Food and Beverage Quality 
         foodQuantity_combo.addItem("Select Food and Beverage Quantity");
         foodQuantity_combo.addItem("1");
         foodQuantity_combo.addItem("2");
         foodQuantity_combo.addItem("3");
         foodQuantity_combo.addItem("4");        
         foodQuantity_combo.setBackground(new Color(246, 246, 238));
         foodQuantity_combo.setForeground(new Color(59, 47, 43));
         
         new_btn.setBackground(new Color(246, 246, 238));
         new_btn.setForeground(new Color(59, 47, 43));
         
         cancel_btn.setBackground(new Color(246, 246, 238));
         cancel_btn.setForeground(new Color(59, 47, 43));
         
         select_seatCombo.setEnabled(false);
         no_ofSeat_combo.setEnabled(false);
         food_combo.setEnabled(false);
         foodQuantity_combo.setEnabled(false);
         
         next_btn.setBackground(new Color(246, 246, 238));
         next_btn.setForeground(new Color(0,0,0));         
         total_amount_txt.setBackground(new Color(246, 246, 238));
         total_amount_txt.setForeground(new Color(0,0,0)); 
        
                 
    }
    void numOfSeatsCombo(){
    
    if(no_ofSeat_combo.getSelectedItem().toString().equals("1"))  
    {
            if(select_seatCombo.getSelectedItem().toString().equals("Platinum - Rs.200"))
            {
                seat_cost = 200*1;               
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Diamond - Rs.150"))
            {
                seat_cost = 150*1;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 100*1;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 70*1;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
        no_ofSeat_combo.setSelectedItem("1");
            
    }
    else if(no_ofSeat_combo.getSelectedItem().toString().equals("2"))
    {
            if(select_seatCombo.getSelectedItem().toString().equals("Platinum - Rs.200"))
            {
                seat_cost = 200*2;               
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Diamond - Rs.150"))
            {
                seat_cost = 150*2;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 100*2;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 70*2;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            } 
          no_ofSeat_combo.setSelectedItem("2");
        
    }
    else if(no_ofSeat_combo.getSelectedItem().toString().equals("3"))
    {
            if(select_seatCombo.getSelectedItem().toString().equals("Platinum - Rs.200"))
            {
                seat_cost = 200*3;               
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Diamond - Rs.150"))
            {
                seat_cost = 150*3;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 100*3;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 70*3;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
           no_ofSeat_combo.setSelectedItem("3");            
    }
    else if(no_ofSeat_combo.getSelectedItem().toString().equals("4"))
    {
            if(select_seatCombo.getSelectedItem().toString().equals("Platinum - Rs.200"))
            {
                seat_cost = 200*4;               
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Diamond - Rs.150"))
            {
                seat_cost = 150*4;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 100*4;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 70*4;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
         no_ofSeat_combo.setSelectedItem("4");
    }
    else if(no_ofSeat_combo.getSelectedItem().toString().equals("5"))
    {
            if(select_seatCombo.getSelectedItem().toString().equals("Platinum - Rs.200"))
            {
                seat_cost = 200*5;               
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Diamond - Rs.150"))
            {
                seat_cost = 150*5;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 100*5;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 70*5;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
          no_ofSeat_combo.setSelectedItem("5");
    }
    else if(no_ofSeat_combo.getSelectedItem().toString().equals("6"))
    {
            if(select_seatCombo.getSelectedItem().toString().equals("Platinum - Rs.200"))
            {
                seat_cost = 200*6;               
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Diamond - Rs.150"))
            {
                seat_cost = 150*6;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 100*6;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 70*6;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
          no_ofSeat_combo.setSelectedItem("3");
    }
    else if(no_ofSeat_combo.getSelectedItem().toString().equals("7"))
    {
            if(select_seatCombo.getSelectedItem().toString().equals("Platinum - Rs.200"))
            {
                seat_cost = 200*7;               
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Diamond - Rs.150"))
            {
                seat_cost = 150*7;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 100*7;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 70*7;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            } 
          no_ofSeat_combo.setSelectedItem("7");
    }
    else if(no_ofSeat_combo.getSelectedItem().toString().equals("8"))
    {
            if(select_seatCombo.getSelectedItem().toString().equals("Platinum - Rs.200"))
            {
                seat_cost = 200*8;               
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Diamond - Rs.150"))
            {
                seat_cost = 150*8;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 100*8;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
            else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
            {
                seat_cost = 70*8;
                noOfSeat_txt.setText(String.valueOf("Rs."+seat_cost));
            }
          no_ofSeat_combo.setSelectedItem("8");
          
    }
  
    }
    void foodComboAction()
    {
        if(food_combo.getSelectedItem().toString().equals("Samosa - Rs.70"))
        {
            selectFood_txt.setText("Samosa");
            
        }
        else if(food_combo.getSelectedItem().toString().equals("PopCorn - Rs.50"))
        {
            selectFood_txt.setText("PopCorn");
           
        }
        else if(food_combo.getSelectedItem().toString().equals("Cake - Rs.100"))
        {
            selectFood_txt.setText("Cake");
            
        }
        else if(food_combo.getSelectedItem().toString().equals("Samosa PopCorn Combo - Rs.110"))
        {
            selectFood_txt.setText("Samosa PopCorn Combo");
           
        } 
        else if(food_combo.getSelectedItem().toString().equals("Samosa Cake Combo - Rs.150"))
        {
            selectFood_txt.setText("Samosa Cake Combo");
           
        } 

    }
    void foodQuantityAction()
    {
    if(foodQuantity_combo.getSelectedItem().toString().equals("1"))  
    {
            if(food_combo.getSelectedItem().toString().equals("Samosa - Rs.70"))
            {
                food_cost = 70*1;               
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("PopCorn - Rs.50"))
            {
                food_cost = 50*1;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Cake - Rs.100"))
            {
                food_cost = 100*1;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Samosa PopCorn Combo - Rs.110"))
            {
                food_cost = 110*1;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Samosa Cake Combo - Rs.150"))
            {
                food_cost = 150*1;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            
            
            
    }        // TODO add your handling code here:
    else if(foodQuantity_combo.getSelectedItem().toString().equals("2"))  
    {
            if(food_combo.getSelectedItem().toString().equals("Samosa - Rs.70"))
            {
                food_cost = 70*2;               
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("PopCorn - Rs.50"))
            {
                food_cost = 50*2;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Cake - Rs.100"))
            {
                food_cost = 100*2;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Samosa PopCorn Combo - Rs.110"))
            {
                food_cost = 110*2;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Samosa Cake Combo - Rs.150"))
            {
                food_cost = 150*2;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            
    }       
    else if(foodQuantity_combo.getSelectedItem().toString().equals("3"))  
    {
            if(food_combo.getSelectedItem().toString().equals("Samosa - Rs.70"))
            {
                food_cost = 70*3;               
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("PopCorn - Rs.50"))
            {
                food_cost = 50*3;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Cake - Rs.100"))
            {
                food_cost = 100*3;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Samosa PopCorn Combo - Rs.110"))
            {
                food_cost = 110*3;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Samosa Cake Combo - Rs.150"))
            {
                food_cost = 150*3;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            
            
    }         
    else if(foodQuantity_combo.getSelectedItem().toString().equals("4"))  
    {
            if(food_combo.getSelectedItem().toString().equals("Samosa - Rs.70"))
            {
                food_cost = 70*4;               
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("PopCorn - Rs.50"))
            {
                food_cost = 50*4;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Cake - Rs.100"))
            {
                food_cost = 100*4;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Samosa PopCorn Combo - Rs.110"))
            {
                food_cost = 110*4;
                foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
            else if(food_combo.getSelectedItem().toString().equals("Samosa Cake Combo - Rs.150"))
            {
                food_cost = 150*4;
               foodQuantity_txt.setText(String.valueOf("Rs."+food_cost));
            }
           
    } 
    food_amt = String.valueOf(food_cost);
    total_amount_txt.setText(String.valueOf("Rs "+((seat_cost + food_cost))));
    gross_amount_txt.setText(String.valueOf("Rs "+((seat_cost + food_cost)+(0.18*(seat_cost + food_cost)))));
    
    }
    void saveRecord()
    {
    
        seat_price = noOfSeat_txt.getText();
        seat_count = no_ofSeat_combo.getSelectedItem().toString();
        total_seat_price = noOfSeat_txt.getText();
        amount_str = total_amount_txt.getText();
        food_name = selectFood_txt.getText();
        
        food_amt = foodQuantity_txt.getText();
        seatType_str = selectSeat_txt.getText();
        selectSeatCombo = select_seatCombo.getSelectedItem().toString();
        numOfSeatcCombo= no_ofSeat_combo.getSelectedItem().toString();
        foodCombo = food_combo.getSelectedItem().toString();
        foodQuantityCombo = foodQuantity_combo.getSelectedItem().toString();
      
       if(movie_1.isEnabled())
        {
            movie_1.setIcon(new ImageIcon(new ImageIcon("images/moviePic1_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
            movie_2.setIcon(new ImageIcon(new ImageIcon("images/movi_pic2.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
            movie_3.setIcon(new ImageIcon(new ImageIcon("images/movie_pic3.png").getImage().getScaledInstance(210, 325, Image.SCALE_DEFAULT)));
            movie_4.setIcon(new ImageIcon(new ImageIcon("images/movie_pic4.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
            movie_number = 1;
            movie_1.setText(""+movie_number);

        }
        else if(movie_2.isEnabled())
        {
             movie_1.setIcon(new ImageIcon(new ImageIcon("images/movie_pic1.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
             movie_2.setIcon(new ImageIcon(new ImageIcon("images/moviePic2_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
             movie_3.setIcon(new ImageIcon(new ImageIcon("images/movie_pic3.png").getImage().getScaledInstance(210, 325, Image.SCALE_DEFAULT)));
             movie_4.setIcon(new ImageIcon(new ImageIcon("images/movie_pic4.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));  
             movie_number = 2;
             movie_2.setText(""+movie_number);
          
        }
        else if(movie_3.isEnabled())
        {
            movie_1.setIcon(new ImageIcon(new ImageIcon("images/movie_pic1.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
            movie_2.setIcon(new ImageIcon(new ImageIcon("images/movi_pic2.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
            movie_3.setIcon(new ImageIcon(new ImageIcon("images/Adipurush-5-322x403.png").getImage().getScaledInstance(210, 325, Image.SCALE_DEFAULT)));
            movie_4.setIcon(new ImageIcon(new ImageIcon("images/movie_pic4.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));            
            movie_number = 3;
            movie_3.setText(""+movie_number);
           
        }
        else if(movie_4.isEnabled())
        {
            movie_1.setIcon(new ImageIcon(new ImageIcon("images/movie_pic1.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
            movie_2.setIcon(new ImageIcon(new ImageIcon("images/movi_pic2.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
            movie_3.setIcon(new ImageIcon(new ImageIcon("images/movie_pic3.png").getImage().getScaledInstance(210, 325, Image.SCALE_DEFAULT)));
            movie_4.setIcon(new ImageIcon(new ImageIcon("images/moviePic4_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT))); 
            movie_number = 4;
            movie_4.setText(""+movie_number);

        }
       
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movie_1 = new javax.swing.JLabel();
        movie_3 = new javax.swing.JLabel();
        movie_2 = new javax.swing.JLabel();
        select_seatCombo = new javax.swing.JComboBox<>();
        no_ofSeat_combo = new javax.swing.JComboBox<>();
        foodQuantity_combo = new javax.swing.JComboBox<>();
        food_combo = new javax.swing.JComboBox<>();
        movie_4 = new javax.swing.JLabel();
        exit_label = new javax.swing.JLabel();
        new_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        noOfSeat_txt = new javax.swing.JTextField();
        selectFood_txt = new javax.swing.JTextField();
        selectSeat_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        foodQuantity_txt = new javax.swing.JTextField();
        next_btn = new javax.swing.JButton();
        total_amount_txt = new javax.swing.JTextField();
        gross_amount_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        main_frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movie_1.setIcon(new javax.swing.ImageIcon("D:\\Nextech Project\\NetBeansProjects\\BookMyShow\\images\\48613e3dfe4b8d590dbf5c04acbe2bd9.png")); // NOI18N
        movie_1.setOpaque(true);
        movie_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_1MouseClicked(evt);
            }
        });
        getContentPane().add(movie_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 209, 325));

        movie_3.setIcon(new javax.swing.ImageIcon("D:\\Nextech Project\\NetBeansProjects\\BookMyShow\\images\\Adipurush-5-322x403.png")); // NOI18N
        movie_3.setOpaque(true);
        movie_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_3MouseClicked(evt);
            }
        });
        getContentPane().add(movie_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 209, 325));

        movie_2.setIcon(new javax.swing.ImageIcon("D:\\Nextech Project\\NetBeansProjects\\BookMyShow\\images\\pathan_poster_shah_rukh_khan__pathan__poster_by_rizucreation_devatj6-fullview.png")); // NOI18N
        movie_2.setOpaque(true);
        movie_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_2MouseClicked(evt);
            }
        });
        getContentPane().add(movie_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 209, 325));

        select_seatCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        select_seatCombo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        select_seatCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_seatComboActionPerformed(evt);
            }
        });
        getContentPane().add(select_seatCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 640, 40));

        no_ofSeat_combo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        no_ofSeat_combo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        no_ofSeat_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_ofSeat_comboActionPerformed(evt);
            }
        });
        getContentPane().add(no_ofSeat_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 640, 40));

        foodQuantity_combo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        foodQuantity_combo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        foodQuantity_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodQuantity_comboActionPerformed(evt);
            }
        });
        getContentPane().add(foodQuantity_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, 640, 40));

        food_combo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        food_combo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        food_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food_comboActionPerformed(evt);
            }
        });
        getContentPane().add(food_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 640, 40));

        movie_4.setIcon(new javax.swing.ImageIcon("D:\\Nextech Project\\NetBeansProjects\\BookMyShow\\images\\Ved_film_poster.png")); // NOI18N
        movie_4.setOpaque(true);
        movie_4.setPreferredSize(new java.awt.Dimension(209, 334));
        movie_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movie_4MouseClicked(evt);
            }
        });
        getContentPane().add(movie_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 209, 325));

        exit_label.setBackground(new java.awt.Color(204, 204, 204));
        exit_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_label.setText("X");
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

        new_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        new_btn.setText("New");
        new_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });
        getContentPane().add(new_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 920, 190, 40));

        cancel_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel_btn.setText("Cancel");
        cancel_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 920, 190, 40));

        noOfSeat_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        noOfSeat_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        noOfSeat_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(noOfSeat_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 310, 40));

        selectFood_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectFood_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        selectFood_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        selectFood_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFood_txtActionPerformed(evt);
            }
        });
        getContentPane().add(selectFood_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 670, 310, 40));

        selectSeat_txt.setEditable(false);
        selectSeat_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectSeat_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        selectSeat_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        selectSeat_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSeat_txtActionPerformed(evt);
            }
        });
        getContentPane().add(selectSeat_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 310, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GST 18%");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 730, 260, 40));

        foodQuantity_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        foodQuantity_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        foodQuantity_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(foodQuantity_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 740, 310, 40));

        next_btn.setBackground(new java.awt.Color(255, 255, 255));
        next_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        next_btn.setText("Proceed to Next");
        next_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btnActionPerformed(evt);
            }
        });
        getContentPane().add(next_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 920, 260, 40));

        total_amount_txt.setEditable(false);
        total_amount_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total_amount_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_amount_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        total_amount_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_amount_txtActionPerformed(evt);
            }
        });
        getContentPane().add(total_amount_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 670, 260, 40));

        gross_amount_txt.setEditable(false);
        gross_amount_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gross_amount_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gross_amount_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        gross_amount_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gross_amount_txtActionPerformed(evt);
            }
        });
        getContentPane().add(gross_amount_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1579, 790, 260, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Amount :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 670, 240, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gross Amount :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 790, 240, 40));

        main_frame.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        main_frame.setIcon(new javax.swing.ImageIcon("D:\\Nextech Project\\NetBeansProjects\\BookMyShow\\images\\seat_bgimg.png")); // NOI18N
        getContentPane().add(main_frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseEntered
        exit_label.setBackground(Color.red);        // TODO add your handling code here:
    }//GEN-LAST:event_exit_labelMouseEntered

    private void exit_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseExited
         exit_label.setBackground(Color.LIGHT_GRAY);// TODO add your handling code here:
    }//GEN-LAST:event_exit_labelMouseExited

    private void exit_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_labelMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exit_labelMouseClicked

    private void select_seatComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_seatComboActionPerformed
    
     
        if(select_seatCombo.getSelectedItem().toString().equals("Platinum - Rs.200"))
        {
            selectSeat_txt.setText("200");
            
        }
        else if(select_seatCombo.getSelectedItem().toString().equals("Diamond - Rs.150"))
        {
            selectSeat_txt.setText("150");
           
        }
        else if(select_seatCombo.getSelectedItem().toString().equals("Gold - Rs.100"))
        {
            selectSeat_txt.setText("100");
            
        }
        else if(select_seatCombo.getSelectedItem().toString().equals("Silver - Rs.70"))
        {
            selectSeat_txt.setText("70");
           
        }
        no_ofSeat_combo.setEnabled(true); 
       
        // TODO add your handling code here:
    }//GEN-LAST:event_select_seatComboActionPerformed

    private void movie_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_1MouseClicked
      
       
        
        movie_1.setIcon(new ImageIcon(new ImageIcon("images/moviePic1_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_2.setIcon(new ImageIcon(new ImageIcon("images/movi_pic2.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_3.setIcon(new ImageIcon(new ImageIcon("images/movie_pic3.png").getImage().getScaledInstance(210, 325, Image.SCALE_DEFAULT)));
        movie_4.setIcon(new ImageIcon(new ImageIcon("images/movie_pic4.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        
        select_seatCombo.setEnabled(true);
        //no_ofSeat_combo.setEnabled(true);
        //food_combo.setEnabled(true);
        //foodQuantity_combo.setEnabled(true);
        
        movie_number = 1;
        
        
        //movie_2.setEnabled(false);
        //movie_3.setEnabled(false);
        //movie_4.setEnabled(false);
        
        
        
        
        
       

    }//GEN-LAST:event_movie_1MouseClicked

    private void movie_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_4MouseClicked
        movie_1.setIcon(new ImageIcon(new ImageIcon("images/movie_pic1.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_2.setIcon(new ImageIcon(new ImageIcon("images/movi_pic2.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_3.setIcon(new ImageIcon(new ImageIcon("images/movie_pic3.png").getImage().getScaledInstance(210, 325, Image.SCALE_DEFAULT)));
        movie_4.setIcon(new ImageIcon(new ImageIcon("images/moviePic4_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        select_seatCombo.setEnabled(true);
        //no_ofSeat_combo.setEnabled(true);
        //food_combo.setEnabled(true);
        //foodQuantity_combo.setEnabled(true);

        movie_number = 4;
       

        movie_4.setEnabled(true);        
        
        
    }//GEN-LAST:event_movie_4MouseClicked

    private void movie_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_2MouseClicked
        movie_1.setIcon(new ImageIcon(new ImageIcon("images/movie_pic1.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_2.setIcon(new ImageIcon(new ImageIcon("images/moviePic2_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_3.setIcon(new ImageIcon(new ImageIcon("images/movie_pic3.png").getImage().getScaledInstance(210, 325, Image.SCALE_DEFAULT)));
        movie_4.setIcon(new ImageIcon(new ImageIcon("images/movie_pic4.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));// TODO add your handling code here:
        select_seatCombo.setEnabled(true);
        //no_ofSeat_combo.setEnabled(true);
        //food_combo.setEnabled(true);
        //foodQuantity_combo.setEnabled(true);  
        
        movie_number = 2;
        
        
        movie_2.setEnabled(true);
        
        
    }//GEN-LAST:event_movie_2MouseClicked

    private void movie_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movie_3MouseClicked
        movie_1.setIcon(new ImageIcon(new ImageIcon("images/movie_pic1.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_2.setIcon(new ImageIcon(new ImageIcon("images/movi_pic2.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_3.setIcon(new ImageIcon(new ImageIcon("images/Adipurush-5-322x403.png").getImage().getScaledInstance(210, 325, Image.SCALE_DEFAULT)));
        movie_4.setIcon(new ImageIcon(new ImageIcon("images/movie_pic4.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        select_seatCombo.setEnabled(true);
        //no_ofSeat_combo.setEnabled(true);
        //food_combo.setEnabled(true);
        //foodQuantity_combo.setEnabled(true);  
        
        movie_number = 3;
        
        movie_3.setEnabled(true);
    }//GEN-LAST:event_movie_3MouseClicked

    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed
        selectSeat_txt.setText(""); 
        noOfSeat_txt.setText("");
        selectFood_txt.setText("");
        foodQuantity_txt.setText("");
        
        select_seatCombo.setSelectedItem("Select Seat Type");
        no_ofSeat_combo.setSelectedItem("Select No. of Seats");
        food_combo.setSelectedItem("Select Food and Beverage");
        foodQuantity_combo.setSelectedItem("Select Food and Beverage Quantity");
        
        movie_1.setIcon(new ImageIcon(new ImageIcon("images/moviePic1_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_2.setIcon(new ImageIcon(new ImageIcon("images/moviePic2_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));
        movie_3.setIcon(new ImageIcon(new ImageIcon("images/Adipurush-5-322x403.png").getImage().getScaledInstance(210, 325, Image.SCALE_DEFAULT)));
        movie_4.setIcon(new ImageIcon(new ImageIcon("images/moviePic4_org.png").getImage().getScaledInstance(209, 325, Image.SCALE_DEFAULT)));

       
        
        
    }//GEN-LAST:event_new_btnActionPerformed

    private void no_ofSeat_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_ofSeat_comboActionPerformed
    
        numOfSeatsCombo();
        food_combo.setEnabled(true);
        
    }//GEN-LAST:event_no_ofSeat_comboActionPerformed

    private void food_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food_comboActionPerformed
      
        foodComboAction();
        foodQuantity_combo.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_food_comboActionPerformed

    private void foodQuantity_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodQuantity_comboActionPerformed
     
        foodQuantityAction();
    }//GEN-LAST:event_foodQuantity_comboActionPerformed
    
    private void next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btnActionPerformed
        saveRecord();
        new SeatConfirmation().show();
        frame.setVisible(false);
    }//GEN-LAST:event_next_btnActionPerformed

    private void total_amount_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_amount_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_amount_txtActionPerformed

    private void selectSeat_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSeat_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSeat_txtActionPerformed

    private void selectFood_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFood_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectFood_txtActionPerformed

    private void gross_amount_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gross_amount_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gross_amount_txtActionPerformed
   
     
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookMyShow_fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookMyShow_fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookMyShow_fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookMyShow_fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookMyShow_fram().setVisible(true);
               
          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel exit_label;
    private javax.swing.JComboBox<String> foodQuantity_combo;
    private javax.swing.JTextField foodQuantity_txt;
    private javax.swing.JComboBox<String> food_combo;
    private javax.swing.JTextField gross_amount_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel main_frame;
    private javax.swing.JLabel movie_1;
    private javax.swing.JLabel movie_2;
    private javax.swing.JLabel movie_3;
    private javax.swing.JLabel movie_4;
    private javax.swing.JButton new_btn;
    private javax.swing.JButton next_btn;
    private javax.swing.JTextField noOfSeat_txt;
    private javax.swing.JComboBox<String> no_ofSeat_combo;
    private javax.swing.JTextField selectFood_txt;
    private javax.swing.JTextField selectSeat_txt;
    private javax.swing.JComboBox<String> select_seatCombo;
    private javax.swing.JTextField total_amount_txt;
    // End of variables declaration//GEN-END:variables
}
