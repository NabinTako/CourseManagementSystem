package FinalFrontend;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TeacherDashnoard {

	private JFrame frmTeacher;
	private JPanel panelRight;
	private CardLayout layouts = new CardLayout(0, 0);
	private JButton btnDashboard;
	private JButton btnStudent;
	private JTable table;
	private JButton btnGiveMarks;
	private JTable ClassTimeTable;

	

	public JFrame getFrame() {
		return frmTeacher;
	}
	
	public void activeBtn(int R,int G,int B,String id) {
		btnDashboard.setBackground(new Color(153,180,209));
		btnStudent.setBackground(new Color(153,180,209));
		btnGiveMarks.setBackground(new Color(153,180,209));
		if(id.equals("DbBtn")) {
			btnDashboard.setBackground(new Color(R,G,B));
		}else if(id.equals("StdBtn")) {
			btnStudent.setBackground(new Color(R,G,B));
		}else if(id.equals("MarkBtn")){
			btnGiveMarks.setBackground(new Color(R,G,B));
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
					window.frmTeacher.setVisible(true);
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
		frmTeacher = new JFrame();
		frmTeacher.setTitle("Teacher");
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 784, 561);
		frmTeacher.setBounds(550, 200, 800, 600);
		JSplitPane SplitPane = new JSplitPane();
		SplitPane.setDividerSize(0);
		frmTeacher.setContentPane(SplitPane);
		
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
				Object[] options= {"Yes","No"};
				int optionSelected=JOptionPane.showOptionDialog(null, "Are you sure you want to logout?", "Confirm Logout",
						JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
				System.out.println(optionSelected);
				if(optionSelected==0) {
					Login window = new Login();
					window.getFrame().setVisible(true);
					frmTeacher.dispose();
				}
			}
		});
		btnLogout.setFont(new Font("Arial", Font.ITALIC, 15));
		btnLogout.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnLogout.setBackground(SystemColor.activeCaption);
		
		btnGiveMarks = new JButton("Give Marks");
		btnGiveMarks.setBackground(new Color(153,180,209));
		btnGiveMarks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activeBtn(241,241,240,"MarkBtn");
				layouts.show(panelRight, "name_211141438603200");
				
			}
		});
		ImageIcon ResultImg = new ImageIcon(new ImageIcon(AdminDashboard.class.getResource("/images/result.png")).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
		btnGiveMarks.setIcon(ResultImg);
		btnGiveMarks.setFont(new Font("Arial", Font.ITALIC, 15));
		btnGiveMarks.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnGiveMarks.setBackground(SystemColor.activeCaption);
		
		JButton btnAssignment = new JButton("Assignment");
		btnAssignment.setFont(new Font("Arial", Font.ITALIC, 15));
		btnAssignment.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnAssignment.setBackground(new Color(241, 241, 240));
		
		GroupLayout gl_panelLeft = new GroupLayout(panelLeft);
		gl_panelLeft.setHorizontalGroup(
			gl_panelLeft.createParallelGroup(Alignment.LEADING)
				.addComponent(btnDashboard, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
				.addGroup(gl_panelLeft.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_panelLeft.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblWelcome)
						.addComponent(Icon))
					.addContainerGap(40, Short.MAX_VALUE))
				.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
				.addComponent(btnGiveMarks, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
				.addComponent(btnStudent, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
				.addGroup(gl_panelLeft.createSequentialGroup()
					.addComponent(btnAssignment, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
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
					.addGap(35)
					.addComponent(btnStudent, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnGiveMarks, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnAssignment, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
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
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_DashBoard = new GroupLayout(DashBoard);
		gl_DashBoard.setHorizontalGroup(
			gl_DashBoard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DashBoard.createSequentialGroup()
					.addGroup(gl_DashBoard.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_DashBoard.createSequentialGroup()
							.addGap(293)
							.addComponent(lblNewLabel))
						.addGroup(gl_DashBoard.createSequentialGroup()
							.addGap(34)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_DashBoard.setVerticalGroup(
			gl_DashBoard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_DashBoard.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel)
					.addGap(65)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(67, Short.MAX_VALUE))
		);
		
		ClassTimeTable = new JTable();
		
		ClassTimeTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"L4CG2", "10AM", "TR-02", "WLV"},
				{"L5CG6", "1:30 PM", "Lab 05", "HCK"},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Class", "Time", "ClassRoom", "Block"
			}
		));
		ClassTimeTable.getColumnModel().getColumn(2).setPreferredWidth(82);
		scrollPane_1.setViewportView(ClassTimeTable);
		DashBoard.setLayout(gl_DashBoard);
		
		JPanel Student = new JPanel();
		panelRight.add(Student, "name_169311108756800");
		
		JLabel lblNewLabel_1 = new JLabel("Students");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_Student = new GroupLayout(Student);
		gl_Student.setHorizontalGroup(
			gl_Student.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Student.createSequentialGroup()
					.addGroup(gl_Student.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Student.createSequentialGroup()
							.addGap(293)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_Student.createSequentialGroup()
							.addGap(25)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 578, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_Student.setVerticalGroup(
			gl_Student.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Student.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_1)
					.addGap(56)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(108, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"nami", null, "female", "Berry@newWorld.com"},
				{"Robin", null, "female", "Devil@friends.com"},
				{"Zorro", null, "male", "Alwayslost@places.com"},
				{"Sanji", null, "male", "best@cooking.com"},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"First Name", "Last Name", "Sex", "Email"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(133);
		table.setFont(new Font("Arial", Font.ITALIC, 15));
		scrollPane.setViewportView(table);
		Student.setLayout(gl_Student);
		
		JPanel Marks = new JPanel();
		panelRight.add(Marks, "name_211141438603200");
		
		JPanel Assignment = new JPanel();
		panelRight.add(Assignment, "name_337793314841900");
		SplitPane.setDividerLocation(150);
		frmTeacher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
