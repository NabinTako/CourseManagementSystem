package frontEnd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
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

public class LoginApp {

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
					LoginApp window = new LoginApp();
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
	public LoginApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(550, 200, 500, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Welcome To TMS");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 26, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 132, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 59, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -147, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		userNameTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 3, SpringLayout.NORTH, userNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -29, SpringLayout.WEST, userNameTextField);
		springLayout.putConstraint(SpringLayout.NORTH, userNameTextField, 36, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, userNameTextField, -292, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, userNameTextField, -24, SpringLayout.EAST, frame.getContentPane());
		userNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(userNameTextField);
		userNameTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 41, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, -1, SpringLayout.NORTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, userNameTextField);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, 62, SpringLayout.SOUTH, userNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 0, SpringLayout.EAST, userNameTextField);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Select user");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 50, SpringLayout.SOUTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel_1);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					valueFromComboBox = (String) e.getItem();
					System.out.print(valueFromComboBox);
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 42, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 32, SpringLayout.EAST, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, -76, SpringLayout.EAST, frame.getContentPane());
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select User", "Admin", "Landlord", "Tenant"}));
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(userNameTextField.getText().equals("admin") && Arrays.equals(passwordField.getPassword(),new char[] {'a','d','m','i','n'}) && valueFromComboBox.equals("Admin")) {
					AdminPannel window = new AdminPannel();
					window.getFrmNAdminPannel().setVisible(true);
					frame.dispose();
					
				}
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 179, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, frame.getContentPane());
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton);
	}
}
