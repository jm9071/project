package AliveAuction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class test2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test2 window = new test2();
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
	public test2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 671, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 172, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 100, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 290, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -163, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel label = new JLabel("\uBAA8\uC790");
		sl_panel.putConstraint(SpringLayout.WEST, label, 29, SpringLayout.WEST, panel);
		label.setFont(new Font("±¼¸²", Font.BOLD, 15));
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("\uAC00\uACA9");
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 185, SpringLayout.WEST, panel);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 15));
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 59, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, -40, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 29, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uAD6C\uB9E4\uD558\uAE30");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 23, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -27, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, btnNewButton);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, -122, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -21, SpringLayout.EAST, panel);
		panel.add(btnNewButton);
	}
}
