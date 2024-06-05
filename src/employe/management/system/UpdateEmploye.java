package employe.management.system;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class UpdateEmploye extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel idAnswerLabel;
	private JTextField nameField;
	private JTextField fNameField;
	private JTextField addressField;
	private JTextField salaryField;
	private JTextField phoneField;
	private JTextField qualificationBox;
	private JTextField cnicField;
	private JTextField designationField;
	private JTextField emailField;
	private JTextField dateField;
	String empID;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEmploye frame = new UpdateEmploye("");	
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
	public UpdateEmploye(String empID) {
		this.empID = empID;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 517);
		setLocation(370,120);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setForeground(new Color(0, 0, 0));
		nameLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		nameLabel.setBounds(21, 128, 46, 14);
		contentPane.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBackground(new Color(255, 255, 255));
		nameField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		nameField.setBounds(85, 123, 165, 30);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel fNameLabel = new JLabel("Father's Name");
		fNameLabel.setForeground(new Color(0, 0, 0));
		fNameLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		fNameLabel.setBounds(290, 128, 99, 14);
		contentPane.add(fNameLabel);
		
		fNameField = new JTextField();
		fNameField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		fNameField.setBounds(399, 123, 165, 30);
		contentPane.add(fNameField);
		fNameField.setColumns(10);
		
	
	    JLabel addressLabel = new JLabel("Address");
		addressLabel.setForeground(new Color(0, 0, 0));
		addressLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		addressLabel.setBounds(21, 183, 62, 14);
		contentPane.add(addressLabel);
		
		addressField = new JTextField();
		addressField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		addressField.setBounds(85, 178, 239, 30);
		contentPane.add(addressField);
		addressField.setColumns(10);
		
		JLabel phoneLabel = new JLabel("Phone");
		phoneLabel.setForeground(new Color(0, 0, 0));
		phoneLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		phoneLabel.setBounds(21, 237, 46, 14);
		contentPane.add(phoneLabel);
		
		JLabel cnicLabel = new JLabel("CNIC");
		cnicLabel.setForeground(new Color(0, 0, 0));
		cnicLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		cnicLabel.setBounds(21, 293, 46, 14);
		contentPane.add(cnicLabel);
		
		phoneField = new JTextField();
		phoneField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		phoneField.setBounds(85, 232, 165, 30);
		contentPane.add(phoneField);
		phoneField.setColumns(10);
		
		cnicField = new JTextField();
		cnicField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cnicField.setBounds(85, 288, 165, 30);
		contentPane.add(cnicField);
		cnicField.setColumns(10);
		
		qualificationBox = new JTextField();
		qualificationBox.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		qualificationBox.setBounds(399, 232, 165, 30);
		contentPane.add(qualificationBox);
		
		JLabel qualificationLabel = new JLabel("Qualification");
		qualificationLabel.setForeground(new Color(0, 0, 0));
		qualificationLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		qualificationLabel.setBounds(290, 237, 87, 14);
		contentPane.add(qualificationLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setForeground(new Color(0, 0, 0));
		emailLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		emailLabel.setBounds(21, 348, 46, 14);
		contentPane.add(emailLabel);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		emailField.setBounds(85, 342, 165, 30);
		contentPane.add(emailField);
		emailField.setColumns(10);
		
		JLabel dobLabel = new JLabel("Date Of Birth");
		dobLabel.setForeground(new Color(0, 0, 0));
		dobLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		dobLabel.setBounds(290, 348, 99, 14);
		contentPane.add(dobLabel);
		
	
		
		JLabel idLabel = new JLabel("Employe ID :");
		idLabel.setForeground(new Color(0, 0, 0));
		idLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		idLabel.setBounds(22, 73, 87, 22);
		contentPane.add(idLabel);
		
		idAnswerLabel = new JLabel();
		idAnswerLabel.setForeground(new Color(0, 0, 0));
		idAnswerLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		idAnswerLabel.setBounds(118, 71, 54, 30);
		contentPane.add(idAnswerLabel);
		
		JLabel headingLabel = new JLabel("UPDATE EMPLOYE DETAILS");
		headingLabel.setForeground(new Color(0, 0, 0));
		headingLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		headingLabel.setBounds(167, 21, 273, 30);
		contentPane.add(headingLabel);
		
		dateField = new JTextField();
		dateField.setBounds(399, 342, 165, 30);
		contentPane.add(dateField);
		
		JButton backBtn = new JButton("BACK");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ViewEmployes ve = new ViewEmployes();
			setVisible(false);
			ve.setVisible(true);			}
		});
		backBtn.setBackground(new Color(0, 0, 0));
		backBtn.setForeground(new Color(255, 255, 255));
		backBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		backBtn.setBounds(309, 402, 89, 23);
		contentPane.add(backBtn);
		
		
		JButton submitBtn = new JButton("UPDATE");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == submitBtn) {
					String name =nameField.getText() ;
					String fname =fNameField.getText() ;
					String adress =addressField.getText() ;
					String salary =salaryField.getText() ;
					String phone = phoneField.getText();
					String qua = qualificationBox.getText();
					String cnic = cnicField.getText();
					String desig =designationField.getText() ;
					String email = emailField.getText();
					String dob = dateField.getText();
					try {
						connection con = new connection();
						String query = "update employe set name = '"+name+"', Father_Name = '"+fname+"',Address = '"+adress+"',Salary = '"+salary+"',Phone_Number = '"+phone+"',Qualification = '"+qua+"',CNIC = '"+cnic+"',Designation = '"+desig+"',Email = '"+email+"',Date_Of_Birth = '"+dob+"' where ID = '"+empID+"'";
						con.statement.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "Details Updated Successfully!");
					}catch(Exception e1) {
						e1.printStackTrace();
						
					}
					setVisible(false);
					new HomePage().setVisible(true);
				}
				
				
				
		
			}
		});
		submitBtn.setForeground(new Color(255, 255, 255));
		submitBtn.setBackground(new Color(0, 0, 0));
		submitBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		submitBtn.setBounds(182, 402, 89, 23);
		contentPane.add(submitBtn);
		
		JLabel designationLabel = new JLabel("Designation");
		designationLabel.setForeground(new Color(0, 0, 0));
		designationLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		designationLabel.setBounds(290, 289, 89, 22);
		contentPane.add(designationLabel);
		
		designationField = new JTextField();
		designationField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		designationField.setBounds(399, 286, 165, 30);
		contentPane.add(designationField);
		designationField.setColumns(10);
		
		JLabel salaryLabel = new JLabel("Salary");
		salaryLabel.setForeground(new Color(0, 0, 0));
		salaryLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		salaryLabel.setBounds(343, 178, 46, 25);
		contentPane.add(salaryLabel);
		
		salaryField = new JTextField();
		salaryField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		salaryField.setBounds(399, 178, 165, 30);
		contentPane.add(salaryField);
		salaryField.setColumns(10);
		try {
			connection con = new connection();
			String query = "select * from employe where ID  = '"+empID+"'";
			ResultSet rs = con.statement.executeQuery(query);
			while(rs.next()) {
				idAnswerLabel.setText(rs.getString("ID"));
				nameField.setText(rs.getString("Name"));
				fNameField.setText(rs.getString("Father_Name"));
				addressField.setText(rs.getString("Address"));
				phoneField.setText(rs.getString("Phone_Number"));
				cnicField.setText(rs.getString("CNIC"));
				qualificationBox.setText(rs.getString("Qualification"));
				emailField.setText(rs.getString("Email"));
				dateField.setText(rs.getString("Date_Of_Birth"));
				designationField.setText(rs.getString("Designation"));
				salaryField.setText(rs.getString("Salary"));
				
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}
