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
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class studentDashboard {

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
	private JTable ClassmateTable;

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
					studentDashboard window = new studentDashboard();
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
	public studentDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
				Login window = new Login();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		
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
		btnResult.setFont(new Font("Arial", Font.ITALIC, 15));
		GroupLayout gl_streamPanel = new GroupLayout(streamPanel);
		gl_streamPanel.setHorizontalGroup(
			gl_streamPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_streamPanel.createSequentialGroup()
					.addGap(26)
					.addComponent(OODPBtn)
					.addGap(35)
					.addComponent(btnConcurancy)
					.addPreferredGap(ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
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
						.addComponent(btnResult))
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
		
		JLabel PeopleBtn = new JLabel("People");
		PeopleBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_Model_Panel.show(Model_Panel,"name_18635330178400");
			}
		});
		PeopleBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_inModuleTop = new GroupLayout(inModuleTop);
		gl_inModuleTop.setHorizontalGroup(
			gl_inModuleTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop.createSequentialGroup()
					.addContainerGap()
					.addComponent(StreamBtn, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(PeopleBtn, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(305, Short.MAX_VALUE))
		);
		gl_inModuleTop.setVerticalGroup(
			gl_inModuleTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop.createSequentialGroup()
					.addGroup(gl_inModuleTop.createParallelGroup(Alignment.BASELINE)
						.addComponent(StreamBtn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(PeopleBtn, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		inModuleTop.setLayout(gl_inModuleTop);
		
		Model_Panel = new JPanel();
		OODP.setRightComponent(Model_Panel);
		Model_Panel.setLayout(cl_Model_Panel);
		
		JPanel StreamView = new JPanel();
		StreamView.setBackground(new Color(102, 153, 153));
		Model_Panel.add(StreamView, "name_18615144178400");
		
		JPanel PeopleView = new JPanel();
		PeopleView.setBackground(new Color(204, 204, 204));
		Model_Panel.add(PeopleView, "name_18635330178400");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_PeopleView = new GroupLayout(PeopleView);
		gl_PeopleView.setHorizontalGroup(
			gl_PeopleView.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PeopleView.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_PeopleView.setVerticalGroup(
			gl_PeopleView.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PeopleView.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		ClassmateTable = new JTable();
		ClassmateTable.setDefaultEditor(Object.class, null);
		ClassmateTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nami", null, "female", "Berry@newWorld.com"},
				{"Robin", "Devil's child", "female", "Devil@friends.com"},
				{"Zorro", null, "male", "Alwayslost@places.com"},
				{"Sanji", null, "male", "Best@cooking.com"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"First Name", "Second Name", "Sex", "Email"
			}
		));
		ClassmateTable.getColumnModel().getColumn(3).setPreferredWidth(150);
		ClassmateTable.setFont(new Font("Arial", Font.ITALIC, 15));
		scrollPane_1.setViewportView(ClassmateTable);
		PeopleView.setLayout(gl_PeopleView);
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
		
		JLabel PeopleBtn_2 = new JLabel("People");
		PeopleBtn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_Model_panel2.show(Model_panel2,"name_211500318189700");
			}
		});
		PeopleBtn_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_inModuleTop_2 = new GroupLayout(inModuleTop_2);
		gl_inModuleTop_2.setHorizontalGroup(
			gl_inModuleTop_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(StreamBtn_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(PeopleBtn_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(297, Short.MAX_VALUE))
		);
		gl_inModuleTop_2.setVerticalGroup(
			gl_inModuleTop_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop_2.createSequentialGroup()
					.addGroup(gl_inModuleTop_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(StreamBtn_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(PeopleBtn_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		inModuleTop_2.setLayout(gl_inModuleTop_2);
		
		Model_panel2 = new JPanel();
		Concurancy.setRightComponent(Model_panel2);
		Model_panel2.setLayout(cl_Model_panel2);
		
		JPanel StreamView2 = new JPanel();
		StreamView2.setBackground(new Color(102, 153, 153));
		Model_panel2.add(StreamView2, "name_19090528781200");
		
		JPanel PeopleView2 = new JPanel();
		PeopleView2.setBackground(new Color(204, 204, 204));
		Model_panel2.add(PeopleView2, "name_19093441402800");
		Concurancy.setDividerLocation(30);
		
		JPanel InstructorPlane = new JPanel();
		panel.add(InstructorPlane, "name_116840171274100");
		
		JPanel TeacherPanel = new JPanel();
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
		TeacherTable.setDefaultEditor(Object.class, null);
		TeacherTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"brook", "dead", "Undead", "CanI@see.com"},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"First Name", "Last Name", "Sex", "Email"
			}
		));
		TeacherTable.getColumnModel().getColumn(3).setPreferredWidth(144);
		TeacherTable.setFont(new Font("Arial", Font.ITALIC, 15));
		scrollPane.setViewportView(TeacherTable);
		TeacherPanel.setLayout(gl_TeacherPanel);
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
					.addContainerGap(61, Short.MAX_VALUE)
					.addComponent(lblNewLabel_3)
					.addGap(54))
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
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3)
					.addContainerGap(418, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		SplitPane.setDividerLocation(500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
