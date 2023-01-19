package FinalFrontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentDashboard {

	private JFrame frame;
	private CardLayout cl_cardPanel = new CardLayout(0,0);
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentDashboard window = new studentDashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentDashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		JSplitPane splitPane = new JSplitPane();
//		splitPane.setBounds(0, 0, 784, 561);
//		frmNAdminPannel.setBounds(550, 200, 800, 600);
//		JSplitPane SplitPane = new JSplitPane();
//		SplitPane.setDividerSize(0);
//		frmNAdminPannel.setContentPane(SplitPane);
		frame = new JFrame();
		frame.setTitle("Student");
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 784, 561);
		frame.setBounds(550, 200, 800, 600);
		JSplitPane SplitPane = new JSplitPane();
		SplitPane.setDividerSize(0);
		frame.setContentPane(SplitPane);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setDividerSize(0);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		SplitPane.setLeftComponent(splitPane_1);
		
		JPanel panelTop = new JPanel();
		splitPane_1.setLeftComponent(panelTop);
		
		JButton btnModule = new JButton("Modules");
		btnModule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(panel, "name_103190183779300");
					
			}
		});
		GroupLayout gl_panelTop = new GroupLayout(panelTop);
		gl_panelTop.setHorizontalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnModule)
					.addContainerGap(398, Short.MAX_VALUE))
		);
		gl_panelTop.setVerticalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnModule)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panelTop.setLayout(gl_panelTop);
		
		panel = new JPanel();
		splitPane_1.setRightComponent(panel);
		panel.setLayout(cl_cardPanel);
		
		JPanel streamPanel = new JPanel();
		panel.add(streamPanel, "name_103190183779300");
		
		JButton OODPBtn = new JButton("OODP");
		OODPBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_cardPanel.show(panel, "name_103218011780600");
				
			}
		});
		GroupLayout gl_streamPanel = new GroupLayout(streamPanel);
		gl_streamPanel.setHorizontalGroup(
			gl_streamPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_streamPanel.createSequentialGroup()
					.addGap(34)
					.addComponent(OODPBtn)
					.addContainerGap(374, Short.MAX_VALUE))
		);
		gl_streamPanel.setVerticalGroup(
			gl_streamPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_streamPanel.createSequentialGroup()
					.addGap(38)
					.addComponent(OODPBtn)
					.addContainerGap(447, Short.MAX_VALUE))
		);
		streamPanel.setLayout(gl_streamPanel);
		
		JSplitPane Module1 = new JSplitPane();
		Module1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		Module1.setDividerSize(0);
		panel.add(Module1, "name_103218011780600");
		
		JPanel inModuleTop = new JPanel();
		Module1.setLeftComponent(inModuleTop);
		
		JLabel StreamBtn = new JLabel("Stream");
		StreamBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel PeopleBtn = new JLabel("People");
		PeopleBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_inModuleTop = new GroupLayout(inModuleTop);
		gl_inModuleTop.setHorizontalGroup(
			gl_inModuleTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop.createSequentialGroup()
					.addContainerGap()
					.addComponent(StreamBtn)
					.addGap(92)
					.addComponent(PeopleBtn, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(305, Short.MAX_VALUE))
		);
		gl_inModuleTop.setVerticalGroup(
			gl_inModuleTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inModuleTop.createSequentialGroup()
					.addGroup(gl_inModuleTop.createParallelGroup(Alignment.BASELINE)
						.addComponent(StreamBtn, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(PeopleBtn, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		inModuleTop.setLayout(gl_inModuleTop);
		Module1.setDividerLocation(30);
		splitPane_1.setDividerLocation(50);
		SplitPane.setDividerLocation(500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
