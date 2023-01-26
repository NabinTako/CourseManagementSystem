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

public class AddTeacherForm extends JDialog {
	
	private JTextField FirstNametextField;
	private JTextField lastNametextField;
	private JTextField AddresstextField;
	private JTextField NumbertextField;
	private JButton btnSubmit;
	
	
	

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
		setBounds(100, 100, 437, 390);
		
		JLabel lblFirstName = new JLabel("First Name");
		
		FirstNametextField = new JTextField();
		FirstNametextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		
		lastNametextField = new JTextField();
		lastNametextField.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		
		AddresstextField = new JTextField();
		AddresstextField.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		
		NumbertextField = new JTextField();
		NumbertextField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFirstName)
								.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPhoneNumber, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(NumbertextField, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
								.addComponent(AddresstextField, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
								.addComponent(lastNametextField, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
								.addComponent(FirstNametextField, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(140)
							.addComponent(btnSubmit)))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName)
						.addComponent(FirstNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName)
						.addComponent(lastNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(AddresstextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPhoneNumber)
						.addComponent(NumbertextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addGap(43))
		);
		getContentPane().setLayout(groupLayout);
	}
}
