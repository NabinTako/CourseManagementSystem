package FinalFrontend;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Image;
import java.util.Enumeration;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class AddTeacherForm extends JDialog {
	
	private JTextField FirstNametextField;
	private JTextField lastNametextField;
	private JTextField AddresstextField;
	private JTextField NumbertextField;
	private JButton btnSubmit;
	private JLabel lblshowID;
	private JLabel lblType;
	private JTextField userNametextField;
	private JTextField passWordtextField;
	private JTextField ModuleAssignedtextField;
	private JCheckBox isPartTimeCheckBox;
	
	
	
	public JCheckBox getIsPartTimeCheckBox() {
		return isPartTimeCheckBox;
	}

	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	
	
	

	public JLabel getLblshowID() { // Label that displays id
		return lblshowID;
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	public JTextField getFirstNametextField() {
		return FirstNametextField;
	}

	public JTextField getLastNametextField() {
		return lastNametextField;
	}

	public JTextField getAddresstextField() {
		return AddresstextField;
	}

	public JTextField getNumbertextField() {
		return NumbertextField;
	}
	public JTextField getUsernametextField() {
		return userNametextField;
	}

	public JTextField getPasswordtextField() {
		return passWordtextField;
	}
	public JTextField getModuleAssignedtextField() {
		return ModuleAssignedtextField;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddTeacherForm dialog = new AddTeacherForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddTeacherForm() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Teacher Form");
		setBounds(100, 100, 693, 691);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Arial", Font.ITALIC, 20));
		
		FirstNametextField = new JTextField();
		FirstNametextField.setFont(new Font("Arial", Font.ITALIC, 20));
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Arial", Font.ITALIC, 20));
		
		lastNametextField = new JTextField();
		lastNametextField.setFont(new Font("Arial", Font.ITALIC, 20));
		lastNametextField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Arial", Font.ITALIC, 20));
		
		AddresstextField = new JTextField();
		AddresstextField.setFont(new Font("Arial", Font.ITALIC, 20));
		AddresstextField.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setFont(new Font("Arial", Font.ITALIC, 20));
		
		NumbertextField = new JTextField();
		NumbertextField.setFont(new Font("Arial", Font.ITALIC, 20));
		NumbertextField.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Arial", Font.ITALIC, 20));
		
		lblshowID = new JLabel("Auto Generated");
		lblshowID.setFont(new Font("Arial", Font.ITALIC, 20));
		
		lblType = new JLabel("Type");
		lblType.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblPassword = new JLabel("PassWord");
		lblPassword.setFont(new Font("Arial", Font.ITALIC, 20));
		
		userNametextField = new JTextField();
		userNametextField.setFont(new Font("Arial", Font.ITALIC, 20));
		userNametextField.setColumns(10);
		
		passWordtextField = new JTextField();
		passWordtextField.setFont(new Font("Arial", Font.ITALIC, 20));
		passWordtextField.setColumns(10);
		
		JLabel lblModuleAssigned = new JLabel("Module Assigned");
		lblModuleAssigned.setFont(new Font("Arial", Font.ITALIC, 20));
		
		ModuleAssignedtextField = new JTextField();
		ModuleAssignedtextField.setFont(new Font("Arial", Font.ITALIC, 20));
		ModuleAssignedtextField.setColumns(10);
		
		isPartTimeCheckBox = new JCheckBox("is part_time");
		isPartTimeCheckBox.setBackground(Color.LIGHT_GRAY);
		isPartTimeCheckBox.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel MaleLogo = new JLabel("");
		ImageIcon logo = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/maleImg.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		MaleLogo.setIcon(logo);
		MaleLogo.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel FemaleLogo = new JLabel("");
		ImageIcon Femaleimg = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/female.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		FemaleLogo.setIcon(Femaleimg);
		FemaleLogo.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel PartTimeLogo = new JLabel("");
		ImageIcon parttimelogo = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/partTime.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		PartTimeLogo.setIcon(parttimelogo);
		PartTimeLogo.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(67)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(25)
									.addComponent(lblId)
									.addGap(149)
									.addComponent(lblshowID, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblFirstName)
									.addGap(95)
									.addComponent(FirstNametextField, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(lblPhoneNumber, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblModuleAssigned, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblType, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
										.addGap(6)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addGap(10)
												.addComponent(PartTimeLogo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(isPartTimeCheckBox))
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(ModuleAssignedtextField, Alignment.LEADING)
												.addComponent(passWordtextField, Alignment.LEADING)
												.addComponent(userNametextField, Alignment.LEADING)
												.addComponent(NumbertextField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE))))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblSex, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
										.addGap(79)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addGap(10)
												.addComponent(MaleLogo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(rdbtnNewRadioButton)
												.addGap(28)
												.addComponent(FemaleLogo)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(rdbtnNewRadioButton_1))
											.addComponent(AddresstextField, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
											.addComponent(lastNametextField, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(251)
							.addComponent(btnSubmit)))
					.addContainerGap(100, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(4)
									.addComponent(lblId))
								.addComponent(lblshowID))
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblFirstName))
								.addComponent(FirstNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblLastName))
								.addComponent(lastNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(FemaleLogo)
													.addComponent(MaleLogo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.UNRELATED))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(rdbtnNewRadioButton_1)
												.addGap(19))))
									.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(rdbtnNewRadioButton)
										.addGap(18)))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblSex, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addGap(18)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblAddress))
								.addComponent(AddresstextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblPhoneNumber))
								.addComponent(NumbertextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(isPartTimeCheckBox)
								.addComponent(lblType))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(userNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsername))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(21)
									.addComponent(lblPassword))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(passWordtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(31)
									.addComponent(lblModuleAssigned))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(25)
									.addComponent(ModuleAssignedtextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(314)
							.addComponent(PartTimeLogo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addGap(55)
					.addComponent(btnSubmit)
					.addGap(35))
		);
		getContentPane().setLayout(groupLayout);
	}
}
