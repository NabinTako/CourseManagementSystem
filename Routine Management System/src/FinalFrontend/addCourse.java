package FinalFrontend;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import FinalBackend.courses_information;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addCourse extends JDialog {
	private JTextField CourseDurationTextField;
	private JTextField CourseNametextField;
	private JButton btnAddCourse;

	public JButton getBtnAddCourse() {
		return btnAddCourse;
	}

	public JTextField getCourseDurationTextField() {
		return CourseDurationTextField;
	}

	public JTextField getCourseNametextField() {
		return CourseNametextField;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			addCourse dialog = new addCourse();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public addCourse() {
		setTitle("Add Course");
		setBounds(100, 100, 450, 300);
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Arial", Font.ITALIC, 20));
		JLabel lblCourseDuration = new JLabel("Course Duration:");
		lblCourseDuration.setFont(new Font("Arial", Font.ITALIC, 20));
		CourseNametextField = new JTextField();
		CourseNametextField.setFont(new Font("Arial", Font.ITALIC, 20));
		CourseNametextField.setColumns(10);
		CourseDurationTextField = new JTextField();
		CourseDurationTextField.setFont(new Font("Arial", Font.ITALIC, 20));
		CourseDurationTextField.setColumns(10);
		btnAddCourse = new JButton("Add");
		btnAddCourse.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCourseDuration, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblName))
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(CourseNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(CourseDurationTextField, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(158)
							.addComponent(btnAddCourse)))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblName)
						.addComponent(CourseNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCourseDuration, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(CourseDurationTextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addComponent(btnAddCourse)
					.addGap(51))
		);
		getContentPane().setLayout(groupLayout);
	}

}
