package FinalFrontend;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AssignmentPannel extends JDialog {
	private JTextField Ans1textField;
	private JTextField Ans2textField;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AssignmentPannel dialog = new AssignmentPannel();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AssignmentPannel() {
		setResizable(false);
		setFont(new Font("Arial", Font.ITALIC, 16));
		setBounds(100, 100, 656, 414);
		JLabel lblN = new JLabel("Uploaded BY:");
		lblN.setBounds(142, 11, 100, 19);
		lblN.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblQ = new JLabel("Q1");
		lblQ.setBounds(163, 49, 21, 19);
		lblQ.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel Q2 = new JLabel("Q2");
		Q2.setBounds(163, 115, 27, 19);
		Q2.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblQ3 = new JLabel("Q3");
		lblQ3.setBounds(160, 181, 34, 19);
		lblQ3.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblQ4 = new JLabel("Q4");
		lblQ4.setBounds(161, 247, 30, 19);
		lblQ4.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblN_1 = new JLabel("Uploaded BY:");
		lblN_1.setBounds(216, 49, 100, 19);
		lblN_1.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblN_2 = new JLabel("Uploaded BY:");
		lblN_2.setBounds(219, 115, 100, 19);
		lblN_2.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblN_3 = new JLabel("Uploaded BY:");
		lblN_3.setBounds(216, 181, 100, 19);
		lblN_3.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblQ_1 = new JLabel("Q");
		lblQ_1.setBounds(217, 247, 56, 19);
		lblQ_1.setFont(new Font("Arial", Font.ITALIC, 16));
		
		Ans1textField = new JTextField();
		Ans1textField.setBounds(142, 79, 334, 25);
		Ans1textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Ans1textField.setColumns(10);
		
		Ans2textField = new JTextField();
		Ans2textField.setBounds(142, 145, 334, 25);
		Ans2textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Ans2textField.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(142, 211, 334, 25);
		textField.setFont(new Font("Arial", Font.ITALIC, 16));
		textField.setColumns(10);
		getContentPane().setLayout(null);
		getContentPane().add(lblQ4);
		getContentPane().add(lblQ_1);
		getContentPane().add(Q2);
		getContentPane().add(lblQ);
		getContentPane().add(lblN_1);
		getContentPane().add(lblN_2);
		getContentPane().add(Ans1textField);
		getContentPane().add(lblN);
		getContentPane().add(lblQ3);
		getContentPane().add(Ans2textField);
		getContentPane().add(textField);
		getContentPane().add(lblN_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.ITALIC, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(142, 277, 334, 25);
		getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(197, 329, 179, 23);
		getContentPane().add(btnNewButton);
	}
}
