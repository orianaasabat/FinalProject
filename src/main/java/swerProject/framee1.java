package swerProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class framee1 extends JFrame {
	ArrayList<Person> persons = new ArrayList<Person>();
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Employee> employees = new ArrayList<Employee>();
	ArrayList<Adminstrator> admin = new ArrayList<Adminstrator>();
	private JPanel contentPane;
	private JTextField studentName;
	private JTextField studentage;
	private JTextField studentgrade;
	private JTextField studentcity;
	private JTextField studenthouse;
	private JTextField studentstreet;
	private JTextField employeename;
	private JTextField employeeage;
	private JTextField employeesalary;
	private JTextField employeecity;
	private JTextField employeehouse;
	private JTextField employeestreet;
	private JTextField username;
	private JTextField password;
	private JTextField name;
	private JTextField write;
	public static int i = 0;
	public static JButton btnNext;
	public static int btnnext = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framee1 frame = new framee1();
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
	public framee1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("Add Students");
		tabbedPane.setBounds(15, 0, 743, 488);
		contentPane.add(tabbedPane);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Add an Adminstrator", null, panel_3, null);
		panel_3.setLayout(null);

		username = new JTextField();
		username.setBounds(151, 16, 146, 26);
		panel_3.add(username);
		username.setColumns(10);

		JLabel lblUserName = new JLabel("Username");
		lblUserName.setBounds(23, 19, 131, 20);
		panel_3.add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(23, 61, 102, 20);
		panel_3.add(lblPassword);

		password = new JTextField();
		password.setBounds(151, 58, 146, 26);
		panel_3.add(password);
		password.setColumns(10);

		JButton btnSave = new JButton("Add an Adminstrator");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username1 = username.getText();
				String password1 = password.getText();
				admin.add(new Adminstrator(username1, password1));
			}
		});
		btnSave.setBounds(288, 205, 115, 29);
		panel_3.add(btnSave);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("add student", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel studentname = new JLabel("Name");
		studentname.setBounds(216, 19, 41, 20);
		panel_1.add(studentname);

		studentName = new JTextField();
		studentName.setBounds(15, 16, 146, 26);
		panel_1.add(studentName);
		studentName.setColumns(10);

		final JLabel studentAge = new JLabel("Age");
		studentAge.setBounds(216, 55, 85, 20);
		panel_1.add(studentAge);

		studentage = new JTextField();
		studentage.setBounds(15, 52, 146, 26);
		panel_1.add(studentage);
		studentage.setColumns(10);

		studentgrade = new JTextField();
		studentgrade.setBounds(15, 94, 146, 26);
		panel_1.add(studentgrade);
		studentgrade.setColumns(10);

		JLabel studentGrade = new JLabel("Grade");
		studentGrade.setBounds(216, 91, 69, 20);
		panel_1.add(studentGrade);

		studentcity = new JTextField();
		studentcity.setBounds(15, 136, 146, 26);
		panel_1.add(studentcity);
		studentcity.setColumns(10);

		JLabel studentStreet = new JLabel("Street Name");
		studentStreet.setBounds(216, 225, 107, 20);
		panel_1.add(studentStreet);

		studenthouse = new JTextField();
		studenthouse.setBounds(15, 178, 146, 26);
		panel_1.add(studenthouse);
		studenthouse.setColumns(10);

		JLabel studentHouseNumber = new JLabel("House Number");
		studentHouseNumber.setBounds(216, 181, 107, 20);
		panel_1.add(studentHouseNumber);

		final JLabel studentCity = new JLabel("city");
		studentCity.setBounds(216, 142, 69, 20);
		panel_1.add(studentCity);

		studentstreet = new JTextField();
		studentstreet.setBounds(15, 222, 146, 26);
		panel_1.add(studentstreet);
		studentstreet.setColumns(10);

		JButton btnSave_1 = new JButton("Add Student");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = studentName.getText();
				int age = Integer.parseInt(studentAge.getText());
				String city = studentcity.getText();
				String street = studentstreet.getText();
				String house = studenthouse.getText();
				int grade = Integer.parseInt(studentgrade.getText());
				Address f = new Address(city, street, house);
				persons.add(new Student(name, age, f, grade));
				students.add(new Student(name, age, f, grade));
			}
		});
		btnSave_1.setBounds(359, 232, 115, 29);
		panel_1.add(btnSave_1);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Employee", null, panel, null);
		panel.setLayout(null);

		employeename = new JTextField();
		employeename.setBounds(0, 16, 146, 26);
		panel.add(employeename);
		employeename.setColumns(10);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(179, 22, 69, 20);
		panel.add(lblName);

		JLabel lblAge_1 = new JLabel("Age");
		lblAge_1.setBounds(179, 58, 69, 20);
		panel.add(lblAge_1);

		employeeage = new JTextField();
		employeeage.setBounds(0, 58, 146, 26);
		panel.add(employeeage);
		employeeage.setColumns(10);

		employeesalary = new JTextField();
		employeesalary.setBounds(0, 100, 146, 26);
		panel.add(employeesalary);
		employeesalary.setColumns(10);

		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(179, 103, 69, 20);
		panel.add(lblSalary);

		employeecity = new JTextField();
		employeecity.setBounds(0, 140, 146, 26);
		panel.add(employeecity);
		employeecity.setColumns(10);

		JLabel lblCity_1 = new JLabel("City");
		lblCity_1.setBounds(179, 143, 69, 20);
		panel.add(lblCity_1);

		JLabel lblHouseNumber = new JLabel("House Number");
		lblHouseNumber.setBounds(179, 188, 120, 20);
		panel.add(lblHouseNumber);

		employeehouse = new JTextField();
		employeehouse.setBounds(0, 185, 146, 26);
		panel.add(employeehouse);
		employeehouse.setColumns(10);

		employeestreet = new JTextField();
		employeestreet.setBounds(0, 235, 146, 26);
		panel.add(employeestreet);
		employeestreet.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Street Name");
		lblNewLabel_2.setBounds(179, 238, 120, 20);
		panel.add(lblNewLabel_2);

		JButton btnSave_2 = new JButton("Add Employee");
		btnSave_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = employeename.getText();
				int age = Integer.parseInt(employeeage.getText());
				String city = employeecity.getText();
				String street = employeestreet.getText();
				String house = employeehouse.getText();
				int salary = Integer.parseInt(employeesalary.getText());
				Address u = new Address(city, street, house);
				persons.add(new Employee(name, age, u, salary));
				employees.add(new Employee(name, age, u, salary));
			}
		});
		btnSave_2.setBounds(344, 232, 115, 29);
		panel.add(btnSave_2);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Report", null, panel_4, null);

		final JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Search", null, panel_2, null);
		panel_2.setLayout(null);

		JRadioButton employee = new JRadioButton("employees");
		employee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JButton btnNext = new JButton("next");
				btnNext.setBounds(608, 423, 115, 29);
				panel_2.add(btnNext);
				btnNext.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (e.getSource() == btnNext) {
							btnnext++;
							int y = 0;
							int i = 0;
							int t = 0;
							for (y = 0; y < employees.size(); y++) {

								if (i < employees.size()) {

									if (name.getText().equals(employees.get(i).getName())) {
										System.out.println(employees.get(i).toString());
									}
									i++;
									t++;
								}

							}
						}
					}

				});

			}
		});
		employee.setBounds(11, 283, 155, 29);
		panel_2.add(employee);

		JRadioButton student = new JRadioButton("student");
		student.setBounds(11, 320, 155, 29);
		panel_2.add(student);

		JRadioButton unl = new JRadioButton("keep it unlimited");
		unl.setBounds(11, 357, 155, 29);
		panel_2.add(unl);
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(327, 28, 69, 20);
		panel_2.add(lblName_1);

		name = new JTextField();
		name.setBounds(445, 25, 146, 26);
		panel_2.add(name);
		name.setColumns(10);

		write = new JTextField();
		write.setBounds(327, 64, 343, 343);
		panel_2.add(write);
		write.setColumns(10);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}

	public void framee1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}