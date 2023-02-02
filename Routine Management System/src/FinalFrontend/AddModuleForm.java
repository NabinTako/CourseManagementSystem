package FinalFrontend;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import FinalBackend.UpdateTableInformation;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class AddModuleForm extends JDialog {
	private JTextField ModuleNametextField;
	private JTextField ModuleNumtextField;
	private JTextField CredittextField;
	private JComboBox Semester;
	private JComboBox level;
	private JButton btnAdd;
	private JLabel displayCourseName;
	
	

	public JTextField getModuleNametextField() {
		return ModuleNametextField;
	}

	public JTextField getModuleNumtextField() {
		return ModuleNumtextField;
	}

	public JTextField getCredittextField() {
		return CredittextField;
	}

	public JComboBox getSemester() {
		return Semester;
	}

	public JComboBox getLevel() {
		return level;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}
	
	String semesterSelected;
	String levelSelected;
	String typeSelected;

	public String getSemesterSelected() {
		return semesterSelected;
	}

	public String getLevelSelected() {
		return levelSelected;
	}

	public String getTypeSelected() {
		return typeSelected;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddModuleForm dialog = new AddModuleForm("bit");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	/*
	 * Create the dialog.
	 */
	public AddModuleForm(String name) {
		String coursename=name.toLowerCase();
		setBounds(100, 100, 464, 447);
		
		JLabel lblNeeModule = new JLabel("Module Name");
		lblNeeModule.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblModuleNumber = new JLabel("Module Number");
		lblModuleNumber.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblCredit = new JLabel("Credit");
		lblCredit.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Arial", Font.ITALIC, 20));
		
		ModuleNametextField = new JTextField();
		ModuleNametextField.setFont(new Font("Arial", Font.ITALIC, 20));
		ModuleNametextField.setColumns(10);
		
		ModuleNumtextField = new JTextField();
		ModuleNumtextField.setFont(new Font("Arial", Font.ITALIC, 20));
		ModuleNumtextField.setColumns(10);
		
		CredittextField = new JTextField();
		CredittextField.setFont(new Font("Arial", Font.ITALIC, 20));
		CredittextField.setColumns(10);
		
		Semester = new JComboBox();
		Semester.setModel(new DefaultComboBoxModel(new String[] {" ", "First", "Second"}));
		Semester.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					semesterSelected = (String) e.getItem();
//					System.out.println(semesterSelected);
				}
			}
		});
		Semester.setFont(new Font("Arial", Font.ITALIC, 20));
		
		level = new JComboBox();
		level.setModel(new DefaultComboBoxModel(new String[] {" ", "4", "5", "6"}));
		level.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					levelSelected = (String) e.getItem();
//					System.out.println(levelSelected);
				}
			}
		});
		level.setFont(new Font("Arial", Font.ITALIC, 20));
		
		btnAdd = new JButton("Add");
//		btnAdd.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				new UpdateTableInformation(coursename,ModuleNametextField.getText().trim(),ModuleNumtextField.getText().trim(),semesterSelected,levelSelected,CredittextField.getText().trim(),typeSelected);
//				
//			}
//		});
		btnAdd.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JComboBox Type = new JComboBox();
		Type.setModel(new DefaultComboBoxModel(new String[] {"", "Core", "Optional"}));
		Type.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					typeSelected = (String) e.getItem();
//					System.out.println(typeSelected);
				}
			}
		});
		Type.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("Arial", Font.ITALIC, 20));
		
		displayCourseName = new JLabel("Course Name");
		displayCourseName.setText(coursename);
		displayCourseName.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(154)
							.addComponent(btnAdd))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNeeModule)
								.addComponent(lblModuleNumber, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSemester)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblLevel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblCredit, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblType, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCourseName, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(displayCourseName, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addComponent(Type, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
								.addComponent(CredittextField, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
								.addComponent(level, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(ModuleNumtextField, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
									.addComponent(ModuleNametextField, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
									.addComponent(Semester, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(34, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCourseName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(displayCourseName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNeeModule)
						.addComponent(ModuleNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblModuleNumber, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(ModuleNumtextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSemester, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(Semester, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblLevel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(21))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(level, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCredit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(CredittextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblType, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(Type, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnAdd)
					.addGap(21))
		);
		getContentPane().setLayout(groupLayout);
	}

}
