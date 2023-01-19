package frontEnd;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class form extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblFullName;
	private JLabel lblMobileNumber;
	private JTextField MobileNumTextField;
	private JLabel lblAddress;
	private JTextField AddresstextField;
	private JTextField FullNameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			form dialog = new form();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public form() {
		setTitle("Landlord Form");
		setBounds(100, 100, 650, 450);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, contentPanel, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, contentPanel, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, contentPanel, 411, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, contentPanel, 634, SpringLayout.WEST, getContentPane());
		getContentPane().setLayout(springLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		SpringLayout sl_contentPanel = new SpringLayout();
		contentPanel.setLayout(sl_contentPanel);
		{
			lblFullName = new JLabel("Full Name");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblFullName, 34, SpringLayout.NORTH, contentPanel);
			lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 15));
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblFullName, 29, SpringLayout.WEST, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.EAST, lblFullName, 95, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblFullName);
		}
		{
			lblMobileNumber = new JLabel("Mobile Number");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblMobileNumber, 126, SpringLayout.SOUTH, lblFullName);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblMobileNumber, 24, SpringLayout.WEST, contentPanel);
			lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(lblMobileNumber);
		}
		{
			MobileNumTextField = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.WEST, MobileNumTextField, 71, SpringLayout.EAST, lblMobileNumber);
			sl_contentPanel.putConstraint(SpringLayout.EAST, MobileNumTextField, -10, SpringLayout.EAST, contentPanel);
			MobileNumTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			MobileNumTextField.setColumns(10);
			contentPanel.add(MobileNumTextField);
		}
		{
			lblAddress = new JLabel("Address");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblAddress, 88, SpringLayout.SOUTH, lblMobileNumber);
			sl_contentPanel.putConstraint(SpringLayout.EAST, lblAddress, 0, SpringLayout.EAST, lblFullName);
			lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(lblAddress);
		}
		{
			AddresstextField = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.SOUTH, MobileNumTextField, -87, SpringLayout.NORTH, AddresstextField);
			sl_contentPanel.putConstraint(SpringLayout.NORTH, AddresstextField, 0, SpringLayout.NORTH, lblAddress);
			sl_contentPanel.putConstraint(SpringLayout.WEST, AddresstextField, 97, SpringLayout.EAST, lblAddress);
			sl_contentPanel.putConstraint(SpringLayout.EAST, AddresstextField, -10, SpringLayout.EAST, contentPanel);
			AddresstextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			AddresstextField.setColumns(10);
			contentPanel.add(AddresstextField);
		}
		{
			FullNameTextField = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, FullNameTextField, -8, SpringLayout.NORTH, lblFullName);
			sl_contentPanel.putConstraint(SpringLayout.WEST, FullNameTextField, 97, SpringLayout.EAST, lblFullName);
			sl_contentPanel.putConstraint(SpringLayout.SOUTH, FullNameTextField, 33, SpringLayout.NORTH, lblFullName);
			sl_contentPanel.putConstraint(SpringLayout.EAST, FullNameTextField, -10, SpringLayout.EAST, contentPanel);
			FullNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
			FullNameTextField.setColumns(10);
			contentPanel.add(FullNameTextField);
		}
		
		JLabel fullNameErrorMsg = new JLabel("FullName Cannot be empty");
		sl_contentPanel.putConstraint(SpringLayout.NORTH, MobileNumTextField, 28, SpringLayout.SOUTH, fullNameErrorMsg);
		fullNameErrorMsg.setForeground(Color.RED);
		sl_contentPanel.putConstraint(SpringLayout.EAST, fullNameErrorMsg, 470, SpringLayout.WEST, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, fullNameErrorMsg, 53, SpringLayout.SOUTH, FullNameTextField);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, fullNameErrorMsg, 21, SpringLayout.SOUTH, FullNameTextField);
		sl_contentPanel.putConstraint(SpringLayout.WEST, fullNameErrorMsg, 213, SpringLayout.WEST, contentPanel);
		fullNameErrorMsg.setVisible(false);
		fullNameErrorMsg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPanel.add(fullNameErrorMsg);
		
		JButton btnNewButton = new JButton("Submit");
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, AddresstextField, -46, SpringLayout.NORTH, btnNewButton);
		sl_contentPanel.putConstraint(SpringLayout.WEST, btnNewButton, 250, SpringLayout.WEST, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, contentPanel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(FullNameTextField.getText().isEmpty()) {
					fullNameErrorMsg.setVisible(true);
					
				}else {

					fullNameErrorMsg.setVisible(false);
				}
			}
		});
		contentPanel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton Male = new JRadioButton("Male");
		sl_contentPanel.putConstraint(SpringLayout.WEST, Male, 0, SpringLayout.WEST, btnNewButton);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, Male, -6, SpringLayout.NORTH, btnNewButton);
		contentPanel.add(Male);
		
		JRadioButton Female = new JRadioButton("Female");
		sl_contentPanel.putConstraint(SpringLayout.NORTH, Female, 17, SpringLayout.SOUTH, AddresstextField);
		sl_contentPanel.putConstraint(SpringLayout.EAST, Female, -62, SpringLayout.EAST, contentPanel);
		contentPanel.add(Female);
	}
}
