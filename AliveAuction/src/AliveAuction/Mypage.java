package AliveAuction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mypage {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Mypage window = new Mypage();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public Mypage() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
     DAO dao = new DAO();
      frame = new JFrame();
      frame.getContentPane().setBackground(Color.WHITE);
      frame.setBounds(100, 100, 827, 612);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.WHITE);
      panel.setBounds(252, 23, 317, 54);
      frame.getContentPane().add(panel);
      panel.setLayout(new CardLayout(0, 0));
      
      JLabel lblNewLabel = new JLabel("\uB9C8\uC774\uD398\uC774\uC9C0");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 24));
      panel.add(lblNewLabel, "name_1391796929734700");
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(new Color(255, 255, 255));
      panel_1.setBounds(78, 99, 301, 38);
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lab_myid = new JLabel("~\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
      lab_myid.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
      lab_myid.setBounds(94, 10, 161, 18);
      panel_1.add(lab_myid);
      lab_myid.setText(Login.input_id2 + "´Ô È¯¿µÇÕ´Ï´Ù.");
      
      JPanel panel_2 = new JPanel();
      panel_2.setBackground(new Color(255, 255, 255));
      panel_2.setBounds(570, 99, 159, 38);
      frame.getContentPane().add(panel_2);
      panel_2.setLayout(null);
      
      JLabel lab_credit = new JLabel("\uC2E0\uC6A9\uC810\uC218 ");
      lab_credit.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
      lab_credit.setBounds(12, 10, 123, 18);
      panel_2.add(lab_credit);
      lab_credit.setText(dao.selectCreditScore(Login.input_id2));
      
      JPanel panel_3 = new JPanel();
      panel_3.setBackground(new Color(255, 255, 255));
      panel_3.setBounds(410, 99, 159, 38);
      frame.getContentPane().add(panel_3);
      panel_3.setLayout(null);
      
      JLabel label = new JLabel("\uC2E0\uC6A9\uC810\uC218 : ");
      label.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
      label.setBounds(46, 10, 80, 15);
      panel_3.add(label);
      
      JPanel panel_4 = new JPanel();
      panel_4.setBackground(new Color(230, 230, 250));
      panel_4.setBounds(79, 160, 650, 38);
      frame.getContentPane().add(panel_4);
      panel_4.setLayout(new CardLayout(0, 0));
      
      JLabel label_1 = new JLabel("\uCC1C\uD55C\uC0C1\uD488");
      label_1.setBackground(new Color(230, 230, 250));
      label_1.setHorizontalAlignment(SwingConstants.CENTER);
      label_1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 18));
      panel_4.add(label_1, "name_1391740533121400");
      
      JPanel panel_5 = new JPanel();
      panel_5.setBackground(new Color(255, 255, 255));
      panel_5.setBounds(78, 208, 159, 116);
      frame.getContentPane().add(panel_5);
      panel_5.setLayout(new CardLayout(0, 0));
      
      JLabel lab_picture1 = new JLabel("\uC0AC\uC9C41");
      lab_picture1.setHorizontalAlignment(SwingConstants.CENTER);
      lab_picture1.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uD310\uB9E4\uB4F1\uB85D_\uC774\uBBF8\uC9C0\\\uC9C0\uAC11.png"));
      panel_5.add(lab_picture1, "name_1198833233536400");
      
      JPanel panel_6 = new JPanel();
      panel_6.setBackground(new Color(255, 255, 255));
      panel_6.setBounds(410, 208, 159, 116);
      frame.getContentPane().add(panel_6);
      panel_6.setLayout(new CardLayout(0, 0));
      
      JLabel lbl_picture2 = new JLabel("\uC0AC\uC9C42");
      lbl_picture2.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\\uD310\uB9E4\uB4F1\uB85D_\uC774\uBBF8\uC9C0\\\uADC0\uAC78\uC774.png"));
      lbl_picture2.setHorizontalAlignment(SwingConstants.CENTER);
      panel_6.add(lbl_picture2, "name_1199238415021100");
      
      JPanel panel_7 = new JPanel();
      panel_7.setBackground(new Color(248, 248, 255));
      panel_7.setBounds(249, 208, 149, 116);
      frame.getContentPane().add(panel_7);
      panel_7.setLayout(null);
      
      JLabel lab_pro_title1 = new JLabel("\uAD6C\uCC0C \uC9C0\uAC11 \uD314\uC544\uC694");
      lab_pro_title1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
      lab_pro_title1.setBounds(0, 24, 120, 15);
      panel_7.add(lab_pro_title1);
      
      JLabel lbl_price1 = new JLabel("\uAC00\uACA9");
      lbl_price1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
      lbl_price1.setBounds(10, 58, 57, 15);
      panel_7.add(lbl_price1);
      
      JLabel lab_price_contents1 = new JLabel("500.000\uC6D0");
      lab_price_contents1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
      lab_price_contents1.setBounds(10, 77, 152, 15);
      panel_7.add(lab_price_contents1);
      
      JPanel panel_8 = new JPanel();
      panel_8.setBackground(new Color(248, 248, 255));
      panel_8.setLayout(null);
      panel_8.setBounds(581, 208, 148, 116);
      frame.getContentPane().add(panel_8);
      
      JLabel lab_pro_title2 = new JLabel("\uC2A4\uC648\uB85C\uBE0C\uC2A4\uD0A4 \uADC0\uAC78\uC774 \uD31C!");
      lab_pro_title2.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
      lab_pro_title2.setBounds(0, 21, 144, 15);
      panel_8.add(lab_pro_title2);
      
      JLabel lab_price2 = new JLabel("\uAC00\uACA9");
      lab_price2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
      lab_price2.setBounds(12, 57, 72, 15);
      panel_8.add(lab_price2);
      
      JLabel lab_price_contents2 = new JLabel("99.000\uC6D0");
      lab_price_contents2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
      lab_price_contents2.setBounds(12, 78, 152, 15);
      panel_8.add(lab_price_contents2);
   
      
      JPanel panel_9 = new JPanel();
      panel_9.setBackground(new Color(230, 230, 250));
      panel_9.setLayout(null);
      panel_9.setBounds(78, 351, 159, 38);
      frame.getContentPane().add(panel_9);
      
      JLabel label_6 = new JLabel("\uAD6C\uB9E4\uBAA9\uB85D");
      label_6.setHorizontalAlignment(SwingConstants.CENTER);
      label_6.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 18));
      label_6.setBounds(34, 10, 92, 18);
      panel_9.add(label_6);
      
      JPanel panel_10 = new JPanel();
      panel_10.setBackground(new Color(230, 230, 250));
      panel_10.setLayout(null);
      panel_10.setBounds(410, 351, 159, 38);
      frame.getContentPane().add(panel_10);
      
      JLabel label_7 = new JLabel("\uD310\uB9E4\uBAA9\uB85D");
      label_7.setHorizontalAlignment(SwingConstants.CENTER);
      label_7.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 18));
      label_7.setBounds(34, 10, 92, 18);
      panel_10.add(label_7);
      
      
      String[] buyList = new String[dao.columnCountBuyList(Login.input_id2)];
      for (int i = 0; i < buyList.length; i++) {
      buyList[i] = dao.selectBuyList(Login.input_id2,i);
   }
      
      JList buy_list = new JList(buyList);
      buy_list.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      buy_list.setBounds(78, 399, 320, 75);
      frame.getContentPane().add(buy_list);
      
      
      String [] sellList = new String [dao.columnCountSellList(Login.input_id2)];
      for (int i = 0; i < sellList.length; i++) {
      sellList[i] = dao.selectSellList(Login.input_id2, i);
   }
      
      
      JList sell_list = new JList(sellList);
      sell_list.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 14));
      sell_list.setBounds(410, 399, 319, 75);
      frame.getContentPane().add(sell_list);
      
      JPanel panel_11 = new JPanel();
      panel_11.setBounds(319, 505, 159, 38);
      frame.getContentPane().add(panel_11);
      panel_11.setLayout(new CardLayout(0, 0));
      
      JButton btnNewButton = new JButton("New button");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		frame.dispose();
      	}
      });
      btnNewButton.setIcon(new ImageIcon("C:\\Users\\SM18\\Desktop\\¾ó¶óÀÌºê¿Á¼Ç\\¹öÆ°ÀÌ¹ÌÁö\\¹öÆ°_·Î±×ÀÎ_´Ý±â.png"));
      btnNewButton.setOpaque(false);
      btnNewButton.setBorderPainted(false);
      panel_11.add(btnNewButton, "name_1391517305674300");
   }
}
