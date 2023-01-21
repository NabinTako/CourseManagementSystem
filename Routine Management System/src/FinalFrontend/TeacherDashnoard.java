package FinalFrontend;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TeacherDashnoard {

	private JFrame frame;
	private JPanel panelRight;
	private CardLayout layouts = new CardLayout(0, 0);
	private JButton btnDashboard;
	private JButton btnStudent;

	

	public JFrame getFrame() {
		return frame;
	}
	
	public void activeBtn(int R,int G,int B,String id) {
		btnDashboard.setBackground(new Color(153,180,209));
		btnStudent.setBackground(new Color(153,180,209));
		if(id.equals("DbBtn")) {
			btnDashboard.setBackground(new Color(R,G,B));
		}else if(id.equals("StdBtn")) {
			btnStudent.setBackground(new Color(R,G,B));
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherDashnoard window = new TeacherDashnoard();
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
	public TeacherDashnoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Student");
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 784, 561);
		frame.setBounds(550, 200, 800, 600);
		JSplitPane SplitPane = new JSplitPane();
		SplitPane.setDividerSize(0);
		frame.setContentPane(SplitPane);
		
		JPanel panelLeft = new JPanel();
		SplitPane.setLeftComponent(panelLeft);
		panelLeft.setBackground(SystemColor.activeCaption);
		

		JLabel Icon = new JLabel("");
		ImageIcon icon = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/systemIcon.png")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		Icon.setIcon(icon);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Arial", Font.ITALIC, 15));
		
		btnDashboard = new JButton("Dashboard");
		btnDashboard.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activeBtn(241,241,240,"DbBtn");
				layouts.show(panelRight, "name_168095261975300");
				
			}
		});
		ImageIcon BoardImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/dashBoardImg.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		btnDashboard.setIcon(BoardImg);
		btnDashboard.setFont(new Font("Arial", Font.ITALIC, 15));
		btnDashboard.setBackground(new Color(241,241,240));
		
		btnStudent = new JButton("Students");
		btnStudent.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				activeBtn(241,241,240,"StdBtn");
				layouts.show(panelRight, "name_169311108756800");
			}
		});
		ImageIcon stdImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/studentImg.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		btnStudent.setIcon(stdImg);
		btnStudent.setFont(new Font("Arial", Font.ITALIC, 15));
		btnStudent.setBackground(new Color(153,180,209));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(255, 250, 205));
		ImageIcon LogOutImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/logout.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		btnLogout.setIcon(LogOutImg);
		btnLogout.setFont(new Font("Arial", Font.ITALIC, 15));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login window = new Login();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Arial", Font.ITALIC, 15));
		btnLogout.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnLogout.setBackground(SystemColor.activeCaption);
		
		GroupLayout gl_panelLeft = new GroupLayout(panelLeft);
		gl_panelLeft.setHorizontalGroup(
			gl_panelLeft.createParallelGroup(Alignment.LEADING)
				.addComponent(btnStudent, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
				.addComponent(btnDashboard, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
				.addGroup(gl_panelLeft.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_panelLeft.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblWelcome)
						.addComponent(Icon))
					.addContainerGap(30, Short.MAX_VALUE))
				.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
		);
		gl_panelLeft.setVerticalGroup(
			gl_panelLeft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLeft.createSequentialGroup()
					.addGap(20)
					.addComponent(Icon)
					.addGap(18)
					.addComponent(lblWelcome)
					.addGap(69)
					.addComponent(btnDashboard, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(btnStudent, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(171)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panelLeft.setLayout(gl_panelLeft);
		
		panelRight = new JPanel();
		SplitPane.setRightComponent(panelRight);
		panelRight.setLayout(layouts);
		
		JPanel DashBoard = new JPanel();
		panelRight.add(DashBoard, "name_168095261975300");
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setFont(new Font("Arial", Font.ITALIC, 15));
		GroupLayout gl_DashBoard = new GroupLayout(DashBoard);
		gl_DashBoard.setHorizontalGroup(
			gl_DashBoard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DashBoard.createSequentialGroup()
					.addGap(293)
					.addComponent(lblNewLabel))
		);
		gl_DashBoard.setVerticalGroup(
			gl_DashBoard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DashBoard.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel))
		);
		DashBoard.setLayout(gl_DashBoard);
		
		JPanel Student = new JPanel();
		panelRight.add(Student, "name_169311108756800");
		
		JLabel lblNewLabel_1 = new JLabel("Students");
		GroupLayout gl_Student = new GroupLayout(Student);
		gl_Student.setHorizontalGroup(
			gl_Student.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Student.createSequentialGroup()
					.addGap(293)
					.addComponent(lblNewLabel_1))
		);
		gl_Student.setVerticalGroup(
			gl_Student.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Student.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_1))
		);
		Student.setLayout(gl_Student);
		SplitPane.setDividerLocation(150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
