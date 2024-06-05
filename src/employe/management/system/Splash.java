package employe.management.system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Splash extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
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
	public Splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 482);
		setLocation(250,110);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Employe Management System");
		heading.setForeground(new Color(0, 0, 0));
		heading.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 33));
		heading.setBounds(20, 131, 468, 43);
		contentPane.add(heading);
		
		JLabel logo = new JLabel("Made By Syed Aftab");
		logo.setForeground(new Color(0, 0, 0));
		logo.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 13));
		logo.setBounds(341, 166, 136, 32);
		contentPane.add(logo);
		
		
		JButton pressBtn = new JButton("Press the button");
		pressBtn.addActionListener(this);
		pressBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Login l = new Login();
				l.setVisible(true);
			}
		});
		pressBtn.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		pressBtn.setBackground(new Color(0, 0, 0));
		pressBtn.setForeground(new Color(255, 255, 255));
		pressBtn.setBounds(96, 298, 180, 43);
		contentPane.add(pressBtn);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(getClass().getResource("/Icons/hhh.jpg")));
		image.setBounds(0, 0, 861, 443);
		contentPane.add(image);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
