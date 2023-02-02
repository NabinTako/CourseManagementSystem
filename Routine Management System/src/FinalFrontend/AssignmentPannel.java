package FinalFrontend;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import FinalBackend.uploadAssignment;

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
	private JTextField Ans3textField;
	private JTextField Ans4textField;
	private JButton btnNewButton;
	
	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AssignmentPannel dialog = new AssignmentPannel("oodp","k","jk","5","helo","hi","wht","fr");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AssignmentPannel(String modulename,String stdName,String name,String number,String Q1,String Q2,String Q3,String Q4) {
		setTitle("a");
		setResizable(false);
		setFont(new Font("Arial", Font.ITALIC, 16));
		setBounds(100, 100, 656, 414);
		JLabel lblN = new JLabel("Uploaded BY:");
		lblN.setBounds(172, 11, 100, 19);
		lblN.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblQ = new JLabel("Q1");
		lblQ.setBounds(163, 49, 21, 19);
		lblQ.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblQ2 = new JLabel("Q2");
		lblQ2.setBounds(163, 115, 27, 19);
		lblQ2.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblQ3 = new JLabel("Q3");
		lblQ3.setBounds(160, 181, 34, 19);
		lblQ3.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lblQ4 = new JLabel("Q4");
		lblQ4.setBounds(161, 247, 30, 19);
		lblQ4.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lbldisplayQ1 = new JLabel("Uploaded BY:");
		lbldisplayQ1.setText(Q1);
		lbldisplayQ1.setBounds(216, 49, 292, 19);
		lbldisplayQ1.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lbldisplayQ2 = new JLabel("Uploaded BY:");
		lbldisplayQ2.setText(Q2);
		lbldisplayQ2.setBounds(219, 115, 289, 19);
		lbldisplayQ2.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lbldisplayQ3 = new JLabel("Uploaded BY:");
		lbldisplayQ3.setText(Q3);
		lbldisplayQ3.setBounds(216, 181, 292, 19);
		lbldisplayQ3.setFont(new Font("Arial", Font.ITALIC, 16));
		JLabel lbldisplayQ4 = new JLabel("Q");
		lbldisplayQ4.setText(Q4);
		lbldisplayQ4.setBounds(217, 247, 291, 19);
		lbldisplayQ4.setFont(new Font("Arial", Font.ITALIC, 16));
		
		Ans1textField = new JTextField();
		Ans1textField.setBounds(142, 79, 334, 25);
		Ans1textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Ans1textField.setColumns(10);
		
		Ans2textField = new JTextField();
		Ans2textField.setBounds(142, 145, 334, 25);
		Ans2textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Ans2textField.setColumns(10);
		
		Ans3textField = new JTextField();
		Ans3textField.setBounds(142, 211, 334, 25);
		Ans3textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Ans3textField.setColumns(10);
		getContentPane().setLayout(null);
		getContentPane().add(lblQ4);
		getContentPane().add(lbldisplayQ4);
		getContentPane().add(lblQ2);
		getContentPane().add(lblQ);
		getContentPane().add(lbldisplayQ1);
		getContentPane().add(lbldisplayQ2);
		getContentPane().add(Ans1textField);
		getContentPane().add(lblN);
		getContentPane().add(lblQ3);
		getContentPane().add(Ans2textField);
		getContentPane().add(Ans3textField);
		getContentPane().add(lbldisplayQ3);
		
		Ans4textField = new JTextField();
		Ans4textField.setFont(new Font("Arial", Font.ITALIC, 16));
		Ans4textField.setColumns(10);
		Ans4textField.setBounds(142, 277, 334, 25);
		getContentPane().add(Ans4textField);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=stdName;
				String q1=lbldisplayQ1.getText().trim();
				String q2=lbldisplayQ2.getText().trim();
				String q3=lbldisplayQ3.getText().trim();
				String q4=lbldisplayQ4.getText().trim();
				String Ans1=Ans1textField.getText().trim();
				String Ans2=Ans2textField.getText().trim();
				String Ans3=Ans3textField.getText().trim();
				String Ans4=Ans4textField.getText().trim();
//				System.out.println(modulename);
//				System.out.println(number);
//				System.out.println(name);
//				System.out.println(q1);
//				System.out.println(q2);
//				System.out.println(q3);
//				System.out.println(q4);
//				System.out.println(Ans1);
//				System.out.println(Ans2);
//				System.out.println(Ans3);
//				System.out.println(Ans4);
				new uploadAssignment(modulename,number,name,q1,q2,q3,q4,Ans1,Ans2,Ans3,Ans4);
			}
		});
		btnNewButton.setBounds(197, 313, 179, 39);
		getContentPane().add(btnNewButton);
		
		JLabel lbldisplayname = new JLabel("Uploaded BY:");
		lbldisplayname.setText(name);
		lbldisplayname.setFont(new Font("Arial", Font.ITALIC, 16));
		lbldisplayname.setBounds(297, 11, 222, 19);
		getContentPane().add(lbldisplayname);
	}

}
