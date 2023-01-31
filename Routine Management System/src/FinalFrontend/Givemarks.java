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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Givemarks extends JDialog {
	private JTextField oodpMarktextField;
	private JTextField CmarktextField;
	private JLabel lblDisplayName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Givemarks dialog = new Givemarks("k","j");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Givemarks(String firstName,String lastName) {
		String name = firstName + "" + lastName;
		setTitle("Give Marks");
		setResizable(false);
		setBounds(100, 100, 354, 312);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblOodp = new JLabel("OODP");
		lblOodp.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String oodpmark =oodpMarktextField.getText().trim();
				String Cmark = CmarktextField.getText().trim();
				
				new UpdateTableInformation(firstName,lastName,oodpmark,Cmark);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 20));
		
		oodpMarktextField = new JTextField();
		oodpMarktextField.setFont(new Font("Arial", Font.ITALIC, 20));
		oodpMarktextField.setColumns(10);
		
		CmarktextField = new JTextField();
		CmarktextField.setFont(new Font("Arial", Font.ITALIC, 20));
		CmarktextField.setColumns(10);
		
		lblDisplayName = new JLabel("Name");
		lblDisplayName.setText(name);
		lblDisplayName.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblC, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOodp, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(CmarktextField, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
								.addComponent(oodpMarktextField, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
								.addComponent(lblDisplayName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(96)
							.addComponent(btnNewButton)))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblDisplayName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOodp, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(oodpMarktextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblC, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(CmarktextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(47))
		);
		getContentPane().setLayout(groupLayout);
	}
}
