package employe.management.system;

import java.awt.EventQueue;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JLabel icon;
	
	private JLabel iconVisible;
	private JLabel iconHide;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Screen
	public Login() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,300);
		setLocation(370,200);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userName = new JLabel("Username");
		userName.setForeground(new Color(0, 0, 0));
		userName.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		userName.setBounds(35, 46, 66, 19);
		contentPane.add(userName);
		
		JLabel password = new JLabel("Password");
		password.setForeground(new Color(0, 0, 0));
		password.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		password.setBounds(35, 109, 66, 19);
		contentPane.add(password);
		
		userNameField = new JTextField();
		userNameField.setForeground(new Color(0, 0, 0));
		userNameField.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		userNameField.setBackground(new Color(230, 230, 250));
		userNameField.setBounds(112, 41, 249, 24);
		contentPane.add(userNameField);
		userNameField.setColumns(10);
		
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		passwordField.setBackground(new Color(230, 230, 250));
		passwordField.setBounds(112, 104, 249, 24);
		contentPane.add(passwordField);
		
		JButton loginBtn = new JButton("LOGIN");
		//Login Button //Check If password or username is incorrect from database
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				String user = userNameField.getText();
				String pass = passwordField.getText();
				String query = "select * from login where username = '"+user+"' and password = '"+pass+"' ";
				connection conn = new connection();
				ResultSet rs = conn.statement.executeQuery(query);
				if(rs.next()) {
				
					setVisible(false);
					HomePage hm = new HomePage();
					hm.setVisible(true);					
				}else {
					JOptionPane.showMessageDialog(null, "UserName OR Password Is Incorrect");
					
				}
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			
			}
		});
		loginBtn.setForeground(new Color(255, 255, 255));
		loginBtn.setBackground(new Color(0, 0, 0));
		
		loginBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		loginBtn.setBounds(186, 175, 103, 27);
		contentPane.add(loginBtn);
		
		icon = new JLabel("");
		icon.setIcon(new ImageIcon(getClass().getResource("/Icons/111.png")));
		icon.setBounds(400, 21, 172, 174);
		contentPane.add(icon);
		
		iconVisible = new JLabel("");
		//Show Password
		iconVisible.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				iconVisible.setVisible(false);
				iconHide.setVisible(true);
				passwordField.setEchoChar((char) 0);
				
			}
		});
		iconVisible.setIcon(new ImageIcon(Login.class.getResource("/Icons/show1.png")));
		iconVisible.setBounds(371, 104, 30, 30);
		contentPane.add(iconVisible);
		
		iconHide = new JLabel("");
		//Hide Password
		iconHide.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				iconVisible.setVisible(true);
				iconHide.setVisible(false);
				passwordField.setEchoChar('*');
			}
		});
		iconHide.setIcon(new ImageIcon(Login.class.getResource("/Icons/hide1.png")));
		iconHide.setBounds(371, 104, 30, 30);
		iconHide.setVisible(false);
		contentPane.add(iconHide);
	}
}
