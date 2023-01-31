package FinalFrontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import FinalBackend.GetAssignment;
import FinalBackend.Std_info;
import FinalBackend.Teacher_info;
import javax.swing.JComboBox;

public class studentDashboard {
	
	Teacher_info teacher_info;
	Std_info std_info;
	GetAssignment getworks;

	private JFrame frame;

	private CardLayout cl_cardPanel = new CardLayout(0,0);
	private CardLayout cl_Model_Panel = new CardLayout(0,0);
	private CardLayout cl_Model_panel2 = new CardLayout(0,0);
	private JPanel panel;
	private JPanel Model_Panel;
	private JPanel Model_panel2;
	private JButton OODPBtn;
	private JButton btnConcurancy;
	private JButton btnModule;
	private JButton btnTeacher;
	private JTable TeacherTable;
	
	DefaultTableModel TeacherModel =new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First Name", "Last Name", "Sex", "Module"
			}
		);
	DefaultTableModel StdModel = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First name", "Last name", "Email", "Sex", "Level"
			});
	
	DefaultTableModel oodpModle = new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Uploaded By", "Q1", "Q2", "Q3", "Q4"
			}
		);
	DefaultTableModel cModle = new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Uploaded By", "Q1", "Q2", "Q3", "Q4"
			}
		);
	private JTable Stdtable;
	private JTable oodptable;
	private JTable Ctable;

	/**
	 * Launch the application.
	 */
	public JFrame getFrame() {
		return frame;
	}
	private void activeBtn(int R,int G,int B,String a) {

		btnTeacher.setBackground(new Color(255, 250, 205));
		btnModule.setBackground(new Color(255, 250, 205));
		if(a.equals("DbBtn")){
			btnModule.setBackground(new Color(R,G,B));
			
		}else if(a.equals("TeacherBtn")) { 
			btnTeacher.setBackground(new Color(R,G,B));
		}
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentDashboard window = new studentDashboard("j","k");
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
	public studentDashboard(String firstname,String lastname) {
		initialize(firstname,lastname);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String firstname,String lastname) {
		String fullname = firstname+" "+lastname;
//		JSplitPane splitPane = new JSplitPane();
//		splitPane.setBounds(0, 0, 784, 561);
//		frmNAdminPannel.setBounds(550, 200, 800, 600);
//		JSplitPane SplitPane = new JSplitPane();
//		SplitPane.setDividerSize(0);
//		frmNAdminPannel.setContentPane(SplitPane);
		frame = new JFrame();
		frame.setTitle("Student");
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 784, 561);
		frame.setBounds(550, 200, 800, 600);
		JSplitPane SplitPane = new JSplitPane();
		SplitPane.setDividerSize(0);
		frame.setContentPane(SplitPane);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setDividerSize(0);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		SplitPane.setLeftComponent(splitPane_1);
		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(SystemColor.activeCaption);
		splitPane_1.setLeftComponent(panelTop);
		
		btnModule = new JButton("HomePage");
		btnModule.setBackground(new Color(255, 235, 205));
		ImageIcon BoardImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/dashBoardImg.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		btnModule.setIcon(BoardImg);
		btnModule.setFont(new Font("Arial", Font.ITALIC, 15));
		btnModule.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				activeBtn(255, 235, 205,"DbBtn");
				
			}
		});
		btnModule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(panel, "name_103190183779300");
					
			}
		});
		
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
					frame.dispose();
			}
			}});
		
		btnTeacher = new JButton("Instructors");
		btnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activeBtn(255, 235, 205, "TeacherBtn");
				cl_cardPanel.show(panel, "name_211500318189700");
				
			}
		});
		btnTeacher.setBackground(new Color(255, 250, 205));
		ImageIcon teacherImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/teacherImg.png")).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		btnTeacher.setIcon(teacherImg);
		btnTeacher.setFont(new Font("Arial", Font.ITALIC, 15));
		
		GroupLayout gl_panelTop = new GroupLayout(panelTop);
		gl_panelTop.setHorizontalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addComponent(btnModule, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTeacher, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
		);
		gl_panelTop.setVerticalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createParallelGroup(Alignment.BASELINE)
					.addComponent(btnModule, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addComponent(btnTeacher, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
		);
		panelTop.setLayout(gl_panelTop);
		
		panel = new JPanel();
		splitPane_1.setRightComponent(panel);
		panel.setLayout(cl_cardPanel);
		
		JPanel streamPanel = new JPanel();
		streamPanel.setBackground(new Color(143, 188, 143));
		panel.add(streamPanel, "name_103190183779300");
		
		OODPBtn = new JButton("OODP");
		OODPBtn.setBackground(new Color(255, 250, 205));
		OODPBtn.setFont(new Font("Arial", Font.ITALIC, 15));
		OODPBtn.addMouseListener(new MouseAdapter() {
			
		});
		OODPBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(panel, "name_103218011780600");
				
			}
		});
		
		btnConcurancy = new JButton("C");
		btnConcurancy.setBackground(new Color(255, 250, 205));
		btnConcurancy.setFont(new Font("Arial", Font.ITALIC, 15));
		btnConcurancy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(panel, "name_18988649720600");
			}
		});
		btnConcurancy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_cardPanel.show(panel, "name_7936525319300");
			}
		});
		
		JButton btnResult = new JButton("View Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(panel, "name_547851383737699");
			}
		});
		btnResult.setFont(new Font("Arial", Font.ITALIC, 15));
		
		JButton btnClassmates = new JButton("classmates");
		btnClassmates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(panel, "name_547834953442900");
			}
		});
		btnClassmates.setFont(new Font("Arial", Font.ITALIC, 15));
		btnClassmates.setBackground(new Color(255, 250, 205));
		GroupLayout gl_streamPanel = new GroupLayout(streamPanel);
		gl_streamPanel.setHorizontalGroup(
			gl_streamPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_streamPanel.createSequentialGroup()
					.addGap(26)
					.addComponent(OODPBtn)
					.addGap(35)
					.addComponent(btnConcurancy)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(btnClassmates, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnResult)
					.addContainerGap())
		);
		gl_streamPanel.setVerticalGroup(
			gl_streamPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_streamPanel.createSequentialGroup()
					.addGap(58)
					.addGroup(gl_streamPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(OODPBtn)
						.addComponent(btnConcurancy)
						.addComponent(btnResult)
						.addComponent(btnClassmates, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(423, Short.MAX_VALUE))
		);
		streamPanel.setLayout(gl_streamPanel);
		
		JSplitPane OODP = new JSplitPane();
		OODP.setOrientation(JSplitPane.VERTICAL_SPLIT);
		OODP.setDividerSize(0);
		panel.add(OODP, "name_103218011780600");
		
		JPanel inModuleTop = new JPanel();
		OODP.setLeftComponent(inModuleTop);
		
		JLabel StreamBtn = new JLabel("Stream");
		StreamBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_Model_Panel.show(Model_Panel,"name_18615144178400");
			}
		});
		StreamBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_inModuleTop = new GroupLayout(inModuleTop);
		gl_inModuleTop.setHorizontalGroup(
			gl_inModuleTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop.createSequentialGroup()
					.addContainerGap()
					.addComponent(StreamBtn, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(423, Short.MAX_VALUE))
		);
		gl_inModuleTop.setVerticalGroup(
			gl_inModuleTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop.createSequentialGroup()
					.addComponent(StreamBtn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		inModuleTop.setLayout(gl_inModuleTop);
		
		Model_Panel = new JPanel();
		OODP.setRightComponent(Model_Panel);
		Model_Panel.setLayout(cl_Model_Panel);
		
		JPanel StreamView = new JPanel();
		StreamView.setBackground(new Color(102, 153, 153));
		Model_Panel.add(StreamView, "name_18615144178400");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GroupLayout gl_StreamView = new GroupLayout(StreamView);
		gl_StreamView.setHorizontalGroup(
			gl_StreamView.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_StreamView.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_StreamView.setVerticalGroup(
			gl_StreamView.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_StreamView.createSequentialGroup()
					.addGap(9)
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		oodptable = new JTable();
		oodptable.setModel(oodpModle);
		getworks = new GetAssignment();
		for(int i=0;i<getworks.getOodpSize();i++) {
			oodpModle.addRow(new Object[] {getworks.getOodpname(i),getworks.getOodpq1(i),getworks.getOodpq2(i),getworks.getOodpq3(i),getworks.getOodpq4(i)});
		}
//		
		oodptable.setDefaultEditor(Object.class, null);
		oodptable.setFont(new Font("Arial", Font.ITALIC, 16));
		scrollPane_2.setViewportView(oodptable);
		StreamView.setLayout(gl_StreamView);
		OODP.setDividerLocation(30);
		
		JSplitPane Concurancy = new JSplitPane();
		Concurancy.setOrientation(JSplitPane.VERTICAL_SPLIT);
		Concurancy.setDividerSize(0);
		panel.add(Concurancy, "name_18988649720600");
		
		JPanel inModuleTop_2 = new JPanel();
		Concurancy.setLeftComponent(inModuleTop_2);
		
		JLabel StreamBtn_2 = new JLabel("Stream");
		StreamBtn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_Model_panel2.show(Model_panel2,"name_19090528781200");
			}
		});
		StreamBtn_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_inModuleTop_2 = new GroupLayout(inModuleTop_2);
		gl_inModuleTop_2.setHorizontalGroup(
			gl_inModuleTop_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(StreamBtn_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(417, Short.MAX_VALUE))
		);
		gl_inModuleTop_2.setVerticalGroup(
			gl_inModuleTop_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop_2.createSequentialGroup()
					.addComponent(StreamBtn_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		inModuleTop_2.setLayout(gl_inModuleTop_2);
		
		Model_panel2 = new JPanel();
		Concurancy.setRightComponent(Model_panel2);
		Model_panel2.setLayout(cl_Model_panel2);
		
		JPanel StreamView2 = new JPanel();
		StreamView2.setBackground(new Color(102, 153, 153));
		Model_panel2.add(StreamView2, "name_19090528781200");
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_StreamView2 = new GroupLayout(StreamView2);
		gl_StreamView2.setHorizontalGroup(
			gl_StreamView2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_StreamView2.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_StreamView2.setVerticalGroup(
			gl_StreamView2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_StreamView2.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		Ctable = new JTable();
		Ctable.setModel(cModle);
		for(int i=0;i<getworks.getCSize();i++) {
			cModle.addRow(new Object[] {getworks.getCname(i),getworks.getCq1(i),getworks.getCq2(i),getworks.getCq3(i),getworks.getCq4(i)});
		}
//		
		Ctable.setDefaultEditor(Object.class, null);
		scrollPane_3.setViewportView(Ctable);
		StreamView2.setLayout(gl_StreamView2);
		Concurancy.setDividerLocation(30);
		
		JPanel TeacherPanel = new JPanel();
		TeacherPanel.setBackground(Color.LIGHT_GRAY);
		panel.add(TeacherPanel, "name_211500318189700");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_TeacherPanel = new GroupLayout(TeacherPanel);
		gl_TeacherPanel.setHorizontalGroup(
			gl_TeacherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_TeacherPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_TeacherPanel.setVerticalGroup(
			gl_TeacherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TeacherPanel.createSequentialGroup()
					.addGap(42)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(96, Short.MAX_VALUE))
		);
		
		TeacherTable = new JTable();
		TeacherTable.setBackground(new Color(240,240,240));
		TeacherTable.setDefaultEditor(Object.class, null);
		TeacherTable.setModel(TeacherModel);
		teacher_info = new Teacher_info();
		for(int i=0;i<teacher_info.getSize();i++) {
		TeacherModel.addRow(new Object[] {teacher_info.getfirstName(i),teacher_info.getlastName(i),teacher_info.getSex(i),teacher_info.getModuleAssigned(i)});
		}
		TeacherTable.getColumnModel().getColumn(3).setPreferredWidth(144);
		TeacherTable.setFont(new Font("Arial", Font.ITALIC, 16));
		scrollPane.setViewportView(TeacherTable);
		TeacherPanel.setLayout(gl_TeacherPanel);
		
		JPanel ClassMate = new JPanel();
		ClassMate.setBackground(new Color(143, 188, 143));
		panel.add(ClassMate, "name_547834953442900");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(new Color(143, 188, 143));
		GroupLayout gl_ClassMate = new GroupLayout(ClassMate);
		gl_ClassMate.setHorizontalGroup(
			gl_ClassMate.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_ClassMate.createSequentialGroup()
					.addGap(19)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_ClassMate.setVerticalGroup(
			gl_ClassMate.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ClassMate.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		Stdtable = new JTable();
		Stdtable.setFont(new Font("Arial", Font.ITALIC, 16));
		Stdtable.setModel(StdModel);
		std_info = new Std_info();
		for(int i=0;i<std_info.getSize();i++) {
			StdModel.addRow(new Object[] {std_info.getfirstName(i),std_info.getlastName(i),std_info.getEmail(i),std_info.getSex(i),std_info.getLevel(i)});
		}
		Stdtable.setDefaultEditor(Object.class, null);
		Stdtable.setBackground(new Color(143, 188, 143));
		scrollPane_1.setViewportView(Stdtable);
		ClassMate.setLayout(gl_ClassMate);
		
		JPanel SeeResult = new JPanel();
		SeeResult.setBackground(new Color(143, 188, 143));
		panel.add(SeeResult, "name_547851383737699");
		
		JLabel lblNewLabel_4 = new JLabel("Your Marks");
		lblNewLabel_4.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblOODP = new JLabel("OODP");
		lblOODP.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblNMC = new JLabel("NMC");
		lblNMC.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblAI = new JLabel("AI");
		lblAI.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel displayOODPmarks = new JLabel("OODP");
		displayOODPmarks.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel displayNMCmarks = new JLabel("NMC");
		displayNMCmarks.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel displayAImarks = new JLabel("AI");
		displayAImarks.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout gl_SeeResult = new GroupLayout(SeeResult);
		gl_SeeResult.setHorizontalGroup(
			gl_SeeResult.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_SeeResult.createSequentialGroup()
					.addGroup(gl_SeeResult.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_SeeResult.createSequentialGroup()
							.addGap(188)
							.addComponent(lblNewLabel_4))
						.addGroup(gl_SeeResult.createSequentialGroup()
							.addGap(76)
							.addGroup(gl_SeeResult.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_SeeResult.createSequentialGroup()
									.addComponent(lblNMC, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(displayNMCmarks, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_SeeResult.createSequentialGroup()
									.addComponent(lblOODP, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(displayOODPmarks, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_SeeResult.createSequentialGroup()
									.addComponent(lblAI, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(displayAImarks, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(197, Short.MAX_VALUE))
		);
		gl_SeeResult.setVerticalGroup(
			gl_SeeResult.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SeeResult.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel_4)
					.addGap(37)
					.addGroup(gl_SeeResult.createParallelGroup(Alignment.LEADING)
						.addComponent(lblOODP, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(displayOODPmarks, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_SeeResult.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNMC, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(displayNMCmarks, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_SeeResult.createParallelGroup(Alignment.LEADING)
						.addComponent(displayAImarks, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAI, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(311, Short.MAX_VALUE))
		);
		SeeResult.setLayout(gl_SeeResult);
		splitPane_1.setDividerLocation(50);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		SplitPane.setRightComponent(panel_1);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon hatImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/stdhat.png")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		lblNewLabel.setIcon(hatImg);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon icon = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/systemIcon.png")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		lblNewLabel_1.setIcon(icon);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to CMS");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Your Assignments:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel Name = new JLabel("name");
		Name.setText(fullname);
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(80)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(63, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(Name, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(52))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addComponent(lblNewLabel_2)
					.addGap(3)
					.addComponent(Name, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addContainerGap(396, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		SplitPane.setDividerLocation(500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
