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

import FinalBackend.Std_info;
import FinalBackend.Teacher_info;
import FinalBackend.admin_info;

import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Window.Type;

public class Login {
	//associations +++++++++++++++++++++++++++++++++++++++++

	admin_info adminInfo = new admin_info();
	Teacher_info teacher_info = new Teacher_info();
	Std_info std_info = new Std_info();
	
	// ++++++++++++++++++++++++++++++++++++++++++++++++
	

	private JFrame frame;

	private JTextField userNameTextField;
	private JPasswordField passwordField;
	static String valueFromComboBox;
	private JLabel ErroeLabel;
	private JLabel lblNewLabel_5;

	
	private int size =15;
	
	public JFrame getFrame() {
		return frame;
	}
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
		frame.setType(Type.UTILITY);
		frame.setResizable(false);
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(550, 200, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 20, SpringLayout.NORTH, frame.getContentPane());
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(Login.class.getResource("/images/userName.png")).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		lblNewLabel_1.setIcon(imageIcon);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1);
		
		userNameTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, userNameTextField, 6, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, userNameTextField, -28, SpringLayout.EAST, frame.getContentPane());
		userNameTextField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(255, 255, 255), new Color(255, 255, 255)));
		userNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(userNameTextField);
		userNameTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Password");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 6, SpringLayout.SOUTH, userNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel_1);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ImageIcon passImg = new ImageIcon(new ImageIcon(Login.class.getResource("/images/passWord.png")).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		lblNewLabel_2.setIcon(passImg);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 6, SpringLayout.SOUTH, lblNewLabel_2);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 0, SpringLayout.WEST, userNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -42, SpringLayout.EAST, frame.getContentPane());
		passwordField.setColumns(10);
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), Color.WHITE, Color.WHITE));
		frame.getContentPane().add(passwordField);
		passwordField.setEchoChar('*');
		passwordField.setFont(passwordField.getFont().deriveFont(Font.BOLD, 20f));
		
		JLabel lblNewLabel_3 = new JLabel("User Type");
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, -39, SpringLayout.NORTH, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, lblNewLabel_1);
		ImageIcon SelectUserImg = new ImageIcon(new ImageIcon(Login.class.getResource("/images/selectUser.png")).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		lblNewLabel_3.setIcon(SelectUserImg);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -14, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 214, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, comboBox, -37, SpringLayout.EAST, frame.getContentPane());
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.GRAY, Color.WHITE, Color.WHITE));
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					valueFromComboBox = (String) e.getItem();
				}
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select User", "Admin", "Teacher", "Student"}));
		comboBox.setSelectedIndex(0);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Login");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, -205, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -108, SpringLayout.EAST, frame.getContentPane());
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.GRAY, Color.WHITE, Color.WHITE));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
						
					if(valueFromComboBox.equals("Student")) {
						for(int i=0;i<std_info.getSize();i++) {
				if(userNameTextField.getText().equals(std_info.getUserName(i)) && String.valueOf(passwordField.getPassword()).equals(std_info.getPassWord(i)) && valueFromComboBox.equals("Student")) {
					studentDashboard window = new studentDashboard();
					window.getFrame().setVisible(true);
					frame.dispose();
				} else if(!userNameTextField.getText().equals(std_info.getUserName(i)) || !String.valueOf(passwordField.getPassword()).equals(std_info.getPassWord(i)) ){
					ErroeLabel.setFont(new Font("Arial", Font.BOLD, size));
					ErroeLabel.setVisible(true);
					lblNewLabel_5.setVisible(false);
					size+=1;
				}else if (userNameTextField.getText().equals(std_info.getUserName(i)) && String.valueOf(passwordField.getPassword()).equals(std_info.getPassWord(i)) && !valueFromComboBox.equals("Student")) {
					lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, size));
					ErroeLabel.setVisible(false);
					lblNewLabel_5.setVisible(true);
					size +=1;
				}}
				}else if(valueFromComboBox.equals("Admin")) {
					for(int i=0;i<adminInfo.getDtaNumber();i++) {
				if(userNameTextField.getText().equals(adminInfo.getUserName(i)) && String.valueOf(passwordField.getPassword()).equals(adminInfo.getPassWord(i)) && valueFromComboBox.equals("Admin")) {
					AdminDashboard window = new AdminDashboard();
					window.getFrame().setVisible(true);
					frame.dispose();
				} else if(!userNameTextField.getText().equals(adminInfo.getUserName(i)) || !String.valueOf(passwordField.getPassword()).equals(adminInfo.getPassWord(i))){
					ErroeLabel.setFont(new Font("Arial", Font.BOLD, size));
					ErroeLabel.setVisible(true);
					lblNewLabel_5.setVisible(false);
					size+=1;
				}else if (userNameTextField.getText().equals(adminInfo.getUserName(i)) && String.valueOf(passwordField.getPassword()).equals(adminInfo.getPassWord(i)) && !valueFromComboBox.equals("Admin")) {
					lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, size));
					ErroeLabel.setVisible(false);
					lblNewLabel_5.setVisible(true);
					size +=1;
					
				} }
				}else if(valueFromComboBox.equals("Teacher")) {
					for(int i=0;i<teacher_info.getSize();i++) {
					if(userNameTextField.getText().equalsIgnoreCase(teacher_info.getUserName(i)) && String.valueOf(passwordField.getPassword()).equals(teacher_info.getPassWord(i)) && valueFromComboBox.equals("Teacher")) {
						TeacherDashnoard window = new TeacherDashnoard();
						window.getFrame().setVisible(true);
						frame.dispose();
					} else if(!userNameTextField.getText().equals(teacher_info.getUserName(i)) || !String.valueOf(passwordField.getPassword()).equals(teacher_info.getPassWord(i))){
						ErroeLabel.setFont(new Font("Arial", Font.BOLD, size));
						ErroeLabel.setVisible(true);
						lblNewLabel_5.setVisible(false);
						size+=1;
					}else if (userNameTextField.getText().equals(teacher_info.getUserName(i)) && String.valueOf(passwordField.getPassword()).equals(teacher_info.getPassWord(i)) && !valueFromComboBox.equals("Teacher")) {
						lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, size));
						ErroeLabel.setVisible(false);
						lblNewLabel_5.setVisible(true);
						size +=1;
					}
					}
				}else {
					lblNewLabel_5.setVisible(true);
					ErroeLabel.setVisible(false);
				}

				if(size>=18) {
					size=15;
				}
				}catch(Exception err) {
					lblNewLabel_5.setVisible(true);
					ErroeLabel.setVisible(true);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 0, SpringLayout.NORTH, passwordField);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -220, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_4, 0, SpringLayout.EAST, frame.getContentPane());
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
					passwordField.setEchoChar('*');
					isShown = false;
				}
			}
		});
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().add(lblNewLabel_4);
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(Login.class.getResource("/images/seePassWord.png")).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		lblNewLabel_4.setIcon(imageIcon1);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 22, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_4, 272, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -306, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 88, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.WEST, userNameTextField, 10, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, frame.getContentPane());
		panel.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(panel);
		
		JLabel HomeImg = new JLabel("");
		ImageIcon loginImg = new ImageIcon(new ImageIcon(Login.class.getResource("/images/loginPic.png")).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		HomeImg.setIcon(loginImg);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 23, SpringLayout.NORTH, frame.getContentPane());
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -12, SpringLayout.NORTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 81, SpringLayout.EAST, panel);
		
		JLabel lblNewLabel1 = new JLabel("Course Management System");
		lblNewLabel1.setForeground(new Color(0, 0, 0));
		lblNewLabel1.setBackground(new Color(255, 255, 255));
		lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Arial", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(49)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(71)
							.addComponent(lblTo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(48, Short.MAX_VALUE))
				.addComponent(lblNewLabel1, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(HomeImg, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTo, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(HomeImg, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		ErroeLabel = new JLabel("Username or Password Wrong!!!");
		springLayout.putConstraint(SpringLayout.NORTH, ErroeLabel, 6, SpringLayout.SOUTH, passwordField);
		springLayout.putConstraint(SpringLayout.WEST, ErroeLabel, 0, SpringLayout.WEST, userNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, ErroeLabel, 0, SpringLayout.EAST, lblNewLabel_4);
		ErroeLabel.setVisible(false);
		ErroeLabel.setFont(new Font("Arial", Font.BOLD, 15));
		ErroeLabel.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(ErroeLabel);
		
		lblNewLabel_5 = new JLabel("Select Correct User Type!!!");
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_5, 0, SpringLayout.EAST, lblNewLabel_4);
		lblNewLabel_5.setVisible(false);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 6, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_5, 20, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_5, 31, SpringLayout.SOUTH, comboBox);
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_5);
	}
}
