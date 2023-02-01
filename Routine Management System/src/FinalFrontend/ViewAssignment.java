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
import javax.swing.LayoutStyle.ComponentPlacement;

public class ViewAssignment extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ViewAssignment dialog = new ViewAssignment("k","l","m","n","o","p","q","r","s");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
//	see.getOodpname(rowselected),see.getOodpq1(rowselected),see.getOodpq2(rowselected),see.getOodpq3(rowselected),see.getOodpq4(rowselected),
//	see.getOodpAns1(rowselected),see.getOodpAns2(rowselected),see.getOodpAns3(rowselected),see.getOodpAns4(rowselected)
	public ViewAssignment(String name,String Q1,String Q2,String Q3,String Q4,String Ans1,String Ans2,String Ans3,String Ans4) {
		setResizable(false);
		setBounds(100, 100, 572, 422);
		
		JLabel lblNewLabel = new JLabel("Uploaded By:");
		lblNewLabel.setBounds(95, 11, 97, 19);
		lblNewLabel.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblQ = new JLabel("Q1");
		lblQ.setBounds(135, 64, 57, 19);
		lblQ.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblAns = new JLabel("Ans");
		lblAns.setBounds(135, 94, 57, 19);
		lblAns.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblQ_2 = new JLabel("Q2");
		lblQ_2.setBounds(135, 124, 57, 19);
		lblQ_2.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblQ_3 = new JLabel("Q3");
		lblQ_3.setBounds(135, 184, 57, 19);
		lblQ_3.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblQ_4 = new JLabel("Q4");
		lblQ_4.setBounds(135, 244, 57, 19);
		lblQ_4.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblAns_1 = new JLabel("Ans");
		lblAns_1.setBounds(135, 154, 57, 19);
		lblAns_1.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblAns_2 = new JLabel("Ans");
		lblAns_2.setBounds(135, 214, 57, 19);
		lblAns_2.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblAns_3 = new JLabel("Ans");
		lblAns_3.setBounds(135, 274, 57, 19);
		lblAns_3.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lblDisplayName = new JLabel("Uploaded By:");
		lblDisplayName.setText(name);
		lblDisplayName.setBounds(259, 11, 97, 19);
		lblDisplayName.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lbldisplayQ1 = new JLabel("Uploaded By:");
		lbldisplayQ1.setText(Q1);
		lbldisplayQ1.setBounds(254, 64, 292, 19);
		lbldisplayQ1.setFont(new Font("Arial", Font.ITALIC, 16));
		
		JLabel lbldisplayAns1 = new JLabel("Uploaded By:");
		lbldisplayAns1.setText(Ans1);
		lbldisplayAns1.setBounds(254, 94, 292, 19);
		lbldisplayAns1.setFont(new Font("Arial", Font.ITALIC, 16));
		getContentPane().setLayout(null);
		getContentPane().add(lblQ_4);
		getContentPane().add(lblAns_3);
		getContentPane().add(lblAns_1);
		getContentPane().add(lblQ_3);
		getContentPane().add(lblQ_2);
		getContentPane().add(lblAns);
		getContentPane().add(lbldisplayAns1);
		getContentPane().add(lblQ);
		getContentPane().add(lbldisplayQ1);
		getContentPane().add(lblNewLabel);
		getContentPane().add(lblDisplayName);
		getContentPane().add(lblAns_2);
		
		JLabel lblDisplayQ2 = new JLabel("Uploaded By:");
		lblDisplayQ2.setText(Q2);
		lblDisplayQ2.setFont(new Font("Arial", Font.ITALIC, 16));
		lblDisplayQ2.setBounds(254, 124, 292, 19);
		getContentPane().add(lblDisplayQ2);
		
		JLabel lblDisplayQ3 = new JLabel("Uploaded By:");
		lblDisplayQ3.setText(Q3);
		lblDisplayQ3.setFont(new Font("Arial", Font.ITALIC, 16));
		lblDisplayQ3.setBounds(254, 184, 292, 19);
		getContentPane().add(lblDisplayQ3);
		
		JLabel lblDisplayQ4 = new JLabel("Uploaded By:");
		lblDisplayQ4.setText(Q4);
		lblDisplayQ4.setFont(new Font("Arial", Font.ITALIC, 16));
		lblDisplayQ4.setBounds(254, 244, 292, 19);
		getContentPane().add(lblDisplayQ4);
		
		JLabel lbldisplayAns2 = new JLabel("Uploaded By:");
		lbldisplayAns2.setText(Ans2);
		lbldisplayAns2.setFont(new Font("Arial", Font.ITALIC, 16));
		lbldisplayAns2.setBounds(254, 154, 292, 19);
		getContentPane().add(lbldisplayAns2);
		
		JLabel lbldisplayAns3 = new JLabel("Uploaded By:");
		lbldisplayAns3.setText(Ans3);
		lbldisplayAns3.setFont(new Font("Arial", Font.ITALIC, 16));
		lbldisplayAns3.setBounds(254, 214, 292, 19);
		getContentPane().add(lbldisplayAns3);
		
		JLabel lbldisplayAns4 = new JLabel("Uploaded By:");
		lbldisplayAns4.setText(Ans4);
		lbldisplayAns4.setFont(new Font("Arial", Font.ITALIC, 16));
		lbldisplayAns4.setBounds(254, 274, 292, 19);
		getContentPane().add(lbldisplayAns4);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 16));
		btnNewButton.setBounds(155, 333, 157, 23);
		getContentPane().add(btnNewButton);
	}
}
