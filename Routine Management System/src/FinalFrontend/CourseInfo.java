package FinalFrontend;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import FinalBackend.course_info;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class CourseInfo extends JDialog {
	private JTable ModulesTable;
	
	DefaultTableModel model = new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Name", "Module Number","level","semester","credit","type"
			}
		);
	private JLabel DisplayCourseName;
	private JLabel DisplayYear;

	public JLabel getDisplayCourseName() {
		return DisplayCourseName;
	}

	public JLabel getDisplayYear() {
		return DisplayYear;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CourseInfo dialog = new CourseInfo("bit");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CourseInfo(String CourseName) {
		setTitle(CourseName);
		List<Object> Modulename = new ArrayList<>();
		List<Object> Modulenumber = new ArrayList<>();
		List<Object> level = new ArrayList<>();
		List<Object> semester = new ArrayList<>();
		List<Object> credit = new ArrayList<>();
		List<Object> type = new ArrayList<>();
		course_info informations=new course_info(CourseName);
		setBounds(100, 100, 800, 600);
//		int i;
		for(int i=0;i<informations.getModule().size();i++) {
			Modulename.add(informations.getModule(i));
			Modulenumber.add(informations.getModuleNumber(i));
			level.add(informations.getLevel(i));
			semester.add(informations.getSemester(i));
			credit.add(informations.GetCredit(i));
			type.add(informations.getType(i));
			Object[] show = {Modulename.get(i),Modulenumber.get(i),level.get(i),semester.get(i),credit.get(i),type.get(i)};
			model.addRow(show);
		}
		
		JLabel lblCourseName = new JLabel("Name");
		lblCourseName.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblCourseYear = new JLabel("Course Year");
		lblCourseYear.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		
		DisplayCourseName = new JLabel("");
		DisplayCourseName.setFont(new Font("Arial", Font.ITALIC, 20));
		
		DisplayYear = new JLabel("");
		DisplayYear.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JButton btnNewButton = new JButton("Add Module");
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(48)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCourseYear, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(DisplayYear, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCourseName)
									.addGap(44)
									.addComponent(DisplayCourseName, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(308)
							.addComponent(btnNewButton))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCourseName)
						.addComponent(DisplayCourseName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCourseYear, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(DisplayYear, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		
		ModulesTable = new JTable();
		ModulesTable.setFont(new Font("Arial", Font.ITALIC, 15));
		ModulesTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] options= {"Update","Delete"};
				int userOption=JOptionPane.showOptionDialog(null, "Do you want to update or delete?", "Update or delete module",
						JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
				if(userOption==0) {
					
				}
			}
		});
		ModulesTable.setDefaultEditor(Object.class, null);
		ModulesTable.setModel(model);
		
//		Object[] informations = {DisplayCourseName.getText(),DisplayYear.getText()};
//		model.addRow(informations);
//		
		ModulesTable.getColumnModel().getColumn(1).setPreferredWidth(113);
		scrollPane.setViewportView(ModulesTable);
		getContentPane().setLayout(groupLayout);
	}
}
