package Default;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Login extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	int xx,xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setUndecorated(true);
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
		frame.setBounds(100, 100, 735, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 0, 329, 491);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx =e.getX();
				xy =e.getY();
			}
		});
		lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				Login.this.setLocation(x-xx,y-xy);
			}
		});
		lblNewLabel_1.setBounds(35, 0, 221, 223);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/images/GameDesign.png")));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Keep Too");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(111, 265, 97, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("We got you");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(98, 313, 131, 24);
		panel.add(lblNewLabel_1_1_1);
		
		Button button = new Button("Sign Up");
		button.setBackground(new Color(95, 158, 160));
		button.setBounds(389, 424, 248, 34);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(389, 120, 248, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(389, 95, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Email");
		lblPassword.setBounds(389, 176, 63, 14);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(389, 201, 248, 34);
		frame.getContentPane().add(textField_1);
		
		JLabel lblAsdsa = new JLabel("Password");
		lblAsdsa.setBounds(389, 257, 63, 14);
		frame.getContentPane().add(lblAsdsa);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setBounds(389, 333, 101, 14);
		frame.getContentPane().add(lblConfirmPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(389, 288, 248, 34);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(389, 358, 248, 34);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("X");
		lblNewLabel_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(656, 0, 63, 24);
		frame.getContentPane().add(lblNewLabel_1_1_2);
	}
}
