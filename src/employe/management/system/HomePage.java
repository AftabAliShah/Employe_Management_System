package employe.management.system;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 482);
		setLocation(250,110);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton addBtn = new JButton("");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddScreen as = new AddScreen();
			setVisible(false);
			as.setVisible(true);
			}
		});
		addBtn.setForeground(new Color(255, 255, 255));
		addBtn.setBackground(new Color(255, 255, 255));
		addBtn.setBounds(44, 137, 142, 127);
		addBtn.setIcon(new ImageIcon(getClass().getResource("/Icons/add1.png")));
		contentPane.add(addBtn);
		
		JButton viewBtn = new JButton("");
		viewBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ViewEmployes ve = new ViewEmployes();
				ve.setVisible(true);
			}
		});
		viewBtn.setForeground(new Color(255, 255, 255));
		viewBtn.setBackground(new Color(255, 255, 255));
		viewBtn.setBounds(258, 137, 142, 127);
		viewBtn.setIcon(new ImageIcon(getClass().getResource("/Icons/list2.png")));

		contentPane.add(viewBtn);
		
		JButton updateBtn = new JButton("\r\n");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ViewEmployes ve = new ViewEmployes();
				ve.setVisible(true);
			}
		});
		updateBtn.setForeground(new Color(255, 255, 255));
		updateBtn.setBackground(new Color(255, 255, 255));
		updateBtn.setBounds(473, 137, 142, 127);
		updateBtn.setIcon(new ImageIcon(getClass().getResource("/Icons/update5.png")));

		contentPane.add(updateBtn);
		
		JButton removeBtn = new JButton("");
		removeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				RemoveEmploye re = new RemoveEmploye();
				re.setVisible(true);
			}
		});
		removeBtn.setForeground(new Color(255, 255, 255));
		removeBtn.setBackground(new Color(255, 255, 255));
		removeBtn.setBounds(680, 137, 142, 127);
		removeBtn.setIcon(new ImageIcon(getClass().getResource("/Icons/remove1.png")));
		contentPane.add(removeBtn);
		
		JLabel addLabel = new JLabel("Add Employe");
		addLabel.setForeground(new Color(0, 0, 0));
		addLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		addLabel.setBounds(71, 265, 104, 33);
		contentPane.add(addLabel);
		
		JLabel viewLabel = new JLabel("View Employes");
		viewLabel.setForeground(new Color(0, 0, 0));
		viewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		viewLabel.setBounds(279, 271, 109, 21);
		contentPane.add(viewLabel);
		
		JLabel updateLabel = new JLabel("Update Employe");
		updateLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		updateLabel.setForeground(new Color(0, 0, 0));
		updateLabel.setBounds(483, 271, 121, 21);
		contentPane.add(updateLabel);
		
		JLabel removeLabel = new JLabel("Remove Employe");
		removeLabel.setForeground(new Color(0, 0, 0));
		removeLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		removeLabel.setBounds(690, 270, 133, 23);
		contentPane.add(removeLabel);
		
		JButton exitBtn = new JButton("EXIT");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		exitBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		exitBtn.setBackground(new Color(0, 0, 0));
		exitBtn.setForeground(new Color(255, 255, 255));
		exitBtn.setBounds(745, 387, 89, 23);
		contentPane.add(exitBtn);
		
		JButton backBtn = new JButton("BACK");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login l = new Login();
			
				l.setVisible(true);
			}
		});
		backBtn.setBackground(new Color(0, 0, 0));
		backBtn.setForeground(new Color(255, 255, 255));
		backBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		backBtn.setBounds(29, 388, 89, 23);
		contentPane.add(backBtn);
		
		JLabel homePageLabel = new JLabel(" HOMEPAGE");
		homePageLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		homePageLabel.setBackground(new Color(255, 255, 255));
		homePageLabel.setForeground(new Color(0, 0, 0));
		homePageLabel.setIcon(new ImageIcon(HomePage.class.getResource("/Icons/home1.png")));
		homePageLabel.setBounds(322, 24, 182, 63);
		contentPane.add(homePageLabel);
	
	}
}
