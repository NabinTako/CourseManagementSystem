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

public class viewMarks extends JDialog {
	private JButton btnGenerate;
	private JLabel lblDisplayPercentage;
	private JLabel lblDisplayCmark;
	private JLabel lblDisplayoodpmark;
	private JLabel lblDisplayFirstName;
	private JLabel lblDisplayLastName;
	

	public JLabel getLblDisplayPercentage() {
		return lblDisplayPercentage;
	}

	public JLabel getLblDisplayCmark() {
		return lblDisplayCmark;
	}

	public JLabel getLblDisplayoodpmark() {
		return lblDisplayoodpmark;
	}

	public JLabel getLblDisplayFirstName() {
		return lblDisplayFirstName;
	}

	public JLabel getLblDisplayLastName() {
		return lblDisplayLastName;
	}

	public JButton getBtnGenerate() {
		return btnGenerate;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			viewMarks dialog = new viewMarks("j","k","6","6");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public viewMarks(String fname,String lname,String oodpMark,String Cmark) {
		setBounds(100, 100, 550, 392);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.ITALIC, 20));
		
		lblDisplayFirstName = new JLabel("Name");
		lblDisplayFirstName.setFont(new Font("Arial", Font.ITALIC, 20));
		lblDisplayFirstName.setText(fname);
		
		JLabel lblName_2 = new JLabel("OODP mark");
		lblName_2.setFont(new Font("Arial", Font.ITALIC, 20));
		
		lblDisplayoodpmark = new JLabel("Name");
		lblDisplayoodpmark.setFont(new Font("Arial", Font.ITALIC, 20));
		lblDisplayoodpmark.setText(oodpMark);
		
		JLabel lblName_4 = new JLabel("C mark");
		lblName_4.setFont(new Font("Arial", Font.ITALIC, 20));
		
		lblDisplayCmark = new JLabel("Name");
		lblDisplayCmark.setFont(new Font("Arial", Font.ITALIC, 20));
		lblDisplayCmark.setText(Cmark);
		
		btnGenerate = new JButton("Generate");
		btnGenerate.setFont(new Font("Arial", Font.ITALIC, 20));
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setFont(new Font("Arial", Font.ITALIC, 20));
		
		lblDisplayPercentage = new JLabel("Percentage");
		float cmark= Integer.parseInt(lblDisplayCmark.getText().trim());
		float oodpmark= Integer.parseInt(lblDisplayoodpmark.getText().trim());
		float percentage = ((cmark+oodpmark)/20) *100;
		String per = String.format("%.02f", percentage)+" %";
		lblDisplayPercentage.setText(per);
		lblDisplayPercentage.setFont(new Font("Arial", Font.ITALIC, 20));
		
		lblDisplayLastName = new JLabel("<dynamic>");
		lblDisplayLastName.setText(lname);
		lblDisplayLastName.setFont(new Font("Arial", Font.ITALIC, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblName_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
							.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblName_4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblPercentage, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(lblDisplayFirstName, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblDisplayLastName, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblDisplayCmark, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblDisplayoodpmark, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
								.addComponent(lblDisplayPercentage, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(13, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(187)
					.addComponent(btnGenerate)
					.addContainerGap(232, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblName)
							.addGap(18)
							.addComponent(lblName_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblName_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblPercentage, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDisplayFirstName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDisplayLastName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lblDisplayoodpmark, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblDisplayCmark, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDisplayPercentage, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(62)
					.addComponent(btnGenerate)
					.addContainerGap(84, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
