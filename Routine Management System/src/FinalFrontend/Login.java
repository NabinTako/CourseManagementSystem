package FinalFrontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;

public class Login {

	private JFrame frame;
	private JTextField userNameTextField;
	private JPasswordField passwordField;
	static String valueFromComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(550, 200, 500, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 23, SpringLayout.NORTH, frame.getContentPane());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -12, SpringLayout.NORTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 68, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -122, SpringLayout.EAST, frame.getContentPane());
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(Login.class.getResource("/images/userName.png")).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		lblNewLabel_1.setIcon(imageIcon);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		userNameTextField = new JTextField();
		userNameTextField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(255, 255, 255), new Color(255, 255, 255)));
		springLayout.putConstraint(SpringLayout.NORTH, userNameTextField, 6, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, userNameTextField, 184, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, userNameTextField, -32, SpringLayout.EAST, frame.getContentPane());
		userNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(userNameTextField);
		userNameTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Password");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, -123, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ImageIcon passImg = new ImageIcon(new ImageIcon(Login.class.getResource("/images/passWord.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		lblNewLabel_2.setIcon(passImg);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), Color.WHITE, Color.WHITE));
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 182, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -6, SpringLayout.NORTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 184, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -46, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(passwordField);
		passwordField.setEchoChar('\u002A');
		passwordField.setFont(passwordField.getFont().deriveFont(Font.BOLD, 20f));
		
		JLabel lblNewLabel_3 = new JLabel("User Type");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.GRAY, Color.WHITE, Color.WHITE));
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -6, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, -35, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, userNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, -53, SpringLayout.EAST, frame.getContentPane());
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					valueFromComboBox = (String) e.getItem();
					System.out.print(valueFromComboBox);
				}
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select User", "Admin", "Landlord", "Tenant"}));
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Login");
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox, -33, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, -205, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -108, SpringLayout.EAST, frame.getContentPane());
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.GRAY, Color.WHITE, Color.WHITE));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(userNameTextField.getText().equals("admin") && Arrays.equals(passwordField.getPassword(),new char[] {'a','d','m','i','n'}) && valueFromComboBox.equals("Admin")) {
//					AdminPannel window = new AdminPannel();
//					window.getFrmNAdminPannel().setVisible(true);
//					frame.dispose();
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 0, SpringLayout.NORTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_4, 2, SpringLayout.EAST, passwordField);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -7, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_4, -10, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			boolean isShown=false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(isShown == false) {
					ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(Login.class.getResource("/images/HIdePassWord.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
					lblNewLabel_4.setIcon(imageIcon1);
					passwordField.setEchoChar((char)0);
					isShown = true;
				}else {
					ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(Login.class.getResource("/images/seePassWord.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
					lblNewLabel_4.setIcon(imageIcon1);
//					passwordField.setEchoChar('.');
					passwordField.setEchoChar('\u002A');	
					passwordField.setFont(passwordField.getFont().deriveFont(Font.BOLD, 20f));
					isShown = false;
				}
			}
		});
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().add(lblNewLabel_4);
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(Login.class.getResource("/images/seePassWord.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		lblNewLabel_4.setIcon(imageIcon1);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 81, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, userNameTextField);
		panel.setBackground(SystemColor.textHighlight);
		frame.getContentPane().add(panel);
	}
}
