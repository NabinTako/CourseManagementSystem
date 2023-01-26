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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ModuleForm extends JDialog {
	private JTextField NametextField;
	private JTextField ModuleNumbertextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ModuleForm dialog = new ModuleForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ModuleForm() {
		setBounds(100, 100, 450, 300);
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.ITALIC, 20));
		
		NametextField = new JTextField();
		NametextField.setFont(new Font("Arial", Font.ITALIC, 20));
		NametextField.setColumns(10);
		
		JLabel lblModuleNumber = new JLabel("Module Number");
		lblModuleNumber.setFont(new Font("Arial", Font.ITALIC, 20));
		
		ModuleNumbertextField = new JTextField();
		ModuleNumbertextField.setFont(new Font("Arial", Font.ITALIC, 20));
		ModuleNumbertextField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblModuleNumber, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ModuleNumbertextField, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
						.addComponent(NametextField, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblName)
						.addComponent(NametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblModuleNumber, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(ModuleNumbertextField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(152))
		);
		getContentPane().setLayout(groupLayout);
	}
}
