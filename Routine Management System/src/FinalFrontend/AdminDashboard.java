package FinalFrontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import FinalBackend.DeleteInformations;
import FinalBackend.Std_info;
import FinalBackend.Teacher_info;
import FinalBackend.UpdateTableInformation;
import FinalBackend.courses_information;
import FinalBackend.getMarks;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Enumeration;



public class AdminDashboard {
	
	//associations 
	
	Teacher_info teacher_information;
	courses_information course_information;
	Std_info student_information;
	AddStdForm stdForm;
	getMarks getMark;
	
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>

	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	private JPanel panel_right;
	private CardLayout layout = new CardLayout(0, 0);
	private JButton btnCourse;
	private JButton btnTeacher;
	private JButton btnStudent;
	private JButton btnResult;
	private JTable TeacherTable;
	private JTable stdTable;
	private JTable resultTable;

	private String Sex;
	private String Type;
	private String level;
	
	
	private DefaultTableModel StdModal =new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First Name", "Last Name", "Sex","PhoneNumber", "Address", "Level"
			}
		);
	
	private DefaultTableModel Teachermodel = new DefaultTableModel(
						new Object[][] {
					},
						//column headers
					new String[] {
						"id","First Name", "Last Name", "Sex" ,"PhoneNumber", "Address","Type","Module Assigned"
						
					}
				);
	private JTable CourseTable;
	private DefaultTableModel coursemodel = new DefaultTableModel(
			new Object[][] {
		
	},
	new String[] {
		"Course name", "Course Year"
	}
);
	private DefaultTableModel resultmodel =new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student Name", "OODP Mark", "C Mark"
			}
		);

	/**
	 * Launch the application.
	 */
private void activeBtn(int R,int G,int B,String a) {

	btnCourse.setBackground(SystemColor.activeCaption);
	btnTeacher.setBackground(SystemColor.activeCaption);
	btnStudent.setBackground(SystemColor.activeCaption);
	btnResult.setBackground(SystemColor.activeCaption);
		if(a.equals("DbBtn")) {
			btnCourse.setBackground(new Color(R,G,B));
		}else if(a.equals("TeacherBtn")) {
			btnTeacher.setBackground(new Color(R,G,B));
		}else if(a.equals("StdBtn")) {
			btnStudent.setBackground(new Color(R,G,B));
		}else if(a.contentEquals("ResultBtn")) {
			btnResult.setBackground(new Color(R,G,B));
		}
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard window = new AdminDashboard();
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
	public AdminDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Admin");
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 784, 561);
		frame.setBounds(550, 200, 800, 600);
		JSplitPane SplitPane = new JSplitPane();
		SplitPane.setDividerSize(0);
		frame.setContentPane(SplitPane);
		
		JPanel panel_left = new JPanel();
		panel_left.setBackground(SystemColor.activeCaption);
		SplitPane.setLeftComponent(panel_left);
		
		btnCourse = new JButton("Courses");
		btnCourse.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ImageIcon courseImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/course.png")).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		btnCourse.setIcon(courseImg);
		btnCourse.setBackground(new Color(255, 235, 205));
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(panel_right,"name_29674605431600");
				activeBtn(255, 235, 205,"DbBtn");
			}
		});
		btnCourse.setFont(new Font("Arial", Font.ITALIC, 17));
		
		btnTeacher = new JButton("Instructors");
		btnTeacher.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnTeacher.setBackground(SystemColor.activeCaption);
		ImageIcon teacherImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/teacherImg.png")).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		btnTeacher.setIcon(teacherImg);
		btnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(panel_right,"name_29678438199200");
//				 teacher_information = new Teacher_info();
				activeBtn(255, 235, 205,"TeacherBtn");
				
			}
		});
		btnTeacher.setFont(new Font("Arial", Font.ITALIC, 17));
		
		btnStudent = new JButton("Student");
		btnStudent.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ImageIcon StdImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/studentImg.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		btnStudent.setIcon(StdImg);
		btnStudent.setBackground(SystemColor.activeCaption);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(panel_right,"name_29680139631500");
				activeBtn(255, 235, 205,"StdBtn");
			}
		});
		btnStudent.setFont(new Font("Arial", Font.ITALIC, 17));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ImageIcon LogOutImg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/logout.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		btnLogout.setIcon(LogOutImg);
		btnLogout.setBackground(SystemColor.activeCaption);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Object[] options= {"Yes","No"};
				int optionSelected=JOptionPane.showOptionDialog(null, "Are you sure you want to logout?", "Confirm Logout",
						JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
				if(optionSelected==0) {
				Login window = new Login();
			window.getFrame().setVisible(true);
			frame.dispose();
				}
		}});
		btnLogout.setFont(new Font("Arial", Font.ITALIC, 17));
		
		JLabel lblAdminPhoto = new JLabel("");
		ImageIcon adminImg = new ImageIcon(new ImageIcon(AdminDashboard.class.getResource("/images/systemIcon.png")).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
		lblAdminPhoto.setIcon(adminImg);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		
		btnResult = new JButton("Publish Result");
		ImageIcon ResultImg = new ImageIcon(new ImageIcon(AdminDashboard.class.getResource("/images/result.png")).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
		btnResult.setIcon(ResultImg);
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(panel_right,"name_173602901088000");
				activeBtn(255, 235, 205,"ResultBtn");
			}
		});
		
		btnResult.setFont(new Font("Arial", Font.ITALIC, 17));
		btnResult.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnResult.setBackground(SystemColor.activeCaption);
		GroupLayout gl_panel_left = new GroupLayout(panel_left);
		gl_panel_left.setHorizontalGroup(
			gl_panel_left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_left.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel_left.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblAdminPhoto)
						.addComponent(lblNewLabel))
					.addGap(40))
				.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
				.addComponent(btnCourse, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
				.addComponent(btnTeacher, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
				.addComponent(btnStudent, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
				.addComponent(btnResult, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
		);
		gl_panel_left.setVerticalGroup(
			gl_panel_left.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_left.createSequentialGroup()
					.addGap(16)
					.addComponent(lblAdminPhoto, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addGap(38)
					.addComponent(btnCourse, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTeacher)
					.addGap(18)
					.addComponent(btnStudent, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnResult, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(108)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		panel_left.setLayout(gl_panel_left);
		
		panel_right = new JPanel();
		SplitPane.setRightComponent(panel_right);
		panel_right.setLayout(layout);
		
		JPanel CoursePanel = new JPanel();
		CoursePanel.setBackground(Color.GRAY);
		panel_right.add(CoursePanel, "name_29674605431600");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JButton btnNewButton = new JButton("Add Course");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addCourse addCourse = new addCourse();
				addCourse.setVisible(true);
				JButton AddBtn = addCourse.getBtnAddCourse();
				AddBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String name=addCourse.getCourseNametextField().getText().trim();
						String year=addCourse.getCourseDurationTextField().getText().trim();
						new courses_information(name, year);
						coursemodel.addRow(new Object[] {name, year});
						new UpdateTableInformation(name);
						
					}
				});
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout gl_CoursePanel = new GroupLayout(CoursePanel);
		gl_CoursePanel.setHorizontalGroup(
			gl_CoursePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CoursePanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
					.addGap(20))
				.addGroup(gl_CoursePanel.createSequentialGroup()
					.addGap(193)
					.addComponent(btnNewButton)
					.addContainerGap(293, Short.MAX_VALUE))
		);
		gl_CoursePanel.setVerticalGroup(
			gl_CoursePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_CoursePanel.createSequentialGroup()
					.addContainerGap(77, Short.MAX_VALUE)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnNewButton)
					.addGap(36))
		);
		
		CourseTable = new JTable();
		CourseTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] options= {"Update","Delete"};
				int selecterOption=JOptionPane.showOptionDialog(null, "Do you want to update or delete?", "Update or delete Course",
						JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
				if(selecterOption==0) {
					String name = (String) CourseTable.getValueAt(CourseTable.getSelectedRow(), 0);
					String year = (String) CourseTable.getValueAt(CourseTable.getSelectedRow(), 1);
				CourseInfo displayInfo = new CourseInfo(name);
				displayInfo.setVisible(true);
//				for(int i =0;i<CourseTable.getColumnCount();i++) {
					
//					if(dialog.getDisplayCourseName().getText().isEmpty()) {
						displayInfo.getDisplayCourseName().setText(name);
//					}else if(dialog.getDisplayYear().getText().isEmpty()) {
						displayInfo.getDisplayYear().setText(year);
//					}
				
			}else if(selecterOption==1) {
				Object[] confirm= {"Yes","No"};
				int confirmOption=JOptionPane.showOptionDialog(null, "Are you sure u want to delete?", "Confirm",
						JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,confirm,confirm[0]);
				if(confirmOption==0) {
					new DeleteInformations(Integer.parseInt(course_information.getId(CourseTable.getSelectedRow())),course_information.getCourseName(CourseTable.getSelectedRow()));
					coursemodel.removeRow(CourseTable.getSelectedRow());
				}
			}
				}
		});
		CourseTable.setDefaultEditor(Object.class, null);
		CourseTable.setFont(new Font("Arial", Font.ITALIC, 15));
		CourseTable.setModel(coursemodel);
		course_information = new courses_information();
		for(int i=0;i<course_information.getDataNum();i++) {
		coursemodel.addRow(new Object[] {course_information.getCourseName(i),course_information.getCourseYear(i)});
		}
		CourseTable.getColumnModel().getColumn(0).setPreferredWidth(85);
		scrollPane_1.setViewportView(CourseTable);
		CoursePanel.setLayout(gl_CoursePanel);
		
		JPanel TeacherPanel = new JPanel();
		TeacherPanel.setForeground(Color.GRAY);
		TeacherPanel.setBackground(Color.GRAY);
		panel_right.add(TeacherPanel, "name_29678438199200");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(Color.GRAY);
		scrollPane.setBackground(Color.GRAY);
		
		JButton btnAddTutor = new JButton("Add Tutor");
		btnAddTutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTeacherForm form = new AddTeacherForm();
				form.setVisible(true);
				JButton btnSubmit = form.getBtnSubmit();
				btnSubmit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
//						System.out.println("clicked");

						selected(form);
						Object[] informations = {form.getLblshowID().getText(),form.getFirstNametextField().getText(),form.getLastNametextField().getText(),Sex,form.getNumbertextField().getText(),
								form.getAddresstextField().getText(),Type,form.getModuleAssignedtextField().getText().trim()};
						new UpdateTableInformation(form.getUsernametextField().getText().trim(),form.getPasswordtextField().getText().trim(),form.getFirstNametextField().getText().trim(),form.getLastNametextField().getText().trim(),
								Sex,form.getAddresstextField().getText().trim(),form.getNumbertextField().getText().trim(),Type,form.getModuleAssignedtextField().getText().trim());
					
//						for(int i=0;i<4;i++) {
//							System.out.println(informations[i]);
//						}
						Teachermodel.addRow(informations);
						
						form.dispose();
					}
				});
			}
		});
				
		btnAddTutor.setFont(new Font("Arial", Font.ITALIC, 17));
		btnAddTutor.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		btnAddTutor.setBackground(SystemColor.activeCaption);
		GroupLayout gl_TeacherPanel = new GroupLayout(TeacherPanel);
		gl_TeacherPanel.setHorizontalGroup(
			gl_TeacherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TeacherPanel.createSequentialGroup()
					.addGroup(gl_TeacherPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_TeacherPanel.createSequentialGroup()
							.addGap(10)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_TeacherPanel.createSequentialGroup()
							.addGap(191)
							.addComponent(btnAddTutor, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_TeacherPanel.setVerticalGroup(
			gl_TeacherPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TeacherPanel.createSequentialGroup()
					.addGap(61)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAddTutor, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(63, Short.MAX_VALUE))
		);
		TeacherTable = new JTable();
		TeacherTable.setBackground(Color.WHITE);
		TeacherTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.out.println(TeacherTable.getSelectedRow());
				Object[] options= {"Update","Delete"};
				int selecterOption=JOptionPane.showOptionDialog(null, "Do you want to update or delete?", "Update or delete teacher",
						JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
				if(selecterOption==0) {
					ArrayList<String> informations = new ArrayList<>();
					int selectedRow = TeacherTable.getSelectedRow();
					// Opening the form we made
					AddTeacherForm form = new AddTeacherForm();
					form.setVisible(true);
					//getting the button of the form
					JButton btnSubmit = form.getBtnSubmit();
					btnSubmit.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
//							for (Enumeration<AbstractButton> buttons = form.getButtonGroup().getElements(); buttons.hasMoreElements();) {
//			                    AbstractButton button = buttons.nextElement();
//			                    if (button.isSelected()) {
//			                    	Sex = button.getText();
//			                    }}
							selected(form);
							new UpdateTableInformation(form.getLblshowID().getText().trim(),form.getUsernametextField().getText().trim(),form.getPasswordtextField().getText().trim(),
									form.getFirstNametextField().getText().trim(),form.getLastNametextField().getText().trim(),Sex,form.getAddresstextField().getText().trim(),
									form.getNumbertextField().getText().trim(),Type,form.getModuleAssignedtextField().getText().trim());
							informations.add(form.getLblshowID().getText());	
							informations.add(form.getFirstNametextField().getText());
							informations.add(form.getLastNametextField().getText());
							informations.add(Sex);
							informations.add(form.getNumbertextField().getText());	
							informations.add(form.getAddresstextField().getText());
							informations.add(Type);
							informations.add(form.getModuleAssignedtextField().getText());
							for(int i=1;i<TeacherTable.getColumnCount();i++) {
								String info = informations.get(i);
								TeacherTable.setValueAt(info, selectedRow, i);
						}
							form.dispose();	
						}});
					
					// To update the database infos>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
						form.getLblshowID().setText(teacher_information.getId(selectedRow));
						
						
							form.getFirstNametextField().setText(teacher_information.getfirstName(selectedRow));
						
						
							
							form.getLastNametextField().setText(teacher_information.getlastName(selectedRow));
							
							
									
							form.getNumbertextField().setText(teacher_information.getPhoneNumber(selectedRow));
							
							
							form.getAddresstextField().setText(teacher_information.getAddress(selectedRow));
							
							
//							form.getTypetextField().setText(teacher_information.getType(selectedRow));
//							informations.add(form.getTypetextField());
//							informations.add();
							
							form.getUsernametextField().setText(teacher_information.getUserName(selectedRow));
							form.getPasswordtextField().setText(teacher_information.getPassWord(selectedRow));
							form.getModuleAssignedtextField().setText(teacher_information.getModuleAssigned(selectedRow));

					
				}else if (selecterOption==1) {
					Object[] comfirm= {"Yes","No"};
					int confirm=JOptionPane.showOptionDialog(null, "Are you sure you want to delete?", "Confirm",
							JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,comfirm,comfirm[0]);
					if(confirm ==0) {
//						System.out.println(TeacherTable.getSelectedRow());
						String phoneNumber = teacher_information.getPhoneNumber(TeacherTable.getSelectedRow());
					Teachermodel.removeRow(TeacherTable.getSelectedRow());
					new DeleteInformations(phoneNumber);
					}
				}
			}
		});
		TeacherTable.setDefaultEditor(Object.class, null);
		TeacherTable.setFont(new Font("Arial", Font.ITALIC, 15));
		TeacherTable.setModel(Teachermodel);
		displayTeachData();
		TeacherTable.getColumnModel().getColumn(2).setPreferredWidth(95);
		TeacherTable.getColumnModel().getColumn(3).setPreferredWidth(124);
		scrollPane.setViewportView(TeacherTable);
		TeacherPanel.setLayout(gl_TeacherPanel);
		
		JPanel StdPanel = new JPanel();
		StdPanel.setBackground(Color.GRAY);
		panel_right.add(StdPanel, "name_29680139631500");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JButton btnAddStd = new JButton("Add Student");
		btnAddStd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 stdForm = new AddStdForm();
				stdForm.setVisible(true);
				JButton btnSubmit = stdForm.getBtnSubmit();
				btnSubmit.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						selectedforStd(stdForm);
//						System.out.println(Sex);
						new UpdateTableInformation(0,stdForm.getUsernametextField().getText().trim(),stdForm.getPasswordtextField().getText().trim(),
								stdForm.getFirstnametextField().getText().trim(),stdForm.getLastnametextField().getText().trim(),stdForm.getPhonenumtextField().getText().trim()
								,Sex,stdForm.getAddresstextField().getText().trim(),stdForm.getEmailtextField().getText().trim(),level);
					}
		});
//				JComboBox levelSelected = stdForm1.getLevelSelected();
				stdForm.getLevelSelected().addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						if(e.getStateChange() == 1) {
							level = (String) e.getItem();
//							System.out.println(level);
						}
					}
				});
			}
		});
		btnAddStd.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout gl_StdPanel = new GroupLayout(StdPanel);
		gl_StdPanel.setHorizontalGroup(
			gl_StdPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_StdPanel.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
				.addGroup(Alignment.LEADING, gl_StdPanel.createSequentialGroup()
					.addGap(217)
					.addComponent(btnAddStd)
					.addContainerGap(317, Short.MAX_VALUE))
		);
		gl_StdPanel.setVerticalGroup(
			gl_StdPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_StdPanel.createSequentialGroup()
					.addGap(38)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAddStd)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		
		stdTable = new JTable();
		stdTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = stdTable.getSelectedRow();
				Object[] options= {"Update","Delete"};
				int selecterOption=JOptionPane.showOptionDialog(null, "Do you want to update or delete?", "Update or delete Student",
						JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
				if(selecterOption==0) {
					ArrayList<String> informations = new ArrayList<>();
					 stdForm = new AddStdForm();
					 stdForm.setVisible(true);
					 String id =student_information.getId(selectedRow);
					 stdForm.getUsernametextField().setText(student_information.getUserName(selectedRow));
					 stdForm.getPasswordtextField().setText(student_information.getPassWord(selectedRow));
					 stdForm.getFirstnametextField().setText(student_information.getfirstName(selectedRow));
					 stdForm.getLastnametextField().setText(student_information.getlastName(selectedRow));
					 stdForm.getPhonenumtextField().setText(student_information.getPhoneNumber(selectedRow));
					 stdForm.getAddresstextField().setText(student_information.getAddress(selectedRow));
					 stdForm.getEmailtextField().setText(student_information.getEmail(selectedRow));
					 stdForm.getLevelSelected().addItemListener(new ItemListener() {
							public void itemStateChanged(ItemEvent e) {
								if(e.getStateChange() == 1) {
									level = (String) e.getItem();
//									System.out.println(level);
								}
							}
						});
					JButton btnSubmit = stdForm.getBtnSubmit();
					btnSubmit.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							selectedforStd(stdForm);
//							(int id,String Username,String Password,String Firstname, String Lastname,String Phonenumber,String Sex, String Address,String email,String level) {
							new UpdateTableInformation(id,stdForm.getUsernametextField().getText().trim(),stdForm.getPasswordtextField().getText().trim(), stdForm.getFirstnametextField().getText().trim(),
									 stdForm.getLastnametextField().getText().trim(), stdForm.getPhonenumtextField().getText(),Sex.trim(),stdForm.getAddresstextField().getText().trim(),
									 stdForm.getEmailtextField().getText().trim(),level,"k");
//							student_information.getfirstName(i),student_information.getlastName(i),student_information.getSex(i),student_information.getPhoneNumber(i),
//							student_information.getAddress(i),student_information.getLevel(i)?
							informations.add(stdForm.getFirstnametextField().getText().trim());
							informations.add(stdForm.getLastnametextField().getText().trim());
							informations.add(Sex.trim());
							informations.add(stdForm.getPhonenumtextField().getText());
							informations.add(stdForm.getAddresstextField().getText());
							informations.add(level);
							 for(int i=1;i<stdTable.getColumnCount();i++) {
									String info = informations.get(i);
									StdModal.setValueAt(info, selectedRow, i);
									
							}
									 stdForm.dispose();
						        }});
						
				}else if(selecterOption == 1) {
					Object[] comfirm= {"Yes","No"};
				int confirm=JOptionPane.showOptionDialog(null, "Are you sure you want to delete?", "Confirm",
						JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,comfirm,comfirm[0]);
				if(confirm ==0) {
					new DeleteInformations("0", student_information.getPhoneNumber(selectedRow));
					StdModal.removeRow(selectedRow);
				}
				}
			}
		});
		stdTable.setDefaultEditor(Object.class, null);
		stdTable.setFont(new Font("Arial", Font.ITALIC, 15));
		stdTable.setModel(StdModal);
		student_information = new Std_info();
		int size = student_information.getSize();
		for(int i=0;i<size;i++) {
			StdModal.addRow(new Object[] {student_information.getfirstName(i),student_information.getlastName(i),student_information.getSex(i),student_information.getPhoneNumber(i),
					student_information.getAddress(i),student_information.getLevel(i)});
		}
		stdTable.getColumnModel().getColumn(3).setPreferredWidth(110);
		scrollPane_2.setViewportView(stdTable);
		StdPanel.setLayout(gl_StdPanel);
		
		JPanel ResultPanel = new JPanel();
		JScrollPane scrollPane_3 = new JScrollPane();
		GroupLayout gl_ResultPanel = new GroupLayout(ResultPanel);
		gl_ResultPanel.setHorizontalGroup(
			gl_ResultPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_ResultPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_ResultPanel.setVerticalGroup(
			gl_ResultPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ResultPanel.createSequentialGroup()
					.addGap(25)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		
		resultTable = new JTable();
		resultTable.setModel(resultmodel);
		
		resultTable.setDefaultEditor(Object.class, null);
		scrollPane_3.setViewportView(resultTable);
		getMark = new getMarks();
		for(int i=1;i<getMark.getSize();i++) {
			resultmodel.addRow(new Object[] {
					getMark.getFirstName(i) + " "+getMark.getLastName(i),
					getMark.getOODPmark(i),
					getMark.getCmark(i)
			});
		}
		resultTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] comfirm= {"View","Back"};
				int confirm=JOptionPane.showOptionDialog(null, "View Given Marks? ", "Confirm",
						JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,comfirm,comfirm[0]);
				if(confirm ==0) {
					int i = resultTable.getSelectedRow();
					viewMarks seeMark = new viewMarks(getMark.getFirstName(i+1),getMark.getLastName(i+1),getMark.getOODPmark(i+1),getMark.getCmark(i+1));
					seeMark.setVisible(true);
					JButton btnGenerate = seeMark.getBtnGenerate();
					btnGenerate.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							int i=resultTable.getSelectedRow();
							String id = getMark.getId(i+1);
							String fname = seeMark.getLblDisplayFirstName().getText();
							String lname = seeMark.getLblDisplayLastName().getText().trim();
							String oodpMark = seeMark.getLblDisplayoodpmark().getText().trim();
							String CMark= seeMark.getLblDisplayCmark().getText().trim();
							String percentage= seeMark.getLblDisplayPercentage().getText().trim();
							new UpdateTableInformation(id,fname,lname,oodpMark,CMark,percentage);
						}
						});
				}
				
				
			}});
		ResultPanel.setLayout(gl_ResultPanel);
		panel_right.add(ResultPanel, "name_173602901088000");
		SplitPane.setDividerLocation(160);
	}
	
	// function to display teacher data in table
	public <E> void displayTeachData() {
		teacher_information=new Teacher_info();
		int size=teacher_information.getSize();
		for(int i=0;i<size;i++) {
		Object[] name = {teacher_information.getId(i),teacher_information.getfirstName(i),teacher_information.getlastName(i),teacher_information.getSex(i),
				teacher_information.getPhoneNumber(i),teacher_information.getAddress(i),teacher_information.getType(i),teacher_information.getModuleAssigned(i)};
		Teachermodel.addRow(name);
		}
		
		
	}
	public void selected(AddTeacherForm form) {
	for (Enumeration<AbstractButton> buttons = form.getButtonGroup().getElements(); buttons.hasMoreElements();) {
        AbstractButton button = buttons.nextElement();
        if (button.isSelected()) {
        	Sex = button.getText();
        }}
	
	if(form.getIsPartTimeCheckBox().isSelected()) {
		Type = "Part-time";
	}else {
		Type="Full-time";
	}
	}
	public void selectedforStd(AddStdForm form) {
		for (Enumeration<AbstractButton> buttons = form.getButtonGroup().getElements(); buttons.hasMoreElements();) {
	        AbstractButton button = buttons.nextElement();
	        if (button.isSelected()) {
	        	Sex = button.getText();
	        }}
	}
}
