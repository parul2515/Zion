
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chiragpopli
 * 
 */

public class zion extends javax.swing.JFrame {

    /**
     * Creates new form zion
     */
    ///zion asli valla project
    public zion() {
        initComponents();
        new bhavika().execute();
        new blogsss().execute();
        new parul_Banner().execute();
        new abc().execute();
        new def().execute();
        new ghi().execute();
        thankyou.setVisible(false);
        jTextField23.setEnabled(false);
        jButton39.setEnabled(false);
        //jTextField20.setEnabled(false);
        login.setVisible(false);
        signup.setVisible(false);
        new jkl().execute();
        new bbc().execute();
        new mno().execute();
        new blog().execute();
        new blogs().execute();
                new blogss().execute();

     //   new blogss().execute();
  //      new blogsss().execute();
        
       
        
        try {
//                 BufferedImage bim74 =   ImageIO.read(new File(src\\images\\rupee.jpg"));
//                 Image img74 = bim74.getScaledInstance(jLabel39.getWidth(), jLabel39.getHeight(), Image.SCALE_DEFAULT);
//                 jLabel39.setIcon(new ImageIcon(img74));
            BufferedImage bim84 = ImageIO.read(new File("src//mages//200.png"));
            Image img84 = bim84.getScaledInstance(jLabel40.getWidth(), jLabel40.getHeight(), Image.SCALE_DEFAULT);
            jLabel40.setIcon(new ImageIcon(img84));
            
            BufferedImage bim85 = ImageIO.read(new File("src//b1//.jpg"));
            Image img85 = bim85.getScaledInstance(jLabel48.getWidth(), jLabel48.getHeight(), Image.SCALE_DEFAULT);
            jLabel48.setIcon(new ImageIcon(img84));

        } catch (Exception e) {
            System.out.print(e);
        }
        try
        {
        BufferedImage bim=ImageIO.read(new File("src\\images\\haldi1.jpg"));
               Image img = bim.getScaledInstance(jLabel86.getWidth(), jLabel86.getHeight(), Image.SCALE_DEFAULT);
               jLabel86.setIcon(new ImageIcon(img));
                BufferedImage bi=ImageIO.read(new File("src\\images\\label1.jpg"));
               Image im = bi.getScaledInstance(jLabel87.getWidth(), jLabel87.getHeight(), Image.SCALE_DEFAULT);
               jLabel87.setIcon(new ImageIcon(im));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
        BufferedImage bim=ImageIO.read(new File("src\\images\\birthday1.jpg"));
               Image img = bim.getScaledInstance(jLabel57.getWidth(), jLabel57.getHeight(), Image.SCALE_DEFAULT);
               jLabel57.setIcon(new ImageIcon(img));
                BufferedImage bi=ImageIO.read(new File("src\\images\\birthday2.jpg"));
               Image im = bi.getScaledInstance(jLabel60.getWidth(), jLabel60.getHeight(), Image.SCALE_DEFAULT);
               jLabel60.setIcon(new ImageIcon(im));
               BufferedImage b=ImageIO.read(new File("src\\images\\birthday3.jpg"));
               Image i = b.getScaledInstance(jLabel63.getWidth(), jLabel63.getHeight(), Image.SCALE_DEFAULT);
               jLabel63.setIcon(new ImageIcon(i));
               BufferedImage bi1=ImageIO.read(new File("src\\images\\day3.jpg"));
               Image im1 = bi1.getScaledInstance(jLabel67.getWidth(), jLabel67.getHeight(), Image.SCALE_DEFAULT);
               jLabel67.setIcon(new ImageIcon(im1));
//               BufferedImage bim1=ImageIO.read(new File("src\\images\\back_pic.jpg"));
//               Image img1 = bim1.getScaledInstance(jLabel48.getWidth(), jLabel48.getHeight(), Image.SCALE_DEFAULT);
//               jLabel48.setIcon(new ImageIcon(img1));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try{
            BufferedImage bim61 = ImageIO.read(new File("C:\\Users\\asus\\Desktop\\zion\\mainmenu.jpg"));
            Image img61 = bim61.getScaledInstance(jLabel116.getWidth(), jLabel116.getHeight(), Image.SCALE_DEFAULT);
            jLabel116.setIcon(new ImageIcon(img61));
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            BufferedImage bim62 = ImageIO.read(new File("C:\\Users\\asus\\Desktop\\zion\\offer1.jpg"));
            Image img62 = bim62.getScaledInstance(paneerlababdar.getWidth(), paneerlababdar.getHeight(), Image.SCALE_DEFAULT);
          paneerlababdar.setIcon(new ImageIcon(img62));
        }
        catch(Exception e){
            System.out.println(e);
        }
         try {
                BufferedImage bim94 = ImageIO.read(new File("src\\images\\bc.jpg"));
                Image img94 = bim94.getScaledInstance(jLabel33.getWidth(), jLabel33.getHeight(), Image.SCALE_DEFAULT);
                jLabel33.setIcon(new ImageIcon(img94));

            } catch (Exception e) {
                System.out.print(e);
            }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainzion = new javax.swing.JPanel();
        coroselp = new javax.swing.JPanel();
        jLabel15p = new javax.swing.JLabel();
        jLabel16p = new javax.swing.JLabel();
        jLabel17p = new javax.swing.JLabel();
        jLabel18p = new javax.swing.JLabel();
        jLabel19p = new javax.swing.JLabel();
        jLabel20p = new javax.swing.JLabel();
        jLabel21p = new javax.swing.JLabel();
        jLabel22p = new javax.swing.JLabel();
        jLabel23p = new javax.swing.JLabel();
        jLabel24p = new javax.swing.JLabel();
        jLabel25p = new javax.swing.JLabel();
        jLabel26p = new javax.swing.JLabel();
        jLabel27p = new javax.swing.JLabel();
        jLabel1p = new javax.swing.JLabel();
        jButton1p = new javax.swing.JButton();
        jLabel2p = new javax.swing.JLabel();
        roomp = new javax.swing.JPanel();
        jButton5p = new javax.swing.JButton();
        jPanel4p = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        partyp = new javax.swing.JPanel();
        jButton2p = new javax.swing.JButton();
        jPanel6p = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        restro = new javax.swing.JPanel();
        jButton4p = new javax.swing.JButton();
        jPanel8p = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        aboutus = new javax.swing.JPanel();
        jPanel10p = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel11p = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jButton3p = new javax.swing.JButton();
        jButton7p = new javax.swing.JButton();
        jPanel12p = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        headingp = new javax.swing.JPanel();
        jLabel9p = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        house = new javax.swing.JButton();
        photos = new javax.swing.JButton();
        blog = new javax.swing.JButton();
        birthday = new javax.swing.JButton();
        sale = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        crousel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        menuheading = new java.awt.Label();
        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check7 = new javax.swing.JCheckBox();
        check9 = new javax.swing.JCheckBox();
        check6 = new javax.swing.JCheckBox();
        check8 = new javax.swing.JCheckBox();
        check10 = new javax.swing.JCheckBox();
        check11 = new javax.swing.JCheckBox();
        check12 = new javax.swing.JCheckBox();
        check13 = new javax.swing.JCheckBox();
        check14 = new javax.swing.JCheckBox();
        check15 = new javax.swing.JCheckBox();
        check16 = new javax.swing.JCheckBox();
        check17 = new javax.swing.JCheckBox();
        check18 = new javax.swing.JCheckBox();
        button1 = new java.awt.Button();
        rate1 = new javax.swing.JLabel();
        rate2 = new javax.swing.JLabel();
        rate3 = new javax.swing.JLabel();
        rate4 = new javax.swing.JLabel();
        rate5 = new javax.swing.JLabel();
        rate6 = new javax.swing.JLabel();
        rate7 = new javax.swing.JLabel();
        rate8 = new javax.swing.JLabel();
        rate9 = new javax.swing.JLabel();
        rate10 = new javax.swing.JLabel();
        rate11 = new javax.swing.JLabel();
        rate12 = new javax.swing.JLabel();
        rate13 = new javax.swing.JLabel();
        rate14 = new javax.swing.JLabel();
        rate15 = new javax.swing.JLabel();
        rate16 = new javax.swing.JLabel();
        rate17 = new javax.swing.JLabel();
        rate18 = new javax.swing.JLabel();
        restraunt = new javax.swing.JPanel();
        zionrestraunt = new javax.swing.JLabel();
        crausel = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        call = new javax.swing.JButton();
        offers = new javax.swing.JButton();
        bhavikamenu = new javax.swing.JButton();
        booknow = new javax.swing.JButton();
        paneerlababdar = new javax.swing.JLabel();
        reservetable = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel37 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        thankyou = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        signup = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton11 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jButton17 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        menubhavika = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jButton38 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jXDatePicker3 = new org.jdesktop.swingx.JXDatePicker();
        jLabel78 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel83 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        label27 = new java.awt.Label();
        label29 = new java.awt.Label();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        label30 = new java.awt.Label();
        label39 = new java.awt.Label();
        jPanel45 = new javax.swing.JPanel();
        label40 = new java.awt.Label();
        jTextField24 = new javax.swing.JTextField();
        label41 = new java.awt.Label();
        jTextField25 = new javax.swing.JTextField();
        label42 = new java.awt.Label();
        jTextField26 = new javax.swing.JTextField();
        label43 = new java.awt.Label();
        jTextField27 = new javax.swing.JTextField();
        label44 = new java.awt.Label();
        label45 = new java.awt.Label();
        jTextField28 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jButton47 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jPanel46 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        label31 = new java.awt.Label();
        jButton48 = new javax.swing.JButton();
        MAINPANEL = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RESERVEROOM = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        RESERVEYOURROOMNOW = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jXDatePicker4 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker5 = new org.jdesktop.swingx.JXDatePicker();
        ROOMDETAILS = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        ROOMDETAILSSPECIFIC = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        ROOMDETAILSPRICE = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        ROOMDEATILSROOMS = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel114 = new javax.swing.JLabel();
        WELCOME = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        mainzion.setBackground(new java.awt.Color(255, 255, 255));
        mainzion.setLayout(null);

        coroselp.setBackground(new java.awt.Color(255, 204, 204));
        coroselp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        coroselp.setLayout(null);

        jLabel15p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wifi.jpg"))); // NOI18N
        jLabel15p.setText("FREE WIFI");
        coroselp.add(jLabel15p);
        jLabel15p.setBounds(30, 70, 250, 70);

        jLabel16p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spa.jpg"))); // NOI18N
        jLabel16p.setText("SPA&SALON");
        coroselp.add(jLabel16p);
        jLabel16p.setBounds(330, 70, 250, 80);

        jLabel17p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parking.jpg"))); // NOI18N
        jLabel17p.setText("PARKING");
        coroselp.add(jLabel17p);
        jLabel17p.setBounds(640, 60, 250, 90);

        jLabel18p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/psnooker.jpeg"))); // NOI18N
        jLabel18p.setText("SNOOKER");
        coroselp.add(jLabel18p);
        jLabel18p.setBounds(30, 150, 240, 80);

        jLabel19p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tennis.jpg"))); // NOI18N
        jLabel19p.setText("TENNIES");
        coroselp.add(jLabel19p);
        jLabel19p.setBounds(330, 160, 240, 80);

        jLabel20p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plate.jpg"))); // NOI18N
        jLabel20p.setText("RESTAURENT");
        coroselp.add(jLabel20p);
        jLabel20p.setBounds(640, 160, 270, 80);

        jLabel21p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel21p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fitness.jpg"))); // NOI18N
        jLabel21p.setText("GYM");
        coroselp.add(jLabel21p);
        jLabel21p.setBounds(30, 240, 230, 90);

        jLabel22p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel22p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pool.jpg"))); // NOI18N
        jLabel22p.setText("SWIMMIMG POOL");
        coroselp.add(jLabel22p);
        jLabel22p.setBounds(330, 250, 280, 80);

        jLabel23p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel23p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phandi2.jpeg"))); // NOI18N
        jLabel23p.setText("HANDICHAPED");
        coroselp.add(jLabel23p);
        jLabel23p.setBounds(640, 250, 300, 80);

        jLabel24p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel24p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phall2.jpeg"))); // NOI18N
        jLabel24p.setText("BANQUET HALLS");
        coroselp.add(jLabel24p);
        jLabel24p.setBounds(30, 330, 290, 100);

        jLabel25p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel25p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laundry.jpg"))); // NOI18N
        jLabel25p.setText("INHOUSE LAUNDARY");
        coroselp.add(jLabel25p);
        jLabel25p.setBounds(330, 340, 300, 90);

        jLabel26p.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel26p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/conference.jpg"))); // NOI18N
        jLabel26p.setText("CONFERENCE ROOMS");
        coroselp.add(jLabel26p);
        jLabel26p.setBounds(640, 340, 350, 90);

        jLabel27p.setFont(new java.awt.Font("Algerian", 2, 40)); // NOI18N
        jLabel27p.setText("HOTEL FACILITIES.......");
        coroselp.add(jLabel27p);
        jLabel27p.setBounds(20, 0, 680, 70);

        mainzion.add(coroselp);
        coroselp.setBounds(0, 100, 1000, 440);

        jLabel1p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/]bbhj.png"))); // NOI18N
        jLabel1p.setText("jLabel1");
        mainzion.add(jLabel1p);
        jLabel1p.setBounds(0, 0, 360, 98);

        jButton1p.setBackground(new java.awt.Color(51, 51, 51));
        jButton1p.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1p.setForeground(new java.awt.Color(255, 255, 255));
        jButton1p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginp.jpeg"))); // NOI18N
        jButton1p.setText("LOGIN");
        jButton1p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1pActionPerformed(evt);
            }
        });
        mainzion.add(jButton1p);
        jButton1p.setBounds(1670, 0, 260, 100);

        jLabel2p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        mainzion.add(jLabel2p);
        jLabel2p.setBounds(1000, 100, 930, 440);

        roomp.setBackground(new java.awt.Color(255, 204, 204));
        roomp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        roomp.setLayout(null);

        jButton5p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/roomsb.jpeg"))); // NOI18N
        jButton5p.setText("jButton5");
        jButton5p.setBorder(null);
        jButton5p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5pActionPerformed(evt);
            }
        });
        roomp.add(jButton5p);
        jButton5p.setBounds(10, 10, 390, 340);

        jPanel4p.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4p.setLayout(null);

        jLabel64.setFont(new java.awt.Font("Algerian", 2, 40)); // NOI18N
        jLabel64.setText("ROOMS");
        jPanel4p.add(jLabel64);
        jLabel64.setBounds(100, 10, 240, 40);

        roomp.add(jPanel4p);
        jPanel4p.setBounds(10, 370, 390, 60);

        mainzion.add(roomp);
        roomp.setBounds(0, 540, 410, 440);

        partyp.setBackground(new java.awt.Color(255, 204, 204));
        partyp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        partyp.setLayout(null);

        jButton2p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/partyb.jpeg"))); // NOI18N
        jButton2p.setText("jButton2");
        jButton2p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2pActionPerformed(evt);
            }
        });
        partyp.add(jButton2p);
        jButton2p.setBounds(10, 10, 390, 340);

        jPanel6p.setBackground(new java.awt.Color(255, 102, 102));
        jPanel6p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel6p.setLayout(null);

        jLabel79.setFont(new java.awt.Font("Algerian", 2, 40)); // NOI18N
        jLabel79.setText("PARTY HALLS");
        jPanel6p.add(jLabel79);
        jLabel79.setBounds(10, 10, 290, 40);

        partyp.add(jPanel6p);
        jPanel6p.setBounds(10, 370, 390, 60);

        mainzion.add(partyp);
        partyp.setBounds(410, 540, 410, 440);

        restro.setBackground(new java.awt.Color(255, 204, 204));
        restro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        restro.setLayout(null);

        jButton4p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restb.jpeg"))); // NOI18N
        jButton4p.setText("RESTAURENT");
        jButton4p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4pActionPerformed(evt);
            }
        });
        restro.add(jButton4p);
        jButton4p.setBounds(10, 10, 400, 340);

        jPanel8p.setBackground(new java.awt.Color(255, 102, 102));
        jPanel8p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel8p.setLayout(null);

        jLabel93.setFont(new java.awt.Font("Algerian", 2, 40)); // NOI18N
        jLabel93.setText("RESTAURENT");
        jPanel8p.add(jLabel93);
        jLabel93.setBounds(80, 10, 260, 40);

        restro.add(jPanel8p);
        jPanel8p.setBounds(10, 370, 400, 60);

        mainzion.add(restro);
        restro.setBounds(820, 540, 420, 440);

        aboutus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        aboutus.setLayout(null);

        jPanel10p.setBackground(new java.awt.Color(255, 153, 153));
        jPanel10p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10p.setLayout(null);

        jLabel117.setFont(new java.awt.Font("Algerian", 2, 50)); // NOI18N
        jLabel117.setText("ABOUT US");
        jPanel10p.add(jLabel117);
        jLabel117.setBounds(200, 0, 420, 60);

        aboutus.add(jPanel10p);
        jPanel10p.setBounds(10, 0, 690, 70);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(153, 0, 51));
        jTextArea2.setRows(5);
        jTextArea2.setText("We are there for your true service.We have a highly dedicated and \nprofessional hospitality team to pamper you with personalized \nattention.We help you in designing and celebrating all your occasions like \nWeddings, Engagements, Sangeet Ceremonies,Birthday Celebrations, \nCorporate Conference Meetings and Gatherings.We at Zion,\nhave world-class hygiene, luxurious dining, and banquet halls,\noffering all the facilities like salons, Entertainment, Theme Based\nevents, Food, Dining Halls, and tastefully done rooms as per our\nguests choice all under one roof.\n\n");
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane2.setViewportView(jTextArea2);

        aboutus.add(jScrollPane2);
        jScrollPane2.setBounds(10, 70, 670, 280);

        jPanel11p.setBackground(new java.awt.Color(255, 102, 102));
        jPanel11p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel11p.setLayout(null);

        jLabel118.setFont(new java.awt.Font("Algerian", 2, 35)); // NOI18N
        jLabel118.setText("FOLLOW US ON:");
        jPanel11p.add(jLabel118);
        jLabel118.setBounds(10, 10, 250, 70);

        aboutus.add(jPanel11p);
        jPanel11p.setBounds(230, 350, 260, 80);

        jButton3p.setBackground(new java.awt.Color(255, 102, 51));
        jButton3p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insta.jpeg"))); // NOI18N
        aboutus.add(jButton3p);
        jButton3p.setBounds(590, 350, 90, 80);

        jButton7p.setBackground(new java.awt.Color(0, 51, 255));
        jButton7p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fb.jpeg"))); // NOI18N
        aboutus.add(jButton7p);
        jButton7p.setBounds(500, 350, 90, 80);

        jPanel12p.setBackground(new java.awt.Color(255, 204, 204));
        jPanel12p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel12p.setLayout(null);

        jLabel119.setFont(new java.awt.Font("Algerian", 2, 30)); // NOI18N
        jLabel119.setText("CONTACT US:");
        jPanel12p.add(jLabel119);
        jLabel119.setBounds(10, 0, 220, 60);

        jLabel120.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel120.setText("0175-245673");
        jPanel12p.add(jLabel120);
        jLabel120.setBounds(20, 40, 200, 30);

        aboutus.add(jPanel12p);
        jPanel12p.setBounds(10, 350, 220, 80);

        mainzion.add(aboutus);
        aboutus.setBounds(1230, 540, 700, 440);

        headingp.setBackground(new java.awt.Color(255, 153, 153));
        headingp.setLayout(null);

        jLabel9p.setBackground(new java.awt.Color(255, 102, 102));
        jLabel9p.setFont(new java.awt.Font("Algerian", 2, 36)); // NOI18N
        jLabel9p.setText("Affordable | Comfortable | Warm | Efficient | Friendly | Relaxing");
        headingp.add(jLabel9p);
        jLabel9p.setBounds(10, 6, 1290, 90);

        mainzion.add(headingp);
        headingp.setBounds(360, 0, 1310, 100);

        getContentPane().add(mainzion, "card12");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
        });
        jPanel5.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        house.setBackground(new java.awt.Color(255, 255, 255));
        house.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        house.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        house.setText("HOME");
        house.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseActionPerformed(evt);
            }
        });

        photos.setBackground(new java.awt.Color(255, 255, 255));
        photos.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        photos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photos.jpg"))); // NOI18N
        photos.setText("PHOTOS");
        photos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photosActionPerformed(evt);
            }
        });

        blog.setBackground(new java.awt.Color(255, 255, 255));
        blog.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        blog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blog.jpg"))); // NOI18N
        blog.setText("BLOG");
        blog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogActionPerformed(evt);
            }
        });

        birthday.setBackground(new java.awt.Color(255, 255, 255));
        birthday.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        birthday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cake.jpg"))); // NOI18N
        birthday.setText("BIRTHDAY THEMES");
        birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayActionPerformed(evt);
            }
        });

        sale.setBackground(new java.awt.Color(255, 255, 255));
        sale.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        sale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/offers.jpg"))); // NOI18N
        sale.setText("OFFERS");
        sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(birthday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photos, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sale)
                .addContainerGap(4226, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel9);
        jPanel9.setBounds(401, 27, 5560, 147);
        jPanel5.add(jLabel19);
        jLabel19.setBounds(0, 0, 396, 0);

        jPanel10.setBackground(new java.awt.Color(255, 102, 102));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jButton8.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wedding.jpg"))); // NOI18N
        jButton8.setText("WEDDING");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bday.jpg"))); // NOI18N
        jButton20.setText("BIRTHDAY");
        jButton20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ring1.jpg"))); // NOI18N
        jButton21.setText("ENGAGEMENT");
        jButton21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banquet.jpg"))); // NOI18N
        jButton22.setText("BANQUET");
        jButton22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addGap(114, 114, 114)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel10);
        jPanel10.setBounds(1040, 190, 770, 430);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        label1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        label1.setText("PARTY HARD");

        label2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        label2.setName(""); // NOI18N
        label2.setText("Party With Us We provide you With The best Service Share Your memories With Us .Let's Take a Chance To be \n"); // NOI18N

        label3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        label3.setText("A Family Come and Join Us.We Promise We Will take Care Of All your Need And Demands.You Will say");

        label4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        label4.setText("And We do It for You What Are You Waiting For Come And Join us Now.");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        jPanel5.add(jPanel11);
        jPanel11.setBounds(0, 730, 1000, 240);

        crousel.setBackground(new java.awt.Color(255, 255, 255));
        crousel.setText("crousel");
        crousel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel5.add(crousel);
        crousel.setBounds(20, 190, 1000, 422);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zion6.jpg"))); // NOI18N
        jPanel5.add(jLabel20);
        jLabel20.setBounds(0, 0, 400, 180);

        jPanel25.setBackground(new java.awt.Color(255, 0, 153));
        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.jpg"))); // NOI18N
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel41.setText("Best deals are Available On Wedding Package .Sale!");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel25);
        jPanel25.setBounds(20, 620, 1010, 90);

        menu.setBackground(new java.awt.Color(255, 102, 102));
        menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        menuheading.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        menuheading.setText("Decide Your MENU");

        check1.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check1.setText("veg Kabab");

        check2.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check2.setText("French Fries");
        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });

        check3.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check3.setText("Manchurian");
        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });

        check4.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check4.setText("Spring Rolls");

        check5.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check5.setText("Allo Tikki");

        check7.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check7.setText("Roti");
        check7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check7ActionPerformed(evt);
            }
        });

        check9.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check9.setText("Paneer");

        check6.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check6.setText("Dal");

        check8.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check8.setText("Cold Drinks");

        check10.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check10.setText("Dahi bhalla");

        check11.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check11.setText("Coffee");

        check12.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check12.setText("Shakes");

        check13.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check13.setText("Juices");
        check13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check13ActionPerformed(evt);
            }
        });

        check14.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check14.setText("Mocktalis");

        check15.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check15.setText("Pav Bhajji");

        check16.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check16.setText("Hot Chat");

        check17.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check17.setText("Dosa");
        check17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check17ActionPerformed(evt);
            }
        });

        check18.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        check18.setText("Goll Gappe");

        button1.setBackground(new java.awt.Color(255, 153, 153));
        button1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        button1.setLabel("OK!!!");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        rate1.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate1.setText("65");

        rate2.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate2.setText("50");

        rate3.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate3.setText("100");

        rate4.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate4.setText("80");

        rate5.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate5.setText("70");

        rate6.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate6.setText("120");

        rate7.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate7.setText("100");

        rate8.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate8.setText("85");

        rate9.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate9.setText("120");

        rate10.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate10.setText("50");

        rate11.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate11.setText("80");

        rate12.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate12.setText("120");

        rate13.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate13.setText("90");

        rate14.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate14.setText("50");

        rate15.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate15.setText("50");

        rate16.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate16.setText("165");

        rate17.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate17.setText("185");

        rate18.setFont(new java.awt.Font("Palatino Linotype", 3, 14)); // NOI18N
        rate18.setText("15");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(check1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rate3))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(check3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rate4))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(check4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rate5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 15, Short.MAX_VALUE)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(menuheading, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(menuLayout.createSequentialGroup()
                                            .addComponent(check16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rate9))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(check10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(check17, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rate6)
                                                .addComponent(rate7))
                                            .addGap(27, 27, 27))
                                        .addGroup(menuLayout.createSequentialGroup()
                                            .addComponent(check18, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rate10)))
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addComponent(check15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rate8)))
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(check8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(check14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(check13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(check11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(check12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(check5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rate2))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(check2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(rate14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rate11)
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rate12)
                                            .addComponent(rate13))
                                        .addGap(49, 49, 49)
                                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(check7)
                                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(check6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(check9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(18, 18, 18)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rate18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rate16)
                                    .addComponent(rate17))))
                        .addGap(32, 32, 32))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(rate15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuheading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(check2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rate1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(check10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rate7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rate2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(check17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rate6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(check5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                .addComponent(check16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(check1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rate3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rate8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(check15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(check3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rate4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rate5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(check8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rate11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(check6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rate16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(check14, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                    .addComponent(rate12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(check9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rate17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(check13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rate13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(check11, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                            .addComponent(rate14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(rate15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(menuLayout.createSequentialGroup()
                                                    .addComponent(rate9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(37, 37, 37)
                                                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(check12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                                        .addComponent(rate10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGroup(menuLayout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rate18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );

        jPanel5.add(menu);
        menu.setBounds(1050, 640, 780, 360);

        getContentPane().add(jPanel5, "card3");

        restraunt.setBackground(new java.awt.Color(255, 255, 255));
        restraunt.setLayout(null);

        zionrestraunt.setBackground(new java.awt.Color(255, 51, 51));
        zionrestraunt.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        zionrestraunt.setText("  WELCOME TO ZION'S RESTRAUNT ");
        restraunt.add(zionrestraunt);
        zionrestraunt.setBounds(380, 20, 670, 50);

        crausel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        restraunt.add(crausel);
        crausel.setBounds(20, 80, 1100, 400);

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        home.setText("home");
        home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        restraunt.add(home);
        home.setBounds(1190, 60, 180, 60);

        call.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        call.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/call.jpg"))); // NOI18N
        call.setText("call");
        call.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callActionPerformed(evt);
            }
        });
        restraunt.add(call);
        call.setBounds(1190, 150, 180, 60);

        offers.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        offers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/offers.jpg"))); // NOI18N
        offers.setText("Offers");
        offers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        offers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offersActionPerformed(evt);
            }
        });
        restraunt.add(offers);
        offers.setBounds(1190, 250, 180, 60);

        bhavikamenu.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        bhavikamenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu_bh.jpg"))); // NOI18N
        bhavikamenu.setText("Menu");
        bhavikamenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bhavikamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhavikamenuActionPerformed(evt);
            }
        });
        restraunt.add(bhavikamenu);
        bhavikamenu.setBounds(1190, 340, 180, 50);

        booknow.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        booknow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok.jpg"))); // NOI18N
        booknow.setText("BOOK NOW");
        booknow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        booknow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknowActionPerformed(evt);
            }
        });
        restraunt.add(booknow);
        booknow.setBounds(1190, 420, 200, 70);

        paneerlababdar.setFont(new java.awt.Font("Kohinoor Bangla", 3, 24)); // NOI18N
        paneerlababdar.setForeground(new java.awt.Color(255, 51, 51));
        paneerlababdar.setText("PANEER LABABDAAR JUST RUPEES  190/-");
        paneerlababdar.setBorder(new javax.swing.border.MatteBorder(null));
        restraunt.add(paneerlababdar);
        paneerlababdar.setBounds(60, 540, 600, 240);

        reservetable.setBackground(new java.awt.Color(255, 153, 153));
        reservetable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        reservetable.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel4.setText("       RESERVE  YOUR  TABLE  NOW");
        reservetable.add(jLabel4);
        jLabel4.setBounds(50, 10, 470, 50);

        jLabel5.setText("NAME");
        reservetable.add(jLabel5);
        jLabel5.setBounds(50, 90, 50, 16);

        jLabel7.setText("YOUR CURRENT CITY");
        reservetable.add(jLabel7);
        jLabel7.setBounds(50, 130, 140, 16);

        jLabel8.setText("DATE OF BOOKING");
        reservetable.add(jLabel8);
        jLabel8.setBounds(50, 170, 130, 16);
        reservetable.add(jTextField1);
        jTextField1.setBounds(200, 80, 100, 22);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        reservetable.add(jTextField2);
        jTextField2.setBounds(200, 120, 100, 22);
        reservetable.add(jTextField4);
        jTextField4.setBounds(200, 200, 100, 22);

        jLabel9.setText("SUITABLE TIME");
        reservetable.add(jLabel9);
        jLabel9.setBounds(50, 210, 120, 16);

        jButton6.setBackground(new java.awt.Color(102, 255, 102));
        jButton6.setText("RESERVE YOUR SEAT");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        reservetable.add(jButton6);
        jButton6.setBounds(350, 300, 170, 60);
        reservetable.add(jXDatePicker1);
        jXDatePicker1.setBounds(200, 160, 120, 24);

        jLabel37.setText("NUMBER OF MEMBERS");
        reservetable.add(jLabel37);
        jLabel37.setBounds(50, 250, 140, 16);
        reservetable.add(jTextField3);
        jTextField3.setBounds(200, 240, 100, 22);

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel38.setText("RESERVATION PAYMENT");
        reservetable.add(jLabel38);
        jLabel38.setBounds(330, 70, 230, 30);

        jLabel39.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel39.setText("PAY RUPEES ->");
        reservetable.add(jLabel39);
        jLabel39.setBounds(340, 120, 200, 40);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/200.png"))); // NOI18N
        reservetable.add(jLabel40);
        jLabel40.setBounds(340, 180, 210, 70);

        jLabel15.setText("PHONE NUMBER");
        reservetable.add(jLabel15);
        jLabel15.setBounds(50, 280, 140, 16);

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        reservetable.add(jTextField6);
        jTextField6.setBounds(200, 280, 100, 22);
        reservetable.add(jLabel18);
        jLabel18.setBounds(180, 320, 140, 0);

        restraunt.add(reservetable);
        reservetable.setBounds(740, 520, 580, 380);

        thankyou.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        thankyou.setText("THANKS FOR VISITING");
        restraunt.add(thankyou);
        thankyou.setBounds(140, 790, 670, 100);
        restraunt.add(jLabel116);
        jLabel116.setBounds(1450, 50, 460, 950);

        getContentPane().add(restraunt, "card2");

        login.setBackground(new java.awt.Color(255, 204, 204));
        login.setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel6.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("USER ID");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(180, 110, 110, 30);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("PASSWORD");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(180, 160, 130, 30);
        jPanel6.add(jTextField5);
        jTextField5.setBounds(360, 106, 170, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jPasswordField1);
        jPasswordField1.setBounds(360, 156, 170, 30);

        jButton7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton7.setText("LOGIN");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7);
        jButton7.setBounds(200, 210, 130, 40);

        jButton9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton9.setText("SIGN IN");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9);
        jButton9.setBounds(380, 209, 130, 40);

        jButton10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton10.setText("FORGOT PASSWORD");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);
        jButton10.setBounds(250, 270, 230, 50);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        jLabel11.setText("            ZION'S");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(90, 30, 460, 50);

        jButton18.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton18.setText("BACK");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton18);
        jButton18.setBounds(550, 30, 130, 50);

        login.add(jPanel6);
        jPanel6.setBounds(570, 300, 720, 390);
        login.add(jLabel33);
        jLabel33.setBounds(0, -130, 1920, 1100);

        getContentPane().add(login, "card3");

        signup.setBackground(new java.awt.Color(255, 204, 204));
        signup.setLayout(null);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel7.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 3, 36)); // NOI18N
        jLabel12.setText("WELCOME TO ZION'S");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(180, 30, 420, 40);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel13.setText("USER NAME");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(153, 120, 120, 20);

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel21.setText("USER ID");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(153, 170, 120, 24);

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel22.setText("PASSWORD");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(153, 216, 120, 20);

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel23.setText("RE-TYPE PASSWORD");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(153, 266, 190, 20);
        jPanel7.add(jTextField7);
        jTextField7.setBounds(420, 110, 180, 30);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField11);
        jTextField11.setBounds(420, 166, 180, 30);

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyTyped(evt);
            }
        });
        jPanel7.add(jPasswordField2);
        jPasswordField2.setBounds(420, 210, 180, 30);

        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyTyped(evt);
            }
        });
        jPanel7.add(jPasswordField3);
        jPasswordField3.setBounds(420, 260, 180, 30);

        jButton11.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton11.setText("SUBMIT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11);
        jButton11.setBounds(630, 510, 101, 40);
        jPanel7.add(jLabel24);
        jLabel24.setBounds(620, 270, 90, 0);

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel25.setText("QUESTION");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(160, 400, 150, 30);

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel26.setText("ANSWER");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(160, 480, 110, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(360, 450, 166, 96);

        jComboBox1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PET NAME", "FAV COLOR", "FAV FOOD", "MOBILE NO." }));
        jPanel7.add(jComboBox1);
        jComboBox1.setBounds(420, 400, 180, 25);

        jButton17.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton17.setText("BACK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton17);
        jButton17.setBounds(615, 30, 130, 50);
        jPanel7.add(jLabel36);
        jLabel36.setBounds(640, 266, 110, 20);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel16.setText("MOBILE NUMBER");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(160, 316, 210, 40);

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });
        jPanel7.add(jTextField8);
        jTextField8.setBounds(420, 320, 180, 30);
        jPanel7.add(jLabel17);
        jLabel17.setBounds(620, 316, 130, 30);

        signup.add(jPanel7);
        jPanel7.setBounds(610, 270, 770, 570);

        jLabel35.setText("jLabel35");
        signup.add(jLabel35);
        jLabel35.setBounds(-7, 0, 2310, 1080);

        getContentPane().add(signup, "card4");

        menubhavika.setBackground(new java.awt.Color(255, 255, 153));
        menubhavika.setLayout(null);

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 2, 48)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 51));
        jLabel27.setText("MENU");
        menubhavika.add(jLabel27);
        jLabel27.setBounds(570, 20, 160, 70);

        jButton12.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jButton12.setText("BREAKFAST");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        menubhavika.add(jButton12);
        jButton12.setBounds(80, 110, 190, 50);

        jButton13.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jButton13.setText("LUNCH");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        menubhavika.add(jButton13);
        jButton13.setBounds(490, 110, 140, 50);

        jButton14.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jButton14.setText("DINNER");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        menubhavika.add(jButton14);
        jButton14.setBounds(870, 110, 150, 50);

        jButton15.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jButton15.setText("BEVRAGES");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        menubhavika.add(jButton15);
        jButton15.setBounds(1240, 110, 170, 50);

        jButton16.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jButton16.setText("SNACKS");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        menubhavika.add(jButton16);
        jButton16.setBounds(1580, 110, 150, 50);

        jLabel28.setBorder(new javax.swing.border.MatteBorder(null));
        menubhavika.add(jLabel28);
        jLabel28.setBounds(530, 230, 710, 680);

        jLabel29.setBorder(new javax.swing.border.MatteBorder(null));
        menubhavika.add(jLabel29);
        jLabel29.setBounds(30, 220, 440, 300);

        jLabel30.setBorder(new javax.swing.border.MatteBorder(null));
        menubhavika.add(jLabel30);
        jLabel30.setBounds(70, 560, 410, 320);

        jLabel31.setBorder(new javax.swing.border.MatteBorder(null));
        menubhavika.add(jLabel31);
        jLabel31.setBounds(1320, 220, 520, 310);

        jLabel32.setBorder(new javax.swing.border.MatteBorder(null));
        menubhavika.add(jLabel32);
        jLabel32.setBounds(1300, 590, 520, 300);

        jButton19.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton19.setText("BACK");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        menubhavika.add(jButton19);
        jButton19.setBounds(1710, 20, 120, 40);

        jLabel34.setText("jLabel34");
        menubhavika.add(jLabel34);
        jLabel34.setBounds(3, 0, 1970, 970);

        getContentPane().add(menubhavika, "card5");

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel45.setText("Lovely Experience of People With Zion!!!!");

        jPanel21.setBackground(new java.awt.Color(255, 102, 102));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel46.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel46.setText("Happy Experience of our Coustomer in their Lovely Words!!!!");

        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
        );

        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(255, 102, 102));
        jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel51.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel51.setText("Photos of our Members and their Experience!!!");

        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        jPanel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );

        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton32.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        jButton32.setText("Home");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton33.setText("Back");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/call.jpg"))); // NOI18N
        jButton34.setText("Contact Us");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel20, "card4");

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(null);

        jLabel56.setFont(new java.awt.Font("Palatino Linotype", 3, 48)); // NOI18N
        jLabel56.setText("Celebrate Your Big Day With Zion!!!");
        jPanel32.add(jLabel56);
        jLabel56.setBounds(20, 30, 820, 100);

        jPanel33.setBackground(new java.awt.Color(255, 102, 102));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel57.setBackground(new java.awt.Color(255, 102, 102));
        jLabel57.setText("jLabel19");

        jLabel58.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel58.setText("Little Boy/Girl Package...");

        jLabel59.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel59.setText("22000/-");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel33Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                    .addContainerGap(239, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(72, 72, 72)))
        );

        jPanel32.add(jPanel33);
        jPanel33.setBounds(20, 170, 430, 360);

        jPanel34.setBackground(new java.awt.Color(255, 102, 102));
        jPanel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel60.setText("jLabel20");

        jLabel61.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel61.setText("Young Boy/Girl Package...");

        jLabel62.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel62.setText("25000/-");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jPanel32.add(jPanel34);
        jPanel34.setBounds(540, 170, 410, 360);

        jPanel35.setBackground(new java.awt.Color(255, 102, 102));
        jPanel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel63.setText("jLabel21");

        jLabel65.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel65.setText("Adult Boy Package...");

        jLabel66.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel66.setText("28000/-");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel35Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                    .addContainerGap(239, Short.MAX_VALUE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(72, 72, 72)))
        );

        jPanel32.add(jPanel35);
        jPanel35.setBounds(30, 610, 410, 360);

        jPanel36.setBackground(new java.awt.Color(255, 102, 102));
        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel67.setText("jLabel22");

        jLabel68.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel68.setText("Adult Girl Package...");

        jLabel69.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel69.setText("28000/-");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jPanel32.add(jPanel36);
        jPanel36.setBounds(540, 610, 422, 360);

        jButton35.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        jButton35.setText("Home");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton35);
        jButton35.setBounds(860, 30, 270, 90);

        jButton36.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton36.setText("Back");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton36);
        jButton36.setBounds(1180, 30, 230, 90);

        jButton37.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/call.jpg"))); // NOI18N
        jButton37.setText("Contact Us");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton37);
        jButton37.setBounds(1450, 30, 320, 90);

        jPanel37.setBackground(new java.awt.Color(255, 102, 102));
        jPanel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel70.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel70.setText("Celebrate Your Birthday with us.Fill Your Details");

        jLabel71.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel71.setText("Name");

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel72.setText("Last Name");

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel73.setText("Mobile Number");

        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField17KeyPressed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel74.setText("Event Date");

        jLabel75.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel75.setText("Number of Guests");

        jLabel76.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel76.setText("Aadhar i'd");

        jComboBox4.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jComboBox4.setMaximumRowCount(4);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Little Girl/Boy package", "Young Boy/Girl Package", "Adult Boy package", "Adult Girl package" }));

        jButton38.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jButton38.setText("Continue To Pay");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel37Layout.createSequentialGroup()
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jXDatePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel37Layout.createSequentialGroup()
                                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(111, 111, 111)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jTextField16))
                .addGap(29, 29, 29)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXDatePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jTextField18))
                .addGap(31, 31, 31)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel32.add(jPanel37);
        jPanel37.setBounds(990, 150, 920, 810);
        jPanel32.add(jLabel78);
        jLabel78.setBounds(620, 10, 120, 130);

        getContentPane().add(jPanel32, "card5");

        jPanel38.setBackground(new java.awt.Color(255, 204, 204));
        jPanel38.setAutoscrolls(true);

        jPanel39.setBackground(new java.awt.Color(204, 204, 204));
        jPanel39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));

        jLabel80.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel80.setText("Name");

        jLabel81.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel81.setText("Account Number");

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel82.setText("Bank");

        jComboBox5.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ICICI", "SBI", "HDFC", "PNB" }));

        jLabel83.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel83.setText("Enter OTP");

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(153, 153, 153));
        jButton39.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jButton39.setText("Pay Now-->");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jButton40.setText("Back");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Palatino Linotype", 3, 48)); // NOI18N
        jLabel84.setText("Welcome To Zion!! Pay Now!!");

        jLabel85.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel85.setText("Ammount To Pay");

        jButton27.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jButton27.setText("genrate OTP");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jButton39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField22)
                            .addComponent(jComboBox5, 0, 383, Short.MAX_VALUE)
                            .addComponent(jTextField21)
                            .addComponent(jTextField23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jTextField23))
                .addGap(40, 40, 40)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(934, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel38, "card6");

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setLayout(null);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));

        jButton41.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jButton41.setIcon(new javax.swing.ImageIcon("D:\\java prg\\hotel_management\\src\\images\\home.jpg")); // NOI18N
        jButton41.setText("Home");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel40.add(jPanel41);
        jPanel41.setBounds(500, 20, 260, 90);

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        label27.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        label27.setForeground(new java.awt.Color(255, 102, 102));
        label27.setText("Zion Provides You With The Best menues and Service");

        label29.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        label29.setForeground(new java.awt.Color(255, 102, 102));
        label29.setText("Want To make Your Wedding A big sucess,Try Us Now");

        jButton42.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jButton42.setIcon(new javax.swing.ImageIcon("D:\\java prg\\hotel_management\\src\\images\\click2.jpg")); // NOI18N
        jButton42.setText("click me");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/click1.jpg"))); // NOI18N
        jButton43.setText("click me ");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jButton44.setIcon(new javax.swing.ImageIcon("D:\\java prg\\hotel_management\\src\\images\\click4.jpg")); // NOI18N
        jButton44.setText("click me");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jButton45.setIcon(new javax.swing.ImageIcon("D:\\java prg\\hotel_management\\src\\images\\click3.jpg")); // NOI18N
        jButton45.setText("click me");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jButton46.setIcon(new javax.swing.ImageIcon("D:\\java prg\\hotel_management\\src\\images\\click5.jpg")); // NOI18N
        jButton46.setText("click me");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jButton43)
                        .addGap(1, 1, 1)
                        .addComponent(jButton42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton46, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel40.add(jPanel42);
        jPanel42.setBounds(30, 130, 1040, 280);

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));

        jLabel86.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 51, 51));

        jLabel87.setText("jLabel18");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel40.add(jPanel43);
        jPanel43.setBounds(20, 440, 1000, 330);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        label30.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        label30.setForeground(new java.awt.Color(255, 102, 102));
        label30.setText("BOOK YOUR SLOT NOW ...........");

        label39.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        label39.setForeground(new java.awt.Color(255, 102, 102));
        label39.setText("Fill Your Details Now!!");

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));

        label40.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        label40.setText("Name");

        label41.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        label41.setText("Number of GUEST");

        label42.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        label42.setText("Last name");

        label43.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        label43.setText("Mobile Number");

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField27KeyPressed(evt);
            }
        });

        label44.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        label44.setText("Event Date");

        label45.setFont(new java.awt.Font("Palatino Linotype", 3, 24)); // NOI18N
        label45.setText("Aadhar I'd");

        jComboBox6.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Veg Only", "Non-Veg Only", "Veg And non veg Both" }));

        jComboBox7.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shakes", "Cold Drinks", "Cocktails & Mocktails" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(255, 102, 102));
        jButton47.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N
        jButton47.setText("Continue To Pay");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Palatino Linotype", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label42, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel45Layout.createSequentialGroup()
                            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label40, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(87, 87, 87)
                            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label40, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label43, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton47, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label39, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel40.add(jPanel44);
        jPanel44.setBounds(1120, 20, 770, 920);

        jPanel46.setBackground(new java.awt.Color(255, 102, 102));

        jLabel89.setBackground(new java.awt.Color(255, 102, 102));
        jLabel89.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jLabel89.setText("Book Your Slot Now..Give Zion A Chance ..have a nice day");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel40.add(jPanel46);
        jPanel46.setBounds(30, 790, 960, 180);

        label31.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        label31.setText("Planning a WEDDING??");
        jPanel40.add(label31);
        label31.setBounds(20, 30, 473, 52);

        jButton48.setFont(new java.awt.Font("Palatino Linotype", 3, 36)); // NOI18N
        jButton48.setIcon(new javax.swing.ImageIcon("D:\\java prg\\hotel_management\\src\\images\\back.jpg")); // NOI18N
        jButton48.setText("Back");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel40.add(jButton48);
        jButton48.setBounds(830, 20, 230, 90);

        getContentPane().add(jPanel40, "card3");

        MAINPANEL.setBackground(new java.awt.Color(255, 255, 255));
        MAINPANEL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MAINPANEL.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MAINPANEL.add(jButton1);
        jButton1.setBounds(1640, 0, 120, 100);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/call.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MAINPANEL.add(jButton3);
        jButton3.setBounds(1770, 0, 120, 100);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/]bbhj.png"))); // NOI18N
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

        RESERVEROOM.setBackground(new java.awt.Color(255, 102, 102));
        RESERVEROOM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        RESERVEROOM.setLayout(null);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel42.setText("ROOM CHARGES");
        RESERVEROOM.add(jLabel42);
        jLabel42.setBounds(440, 130, 220, 40);

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel43.setText("OFFERS:");
        RESERVEROOM.add(jLabel43);
        jLabel43.setBounds(440, 180, 140, 60);

        jButton24.setFont(new java.awt.Font("Algerian", 2, 30)); // NOI18N
        jButton24.setText("RESERVE ROOM NOW");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        RESERVEROOM.add(jButton24);
        jButton24.setBounds(250, 340, 450, 60);

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RESERVEROOM.add(jLabel44);
        jLabel44.setBounds(650, 130, 210, 40);

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel90.setText("CHECKOUT DATE");
        RESERVEROOM.add(jLabel90);
        jLabel90.setBounds(10, 280, 210, 30);

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel91.setText("CHECKIN DATE");
        RESERVEROOM.add(jLabel91);
        jLabel91.setBounds(10, 210, 210, 30);

        RESERVEYOURROOMNOW.setBackground(new java.awt.Color(0, 0, 0));
        RESERVEYOURROOMNOW.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        RESERVEYOURROOMNOW.setForeground(new java.awt.Color(255, 255, 255));
        RESERVEYOURROOMNOW.setLayout(null);

        jLabel92.setFont(new java.awt.Font("Algerian", 2, 30)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("RESERVE YOUR ROOM NOW");
        RESERVEYOURROOMNOW.add(jLabel92);
        jLabel92.setBounds(10, 0, 410, 50);

        RESERVEROOM.add(RESERVEYOURROOMNOW);
        RESERVEYOURROOMNOW.setBounds(10, 10, 490, 50);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GET 10% Off If Room Charges Are Is More Than 8000", "GET 5% Off On Two DELUXE DOUBLE ROOM", "GET 20% Off On SUPER DELUXE ROOM", "NONE" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        RESERVEROOM.add(jComboBox2);
        jComboBox2.setBounds(560, 180, 360, 60);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel14.setText("TOTAL");
        RESERVEROOM.add(jLabel14);
        jLabel14.setBounds(440, 250, 120, 50);

        jLabel94.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RESERVEROOM.add(jLabel94);
        jLabel94.setBounds(650, 260, 220, 40);

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel95.setText("NAME");
        RESERVEROOM.add(jLabel95);
        jLabel95.setBounds(10, 70, 150, 30);

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });
        RESERVEROOM.add(jTextField10);
        jTextField10.setBounds(250, 70, 170, 40);

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel96.setText("AADHAR NUMBER");
        RESERVEROOM.add(jLabel96);
        jLabel96.setBounds(10, 130, 240, 40);

        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });
        RESERVEROOM.add(jTextField12);
        jTextField12.setBounds(250, 130, 170, 40);

        jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel97.setText("MOBILE NUMBER");
        RESERVEROOM.add(jLabel97);
        jLabel97.setBounds(440, 70, 220, 30);

        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });
        RESERVEROOM.add(jTextField13);
        jTextField13.setBounds(650, 60, 170, 40);
        RESERVEROOM.add(jXDatePicker4);
        jXDatePicker4.setBounds(250, 200, 170, 40);

        jXDatePicker5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker5ActionPerformed(evt);
            }
        });
        RESERVEROOM.add(jXDatePicker5);
        jXDatePicker5.setBounds(250, 270, 170, 40);

        MAINPANEL.add(RESERVEROOM);
        RESERVEROOM.setBounds(1050, 500, 940, 440);

        ROOMDETAILS.setBackground(new java.awt.Color(255, 153, 153));
        ROOMDETAILS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        ROOMDETAILS.setLayout(null);

        jLabel98.setText("ROOMS");
        ROOMDETAILS.add(jLabel98);
        jLabel98.setBounds(60, 900, 170, 16);

        jLabel99.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel99.setText("1.STANDARD DOUBLE ROOM");
        ROOMDETAILS.add(jLabel99);
        jLabel99.setBounds(10, 60, 340, 30);

        jLabel100.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel100.setText("2.STANDARD SINGLE ROOM");
        ROOMDETAILS.add(jLabel100);
        jLabel100.setBounds(10, 120, 340, 27);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setText("3.DELUXE DOUBLE ROOM");
        ROOMDETAILS.add(jLabel2);
        jLabel2.setBounds(10, 180, 330, 27);

        jLabel101.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel101.setText("4.SUPER DELUXE ROOM");
        ROOMDETAILS.add(jLabel101);
        jLabel101.setBounds(10, 240, 320, 27);

        jLabel102.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel102.setText("SIZE:40 m2 to 45 m2");
        ROOMDETAILS.add(jLabel102);
        jLabel102.setBounds(360, 60, 310, 30);

        jLabel103.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel103.setText("OCCUPANCY:TWO PEOPLE");
        ROOMDETAILS.add(jLabel103);
        jLabel103.setBounds(350, 84, 340, 40);

        jLabel104.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel104.setText("SIZE:37 m2 to 45 m2");
        ROOMDETAILS.add(jLabel104);
        jLabel104.setBounds(360, 120, 340, 30);

        jLabel105.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel105.setText("OCCUPANCY:ONE PERSON");
        ROOMDETAILS.add(jLabel105);
        jLabel105.setBounds(350, 140, 330, 40);

        jLabel106.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel106.setText("SIZE:150 SQUARE FEET");
        ROOMDETAILS.add(jLabel106);
        jLabel106.setBounds(360, 180, 330, 20);

        jLabel107.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel107.setText("OCCUPANCY:2 ADULTS+2 CHILDRENS");
        ROOMDETAILS.add(jLabel107);
        jLabel107.setBounds(300, 200, 420, 30);

        jLabel108.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel108.setText("SIZE:250 SQUARE FEET");
        ROOMDETAILS.add(jLabel108);
        jLabel108.setBounds(360, 230, 320, 30);

        jLabel109.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel109.setText("OCCUPANCY:4 ADULTS");
        ROOMDETAILS.add(jLabel109);
        jLabel109.setBounds(360, 246, 320, 50);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
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

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
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

        jButton25.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButton25.setText("4679");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton25MouseExited(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        ROOMDETAILS.add(jButton25);
        jButton25.setBounds(720, 190, 170, 40);

        jButton26.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButton26.setText("5256");
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton26MouseExited(evt);
            }
        });
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        ROOMDETAILS.add(jButton26);
        jButton26.setBounds(720, 250, 170, 40);

        ROOMDETAILSSPECIFIC.setBackground(new java.awt.Color(0, 0, 0));
        ROOMDETAILSSPECIFIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ROOMDETAILSSPECIFIC.setForeground(new java.awt.Color(255, 255, 255));
        ROOMDETAILSSPECIFIC.setLayout(null);

        jLabel110.setBackground(new java.awt.Color(255, 51, 153));
        jLabel110.setFont(new java.awt.Font("Algerian", 2, 30)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("SPECIFICATIONS");
        ROOMDETAILSSPECIFIC.add(jLabel110);
        jLabel110.setBounds(30, 10, 250, 30);

        ROOMDETAILS.add(ROOMDETAILSSPECIFIC);
        ROOMDETAILSSPECIFIC.setBounds(360, 10, 300, 50);

        ROOMDETAILSPRICE.setBackground(new java.awt.Color(0, 0, 0));
        ROOMDETAILSPRICE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ROOMDETAILSPRICE.setLayout(null);

        jLabel111.setText("PRICE(PER NIGHT)");
        ROOMDETAILSPRICE.add(jLabel111);
        jLabel111.setBounds(770, 0, 360, 50);

        jLabel112.setFont(new java.awt.Font("Algerian", 2, 30)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("PRICE(PER NIGHT)");
        ROOMDETAILSPRICE.add(jLabel112);
        jLabel112.setBounds(30, 0, 310, 50);

        ROOMDETAILS.add(ROOMDETAILSPRICE);
        ROOMDETAILSPRICE.setBounds(710, 10, 330, 50);

        ROOMDEATILSROOMS.setBackground(new java.awt.Color(0, 0, 0));
        ROOMDEATILSROOMS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ROOMDEATILSROOMS.setLayout(null);

        jLabel113.setFont(new java.awt.Font("Algerian", 2, 30)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("ROOMS");
        ROOMDEATILSROOMS.add(jLabel113);
        jLabel113.setBounds(50, 0, 210, 50);

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
        MAINPANEL.add(jLabel114);
        jLabel114.setBounds(720, 1110, 280, 30);

        WELCOME.setBackground(new java.awt.Color(255, 153, 153));
        WELCOME.setLayout(null);

        jLabel115.setBackground(new java.awt.Color(204, 0, 255));
        jLabel115.setFont(new java.awt.Font("Algerian", 2, 42)); // NOI18N
        jLabel115.setText("WELCOME TO THE HOTEL ZION! GET THE ROOMS AT BEST OFFER HERE!");
        jLabel115.setToolTipText("");
        WELCOME.add(jLabel115);
        jLabel115.setBounds(30, 0, 1420, 40);

        MAINPANEL.add(WELCOME);
        WELCOME.setBounds(250, 100, 1480, 40);

        getContentPane().add(MAINPANEL, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents
//String s="";
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

//       
    }//GEN-LAST:event_formWindowOpened
int count=1;
    private void offersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offersActionPerformed
        // TODO add your handling code here:
        paneerlababdar.setBackground(Color.pink);
//        jPanel5.setVisible(false);
//        jPanel32.setVisible(false);
//        jPanel40.setVisible(false);
//        jPanel20.setVisible(false);
//        jPanel38.setVisible(false);
//        restraunt.setVisible(false);
//        login.setVisible(false);
//        signup.setVisible(false);
//        menubhavika.setVisible(false);
//        MAINPANEL.setVisible(true);
       count++;
       if(count%2==0)
       {
           try{
            BufferedImage bim61 = ImageIO.read(new File("C:\\Users\\asus\\Desktop\\zion\\offer2.jpg"));
            Image img61 = bim61.getScaledInstance(paneerlababdar.getWidth(), paneerlababdar.getHeight(), Image.SCALE_DEFAULT);
            paneerlababdar.setIcon(new ImageIcon(img61));
        }
        catch(Exception e){
            System.out.println(e);
       }
       }
       else
       {
           try{
            BufferedImage bim61 = ImageIO.read(new File("C:\\Users\\asus\\Desktop\\zion\\offer1.jpg"));
            Image img61 = bim61.getScaledInstance(paneerlababdar.getWidth(), paneerlababdar.getHeight(), Image.SCALE_DEFAULT);
            paneerlababdar.setIcon(new ImageIcon(img61));
        }
        catch(Exception e){
            System.out.println(e);
       }
       }
        
    }//GEN-LAST:event_offersActionPerformed

    private void booknowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknowActionPerformed
        // TODO add your handling code here:
        reservetable.setBackground(Color.yellow);
    }//GEN-LAST:event_booknowActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
//        jPanel4.setVisible(true);
//        jPanel1.setVisible(false);
//        jPanel3.setVisible(false);
//        jPanel8.setVisible(false);

        String lo = LoginClass.getL_chk();
                if (lo.equals("1"))
        {

            try {
                String time = jTextField4.getText();
                String city = jTextField2.getText();
                String members = jTextField3.getText();
                 Date oDate = jXDatePicker1.getDate();        
                DateFormat oDateFormat = new SimpleDateFormat("dd-MM-YYYY");
                String booking = oDateFormat.format(oDate);
                String name = jTextField1.getText();
                String num = jTextField6.getText();
//                    
                               Connection con =  Database.getConnection();

                Statement stmt1 = con.createStatement();
                stmt1.executeUpdate("insert into restraunt(number,username,time,city,members,booking) values('"+num+"','"+name+"','"+time+"','"+city+"','"+members+"','"+booking+"')");
                JOptionPane.showMessageDialog(null, "proceed to payment");
//                jPanel38.setVisible(true);
                 jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(true);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
                thankyou.setVisible(true);
//                   jPanel4.setEnabled(true);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else
        {
            jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(true);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);

           
        }

//        jPanel4.setVisible(true);
//        jPanel1.setVisible(false);
//        jPanel3.setVisible(false);
//        jPanel8.setVisible(false);
//        try{
//       BufferedImage bim94 =   ImageIO.read(new File(src\\images\\bc.jpg"));
//                 Image img94 = bim94.getScaledInstance(jLabel33.getWidth(), jLabel33.getHeight(), Image.SCALE_DEFAULT);
//                 jLabel33.setIcon(new ImageIcon(img94));
//                 
//        
//                } catch (Exception e) {
//                    System.out.print(e);
//                }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        signup.setVisible(true);
        restraunt.setVisible(false);
        login.setVisible(false);
        try {
            BufferedImage bim64 = ImageIO.read(new File("src\\images\\bc.jpg"));
            Image img64 = bim64.getScaledInstance(jLabel35.getWidth(), jLabel35.getHeight(), Image.SCALE_DEFAULT);
            jLabel35.setIcon(new ImageIcon(img64));

        } catch (Exception e) {
            System.out.print(e);
        }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
//        jPanel4.setVisible(false);
//        jPanel3.setVisible(false);
//        jPanel1.setVisible(true);
        try {
                          Connection con =  Database.getConnection();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from login");
            while (rs.next()) {
                String us = rs.getString("userid");
                String ps = rs.getString("password");
//            String nm=rs.getString("USER NAME");

                if (us.equals(jTextField5.getText()) && ps.equals(jPasswordField1.getText())) {
                    restraunt.setVisible(true);
                    login.setVisible(false);
                    restraunt.setVisible(false);
                    LoginClass.setL_chk("1");

                }
            }
        } catch (Exception h) {
            System.out.println(h);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
//        jPanel1.setVisible(true);
//        jPanel3.setVisible(false);
//        jPanel4.setVisible(false);

        String n = jTextField11.getText();
        String un = jTextField7.getText();
        String ps = jPasswordField2.getText();
        String rps = jPasswordField3.getText();
        String ques = "" + jComboBox1.getSelectedItem();
        String ans = jTextArea1.getText();
        String number = jTextField8.getText();

        if (jPasswordField2.getText().equals(jPasswordField3.getText())) {
            try {
               
               Connection con =  Database.getConnection();
                Statement stmt = con.createStatement();
                stmt.executeUpdate("insert into login(userid,username,password,retypepassword,question,answer,number) values('" + n + "','" + un + "','" + ps + "','" + rps + "','" + ques + "','" + ans + "','" + number + "')");
                JOptionPane.showMessageDialog(null, "data inserted");
                restraunt.setEnabled(true);
            } catch (Exception h) {
                System.out.println(h);
            }
        } else {
            JOptionPane.showMessageDialog(null, "invalid password");
        }


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_jPasswordField2KeyTyped

    private void jPasswordField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyPressed
        // TODO add your handling code here:
        int k = evt.getKeyCode();
        if (k == KeyEvent.VK_BACK_SPACE) {
            if (jPasswordField2.getText().equals("enter Password")) {
                evt.consume();
                Toolkit.getDefaultToolkit();
            }
        }
    }//GEN-LAST:event_jPasswordField3KeyPressed

    private void jPasswordField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyReleased
        // TODO add your handling code here:
        if (jPasswordField2.getText().equals("")) {
            jPasswordField2.setText("enter password");
            jPasswordField2.setForeground(Color.gray);
            jPasswordField2.setEchoChar((char) 0);
        }
        String str1 = jPasswordField2.getText();
        String str2 = jPasswordField3.getText();
        if (str1.length() >= str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    jLabel36.setText("not match");
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                } else {
                    jLabel36.setText(null);
                }
            }
        } else {
            jLabel36.setText("invalid password");
        }

    }//GEN-LAST:event_jPasswordField3KeyReleased

    private void jPasswordField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyTyped
        // TODO add your handling code here:
        if (jPasswordField2.getText().equals("enter password")) {
            jPasswordField2.setText(null);
            jPasswordField2.setForeground(Color.BLACK);
            jPasswordField2.setEchoChar((char) '*');
        }

    }//GEN-LAST:event_jPasswordField3KeyTyped

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        try {
                           Connection con =  Database.getConnection();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from login where username='" + jTextField7.getText() + "'");
            while (rs.next()) {
                String qu = rs.getString("question");
                String ps = rs.getString("PASSWORD");

                String an = rs.getString("answer");
                String k = JOptionPane.showInputDialog(qu);
                if (k.equals(an)) {
                    jPasswordField1.setText(ps);

                }
            }
        } catch (Exception h) {
            System.out.println(h);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        try {

            BufferedImage bim = ImageIO.read(new File("src\\images\\br.jpeg"));
            Image img = bim.getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT);
            jLabel28.setIcon(new ImageIcon(img));

//                 
            BufferedImage bim14 = ImageIO.read(new File("src\\images\\br4.jpg"));
            Image img14 = bim14.getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT);
            jLabel29.setIcon(new ImageIcon(img14));
//                 

        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void bhavikamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhavikamenuActionPerformed
        // TODO add your handling code here:
       jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(true);
        MAINPANEL.setVisible(false);
        try {
            BufferedImage bim54 = ImageIO.read(new File("src\\images\\bvr1.jpg"));
            Image img54 = bim54.getScaledInstance(jLabel34.getWidth(), jLabel34.getHeight(), Image.SCALE_DEFAULT);
            jLabel34.setIcon(new ImageIcon(img54));

        } catch (Exception e) {
            System.out.print(e);
        }

        try {
            BufferedImage bim = ImageIO.read(new File("src\\images\\menu.jpg"));
            Image img = bim.getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT);
            jLabel28.setIcon(new ImageIcon(img));

            BufferedImage bim31 = ImageIO.read(new File("src\\images\\lun4.jpg"));
            Image img31 = bim31.getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT);
            jLabel29.setIcon(new ImageIcon(img31));

            BufferedImage bim32 = ImageIO.read(new File("src\\images\\din4.jpg"));
            Image img32 = bim32.getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_DEFAULT);
            jLabel30.setIcon(new ImageIcon(img32));

            BufferedImage bim33 = ImageIO.read(new File("src\\images\\bvr3.jpg"));
            Image img33 = bim33.getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_DEFAULT);
            jLabel31.setIcon(new ImageIcon(img33));

            BufferedImage bim34 = ImageIO.read(new File("src\\images\\sna4.jpg"));
            Image img34 = bim34.getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_DEFAULT);
            jLabel32.setIcon(new ImageIcon(img34));
        } catch (Exception e) {
            System.out.println(e);

        }


    }//GEN-LAST:event_bhavikamenuActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        try {

            BufferedImage bim0 = ImageIO.read(new File("src\\images\\lun.jpeg"));
            Image img0 = bim0.getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT);
            jLabel28.setIcon(new ImageIcon(img0));

            BufferedImage bim1 = ImageIO.read(new File("src\\images\\y1.jpeg"));
            Image img1 = bim1.getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_DEFAULT);
            jLabel30.setIcon(new ImageIcon(img1));

            BufferedImage bim2 = ImageIO.read(new File("src\\images\\y3.jpg"));
            Image img2 = bim2.getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_DEFAULT);
            jLabel32.setIcon(new ImageIcon(img2));

            BufferedImage bim3 = ImageIO.read(new File("src\\images\\y2.jpeg"));
            Image img3 = bim3.getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_DEFAULT);
            jLabel31.setIcon(new ImageIcon(img3));

            BufferedImage bim15 = ImageIO.read(new File("src\\images\\lun4.jpg"));
            Image img15 = bim15.getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT);
            jLabel29.setIcon(new ImageIcon(img15));

        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        try {

            BufferedImage bim4 = ImageIO.read(new File("src\\images\\din.jpg"));
            Image img4 = bim4.getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT);
            jLabel28.setIcon(new ImageIcon(img4));

            BufferedImage bim16 = ImageIO.read(new File("src\\images\\din4.jpg"));
            Image img16 = bim16.getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT);
            jLabel29.setIcon(new ImageIcon(img16));

        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        try {

            BufferedImage bim5 = ImageIO.read(new File("src\\images\\bvr.jpeg"));
            Image img5 = bim5.getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT);
            jLabel28.setIcon(new ImageIcon(img5));

            BufferedImage bim10 = ImageIO.read(new File("src\\images\\bvr1.jpg"));
            Image img10 = bim10.getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_DEFAULT);
            jLabel30.setIcon(new ImageIcon(img10));

            BufferedImage bim11 = ImageIO.read(new File("src\\images\\bvr3.jpg"));
            Image img11 = bim11.getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_DEFAULT);
            jLabel32.setIcon(new ImageIcon(img11));

            BufferedImage bim12 = ImageIO.read(new File("src\\images\\bvr2.jpg"));
            Image img12 = bim12.getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_DEFAULT);
            jLabel31.setIcon(new ImageIcon(img12));

            BufferedImage bim17 = ImageIO.read(new File("src\\images\\bvr4.jpg"));
            Image img17 = bim17.getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT);
            jLabel29.setIcon(new ImageIcon(img17));

        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        try {

            BufferedImage bim6 = ImageIO.read(new File("src\\images\\sna.jpeg"));
            Image img6 = bim6.getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(), Image.SCALE_DEFAULT);
            jLabel28.setIcon(new ImageIcon(img6));

            BufferedImage bim7 = ImageIO.read(new File("src\\images\\sn1.jpg"));
            Image img7 = bim7.getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_DEFAULT);
            jLabel30.setIcon(new ImageIcon(img7));

            BufferedImage bim8 = ImageIO.read(new File("src\\images\\sn3.jpg"));
            Image img8 = bim8.getScaledInstance(jLabel32.getWidth(), jLabel32.getHeight(), Image.SCALE_DEFAULT);
            jLabel32.setIcon(new ImageIcon(img8));

            BufferedImage bim9 = ImageIO.read(new File("src\\images\\sn2.jpeg"));
            Image img9 = bim9.getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_DEFAULT);
            jLabel31.setIcon(new ImageIcon(img9));

            BufferedImage bim20 = ImageIO.read(new File("src\\images\\sna4.jpg"));
            Image img20 = bim20.getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_DEFAULT);
            jLabel29.setIcon(new ImageIcon(img20));

        } catch (Exception e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel40.setVisible(false);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(true);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
       jPanel5.setVisible(false);
        jPanel40.setVisible(false);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        mainzion.setVisible(true);


    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel40.setVisible(false);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(true);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        // TODO add your handling code here:
        String mobile = jTextField8.getText();
        if (mobile.length() > 10) {
            jLabel17.setText("not more than 10");

            java.awt.Toolkit.getDefaultToolkit().beep();
        }
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            jLabel17.setText("only Numeric value");
            java.awt.Toolkit.getDefaultToolkit().beep();
        }


    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        String mobile = jTextField6.getText();
        if (mobile.length() > 10) {
            jLabel18.setText("not more than 10");

            java.awt.Toolkit.getDefaultToolkit().beep();
        }
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            jLabel18.setText("only Numeric value");
            java.awt.Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_jTextField6KeyPressed

    private void houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseActionPerformed
        // TODO add your handling code here:
//        jPanel33.setVisible(true);
//        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel40.setVisible(false);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        mainzion.setVisible(true);
        

    }//GEN-LAST:event_houseActionPerformed

    private void photosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photosActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel40.setVisible(false);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(true);
        mainzion.setVisible(false);
        
    }//GEN-LAST:event_photosActionPerformed

    private void blogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogActionPerformed
        // TODO add your handling code here:
       jPanel5.setVisible(false);
        jPanel40.setVisible(false);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(true);
        mainzion.setVisible(false);
    }//GEN-LAST:event_blogActionPerformed

    private void birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayActionPerformed
        // TODO add your handling code here:
       jPanel5.setVisible(false);
        jPanel40.setVisible(false);
        jPanel32.setVisible(true);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        mainzion.setVisible(false);

    }//GEN-LAST:event_birthdayActionPerformed

    private void saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "On the Esteem Occasions of Marriage 20% Off Book Now");
        JOptionPane.showMessageDialog(null, "Birthday Off 10% on Student pass");
        JOptionPane.showMessageDialog(null, "Birthday package 30% off");
        jPanel25.setVisible(true);
    }//GEN-LAST:event_saleActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel40.setVisible(true);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel32.setVisible(true);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        jPanel40.setVisible(false);
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel40.setVisible(true);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel40.setVisible(true);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
        // TODO add your handling code here:
        jPanel25.setVisible(false);
    }//GEN-LAST:event_jButton23MouseClicked

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:

        jPanel25.setVisible(false);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel5MouseEntered

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        mainzion.setVisible(true);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
       jPanel5.setVisible(true);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "7710345771");
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        mainzion.setVisible(true);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(true);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "7710345771");
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
        // TODO add your handling code here:
        String mobile = jTextField17.getText();
        if (mobile.length() >=10) {
            jLabel77.setText("not more than 10");

            java.awt.Toolkit.getDefaultToolkit().beep();
        }
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            jLabel77.setText("only Numeric value");
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
        //        jLabel65.setText("");
    }//GEN-LAST:event_jTextField17KeyPressed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        String lo = LoginClass.getL_chk();
                if (lo.equals("1"))
        {
           
        try{
        String name = jTextField16.getText();
        String l_name = jTextField15.getText();
        String mob = jTextField17.getText();
         Date oDate = jXDatePicker3.getDate();        
                DateFormat oDateFormat = new SimpleDateFormat("dd-MM-YYYY");
                String date = oDateFormat.format(oDate);
        String guest = jTextField18.getText();
        String id = jTextField19.getText();
        String pack = (" ") + jComboBox4.getSelectedItem();
       
          Connection con =  Database.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into birthday(name,last_name,mob,event_date,guest,aadhar,package)values('" + name + "','" + l_name + "','" + mob + "','" + date + "','" + guest + "','" + id + "','" + pack + "')");
            JOptionPane.showMessageDialog(null, "Data Inserted");
             jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(true);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }}
        else{
             jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(true);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        }
        //jPanel32.setVisible(true);
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(true);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        restraunt.setVisible(false);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        jPanel40.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        mainzion.setVisible(true);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        restraunt.setVisible(false);
        jPanel32.setVisible(false);
        jPanel38.setVisible(false);
        jPanel40.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        mainzion.setVisible(true);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        try {
            BufferedImage bim1 = ImageIO.read(new File("src\\images\\couple1.jpg"));
            Image img1 = bim1.getScaledInstance(jLabel86.getWidth(), jLabel86.getHeight(), Image.SCALE_DEFAULT);
            jLabel86.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        try {
            BufferedImage bim = ImageIO.read(new File("src\\images\\couple.jpg"));
            Image img = bim.getScaledInstance(jLabel86.getWidth(), jLabel86.getHeight(), Image.SCALE_DEFAULT);
            jLabel86.setIcon(new ImageIcon(img));
            //jLabel3.setIcon(image2);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        try {
            BufferedImage bim1 = ImageIO.read(new File("src\\images\\couple3.jpg"));
            Image img1 = bim1.getScaledInstance(jLabel87.getWidth(), jLabel87.getHeight(), Image.SCALE_DEFAULT);
            jLabel87.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        try {
            BufferedImage bim1 = ImageIO.read(new File("src\\images\\couple2.jpg"));
            Image img1 = bim1.getScaledInstance(jLabel87.getWidth(), jLabel87.getHeight(), Image.SCALE_DEFAULT);
            jLabel87.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        try {
            BufferedImage bim1 = ImageIO.read(new File("src\\images\\couple4.jpg"));
            Image img1 = bim1.getScaledInstance(jLabel86.getWidth(), jLabel86.getHeight(), Image.SCALE_DEFAULT);
            jLabel86.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyPressed
        // TODO add your handling code here:
        String mobile = jTextField27.getText();
        if (mobile.length() > 10) {
            jLabel88.setText("no more entery");

            java.awt.Toolkit.getDefaultToolkit().beep();

        }

        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            jLabel88.setText("Digits only");
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
        //        jLabel64.setText("");
    }//GEN-LAST:event_jTextField27KeyPressed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
         String lo = LoginClass.getL_chk();
                if (lo.equals("1"))
        {
            try{
        String name = jTextField25.getText();
        String l_name = jTextField26.getText();
        String mob = jTextField27.getText();
         Date oDate = jXDatePicker2.getDate();        
                DateFormat oDateFormat = new SimpleDateFormat("dd-MM-YYYY");
                String date= oDateFormat.format(oDate);
        String guest = jTextField24.getText();
        String id = jTextField28.getText();
        String dish = (" ") + jComboBox6.getSelectedItem();
        String drink = (" ") + jComboBox7.getSelectedItem();
       
                         Connection con =  Database.getConnection();

            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into wedding(name,last_name,mobile,event_date,guests,aadhar,dish,drink)values('" + name + "','" + l_name + "','" + mob + "','" + date + "','" + guest + "','" + id + "','" + dish + "','" + drink + "')");
            JOptionPane.showMessageDialog(null, "Data Inserted");
            //jPanel12.setVisible(true);
            jPanel38.setVisible(true);
            jPanel40.setVisible(false);
            jPanel32.setVisible(false);
            jPanel5.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }}
            else{
                    jPanel38.setVisible(false);
            jPanel40.setVisible(false);
            jPanel32.setVisible(false);
            jPanel5.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(true);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        jPanel20.setVisible(false);}
                    
        
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(true);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        mainzion.setVisible(false);

    }//GEN-LAST:event_jButton48ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        mainzion.setVisible(true);
        
    }//GEN-LAST:event_homeActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check2ActionPerformed

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check3ActionPerformed

    private void check7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check7ActionPerformed

    private void check13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check13ActionPerformed

    private void check17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check17ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Menu is Added Thanks For The Response");

        check1.setSelected(false);
        check2.setSelected(false);
        check3.setSelected(false);
        check4.setSelected(false);
        check5.setSelected(false);
        check7.setSelected(false);
        check9.setSelected(false);
        check6.setSelected(false);
        check8.setSelected(false);
        check10.setSelected(false);
        check11.setSelected(false);
        check12.setSelected(false);
        check13.setSelected(false);
        check14.setSelected(false);
        check15.setSelected(false);
        check16.setSelected(false);
        check17.setSelected(false);
        check18.setSelected(false);
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        
        String lo = LoginClass.getL_chk();
                if (lo.equals("1"))
        {
       try{     
        String name = jTextField10.getText();
        String aadhar = jTextField12.getText();
        String mob = jTextField13.getText();
        Date oDate = jXDatePicker4.getDate();        
                DateFormat oDateFormat = new SimpleDateFormat("dd-MM-YYYY");
                String check_in = oDateFormat.format(oDate);
                   Date oDate1 = jXDatePicker5.getDate();        
                DateFormat oDateFormat1 = new SimpleDateFormat("dd-MM-YYYY");
                String check_out = oDateFormat1.format(oDate1);
           // String check_out = jXDatePicker5.getName();
        String offers= ""+jComboBox2.getSelectedItem();
        String room_charges = jLabel44.getText();
        String total=jLabel94.getText();
       
                         Connection con =  Database.getConnection();

            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into rooms(name,aadhar,checkin,checkout,mobile_number,room_charges,offers,total)values('" + name + "','" + aadhar + "','" + check_in + "','" + check_out + "','" + mob + "','" + room_charges+ "','" + offers + "','" + total + "')");
            JOptionPane.showMessageDialog(null, "Data Inserted");
             jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(true);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);
        }
        catch(Exception e){
            System.out.println(e);
        }}
        else{
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(true);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false);     
                }
        
        
        
        
    }//GEN-LAST:event_jButton24ActionPerformed
int pretot=0;
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
       // int pretot1=0;
        String pa="";
        if(jComboBox2.getSelectedItem().equals("GET 10% Off If Room Charges Are Is More Than 8000")){
            pa=jLabel44.getText();
            int pa1=Integer.parseInt(pa);
            if(pa1>8000){
                int pretot=pa1-(pa1*10/100);
                jLabel94.setText(""+pretot);
            }
            else{
                jLabel94.setText(""+pa);
            }
        }
        //  else if(jComboBox2.getSelectedItem().equals("ROOM 3. Rs 4679")){
            // else if(jComboBox1.getSelectedItem().equals("GET 5% Off On DELUXE DOUBLE ROOM)
                //            String pa=jLabel24.getText();
                //            int pa1=Integer.parseInt(pa);
                //            int pretot=pa1-(pa1*20/100);
                //            jLabel4.setText(""+pretot);
                else if(jComboBox2.getSelectedItem().equals("GET 5% Off On Two DELUXE DOUBLE ROOM")){
                    int pretot1=0;
                  String  spinner="catch value";
                Integer myint1=Integer.parseInt(""+jSpinner3.getValue());
                spinner=myint1.toString();
                
                    if(myint1==2){
//                        JOptionPane.showMessageDialog(null,"SELECT A DELUXE DOUBLE ROOM FIRST");
                         pa=jLabel44.getText();
                        int pa1=Integer.parseInt(pa);
                         pretot1=pa1-(pa1*5/100);
                        jLabel94.setText(""+pretot1);
                    }
                    else{
                         JOptionPane.showMessageDialog(null,"SELECT Two DELUXE DOUBLE ROOM FIRST");
                         String pa1=jLabel44.getText();
                         jLabel94.setText(""+pa1);
                         jComboBox2.setSelectedItem("NONE");
                    }
                }

                else if(jComboBox2.getSelectedItem().equals("GET 20% Off On SUPER DELUXE ROOM")){
                    String  spinner="catch value";
                Integer myint1=Integer.parseInt(""+jSpinner4.getValue());
                spinner=myint1.toString();
                //int pretot=0;
                    if(myint1>=1){
                        
                        pa=jLabel44.getText();
                        int pa1=Integer.parseInt(pa);
                         int pretot1=pa1-(pa1*20/100);
                        jLabel94.setText(""+pretot1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"SELECT A SUPER DELUXE ROOM FIRST");
                        String pa3=jLabel44.getText();
                         jLabel94.setText(""+pa3);
                          jComboBox2.setSelectedItem("NONE");
                    }
                }
                else if(jComboBox2.getSelectedItem().equals("NONE")){
                    String af=jLabel44.getText();
                    jLabel94.setText(""+af);
                }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();

        //char pl=v.charAt(0);
        if(!Character.isLetter(c)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();}
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
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
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        // TODO add your handling code here:
        String str=jTextField13.getText();
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
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setBackground(Color.white);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        // TODO add your handling code here:
        //jButton4.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        // TODO add your handling code here:
        // jButton4.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton4MouseReleased

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

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jButton5.setBackground(Color.white);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MAINPANEL.setVisible(false);
        // jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseEntered
        // TODO add your handling code here:
        jButton6.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton25MouseEntered

    private void jButton25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseExited
        // TODO add your handling code here:
        jButton6.setBackground(Color.white);
    }//GEN-LAST:event_jButton25MouseExited

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        MAINPANEL.setVisible(false);
        //  jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseEntered
        // TODO add your handling code here:
        jButton7.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton26MouseEntered

    private void jButton26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseExited
        // TODO add your handling code here:
        jButton7.setBackground(Color.white);
    }//GEN-LAST:event_jButton26MouseExited

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        MAINPANEL.setVisible(false);
        //jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jXDatePicker5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker5ActionPerformed
        // TODO add your handling code here:
        int tot=0;
                   int tot1=0;
                   int tot2=0;
                   int tot3=0;
                   int tot4=0;
                   
       String spinner="";
        String spinner2="";
         String spinner3="";
          String spinner4="";
        //if(evt.getSource().equals(jButton4)){
                int c1=2564;
                int c2=1657;
                int c3=4679;
                int c4=5256;
                //        int k=evt.getKeyCode();
                ////        String c=""+jComboBox2.getSelectedItem() ;
                ////      int c1=Integer.parseInt (c);
                //        if(k==KeyEvent.VK_ENTER){
                Date oDate = jXDatePicker4.getDate();        
                DateFormat oDateFormat = new SimpleDateFormat("dd");
                String szDate = oDateFormat.format(oDate);
                Date oDate1 = jXDatePicker5.getDate();        
                DateFormat oDateFormat1 = new SimpleDateFormat("dd");
                String szDate1 = oDateFormat1.format(oDate1);
                 spinner="catch value";
                Integer myint1=Integer.parseInt(""+jSpinner1.getValue());
                spinner=myint1.toString();
              //  String s1=((spinner)evt.getSource()).getValue();
                
                
                    int d=Integer.parseInt (szDate);
                    int d1=Integer.parseInt (szDate1);
                    int d2=d1-d;
                     tot1=c1*myint1;
                       spinner2="catch value";
                Integer myint2=Integer.parseInt(""+jSpinner2.getValue());
                spinner=myint2.toString();
              //  String s1=((spinner)evt.getSource()).getValue();
                
                
//                    int d3=Integer.parseInt (szDate);
//                    int d4=Integer.parseInt (szDate1);
//                    int d5=d4-d3;
                     tot2=c2*myint2;
                      spinner3="catch value";
                Integer myint3=Integer.parseInt(""+jSpinner3.getValue());
                spinner=myint3.toString();
              //  String s1=((spinner)evt.getSource()).getValue();
                
                
//                    int d6=Integer.parseInt (szDate);
//                    int d7=Integer.parseInt (szDate1);
//                    int d8=d1-d;
                     tot3=c3*myint3;
                       spinner4="catch value";
                Integer myint4=Integer.parseInt(""+jSpinner4.getValue());
                spinner=myint4.toString();
              //  String s1=((spinner)evt.getSource()).getValue();
                
                
//                    int d9=Integer.parseInt (szDate);
//                    int d10=Integer.parseInt (szDate1);
//                    int d11=d10-d9;
                     tot4=c4*myint4;
                     tot=(tot1+tot2+tot3+tot4)*d2;
                     jLabel44.setText(""+tot);
    }//GEN-LAST:event_jXDatePicker5ActionPerformed
int x;
String otp;
String usa;
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        String mobo=JOptionPane.showInputDialog("Enter Your Mobile Number");
        String mob=jTextField8.getText();
        
         try {
                          Connection con =  Database.getConnection();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from login");
            Random r=new Random();
            while (rs.next()) {
                 usa = rs.getString("number");
                //JOptionPane.showMessageDialog(null,usa);
//            String nm=rs.getString("USER NAME");
                

            
            }
            if (usa.equals(mobo)){
//                JOptionPane.showMessageDialog(null,"hello");
                
            x=r.nextInt(10000000);
            JOptionPane.showMessageDialog(null,x);
            otp=JOptionPane.showInputDialog("Enter the OTP");
            if(otp.equals(""+x))
            {
                jTextField23.setEnabled(true);
                jButton39.setEnabled(true);
                 //LoginClass.setL_chk("1");
            }
                }
                else
        {
            JOptionPane.showMessageDialog(null, "Enter Valid Mobile Number");
        }
         }catch(Exception e)
                    {
                    
                    }
//        if(mobo.equals(mob))
//        {
////            jTextField20.setEnabled(true);
//            
//           
//            
//        }
        
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        jButton39.setEnabled(true);
        if(!jTextField23.getText().equals(null))
        {
        
        JOptionPane.showMessageDialog(null,"Your Payment is Done Thanks For Your Response");
        jTextField21.setText(null);
        jTextField22.setText(null);
        jTextField23.setText(null);
        jComboBox5.setSelectedItem(null);
        MAINPANEL.setVisible(false);
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        mainzion.setVisible(true);
        
        }
        else
        {
            //jButton39.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Firstly Enter the Payment");
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton5pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5pActionPerformed
        // TODO add your handling code here:
        MAINPANEL.setVisible(true);
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton5pActionPerformed

    private void jButton2pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2pActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(true);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false); 
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton2pActionPerformed

    private void jButton4pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4pActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(true);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false); 
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton4pActionPerformed

    private void jButton1pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1pActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(true);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false); 
        mainzion.setVisible(false);
    }//GEN-LAST:event_jButton1pActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
        jPanel32.setVisible(false);
        jPanel40.setVisible(false);
        jPanel20.setVisible(false);
        jPanel38.setVisible(false);
        restraunt.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        menubhavika.setVisible(false);
        MAINPANEL.setVisible(false); 
        mainzion.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"CONTACT US HERE:0175-245673");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void callActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callActionPerformed
        // TODO add your handling code here:
     JOptionPane.showMessageDialog(null,"CONTACT US HERE:0175-245673");
    }//GEN-LAST:event_callActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zion().setVisible(true);

            }
        });
    }
//    public class zion extends Applet implements Runnable{
//        
//String s=jLabel2.setText("WELCOME TO ZION'S RESTRAUNT");
//          public void paint (Graphics g){
//                g.drawString(s,20,30);
//            }
//              public void run(){
//                while(true){
//                    Char c=s.CharAt(0);
//                    s=s.substring(1);
//                    s=s+c;
//                    try{
//                        Thread.sleep(500);
//                  
//                   }
//                    catch(Exception h){
//                       System.out.println(h);
//                   }
//                    repaint();
//                }
//           }
//            public void start(){
//                Thread t=new Thread(this);
//                t.start();
//            }
//               


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAINPANEL;
    private javax.swing.JPanel RESERVEROOM;
    private javax.swing.JPanel RESERVEYOURROOMNOW;
    private javax.swing.JPanel ROOMDEATILSROOMS;
    private javax.swing.JPanel ROOMDETAILS;
    private javax.swing.JPanel ROOMDETAILSPRICE;
    private javax.swing.JPanel ROOMDETAILSSPECIFIC;
    private javax.swing.JPanel WELCOME;
    private javax.swing.JPanel aboutus;
    private javax.swing.JButton bhavikamenu;
    private javax.swing.JButton birthday;
    private javax.swing.JButton blog;
    private javax.swing.JButton booknow;
    private java.awt.Button button1;
    private javax.swing.JButton call;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check10;
    private javax.swing.JCheckBox check11;
    private javax.swing.JCheckBox check12;
    private javax.swing.JCheckBox check13;
    private javax.swing.JCheckBox check14;
    private javax.swing.JCheckBox check15;
    private javax.swing.JCheckBox check16;
    private javax.swing.JCheckBox check17;
    private javax.swing.JCheckBox check18;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private javax.swing.JCheckBox check7;
    private javax.swing.JCheckBox check8;
    private javax.swing.JCheckBox check9;
    private javax.swing.JPanel coroselp;
    private javax.swing.JLabel crausel;
    private javax.swing.JLabel crousel;
    private javax.swing.JPanel headingp;
    private javax.swing.JButton home;
    private javax.swing.JButton house;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton1p;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton2p;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton3p;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton4p;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton5p;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton7p;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel15p;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel16p;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel17p;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel18p;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel19p;
    private javax.swing.JLabel jLabel1p;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel20p;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel21p;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel22p;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel23p;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel24p;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel25p;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel26p;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel27p;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel2p;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabel9p;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel10p;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel11p;
    private javax.swing.JPanel jPanel12p;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel4p;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel6p;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8p;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker3;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker4;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label27;
    private java.awt.Label label29;
    private java.awt.Label label3;
    private java.awt.Label label30;
    private java.awt.Label label31;
    private java.awt.Label label39;
    private java.awt.Label label4;
    private java.awt.Label label40;
    private java.awt.Label label41;
    private java.awt.Label label42;
    private java.awt.Label label43;
    private java.awt.Label label44;
    private java.awt.Label label45;
    private javax.swing.JPanel login;
    private javax.swing.JPanel mainzion;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menubhavika;
    private java.awt.Label menuheading;
    private javax.swing.JButton offers;
    private javax.swing.JLabel paneerlababdar;
    private javax.swing.JPanel partyp;
    private javax.swing.JButton photos;
    private javax.swing.JLabel rate1;
    private javax.swing.JLabel rate10;
    private javax.swing.JLabel rate11;
    private javax.swing.JLabel rate12;
    private javax.swing.JLabel rate13;
    private javax.swing.JLabel rate14;
    private javax.swing.JLabel rate15;
    private javax.swing.JLabel rate16;
    private javax.swing.JLabel rate17;
    private javax.swing.JLabel rate18;
    private javax.swing.JLabel rate2;
    private javax.swing.JLabel rate3;
    private javax.swing.JLabel rate4;
    private javax.swing.JLabel rate5;
    private javax.swing.JLabel rate6;
    private javax.swing.JLabel rate7;
    private javax.swing.JLabel rate8;
    private javax.swing.JLabel rate9;
    private javax.swing.JPanel reservetable;
    private javax.swing.JPanel restraunt;
    private javax.swing.JPanel restro;
    private javax.swing.JPanel roomp;
    private javax.swing.JButton sale;
    private javax.swing.JPanel signup;
    private javax.swing.JLabel thankyou;
    private javax.swing.JLabel zionrestraunt;
    // End of variables declaration//GEN-END:variables
class abc extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
      
        int j=1;
        BufferedImage bim1=ImageIO.read(new File("src\\images\\marriage_pic1.jpg"));
               Image img1 = bim1.getScaledInstance(crousel.getWidth(), crousel.getHeight(), Image.SCALE_DEFAULT);
               crousel.setIcon(new ImageIcon(img1));
               try
               {
                   Thread.sleep(1000);
                   jPanel25.setVisible(true);
                   
               }
               catch(Exception e)
               {
                   System.out.println(e);
               }
   
        while(true)
        {
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\ph"+j+".jpg"));
               Image img = bim.getScaledInstance(crousel.getWidth(), crousel.getHeight(), Image.SCALE_DEFAULT);
               crousel.setIcon(new ImageIcon(img));
               Thread.sleep(1500);
               
               j++;
               if(j==4)
               {
                   j=1;
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
      
        
    }
    }
class def extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        int k=1;
       
        while(true)
        {
            
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\label"+k+".jpg"));
               Image img = bim.getScaledInstance(jLabel52.getWidth(), jLabel52.getHeight(), Image.SCALE_DEFAULT);
               jLabel52.setIcon(new ImageIcon(img));
               Thread.sleep(2300);
               k++;
               if(k==4)
               {
                   k=1;
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
    }
    }
class ghi extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        int i=1;
        while(true)
        {
            
        
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\haldi"+i+".jpg"));
               Image img = bim.getScaledInstance(jLabel53.getWidth(), jLabel53.getHeight(), Image.SCALE_DEFAULT);
               jLabel53.setIcon(new ImageIcon(img));
               Thread.sleep(3000);
               i++;
               if(i==5)
               {
                   i=1;
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
    }}
class jkl extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        int l=1;
        while(true)
        {
            
        
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\birthday"+l+".jpg"));
               Image img = bim.getScaledInstance(jLabel54.getWidth(), jLabel54.getHeight(), Image.SCALE_DEFAULT);
               jLabel54.setIcon(new ImageIcon(img));
               Thread.sleep(4000);
               l++;
               if(l==4)
               {
                   l=1;
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
    }}
class mno extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        int m=1;
        while(true)
        {
            
        
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\room_food"+m+".jpg"));
               Image img = bim.getScaledInstance(jLabel55.getWidth(), jLabel55.getHeight(), Image.SCALE_DEFAULT);
               jLabel55.setIcon(new ImageIcon(img));
               Thread.sleep(5000);
               m++;
               if(m==4)
               {
                   m=1;
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
        }
        
    }
class blog extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        int k=1;
        while(true)
        {
            
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\blog"+k+".jpg"));
               Image img = bim.getScaledInstance(jLabel47.getWidth(), jLabel47.getHeight(), Image.SCALE_DEFAULT);
               jLabel47.setIcon(new ImageIcon(img));
               Thread.sleep(9300);
               k++;
               if(k==3)
               {
                   k=1;
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
    }
    }
class blogs extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        int k=1;
        while(true)
        {
            System.out.println("hiiiii");
            
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\blogs"+k+".jpg"));
               Image img = bim.getScaledInstance(jLabel48.getWidth(), jLabel48.getHeight(), Image.SCALE_DEFAULT);
               jLabel48.setIcon(new ImageIcon(img));
               Thread.sleep(8300);
               k++;
               if(k==3)
               {
                   k=1;
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
    }
    }
class blogss extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        int k=1;
        while(true)
        {
            
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\b"+k+".jpg"));
               Image img = bim.getScaledInstance(jLabel49.getWidth(), jLabel49.getHeight(), Image.SCALE_DEFAULT);
               jLabel49.setIcon(new ImageIcon(img));
               Thread.sleep(7300);
               k++;
               if(k==3)
               {
                   k=1;
               }
           }
           catch(Exception e)
           {
              e.printStackTrace();
           }
        }
    }
    }
class blogsss extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        int k=1;
        while(true)
        {
            
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\blogsss"+k+".jpg"));
               Image img = bim.getScaledInstance(jLabel50.getWidth(), jLabel50.getHeight(), Image.SCALE_DEFAULT);
               jLabel50.setIcon(new ImageIcon(img));
               Thread.sleep(6300);
               k++;
               if(k==3)
               {
                   k=1;
               }
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
        }
    }
    }
class bhavika extends SwingWorker<Object, Object>{

    @Override
    protected Object doInBackground() throws Exception {
        int k=1;
        while(true)
        {
            
           try
           {
               BufferedImage bim=ImageIO.read(new File("src\\images\\bi"+k+".jpg"));
               Image img = bim.getScaledInstance(crausel.getWidth(), crausel.getHeight(), Image.SCALE_DEFAULT);
               crausel.setIcon(new ImageIcon(img));
               Thread.sleep(1500);
               k++;
               if(k==4)
               {
                   k=1;
               }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
        }
    }
    }

 class parul_Banner extends SwingWorker<Object, Object>
    {

        @Override
        protected Object doInBackground() throws Exception {
            int i=1;
//            System.out.println("hiiiii");
            while(true)
            {
              
                try {
                 BufferedImage bim =   ImageIO.read(new File("src\\images\\p_room"+i+".jpg"));
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
class bbc extends SwingWorker<Object, Object>
    {

        @Override
        protected Object doInBackground() throws Exception {
            int i=1;
//            System.out.println("hiiiii");
            while(true)
            {
              
                try {
                 BufferedImage bim =   ImageIO.read(new File("src\\images\\parul"+i+".jpeg"));
                 Image img = bim.getScaledInstance(jLabel2p.getWidth(), jLabel2p.getHeight(), Image.SCALE_DEFAULT);
                 jLabel2p.setIcon(new ImageIcon(img));
                 Thread.sleep(1000);
                 i++;
                 if(i==4)
                     i=1;
        
                } catch (Exception e) {
                }
                
                
            }
        }
    }

}
//bhavika pagal