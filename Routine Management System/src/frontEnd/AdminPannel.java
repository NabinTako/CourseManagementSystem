package frontEnd;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class AdminPannel{

	private JFrame frmNAdminPannel;
	private CardLayout cl_cardPanel = new CardLayout(0,0);
	private JPanel cardPanel;

	public JFrame getFrmNAdminPannel() {
		return frmNAdminPannel;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPannel window = new AdminPannel();
					window.frmNAdminPannel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminPannel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNAdminPannel = new JFrame();
		frmNAdminPannel.setTitle("Admin Pannel");
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 784, 561);
		frmNAdminPannel.setBounds(550, 200, 800, 600);
		JSplitPane SplitPane = new JSplitPane();
		SplitPane.setDividerSize(0);
		frmNAdminPannel.setContentPane(SplitPane);
		
		JPanel panel = new JPanel();
		SplitPane.setLeftComponent(panel);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("Landlord");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.err.println("LandLord button clicked");
				cl_cardPanel.show(cardPanel,"name_213271602538800");
				
		}});
		
		JButton btnTenent = new JButton("Tenant");
		btnTenent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(cardPanel,"name_213319282880400");
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Logout");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1_1, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
								.addComponent(btnTenent, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel)
					.addGap(66)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTenent, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(296, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setDividerSize(0);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		SplitPane.setRightComponent(splitPane_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 240, 240));
		splitPane_1.setLeftComponent(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Landlords");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBackground(new Color(204, 51, 51));
		lblNewLabel_1.setOpaque(true);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tenants");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1_1.setBackground(new Color(51, 255, 102));
		lblNewLabel_1_1.setOpaque(true);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(40)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(291)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		cardPanel = new JPanel();
		splitPane_1.setRightComponent(cardPanel);
		cardPanel.setLayout(cl_cardPanel);
		
		JPanel landlordCardPanel = new JPanel();
		cardPanel.add(landlordCardPanel, "name_213271602538800");
		
		JLabel lblNewLabel_2 = new JLabel("Landlord View");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnNewButton_1 = new JButton("Create landlord");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form landlordForm = new form();
				landlordForm.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_landlordCardPanel = new GroupLayout(landlordCardPanel);
		gl_landlordCardPanel.setHorizontalGroup(
			gl_landlordCardPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_landlordCardPanel.createSequentialGroup()
					.addGap(277)
					.addGroup(gl_landlordCardPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1)
						.addComponent(lblNewLabel_2))
					.addContainerGap(275, Short.MAX_VALUE))
		);
		gl_landlordCardPanel.setVerticalGroup(
			gl_landlordCardPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_landlordCardPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addGap(137))
		);
		landlordCardPanel.setLayout(gl_landlordCardPanel);
		
		JPanel tenantCardPanel = new JPanel();
		cardPanel.add(tenantCardPanel, "name_213319282880400");
		splitPane_1.setDividerLocation(70);
		SplitPane.setDividerLocation(100);
		frmNAdminPannel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
