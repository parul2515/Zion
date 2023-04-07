/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel.managment;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.AttributedCharacterIterator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Dell
 */
public class NewJFrame extends javax.swing.JFrame  {
    
      Font fn=new Font("Times new roman",Font.BOLD,18);
                        
    Font fn3=new Font("Times new roman",Font.BOLD,14);
   Font fn1=new Font("Algerian",Font.ITALIC,42);
      Font fn2=new Font("Algerian",Font.ITALIC,32);
          Font fn4=new Font("Times new roman",Font.BOLD,22);
   
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame()  {
               initComponents();
        // setSize(750,600);
        new abc().execute();
     MAINPANEL.setSize(100,100);
      jLabel3.setFont(fn);
  //    jTextField2.setEnabled(false);
//      jLabel5.setBackground(Color.YELLOW);
     jLabel5.setFont(fn1);
      jLabel6.setFont(fn);
       jLabel7.setFont(fn);
         //   jLabel36.setFont(fn2);
        jLabel9.setFont(fn);
         jLabel10.setFont(fn);
          jLabel11.setFont(fn);
           //jLabel12.setFont(fn);
           jLabel2.setFont(fn);
           //jLabel4.setFont(fn);
           jLabel8.setFont(fn);
           //jLabel13.setFont(fn);
           jLabel14.setFont(fn);
           jLabel15.setFont(fn);
           jLabel16.setFont(fn);
           jLabel17.setFont(fn);
           jLabel18.setFont(fn);
           jLabel19.setFont(fn);
           jLabel20.setFont(fn);
           jLabel21.setFont(fn);
           jLabel22.setFont(fn);
           jButton4.setFont(fn);
           jButton5.setFont(fn);
           jLabel25.setFont(fn);
           jLabel26.setFont(fn);
           jLabel32.setFont(fn);
           jTextField2.setFont(fn);
            jTextField3.setFont(fn);
             jTextField4.setFont(fn);
//            jButton11.setFont(fn2);
           jButton6.setFont(fn);
           jButton7.setFont(fn);
           
                             jLabel23.setFont(fn2);
                             jLabel14.setFont(fn2);
                             jLabel7.setFont(fn2);
                               jLabel9.setFont(fn4);
                             jLabel10.setFont(fn4);
                             jLabel2.setFont(fn4);
                             jLabel8.setFont(fn4);
                               jLabel15.setFont(fn4);
                             jLabel19.setFont(fn4);
                             jLabel16.setFont(fn4);
                             jLabel20.setFont(fn4);
                               jLabel17.setFont(fn4);
                                   jLabel21.setFont(fn4);
                             jLabel18.setFont(fn4);
                             jLabel22.setFont(fn4);
                               jLabel11.setFont(fn);
                             jLabel24.setFont(fn);
                             jComboBox2.setFont(fn);
//                             jLabel4.setFont(fn);
//                             jLabel13.setFont(fn);
                              jLabel31.setFont(fn2);
                             jLabel33.setFont(fn);
                              // jLabel34.setFont(fn);
                                jLabel27.setFont(fn);
                             jLabel35.setFont(fn);
                             jLabel13.setFont(fn);
                             jLabel4.setFont(fn);
                             jLabel36.setFont(fn);
                              jLabel29.setFont(fn);
                             jLabel30.setFont(fn);
                             jButton11.setFont(fn2);
                               jButton4.setFont(fn4);
                               jButton5.setFont(fn4);
                               jButton6.setFont(fn4);
                               jButton7.setFont(fn4);
                               jLabel12.setFont(fn2);
//                             jLabel41.setFont(fn3);
                        //     jButton12.setFont(fn);
                        //jPanel4.setVisible(false);
//           jPanel2.setSize(800,800);/
         
     
//      jLabel5.setBackground(Color.YELLOW);
    }


//    public class hi extends Applet implements Runnable {
//  String str="WELCOME TO THE HOTEL ZION! GET THE ROOMS AT BEST OFFER HERE!";
//  @Override
//  public void paint(Graphics g){
//      
////    Font fn=new Font("Ariel",Font.BOLD,100);
////          g.setFont(fn);
//     g.drawString(str,370,300);}
//  @Override
//     public void run(){
//    while(true){
////        String b=""+jLabel5.getText();
//           String a=""+str.charAt(0);
//          str=str.substring(1).concat(a);
//           
//           
//        
//        try{
//            Thread.sleep(500);
//       
//        }
//        catch(InterruptedException e){
//            System.out.print(e);
//        }
//        repaint();
//        
//    }
//}
//public void start(){
//    Thread t=new Thread(this);
//    t.start();
//}
//    }
   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel28 = new javax.swing.JLabel();
        MAINPANEL = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RESERVEROOM = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        RESERVEYOURROOMNOW = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        ROOMDETAILS = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        ROOMDETAILSSPECIFIC = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ROOMDETAILSPRICE = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ROOMDEATILSROOMS = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        WELCOME = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jLabel28.setText("UPLOAD IMAGE OF ID PROOF");
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        MAINPANEL.setBackground(new java.awt.Color(204, 204, 204));
        MAINPANEL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MAINPANEL.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/managment/home.jpg"))); // NOI18N
        MAINPANEL.add(jButton1);
        jButton1.setBounds(1640, 0, 125, 100);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/managment/c3.png"))); // NOI18N
        MAINPANEL.add(jButton3);
        jButton3.setBounds(1770, 0, 120, 100);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/managment/]bbhj.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MAINPANEL.add(jButton2);
        jButton2.setBounds(0, 0, 360, 100);
        MAINPANEL.add(jLabel3);
        jLabel3.setBounds(480, 700, 0, 0);
        MAINPANEL.add(jLabel1);
        jLabel1.setBounds(0, 140, 1930, 360);

        RESERVEROOM.setBackground(new java.awt.Color(255, 0, 102));
        RESERVEROOM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        RESERVEROOM.setLayout(null);

        jLabel33.setText("ROOM CHARGES");
        RESERVEROOM.add(jLabel33);
        jLabel33.setBounds(480, 190, 170, 40);

        jLabel35.setText("OFFERS:");
        RESERVEROOM.add(jLabel35);
        jLabel35.setBounds(480, 240, 140, 60);

        jButton11.setText("RESERVE ROOM NOW");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        RESERVEROOM.add(jButton11);
        jButton11.setBounds(230, 380, 450, 50);
        RESERVEROOM.add(jLabel24);
        jLabel24.setBounds(650, 190, 210, 40);

        jLabel27.setText("NUMBER OF DAYS");
        RESERVEROOM.add(jLabel27);
        jLabel27.setBounds(480, 130, 210, 40);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        RESERVEROOM.add(jTextField1);
        jTextField1.setBounds(650, 130, 170, 40);

        jLabel29.setText("CHECKOUT DATE");
        RESERVEROOM.add(jLabel29);
        jLabel29.setBounds(10, 260, 170, 30);

        jLabel30.setText("CHECKIN DATE");
        RESERVEROOM.add(jLabel30);
        jLabel30.setBounds(10, 200, 160, 30);

        RESERVEYOURROOMNOW.setBackground(new java.awt.Color(255, 204, 204));
        RESERVEYOURROOMNOW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        RESERVEYOURROOMNOW.setLayout(null);

        jLabel31.setText("RESERVE YOUR ROOM NOW");
        RESERVEYOURROOMNOW.add(jLabel31);
        jLabel31.setBounds(10, 0, 410, 40);

        RESERVEROOM.add(RESERVEYOURROOMNOW);
        RESERVEYOURROOMNOW.setBounds(10, 10, 490, 50);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GET 10% Off If Total Is More Than 8000", "GET 5% Off On DELUXE DOUBLE ROOM", "GET 20% Off On SUPER DELUXE ROOM", "NONE" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        RESERVEROOM.add(jComboBox1);
        jComboBox1.setBounds(550, 240, 324, 60);

        jLabel13.setText("TOTAL");
        RESERVEROOM.add(jLabel13);
        jLabel13.setBounds(490, 310, 120, 50);

        jLabel36.setText("SELECT ROOM");
        RESERVEROOM.add(jLabel36);
        jLabel36.setBounds(10, 330, 160, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ROOM 1. Rs 2564", "ROOM 2. Rs 1657", "ROOM 3. Rs 4679", "ROOM 4. Rs 5256", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        RESERVEROOM.add(jComboBox2);
        jComboBox2.setBounds(200, 310, 270, 60);
        RESERVEROOM.add(jLabel4);
        jLabel4.setBounds(650, 320, 180, 40);

        jLabel25.setText("NAME");
        RESERVEROOM.add(jLabel25);
        jLabel25.setBounds(10, 80, 150, 30);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        RESERVEROOM.add(jTextField2);
        jTextField2.setBounds(200, 70, 170, 40);

        jLabel26.setText("AADHAR NUMBER");
        RESERVEROOM.add(jLabel26);
        jLabel26.setBounds(10, 130, 180, 40);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        RESERVEROOM.add(jTextField3);
        jTextField3.setBounds(200, 130, 170, 40);

        jLabel32.setText("MOBILE NUMBER");
        RESERVEROOM.add(jLabel32);
        jLabel32.setBounds(480, 90, 170, 30);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        RESERVEROOM.add(jTextField4);
        jTextField4.setBounds(650, 80, 170, 40);

        MAINPANEL.add(RESERVEROOM);
        RESERVEROOM.setBounds(1050, 500, 880, 440);

        ROOMDETAILS.setBackground(new java.awt.Color(51, 255, 204));
        ROOMDETAILS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        ROOMDETAILS.setLayout(null);

        jLabel6.setText("ROOMS");
        ROOMDETAILS.add(jLabel6);
        jLabel6.setBounds(60, 900, 170, 16);

        jLabel9.setText("1.STANDARD DOUBLE ROOM");
        ROOMDETAILS.add(jLabel9);
        jLabel9.setBounds(10, 60, 340, 30);

        jLabel10.setText("2.STANDARD SINGLE ROOM");
        ROOMDETAILS.add(jLabel10);
        jLabel10.setBounds(10, 120, 340, 16);

        jLabel2.setText("3.DELUXE DOUBLE ROOM");
        ROOMDETAILS.add(jLabel2);
        jLabel2.setBounds(10, 180, 330, 16);

        jLabel8.setText("4.SUPER DELUXE ROOM");
        ROOMDETAILS.add(jLabel8);
        jLabel8.setBounds(10, 240, 320, 16);

        jLabel15.setText("SIZE:40 m2 to 45 m2");
        ROOMDETAILS.add(jLabel15);
        jLabel15.setBounds(360, 60, 310, 30);

        jLabel19.setText("OCCUPANCY:TWO PEOPLE");
        ROOMDETAILS.add(jLabel19);
        jLabel19.setBounds(350, 84, 340, 40);

        jLabel16.setText("SIZE:37 m2 to 45 m2");
        ROOMDETAILS.add(jLabel16);
        jLabel16.setBounds(360, 120, 340, 30);

        jLabel20.setText("OCCUPANCY:ONE PERSON");
        ROOMDETAILS.add(jLabel20);
        jLabel20.setBounds(350, 140, 330, 40);

        jLabel17.setText("SIZE:150 SQUARE FEET");
        ROOMDETAILS.add(jLabel17);
        jLabel17.setBounds(360, 180, 330, 20);

        jLabel21.setText("OCCUPANCY:2 ADULTS+2 CHILDRENS");
        ROOMDETAILS.add(jLabel21);
        jLabel21.setBounds(310, 200, 430, 30);

        jLabel18.setText("SIZE:250 SQUARE FEET");
        ROOMDETAILS.add(jLabel18);
        jLabel18.setBounds(360, 230, 320, 30);

        jLabel22.setText("OCCUPANCY:4 ADULTS");
        ROOMDETAILS.add(jLabel22);
        jLabel22.setBounds(360, 246, 320, 50);

        jButton4.setText("2564");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ROOMDETAILS.add(jButton4);
        jButton4.setBounds(720, 70, 170, 40);

        jButton5.setText("1657");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ROOMDETAILS.add(jButton5);
        jButton5.setBounds(720, 130, 170, 40);

        jButton6.setText("4679");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        ROOMDETAILS.add(jButton6);
        jButton6.setBounds(720, 190, 170, 40);

        jButton7.setText("5256");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        ROOMDETAILS.add(jButton7);
        jButton7.setBounds(720, 250, 170, 40);

        ROOMDETAILSSPECIFIC.setBackground(new java.awt.Color(255, 153, 153));
        ROOMDETAILSSPECIFIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ROOMDETAILSSPECIFIC.setLayout(null);

        jLabel14.setBackground(new java.awt.Color(255, 51, 153));
        jLabel14.setText("SPECIFICATIONS");
        ROOMDETAILSSPECIFIC.add(jLabel14);
        jLabel14.setBounds(30, 10, 250, 30);

        ROOMDETAILS.add(ROOMDETAILSSPECIFIC);
        ROOMDETAILSSPECIFIC.setBounds(360, 10, 300, 50);

        ROOMDETAILSPRICE.setBackground(new java.awt.Color(255, 153, 153));
        ROOMDETAILSPRICE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ROOMDETAILSPRICE.setLayout(null);

        jLabel7.setText("PRICE(PER NIGHT)");
        ROOMDETAILSPRICE.add(jLabel7);
        jLabel7.setBounds(770, 0, 360, 50);

        jLabel12.setText("PRICE(PER NIGHT)");
        ROOMDETAILSPRICE.add(jLabel12);
        jLabel12.setBounds(10, 0, 350, 40);

        ROOMDETAILS.add(ROOMDETAILSPRICE);
        ROOMDETAILSPRICE.setBounds(710, 10, 350, 50);

        ROOMDEATILSROOMS.setBackground(new java.awt.Color(255, 153, 153));
        ROOMDEATILSROOMS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ROOMDEATILSROOMS.setLayout(null);

        jLabel23.setText("ROOMS");
        ROOMDEATILSROOMS.add(jLabel23);
        jLabel23.setBounds(50, 10, 210, 40);

        ROOMDETAILS.add(ROOMDEATILSROOMS);
        ROOMDEATILSROOMS.setBounds(10, 10, 270, 50);
        ROOMDETAILS.add(jSpinner1);
        jSpinner1.setBounds(910, 70, 130, 40);
        ROOMDETAILS.add(jSpinner2);
        jSpinner2.setBounds(910, 130, 130, 40);
        ROOMDETAILS.add(jSpinner3);
        jSpinner3.setBounds(910, 190, 130, 40);
        ROOMDETAILS.add(jSpinner4);
        jSpinner4.setBounds(910, 250, 130, 40);

        MAINPANEL.add(ROOMDETAILS);
        ROOMDETAILS.setBounds(0, 500, 1050, 440);
        MAINPANEL.add(jLabel11);
        jLabel11.setBounds(720, 1110, 280, 30);

        WELCOME.setBackground(new java.awt.Color(255, 255, 102));
        WELCOME.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(204, 0, 255));
        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setLabelFor(this);
        jLabel5.setText("WELCOME TO THE HOTEL ZION! GET THE ROOMS AT BEST OFFER HERE!");
        jLabel5.setToolTipText("");
        WELCOME.add(jLabel5);
        jLabel5.setBounds(30, 0, 1420, 40);

        MAINPANEL.add(WELCOME);
        WELCOME.setBounds(250, 100, 1480, 40);

        getContentPane().add(MAINPANEL, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents
String b;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        jPanel1.setVisible(false);
//       // jPanel2.setVisible(true);
//        int a=2564;
////        String b=""+jTextField4.getText();
//        int b1=(int)Integer.parseInt(b);
//        int c=a*b1;
       // jTextField5.setText(""+c);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MAINPANEL.setVisible(false);
        //jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         MAINPANEL.setVisible(false);
        //  jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MAINPANEL.setVisible(false);
       // jPanel2.setVisible(true);        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
//     if(jTextField4.getText().equals("")){
//         jLabel24.setText("");
//         jLabel4.setText("");
//     }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
            if(jComboBox1.getSelectedItem().equals("GET 10% Off If Total Is More Than 8000")){
            String pa=jLabel24.getText();
            int pa1=Integer.parseInt(pa);
            if(pa1>8000){
            int pretot=pa1-(pa1*10/100);
            jLabel4.setText(""+pretot);
            }
            else{
                  jLabel4.setText(""+pa);
            }
            }
          //  else if(jComboBox2.getSelectedItem().equals("ROOM 3. Rs 4679")){
           // else if(jComboBox1.getSelectedItem().equals("GET 5% Off On DELUXE DOUBLE ROOM)
//            String pa=jLabel24.getText();
//            int pa1=Integer.parseInt(pa);
//            int pretot=pa1-(pa1*20/100);
//            jLabel4.setText(""+pretot);
         else if(jComboBox1.getSelectedItem().equals("GET 5% Off On DELUXE DOUBLE ROOM")){
                 if(!jComboBox2.getSelectedItem().equals("ROOM 3. Rs 4679")){
                   JOptionPane.showMessageDialog(null,"SELECT A DELUXE DOUBLE ROOM FIRST");
             }
                 else{
                        String pa=jLabel24.getText();
            int pa1=Integer.parseInt(pa);
            int pretot=pa1-(pa1*5/100);
            jLabel4.setText(""+pretot);
                 }
         }
    
            
            
             else if(jComboBox1.getSelectedItem().equals("GET 20% Off On SUPER DELUXE ROOM")){
                 if(!jComboBox2.getSelectedItem().equals("ROOM 4. Rs 5256")){
                     JOptionPane.showMessageDialog(null,"SELECT A SUPER DELUXE ROOM FIRST");
                 }
                 else{
            String pa=jLabel24.getText();
            int pa1=Integer.parseInt(pa);
            int pretot=pa1-(pa1*20/100);
            jLabel4.setText(""+pretot);
            }
             }
              else if(jComboBox1.getSelectedItem().equals("NONE")){
               String af=""+jLabel24.getText();
            jLabel4.setText(""+af);
            }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
//    if(evt.getSource()==jButton1){
       // String c=""+jComboBox2.getSelectedItem() ;
        if(jComboBox2.getSelectedItem().equals("ROOM 1. Rs 2564")){
      int c1=2564;
//        int k=evt.getKeyCode();
////        String c=""+jComboBox2.getSelectedItem() ;
////      int c1=Integer.parseInt (c);
//        if(k==KeyEvent.VK_ENTER){
      int d=Integer.parseInt (jTextField1.getText());
      int tot=d*c1;
      jLabel24.setText(""+tot);
        
        }
         else if(jComboBox2.getSelectedItem().equals("ROOM 2. Rs 1657")){
      int c1=1567;
//        int k=evt.getKeyCode();
////        String c=""+jComboBox2.getSelectedItem() ;
////      int c1=Integer.parseInt (c);
//        if(k==KeyEvent.VK_ENTER){
      int d=Integer.parseInt (jTextField1.getText());
      int tot=d*c1;
      jLabel24.setText(""+tot);
        
          }
        else if(jComboBox2.getSelectedItem().equals("ROOM 3. Rs 4679")){
      int c1=4679;
//      int k=evt.getKeyCode();
////        String c=""+jComboBox2.getSelectedItem() ;
////      int c1=Integer.parseInt (c);
//        if(k==KeyEvent.VK_ENTER){
      int d=Integer.parseInt (jTextField1.getText());
      int tot=d*c1;
      jLabel24.setText(""+tot);
        
          }
            else if(jComboBox2.getSelectedItem().equals("ROOM 4. Rs 5256")){
      int c1=5256;
//        int k=evt.getKeyCode();
////        String c=""+jComboBox2.getSelectedItem() ;
////      int c1=Integer.parseInt (c);
//        if(k==KeyEvent.VK_ENTER){
      int d=Integer.parseInt (jTextField1.getText());
      int tot=d*c1;
      jLabel24.setText(""+tot);
        
          }
        
          
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
// char c=evt.getKeyChar();
//        String v=""+jTextField1.getText();
//      
//        char pl=v.charAt(0);
//         if(!Character.isDigit(pl)){
//            evt.consume();
//            Toolkit.getDefaultToolkit().beep();
//        }
//        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
      
        //char pl=v.charAt(0);
         if(!Character.isDigit(c)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
          if(jTextField4.getText().equals("")){
         jLabel24.setText("");
         jLabel4.setText("");
     }
      
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
      
        //char pl=v.charAt(0);
         if(!Character.isLetter(c)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();}
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        String str=jTextField4.getText();
      char c=evt.getKeyChar();
      if(str.length()<9){
          if(Character.isDigit(c)){
          }
          else{
              evt.consume();
              getDefaultToolkit().beep();
          }
      }
      if(str.length()>9){
          evt.consume();
              getDefaultToolkit().beep();
      }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        String str=jTextField3.getText();
      char c=evt.getKeyChar();
      if(str.length()<11){
          if(Character.isDigit(c)){
          }
          else{
              evt.consume();
              getDefaultToolkit().beep();
          }
      }
      if(str.length()>11){
          evt.consume();
              getDefaultToolkit().beep();
      }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        // TODO add your handling code here:
        //jButton4.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
         jButton4.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
         jButton4.setBackground(Color.white);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        // TODO add your handling code here:
       // jButton4.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
                 jButton5.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
                 jButton5.setBackground(Color.white);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
         jButton6.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
         jButton6.setBackground(Color.white);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
          jButton7.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
         jButton7.setBackground(Color.white);
    }//GEN-LAST:event_jButton7MouseExited

    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    class abc extends SwingWorker<Object, Object>
    {

        @Override
        protected Object doInBackground() throws Exception {
            int i=1;
            while(true)
            {
              
                try {
                 BufferedImage bim =   ImageIO.read(new File("src\\hotel\\managment\\room"+i+".jpg"));
                 Image img = bim.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT);
                 jLabel1.setIcon(new ImageIcon(img));
                 Thread.sleep(1000);
                 i++;
                 if(i==4)
                     i=1;
        
                } catch (Exception e) {
                }
                
                
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAINPANEL;
    private javax.swing.JPanel RESERVEROOM;
    private javax.swing.JPanel RESERVEYOURROOMNOW;
    private javax.swing.JPanel ROOMDEATILSROOMS;
    private javax.swing.JPanel ROOMDETAILS;
    private javax.swing.JPanel ROOMDETAILSPRICE;
    private javax.swing.JPanel ROOMDETAILSSPECIFIC;
    private javax.swing.JPanel WELCOME;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    }

