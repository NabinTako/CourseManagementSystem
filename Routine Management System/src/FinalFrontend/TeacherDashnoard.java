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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import FinalBackend.Std_info;
import FinalBackend.uploadAssignment;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TeacherDashnoard {
	
	Std_info std_info;

	private JFrame frmTeacher;
	private JPanel panelRight;
	private CardLayout layouts = new CardLayout(0, 0);
	private JButton btnDashboard;
	private JButton btnStudent;
	private JTable table;
	private JButton btnGiveMarks;
	private JTable ClassTimeTable;

	
	DefaultTableModel stdTable =new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First Name", "Last Name", "Sex", "Email"
			}
		);
	DefaultTableModel assginmentModel = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First name", "Last Name", "level"
			}
		);
	private JButton btnAssignment;
	private JTable StdInfo;
	private JTextField assignmenttextField;
	private JTextField Q1textField;
	private JTextField Q2textField;
	private JTextField Q3textField;
	private JTextField Q4textField;
	
	private String ModuleSelected;
	

	public JFrame getFrame() {
		return frmTeacher;
	}
	
	public void activeBtn(int R,int G,int B,String id) {
		btnDashboard.setBackground(new Color(153,180,209));
		btnStudent.setBackground(new Color(153,180,209));
		btnGiveMarks.setBackground(new Color(153,180,209));
		btnAssignment.setBackground(new Color(153,180,209));
		if(id.equals("DbBtn")) {
			btnDashboard.setBackground(new Color(R,G,B));
		}else if(id.equals("StdBtn")) {
			btnStudent.setBackground(new Color(R,G,B));
		}else if(id.equals("MarkBtn")){
			btnGiveMarks.setBackground(new Color(R,G,B));
		}else if(id.equals("AssignmentBtn")){
			btnAssignment.setBackground(new Color(R,G,B));
		}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherDashnoard window = new TeacherDashnoard("h","L");
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
	public TeacherDashnoard(String Firstname,String Lastname) {
		initialize(Firstname,Lastname);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String Firstname,String Lastname) {
		String fullname = Firstname+Lastname;
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
				layouts.show(panelRight, "name_337793314841900");
				
			}
		});
		ImageIcon ResultImg = new ImageIcon(new ImageIcon(AdminDashboard.class.getResource("/images/result.png")).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
		btnGiveMarks.setIcon(ResultImg);
		btnGiveMarks.setFont(new Font("Arial", Font.ITALIC, 15));
		btnGiveMarks.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		
		btnAssignment = new JButton("Assignment");
		ImageIcon assignmentImg = new ImageIcon(new ImageIcon(AdminDashboard.class.getResource("/images/assignment.png")).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
		btnAssignment.setIcon(assignmentImg);
		btnAssignment.setBackground(new Color(153,180,209));
		btnAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layouts.show(panelRight, "name_211141438603200");
				activeBtn(241,241,240,"AssignmentBtn");
			}
		});
		btnAssignment.setFont(new Font("Arial", Font.ITALIC, 15));
		btnAssignment.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnGiveMarks.setBackground(new Color(153,180,209));
		
		JLabel Name = new JLabel("Welcome");
		Name.setText("<dynamic><dynamic>");
		Name.setFont(new Font("Arial", Font.ITALIC, 15));
		
		GroupLayout gl_panelLeft = new GroupLayout(panelLeft);
		gl_panelLeft.setHorizontalGroup(
			gl_panelLeft.createParallelGroup(Alignment.LEADING)
				.addComponent(btnDashboard, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
				.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
				.addComponent(btnGiveMarks, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
				.addComponent(btnStudent, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
				.addGroup(gl_panelLeft.createSequentialGroup()
					.addComponent(btnAssignment, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panelLeft.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_panelLeft.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblWelcome)
						.addComponent(Icon))
					.addContainerGap(50, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panelLeft.createSequentialGroup()
					.addComponent(Name, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelLeft.setVerticalGroup(
			gl_panelLeft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelLeft.createSequentialGroup()
					.addGap(20)
					.addComponent(Icon)
					.addGap(18)
					.addComponent(lblWelcome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Name, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
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
		DashBoard.setBackground(Color.LIGHT_GRAY);
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
		ClassTimeTable.setFont(new Font("Arial", Font.ITALIC, 15));
		
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
		ClassTimeTable.setDefaultEditor(Object.class, null);
		ClassTimeTable.getColumnModel().getColumn(2).setPreferredWidth(82);
		scrollPane_1.setViewportView(ClassTimeTable);
		DashBoard.setLayout(gl_DashBoard);
		
		JPanel Student = new JPanel();
		Student.setBackground(Color.LIGHT_GRAY);
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
		table.setModel(stdTable);
		std_info = new Std_info();
		for(int i=0;i<std_info.getSize();i++) {
			stdTable.addRow(new Object[] {std_info.getfirstName(i),std_info.getlastName(i),std_info.getSex(i),std_info.getEmail(i)});
		}
		table.setDefaultEditor(Object.class, null);
		table.getColumnModel().getColumn(3).setPreferredWidth(133);
		table.setFont(new Font("Arial", Font.ITALIC, 15));
		scrollPane.setViewportView(table);
		Student.setLayout(gl_Student);
		
		JPanel Assignment = new JPanel();
		Assignment.setBackground(Color.LIGHT_GRAY);
		panelRight.add(Assignment, "name_211141438603200");
		
		JLabel lblQ = new JLabel("Model name");
		lblQ.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblQuestion_1 = new JLabel("Question 1");
		lblQuestion_1.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblQuestion = new JLabel("Question 2");
		lblQuestion.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblQuestion_3 = new JLabel("Question 3");
		lblQuestion_3.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblQuestion_2_1 = new JLabel("Question 4");
		lblQuestion_2_1.setFont(new Font("Arial", Font.ITALIC, 16));
		
		assignmenttextField = new JTextField();
		assignmenttextField.setFont(new Font("Arial", Font.ITALIC, 16));
		assignmenttextField.setColumns(10);
		
		Q1textField = new JTextField();
		Q1textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Q1textField.setColumns(10);
		
		Q2textField = new JTextField();
		Q2textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Q2textField.setColumns(10);
		
		Q3textField = new JTextField();
		Q3textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Q3textField.setColumns(10);
		
		Q4textField = new JTextField();
		Q4textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Q4textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new uploadAssignment(ModuleSelected,assignmenttextField.getText(),fullname,Q1textField.getText(),Q2textField.getText(),Q3textField.getText(),Q4textField.getText()
						,"not needed","not needed","not needed","not needed");
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblQuestion_1_1 = new JLabel("Assignment number");
		lblQuestion_1_1.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JComboBox ModuleChoices = new JComboBox();
		ModuleChoices.setModel(new DefaultComboBoxModel(new String[] {"", "OODP", "C"}));
		ModuleChoices.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					ModuleSelected = ((String) e.getItem()).toLowerCase();
					System.out.println(ModuleSelected);
				}
			}
		});
		ModuleChoices.setFont(new Font("Arial", Font.ITALIC, 16));
		GroupLayout gl_Assignment = new GroupLayout(Assignment);
		gl_Assignment.setHorizontalGroup(
			gl_Assignment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Assignment.createSequentialGroup()
					.addGroup(gl_Assignment.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Assignment.createSequentialGroup()
							.addGap(59)
							.addGroup(gl_Assignment.createParallelGroup(Alignment.LEADING)
								.addComponent(lblQuestion_2_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQ)
								.addComponent(lblQuestion_3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuestion, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuestion_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuestion_1_1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
							.addGap(84)
							.addGroup(gl_Assignment.createParallelGroup(Alignment.LEADING, false)
								.addComponent(Q4textField, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
								.addComponent(assignmenttextField, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
								.addComponent(Q1textField, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
								.addComponent(Q2textField, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
								.addComponent(Q3textField, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
								.addComponent(ModuleChoices, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_Assignment.createSequentialGroup()
							.addGap(162)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(102, Short.MAX_VALUE))
		);
		gl_Assignment.setVerticalGroup(
			gl_Assignment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Assignment.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_Assignment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQ)
						.addComponent(ModuleChoices, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_Assignment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuestion_1_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(assignmenttextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_Assignment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuestion_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(Q1textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Assignment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuestion, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(Q2textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Assignment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuestion_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(Q3textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_Assignment.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuestion_2_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(Q4textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addComponent(btnNewButton)
					.addContainerGap(182, Short.MAX_VALUE))
		);
		Assignment.setLayout(gl_Assignment);
		
		JPanel Marks = new JPanel();
		Marks.setBackground(Color.LIGHT_GRAY);
		panelRight.add(Marks, "name_337793314841900");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GroupLayout gl_Marks = new GroupLayout(Marks);
		gl_Marks.setHorizontalGroup(
			gl_Marks.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Marks.createSequentialGroup()
					.addContainerGap(18, Short.MAX_VALUE)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_Marks.setVerticalGroup(
			gl_Marks.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Marks.createSequentialGroup()
					.addGap(28)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(67, Short.MAX_VALUE))
		);
		
		StdInfo = new JTable();
		StdInfo.setModel(assginmentModel);
		for(int i=0;i<std_info.getSize();i++) {
		assginmentModel.addRow(new Object[] {std_info.getfirstName(i),std_info.getlastName(i),std_info.getLevel(i)});
		}
		StdInfo.setFont(new Font("Arial", Font.ITALIC, 15));
		scrollPane_2.setViewportView(StdInfo);
		Marks.setLayout(gl_Marks);
		SplitPane.setDividerLocation(150);
		frmTeacher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
