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
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class AddStdForm extends JDialog {
	
	
	private String levelSelected;
	
	
	private JTextField UsernametextField;
	private JTextField PasswordtextField;
	private JTextField FirstnametextField;
	private JTextField LastnametextField;
	private JTextField phonenumtextField;
	private JTextField addresstextField;
	private JTextField emailtextField;
	private String Sex;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnSubmit;
	private JComboBox LevelSelected;

	
	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}
	

	public JComboBox getLevelSelected() {
		return LevelSelected;
	}


	

	public JTextField getUsernametextField() {
		return UsernametextField;
	}


	public JTextField getPasswordtextField() {
		return PasswordtextField;
	}


	public JTextField getFirstnametextField() {
		return FirstnametextField;
	}


	public JTextField getLastnametextField() {
		return LastnametextField;
	}


	public JTextField getPhonenumtextField() {
		return phonenumtextField;
	}


	public JTextField getAddresstextField() {
		return addresstextField;
	}


	public JTextField getEmailtextField() {
		return emailtextField;
	}


	public String getSex() {
		return Sex;
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddStdForm dialog = new AddStdForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddStdForm() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setFont(new Font("Arial", Font.ITALIC, 20));
		setBounds(100, 100, 504, 562);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblAddress = new JLabel("address");
		lblAddress.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblEmali = new JLabel("email");
		lblEmali.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblPhoennumber = new JLabel("Phonenumber");
		lblPhoennumber.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setFont(new Font("Arial", Font.ITALIC, 20));
		
		UsernametextField = new JTextField();
		UsernametextField.setFont(new Font("Arial", Font.ITALIC, 20));
		UsernametextField.setColumns(10);
		
		PasswordtextField = new JTextField();
		PasswordtextField.setFont(new Font("Arial", Font.ITALIC, 20));
		PasswordtextField.setColumns(10);
		
		FirstnametextField = new JTextField();
		FirstnametextField.setFont(new Font("Arial", Font.ITALIC, 20));
		FirstnametextField.setColumns(10);
		
		LastnametextField = new JTextField();
		LastnametextField.setFont(new Font("Arial", Font.ITALIC, 20));
		LastnametextField.setColumns(10);
		
		phonenumtextField = new JTextField();
		phonenumtextField.setFont(new Font("Arial", Font.ITALIC, 20));
		phonenumtextField.setColumns(10);
		
		addresstextField = new JTextField();
		addresstextField.setFont(new Font("Arial", Font.ITALIC, 20));
		addresstextField.setColumns(10);
		
		emailtextField = new JTextField();
		emailtextField.setFont(new Font("Arial", Font.ITALIC, 20));
		emailtextField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.ITALIC, 20));
		buttonGroup.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(Color.LIGHT_GRAY);
		rdbtnFemale.setFont(new Font("Arial", Font.ITALIC, 20));
		buttonGroup.add(rdbtnFemale);
		LevelSelected = new JComboBox();
		
		LevelSelected.setModel(new DefaultComboBoxModel(new String[] {"", "4", "5", "6"}));
		LevelSelected.setFont(new Font("Arial", Font.ITALIC, 20));
		LevelSelected.setBackground(UIManager.getColor("Button.background"));
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel malelogo = new JLabel("");
		ImageIcon logo = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/maleImg.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		malelogo.setIcon(logo);
		
		JLabel femalelogo = new JLabel("");
		ImageIcon felogo = new ImageIcon(new ImageIcon(studentDashboard.class.getResource("/images/female.png")).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		femalelogo.setIcon(felogo);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFirstName)
								.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPhoennumber, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmali, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblLevel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSex, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(addresstextField, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addComponent(emailtextField, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addComponent(LevelSelected, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(LastnametextField, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
									.addComponent(phonenumtextField, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
									.addComponent(FirstnametextField, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
									.addComponent(PasswordtextField, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
									.addComponent(UsernametextField, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(malelogo, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnNewRadioButton)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(femalelogo, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnFemale))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(151)
							.addComponent(btnSubmit)))
					.addGap(32))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(UsernametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblFirstName))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(PasswordtextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(FirstnametextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(LastnametextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPhoennumber, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(phonenumtextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblEmali, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(addresstextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(emailtextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblSex, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
										.addComponent(malelogo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(26)
									.addComponent(rdbtnNewRadioButton))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(femalelogo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(26)
									.addComponent(rdbtnFemale)))))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(LevelSelected, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLevel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addGap(32))
		);
		getContentPane().setLayout(groupLayout);
	}
}
