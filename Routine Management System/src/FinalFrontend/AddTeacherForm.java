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
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class AddTeacherForm extends JDialog {
	
	private JTextField FirstNametextField;
	private JTextField lastNametextField;
	private JTextField AddresstextField;
	private JTextField NumbertextField;
	private JTextField TypetextField;
	private JButton btnSubmit;
	private JLabel lblshowID;
	private JLabel lblType;
	private JTextField userNametextField;
	private JTextField passWordtextField;
	
	
	

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
	
	public JTextField getTypetextField() {
		return TypetextField;
	}
	
	public JTextField getUsername() {
		return userNametextField;
	}

	public JTextField getPassword() {
		return passWordtextField;
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
		setTitle("Teacher Form");
		setBounds(100, 100, 552, 603);
		
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
		
		TypetextField = new JTextField();
		TypetextField.setFont(new Font("Arial", Font.ITALIC, 20));
		TypetextField.setColumns(10);
		
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
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblType, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(TypetextField, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
								.addComponent(userNametextField, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
								.addComponent(passWordtextField, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
								.addComponent(btnSubmit)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(51)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblFirstName)
										.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPhoneNumber, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(76)
									.addComponent(lblId)
									.addGap(112)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lastNametextField, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
								.addComponent(FirstNametextField, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
								.addComponent(NumbertextField, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
								.addComponent(AddresstextField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblshowID, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(47, Short.MAX_VALUE)
							.addComponent(lblId)
							.addGap(37))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addComponent(lblshowID, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName)
						.addComponent(FirstNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName)
						.addComponent(lastNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(AddresstextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPhoneNumber)
						.addComponent(NumbertextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblType, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(TypetextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(userNametextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addComponent(passWordtextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(57)
					.addComponent(btnSubmit)
					.addGap(22))
		);
		getContentPane().setLayout(groupLayout);
	}
}
