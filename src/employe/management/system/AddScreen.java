package employe.management.system;

import java.awt.EventQueue;

import com.toedter.calendar.JDateChooser;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class AddScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel idAnswerLabel;
	private JTextField nameField;
	private JTextField fNameField;
	private JTextField addressField;
	private JTextField salaryField;
	private JTextField phoneField;
	private JTextField qualificationField;
	private JTextField cnicField;
	private JTextField designationField;
	private JTextField emailField;
	private JDateChooser dateField;

	private boolean nameIsValid = false;
	private boolean fNameIsValid = false;
	private boolean salaryIsValid = false;
	private boolean phoneIsValid = false;
	private boolean cnicIsValid = false;
	private boolean emailIsValid = false;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddScreen frame = new AddScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AddScreen() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 517);
		setLocation(370, 120);

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
		JLabel nIcon = new JLabel("");

		nIcon.setBounds(250, 123, 30, 30);
		contentPane.add(nIcon);

		JLabel fIcon = new JLabel("");
		fIcon.setBounds(569, 123, 30, 30);
		contentPane.add(fIcon);

		JLabel sIcon = new JLabel("");
		sIcon.setBounds(569, 178, 30, 30);
		contentPane.add(sIcon);

		JLabel phIcon = new JLabel("");
		phIcon.setBounds(250, 232, 30, 30);
		contentPane.add(phIcon);

		JLabel cnIcon = new JLabel("");
		cnIcon.setBounds(250, 288, 30, 30);
		contentPane.add(cnIcon);

		JLabel eIcon = new JLabel("");
		eIcon.setBounds(250, 342, 30, 30);
		contentPane.add(eIcon);

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
		fNameField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String regex = "^[a-zA-Z\\s]{0,30}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(fNameField.getText());
				if (!matcher.matches()) {
					fIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/wr2.png")));
					
				} else {
					fIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/yes1.png")));
					fNameIsValid = true;
				}

			}
		});
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
		phoneField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String regex = "^923[0-4]\\d{8}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(phoneField.getText());
				String regex1 = "^03[0-4]\\d{8}$";
				Pattern pattern1 = Pattern.compile(regex1);
				Matcher matcher1 = pattern1.matcher(phoneField.getText());
				if (!matcher.matches() && !matcher1.matches()) {
					phIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/wr2.png")));
					
				} else {
					phIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/yes1.png")));
					phoneIsValid = true;
				}

			}
		});
		phoneField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		phoneField.setBounds(85, 232, 165, 30);
		contentPane.add(phoneField);
		phoneField.setColumns(10);

		cnicField = new JTextField();
		cnicField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String regex = "^\\d{13}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(cnicField.getText());
				if (!matcher.matches()) {
					cnIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/wr2.png")));
					
				} else {
					cnIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/yes1.png")));
					cnicIsValid = true;
				}
			}
		});
		cnicField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cnicField.setBounds(85, 288, 165, 30);
		contentPane.add(cnicField);
		cnicField.setColumns(10);

		qualificationField = new JTextField();
		qualificationField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		qualificationField.setBounds(399, 232, 165, 30);
		contentPane.add(qualificationField);

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
		emailField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String regex = "[a-z]+@+[a-z]+[.com]{4}";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(emailField.getText());
				if (!matcher.matches()) {
					eIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/wr2.png")));
					
				} else {
					eIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/yes1.png")));
					emailIsValid = true;
				}

			}
		});
		emailField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		emailField.setBounds(85, 342, 165, 30);
		contentPane.add(emailField);
		emailField.setColumns(10);

		JLabel dobLabel = new JLabel("Date Of Birth");
		dobLabel.setForeground(new Color(0, 0, 0));
		dobLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		dobLabel.setBounds(290, 348, 99, 14);
		contentPane.add(dobLabel);

		JLabel headingLabel = new JLabel("ADD EMPLOYE DETAILS");
		headingLabel.setForeground(new Color(0, 0, 0));
		headingLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		headingLabel.setBounds(176, 21, 239, 30);
		contentPane.add(headingLabel);

		dateField = new JDateChooser();
		dateField.setBounds(399, 342, 165, 30);
		contentPane.add(dateField);

		JButton backBtn = new JButton("BACK");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp = new HomePage();
				setVisible(false);
				hp.setVisible(true);
			}
		});
		backBtn.setBackground(new Color(0, 0, 0));
		backBtn.setForeground(new Color(255, 255, 255));
		backBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		backBtn.setBounds(309, 402, 89, 23);
		contentPane.add(backBtn);

		JButton submitBtn = new JButton("SUBMIT");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String fname = fNameField.getText();
				String adress = addressField.getText();
				String salary = salaryField.getText();
				String phone = phoneField.getText();
				String qua = qualificationField.getText();
				String cnic = cnicField.getText();
				String desig = designationField.getText();
				String email = emailField.getText();
				String dob = ((JTextField) dateField.getDateEditor().getUiComponent()).getText();

				try {

					if (!nameIsValid) {
						JOptionPane.showMessageDialog(AddScreen.this, "Name is not valid ", "Message",
								JOptionPane.ERROR_MESSAGE);
					} else if(!fNameIsValid) {				
						JOptionPane.showMessageDialog(AddScreen.this, "Father Name is not valid ", "Message",
								JOptionPane.ERROR_MESSAGE);
					}else if(!salaryIsValid) {
						JOptionPane.showMessageDialog(AddScreen.this, "Salary is not valid ", "Message",
								JOptionPane.ERROR_MESSAGE);
					}else if(!phoneIsValid) {
						JOptionPane.showMessageDialog(AddScreen.this, "Phone Number is not valid ", "Message",
								JOptionPane.ERROR_MESSAGE);
					}else if(!cnicIsValid) {
						JOptionPane.showMessageDialog(AddScreen.this, "CNIC is not valid ", "Message",
								JOptionPane.ERROR_MESSAGE);
					}else if(!emailIsValid) {
						JOptionPane.showMessageDialog(AddScreen.this, "Email is not valid ", "Message",
								JOptionPane.ERROR_MESSAGE);
					}else {
						connection con = new connection();
						String query = "insert into employe(name,father_name,address,salary,phone_number,qualification,cnic,designation,email,date_of_birth) values ('"
								+ name + "','" + fname + "','" + adress + "','" + salary + "','" + phone + "','" + qua
								+ "','" + cnic + "','" + desig + "','" + email + "','" + dob + "')";
						con.statement.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "Details Successfully Added!");
						
						setVisible(false);
						new HomePage().setVisible(true);
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();

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
		salaryField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String regex = "^[0-9]{0,30}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(salaryField.getText());
				if (!matcher.matches()) {
					sIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/wr2.png")));
					
				} else {
					sIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/yes1.png")));
					salaryIsValid = true;
				}
			}
		});
		salaryField.setFont(new Font("Times New Roman", Font.BOLD, 14));
		salaryField.setBounds(399, 178, 165, 30);
		contentPane.add(salaryField);
		salaryField.setColumns(10);

		nameField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String regex = "^[a-zA-Z\\s]{0,30}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(nameField.getText());
				if (!matcher.matches()) {
					nIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/wr2.png")));
					
				} else {
					nIcon.setIcon(new ImageIcon(AddScreen.class.getResource("/Icons/yes1.png")));
					nameIsValid = true;
				}
			}
		});

	}

	
}
