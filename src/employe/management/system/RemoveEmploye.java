package employe.management.system;

import java.awt.EventQueue;

import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;

public class RemoveEmploye extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveEmploye frame = new RemoveEmploye();
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
	public RemoveEmploye() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 459);
		setLocation(400,120);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name :");
		nameLabel.setForeground(new Color(0, 0, 0));
		nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		nameLabel.setBounds(38, 110, 52, 23);
		contentPane.add(nameLabel);
		
		JLabel iconLabel = new JLabel("");
		iconLabel.setIcon(new ImageIcon(RemoveEmploye.class.getResource("/Icons/rm1.png")));
		iconLabel.setBounds(382, 92, 213, 212);
		contentPane.add(iconLabel);
		
		JLabel nameAnswerLabel = new JLabel("");
		nameAnswerLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		nameAnswerLabel.setForeground(new Color(0, 0, 0));
		nameAnswerLabel.setBounds(100, 107, 185, 29);
		contentPane.add(nameAnswerLabel);
		
		Choice idBox = new Choice();
		idBox.setBackground(SystemColor.inactiveCaption);
		idBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		idBox.setBounds(129, 46, 130, 29);
		contentPane.add(idBox);
		try {
			connection con = new connection();
			String query = "select * from employe";
			ResultSet rs = con.statement.executeQuery(query);
			while(rs.next()) {
				idBox.add(rs.getString("ID"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		JLabel idLabel = new JLabel("Empoye ID");
		idLabel.setForeground(new Color(0, 0, 0));
		idLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		idLabel.setBounds(38, 46, 76, 25);
		contentPane.add(idLabel);
		
		JLabel phoneLabel = new JLabel("Phone :");
		phoneLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		phoneLabel.setForeground(new Color(0, 0, 0));
		phoneLabel.setBounds(38, 171, 52, 20);
		contentPane.add(phoneLabel);
		
		JLabel phoneAnswerLabel = new JLabel("");
		phoneAnswerLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		phoneAnswerLabel.setForeground(new Color(0, 0, 0));
		phoneAnswerLabel.setBounds(100, 167, 140, 29);
		contentPane.add(phoneAnswerLabel);
		
		JLabel emailLabel = new JLabel("Email :");
		emailLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		emailLabel.setForeground(new Color(0, 0, 0));
		emailLabel.setBounds(38, 229, 52, 23);
		contentPane.add(emailLabel);
		
		JLabel emailAnswerLabel = new JLabel("");
		emailAnswerLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		emailAnswerLabel.setForeground(new Color(0, 0, 0));
		emailAnswerLabel.setBounds(100, 226, 241, 29);
		contentPane.add(emailAnswerLabel);
		
		JButton deleteBtn = new JButton("Delete");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					connection con = new connection();
					String query = "delete from employe where ID = '"+idBox.getSelectedItem()+"'";
					con.statement.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Employe Details Deleted Successfully!");
					setVisible(false);
					HomePage hm = new HomePage();
					hm.setVisible(true);
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		deleteBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		deleteBtn.setForeground(new Color(255, 255, 255));
		deleteBtn.setBackground(new Color(0, 0, 0));
		deleteBtn.setBounds(69, 305, 107, 29);
		contentPane.add(deleteBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HomePage hm = new HomePage();
				hm.setVisible(true);
			}
		});
		cancelBtn.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cancelBtn.setBackground(new Color(0, 0, 0));
		cancelBtn.setForeground(new Color(255, 255, 255));
		cancelBtn.setBounds(219, 305, 107, 29);
		contentPane.add(cancelBtn);
		try {
			connection con = new connection();
			String query = "select * from employe where ID = '"+idBox.getSelectedItem()+"'";
			ResultSet rs = con.statement.executeQuery(query);
			while(rs.next()) {
				nameAnswerLabel.setText(rs.getString("Name"));
				phoneAnswerLabel.setText(rs.getString("Phone_Number"));
				emailAnswerLabel.setText(rs.getString("Email"));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		idBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				try {
					connection con = new connection();
					String query = "select * from employe where ID = '"+idBox.getSelectedItem()+"'";
					ResultSet rs = con.statement.executeQuery(query);
					while(rs.next()) {
						nameAnswerLabel.setText(rs.getString("Name"));
						phoneAnswerLabel.setText(rs.getString("Phone_Number"));
						emailAnswerLabel.setText(rs.getString("Email"));
						
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
			
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent a) {		
	}
}
