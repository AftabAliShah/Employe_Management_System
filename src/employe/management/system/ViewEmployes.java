package employe.management.system;

import java.awt.EventQueue;


import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class ViewEmployes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	Choice updateChoice;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEmployes frame = new ViewEmployes();
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
	public ViewEmployes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 482);

		setLocation(250, 110);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		table.setBackground(new Color(245, 245, 220));
		table.setForeground(new Color(0, 0, 0));
		table.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		
		table.setLocation(1, 26);
		updateChoice = new Choice();
		updateChoice.setFont(new Font("Times New Roman", Font.BOLD, 13));
		updateChoice.setForeground(new Color(0, 0, 0));
		updateChoice.setBackground(SystemColor.inactiveCaption);
		updateChoice.setBounds(749, 30, 106, 23);
		contentPane.add(updateChoice);
		try {
			connection con = new connection();
			String query = "select * from employe";
			ResultSet rs = con.statement.executeQuery(query);
			while (rs.next()) {
				updateChoice.add(rs.getString("ID"));
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			connection con = new connection();
			String query = "select * from employe";
			ResultSet rs = con.statement.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 80, 888, 363);
		contentPane.add(scrollPane);

		JButton updateBtn = new JButton("Update");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UpdateEmploye ue = new UpdateEmploye(updateChoice.getSelectedItem());
				ue.setVisible(true);
			}
		});
		updateBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		updateBtn.setForeground(new Color(0, 0, 0));
		updateBtn.setBounds(642, 30, 89, 23);
		contentPane.add(updateBtn);

		JButton printBtn = new JButton("Print");
		printBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (PrinterException e1) {
					e1.printStackTrace();
				}
			}
		});
		printBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		printBtn.setForeground(new Color(0, 0, 0));
		printBtn.setBounds(24, 29, 89, 23);
		contentPane.add(printBtn);

		JButton backBtn = new JButton("Back");
		backBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HomePage hm = new HomePage();
				hm.setVisible(true);
			}
		});
		backBtn.setBounds(136, 29, 89, 23);
		contentPane.add(backBtn);

		txtSearch = new JTextField();
		txtSearch.setBackground(SystemColor.menu);
		txtSearch.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				DefaultTableModel obj = (DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> obj11 = new TableRowSorter<>(obj);
				table.setRowSorter(obj11);
				obj11.setRowFilter(RowFilter.regexFilter("(?i)" + txtSearch.getText()));
			}
		});
		txtSearch.setBounds(303, 27, 129, 28);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);

		JLabel searchLabel = new JLabel("Search");
		searchLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		searchLabel.setBounds(246, 30, 47, 17);
		contentPane.add(searchLabel);

	}
}
