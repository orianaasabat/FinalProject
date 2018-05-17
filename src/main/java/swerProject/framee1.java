
package swerProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.List;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.json.JSONArray;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class framee1 extends JFrame {
	ArrayList<Person> persons = new ArrayList<Person>();
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Employee> employees = new ArrayList<Employee>();

	public static JLabel label_2;
	public static JLabel label;
	public static JLabel label_5;
	public static JLabel label_4;
	public static JLabel label_1;
	public static JLabel label_3;
	public static JPanel panel_2;
	public static JButton update;
	public ArrayList<Student> matchingStudents;
	public ArrayList<Person> matchingPersons;
	public ArrayList<Employee> matchingEmployees;
	public static JButton saveUpdate;
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
	public static int i = 0;
	public static int y = 0;
	public static int w = 0;
	public static JButton btnNext;
	public static int btnnext = 0;
	public static JTextArea write;
	private JTextField salarytxt;
	private JTextField reportedtxt;
	private JTextField nametxt;
	private JTextField agetxt;
	private JTextField gstxt;
	private JTextField citytxt;
	private JTextField housetxt;
	private JTextField streettxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObjectMapper m = new ObjectMapper();
					framee1 frame = new framee1();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}// main

	/**
	 * Create the frame.
	 */
	public framee1() {
		// getContentPane().setLayout(new FormLayout(new ColumnSpec[] {}, new RowSpec[]
		// {}));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(Color.CYAN);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("Add Students");
		tabbedPane.setBounds(15, 0, 783, 573);
		contentPane.add(tabbedPane);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Add an Adminstrator", null, panel_3, null);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.CYAN);
		username = new JTextField();
		username.setBounds(267, 58, 146, 26);
		panel_3.add(username);
		username.setColumns(10);

		JLabel lblUserName = new JLabel("Username");
		lblUserName.setBounds(307, 27, 131, 20);
		panel_3.add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(311, 114, 102, 20);
		panel_3.add(lblPassword);

		password = new JTextField();
		password.setBounds(267, 145, 146, 26);
		panel_3.add(password);
		password.setColumns(10);

		JButton btnSave = new JButton("Add an Adminstrator");
		btnSave.setBounds(250, 212, 188, 39);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username1 = username.getText();
				String password1 = password.getText();
				Adminstrator admin = new Adminstrator(username1, password1);
			}
		});
		panel_3.add(btnSave);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 5, 5);
		panel_3.add(tabbedPane_1);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Employee", null, panel, null);
		panel.setLayout(null);

		employeename = new JTextField();
		employeename.setBounds(245, 19, 146, 26);
		panel.add(employeename);
		employeename.setColumns(10);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(292, 0, 69, 20);
		panel.add(lblName);

		JLabel lblAge_1 = new JLabel("Age");
		lblAge_1.setBounds(292, 42, 69, 20);
		panel.add(lblAge_1);
		panel.setBackground(Color.CYAN);
		employeeage = new JTextField();
		employeeage.setBounds(245, 63, 146, 26);
		panel.add(employeeage);
		employeeage.setColumns(10);

		employeesalary = new JTextField();
		employeesalary.setBounds(245, 106, 146, 26);
		panel.add(employeesalary);
		employeesalary.setColumns(10);

		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(292, 86, 69, 20);
		panel.add(lblSalary);

		employeecity = new JTextField();
		employeecity.setBounds(245, 151, 146, 26);
		panel.add(employeecity);
		employeecity.setColumns(10);

		JLabel lblCity_1 = new JLabel("City");
		lblCity_1.setBounds(292, 132, 69, 20);
		panel.add(lblCity_1);

		JLabel lblHouseNumber = new JLabel("House Number");
		lblHouseNumber.setBounds(281, 176, 120, 20);
		panel.add(lblHouseNumber);

		employeehouse = new JTextField();
		employeehouse.setBounds(245, 198, 146, 26);
		panel.add(employeehouse);
		employeehouse.setColumns(10);

		employeestreet = new JTextField();
		employeestreet.setBounds(245, 246, 146, 26);
		panel.add(employeestreet);
		employeestreet.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Street Name");
		lblNewLabel_2.setBounds(281, 223, 120, 20);
		panel.add(lblNewLabel_2);

		JButton btnSave_2 = new JButton("Add Employee");
		btnSave_2.setBounds(262, 307, 115, 29);
		panel.add(btnSave_2);
		btnSave_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = employeename.getText();
				String age = (employeeage.getText());
				Integer age1 = Integer.valueOf(age);
				String city = employeecity.getText();
				String street = employeestreet.getText();
				String house = employeehouse.getText();
				String sal = employeesalary.getText();
				int salary = Integer.parseInt(sal);
				Address u = new Address(city, street, house);
				persons.add(new Employee(name, age1, u, salary));
				employees.add(new Employee(name, age1, u, salary));
			}

		});

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Add student", null, panel_1, null);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.CYAN);
		JLabel studentname = new JLabel("Name");
		studentname.setBounds(333, 0, 41, 20);
		panel_1.add(studentname);

		studentName = new JTextField();
		studentName.setBounds(287, 16, 146, 26);
		panel_1.add(studentName);
		studentName.setColumns(10);

		final JLabel studentAge = new JLabel("Age");
		studentAge.setBounds(333, 42, 85, 20);
		panel_1.add(studentAge);

		studentage = new JTextField();
		studentage.setBounds(287, 63, 146, 26);
		panel_1.add(studentage);
		studentage.setColumns(10);

		studentgrade = new JTextField();
		studentgrade.setBounds(287, 114, 146, 26);
		panel_1.add(studentgrade);
		studentgrade.setColumns(10);

		JLabel studentGrade = new JLabel("Grade");
		studentGrade.setBounds(333, 93, 69, 20);
		panel_1.add(studentGrade);

		studentcity = new JTextField();
		studentcity.setBounds(287, 159, 146, 26);
		panel_1.add(studentcity);
		studentcity.setColumns(10);

		JLabel studentStreet = new JLabel("Street Name");
		studentStreet.setBounds(326, 235, 107, 20);
		panel_1.add(studentStreet);

		studenthouse = new JTextField();
		studenthouse.setBounds(287, 204, 146, 26);
		panel_1.add(studenthouse);
		studenthouse.setColumns(10);

		JLabel studentHouseNumber = new JLabel("House Number");
		studentHouseNumber.setBounds(326, 184, 107, 20);
		panel_1.add(studentHouseNumber);

		final JLabel studentCity = new JLabel("City");
		studentCity.setBounds(333, 139, 69, 20);
		panel_1.add(studentCity);

		studentstreet = new JTextField();
		studentstreet.setBounds(287, 255, 146, 26);
		panel_1.add(studentstreet);
		studentstreet.setColumns(10);

		JButton btnSave_1 = new JButton("Add Student");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = studentName.getText();
				Integer age = Integer.valueOf(studentage.getText());
				String city = studentcity.getText();
				String street = studentstreet.getText();
				String house = studenthouse.getText();
				String grade1 = (studentgrade.getText());
				Integer grade = Integer.valueOf(grade1);
				Address f = new Address(city, street, house);
				persons.add(new Student(name, age, f, grade));
				students.add(new Student(name, age, f, grade));
			}
		});
		btnSave_1.setBounds(301, 303, 115, 29);
		panel_1.add(btnSave_1);
		final JButton next = new JButton("Next");

		final JPanel panel_2_1 = new JPanel();
		tabbedPane.addTab("Search", null, panel_2_1, null);
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.CYAN);
		final JButton search = new JButton("Search");
		search.setBounds(222, 43, 115, 29);
		panel_2_1.add(search);
		final JLabel label_1_1 = new JLabel("Age");
		label_1_1.setBounds(492, 63, 85, 20);
		panel_2_1.add(label_1_1);
		final JLabel label_6 = new JLabel("Name");
		label_6.setBounds(492, 11, 41, 20);
		panel_2_1.add(label_6);

		nametxt = new JTextField();
		nametxt.setBounds(445, 30, 146, 26);
		panel_2_1.add(nametxt);
		nametxt.setColumns(10);
		agetxt = new JTextField();
		agetxt.setBounds(445, 82, 146, 26);
		panel_2_1.add(agetxt);
		agetxt.setColumns(10);

		gstxt = new JTextField();
		gstxt.setBounds(445, 132, 146, 26);
		panel_2_1.add(gstxt);
		gstxt.setColumns(10);

		final JLabel label_2_1 = new JLabel("Grade");
		label_2_1.setBounds(492, 111, 69, 20);
		panel_2_1.add(label_2_1);

		citytxt = new JTextField();
		citytxt.setBounds(445, 185, 146, 26);
		panel_2_1.add(citytxt);
		citytxt.setColumns(10);

		final JLabel lblCity = new JLabel("City");
		lblCity.setBounds(492, 164, 69, 20);
		panel_2_1.add(lblCity);

		housetxt = new JTextField();
		housetxt.setBounds(445, 282, 146, 26);
		panel_2_1.add(housetxt);
		housetxt.setColumns(10);

		final JLabel label_4_1 = new JLabel("House Number");
		label_4_1.setBounds(476, 258, 85, 20);
		panel_2_1.add(label_4_1);

		final JLabel label_3_1 = new JLabel("Street Name");
		label_3_1.setBounds(476, 211, 107, 20);
		panel_2_1.add(label_3_1);

		streettxt = new JTextField();
		streettxt.setBounds(445, 234, 146, 26);
		panel_2_1.add(streettxt);
		streettxt.setColumns(10);

		label_6.setVisible(false);
		nametxt.setVisible(false);
		label_1_1.setVisible(false);
		label_2_1.setVisible(false);
		label_3_1.setVisible(false);
		label_4_1.setVisible(false);
		lblCity.setVisible(false);
		agetxt.setVisible(false);
		gstxt.setVisible(false);
		citytxt.setVisible(false);
		housetxt.setVisible(false);
		streettxt.setVisible(false);
		final JRadioButton employeeCheck = new JRadioButton("Employees");
		employeeCheck.setBackground(Color.white);
		employeeCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				search.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						matchingEmployees = new ArrayList<Employee>();
						for (Employee e1 : employees) {
							if ((name.getText()).equalsIgnoreCase(((Employee) e1).getName()))
								matchingEmployees.add(e1);
						}
						if (e.getSource() == search) {
							if (matchingEmployees.size() == 0) {
								JOptionPane.showMessageDialog(null, "There are no other matching users for this name.");
							} else {
								y = i;
								write = new JTextArea();
								write.setBounds(33, 116, 244, 157);
								contentPane.add(write);
								write.setColumns(10);
								String h = matchingEmployees.get(i) + " ";
								// System.out.println(h);
								write.setText(h);

								next.setBounds(215, 366, 91, 23);
								panel_2_1.add(next);
								next.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										if (e.getSource() == next) {
											try {
												i++;
												String h = matchingEmployees.get(i) + " ";
												write.setText(h);

											} catch (Exception e5) {
												JOptionPane.showMessageDialog(null,
														"There are no other matching users for this name.");

											}
										}
									}

								});
							}
						}
						final JButton update2 = new JButton("Update information");
						update2.setBounds(41, 366, 183, 23);
						panel_2_1.add(update2);

						update2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								final JButton saveUpdate = new JButton("Save The Update");
								saveUpdate.setBounds(445, 336, 156, 29);
								panel_2_1.add(saveUpdate);
								if (e.getSource() == update2) {

									label_2_1.setText("Salary");

									label_6.setVisible(true);
									nametxt.setVisible(true);
									label_1_1.setVisible(true);
									label_2_1.setVisible(true);
									label_3_1.setVisible(true);
									label_4_1.setVisible(true);
									lblCity.setVisible(true);
									saveUpdate.setVisible(true);
									agetxt.setVisible(true);
									gstxt.setVisible(true);
									citytxt.setVisible(true);
									housetxt.setVisible(true);
									streettxt.setVisible(true);
								}

								saveUpdate.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										if (!nametxt.getText().equals("")) {
											matchingEmployees.get(y).setName(nametxt.getText());
										}
										if (!agetxt.getText().equals("")) {
											matchingEmployees.get(y).setAge(Integer.parseInt(agetxt.getText()));
										}

										if (!gstxt.getText().equals("")) {
											((Employee) matchingEmployees.get(y))
													.setSalary(Integer.parseInt(gstxt.getText()));
										}

										if (!citytxt.getText().equals("")) {
											matchingEmployees.get(y).address.setCity(citytxt.getText());
										}
										if (!housetxt.getText().equals("")) {
											matchingEmployees.get(y).address.setHouseNumber(housetxt.getText());
										}
										if (!streettxt.getText().equals("")) {
											matchingEmployees.get(y).address.setStreetName(streettxt.getText());
										}

									}

								});

							}

						});

					}

				});

			}

		});

		employeeCheck.setBounds(10, 7, 92, 29);
		panel_2_1.add(employeeCheck);

		final JRadioButton student = new JRadioButton("Students");
		student.setBackground(Color.WHITE);
		student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == student) {
					search.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							matchingStudents = new ArrayList<Student>();
							for (Student e1 : students) {
								if ((name.getText()).equalsIgnoreCase(((Student) e1).getName()))
									matchingStudents.add(e1);
							}

							if (e.getSource() == search) {
								if (matchingStudents.size() == 0) {
									JOptionPane.showMessageDialog(null,
											"There are no other matching users for this name.");
								} else {
									y = i;
									write = new JTextArea();
									write.setBounds(33, 116, 244, 157);
									contentPane.add(write);
									write.setColumns(10);
									String h = matchingStudents.get(i) + " ";
									write.setText(h);

									next.setBounds(215, 366, 91, 23);
									panel_2_1.add(next);
									next.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											if (e.getSource() == next) {
												try {
													i++;
													String h = matchingStudents.get(i) + " ";
													write.setText(h);

												} catch (Exception e5) {
													JOptionPane.showMessageDialog(null,
															"There are no other matching users for this name.");
												}
											}

										}

									});
								}
							}
							final JButton update2 = new JButton("Update information");
							update2.setBounds(41, 366, 183, 23);
							panel_2_1.add(update2);

							update2.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									final JButton saveUpdate = new JButton("Save The Update");
									saveUpdate.setBounds(445, 336, 156, 29);
									panel_2_1.add(saveUpdate);
									if (e.getSource() == update2) {

										label_2_1.setText("Grade");

										label_6.setVisible(true);
										nametxt.setVisible(true);
										label_1_1.setVisible(true);
										label_2_1.setVisible(true);
										label_3_1.setVisible(true);
										label_4_1.setVisible(true);
										lblCity.setVisible(true);
										saveUpdate.setVisible(true);
										agetxt.setVisible(true);
										gstxt.setVisible(true);
										citytxt.setVisible(true);
										housetxt.setVisible(true);
										streettxt.setVisible(true);
									}

									saveUpdate.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											if (!nametxt.getText().equals("")) {
												matchingStudents.get(y).setName(nametxt.getText());
											}
											if (!agetxt.getText().equals("")) {
												matchingStudents.get(y).setAge(Integer.parseInt(agetxt.getText()));
											}

											if (!gstxt.getText().equals("")) {
												((Student) matchingStudents.get(y))
														.setGrade(Integer.parseInt(gstxt.getText()));
											}

											if (!citytxt.getText().equals("")) {
												matchingStudents.get(y).address.setCity(citytxt.getText());
											}
											if (!housetxt.getText().equals("")) {
												matchingStudents.get(y).address.setHouseNumber(housetxt.getText());
											}
											if (!streettxt.getText().equals("")) {
												matchingStudents.get(y).address.setStreetName(streettxt.getText());
											}
											System.out.println(matchingStudents.get(y));
										}

									});

								}

							});

						}

					});
				}
			}

		});

		student.setBounds(104, 7, 85, 29);
		panel_2_1.add(student);

		JRadioButton unl = new JRadioButton("Both");
		unl.setBackground(Color.white);
		unl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				search.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						matchingPersons = new ArrayList<Person>();
						for (Person e1 : persons) {
							if ((name.getText()).equals(e1.getName()))
								matchingPersons.add(e1);
						}

						if (e.getSource() == search) {
							if (matchingPersons.size() == 0) {
								JOptionPane.showMessageDialog(null, "There are no other matching users for this name.");
							} else {
								y = i;
								write = new JTextArea();
								write.setBounds(33, 116, 244, 157);
								contentPane.add(write);
								write.setColumns(10);
								String h = matchingPersons.get(i) + " ";
								write.setText(h);

								next.setBounds(215, 366, 91, 23);
								panel_2_1.add(next);
								next.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										if (e.getSource() == next) {
											try {
												i++;
												String h = matchingPersons.get(i) + " ";
												write.setText(h);

											} catch (Exception e5) {
												JOptionPane.showMessageDialog(null,
														"There are no other matching users for this name.");
											}
										}

									}

								});
							}
						}

						final JButton update2 = new JButton("Update information");
						update2.setBounds(41, 366, 183, 23);
						panel_2_1.add(update2);

						update2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								final JButton saveUpdate = new JButton("Save The Update");
								saveUpdate.setBounds(445, 336, 156, 29);
								panel_2_1.add(saveUpdate);
								if (e.getSource() == update2) {
									if (matchingPersons.get(y) instanceof Student) {
										label_2_1.setText("Grade");
									} else if (matchingPersons.get(y) instanceof Employee) {
										label_2_1.setText("Salary");
									}

									label_6.setVisible(true);
									nametxt.setVisible(true);
									label_1_1.setVisible(true);
									label_2_1.setVisible(true);
									label_3_1.setVisible(true);
									label_4_1.setVisible(true);
									lblCity.setVisible(true);
									saveUpdate.setVisible(true);
									agetxt.setVisible(true);

									gstxt.setVisible(true);
									citytxt.setVisible(true);
									housetxt.setVisible(true);
									streettxt.setVisible(true);
								}

								saveUpdate.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										if (!nametxt.getText().equals("")) {
											matchingPersons.get(y).setName(nametxt.getText());
										}
										if (!agetxt.getText().equals("")) {
											matchingPersons.get(y).setAge(Integer.parseInt(agetxt.getText()));
										}

										if (!gstxt.getText().equals("")) {
											if (matchingPersons.get(y) instanceof Student) {
												((Student) matchingStudents.get(y))
														.setGrade(Integer.parseInt(gstxt.getText()));
											} else if (matchingPersons.get(y) instanceof Employee) {
												((Employee) matchingPersons.get(y))
														.setSalary(Integer.parseInt(gstxt.getText()));
											}
										}

										if (!citytxt.getText().equals("")) {
											matchingPersons.get(y).address.setCity(citytxt.getText());
										}
										if (!housetxt.getText().equals("")) {
											matchingPersons.get(y).address.setHouseNumber(housetxt.getText());
										}
										if (!streettxt.getText().equals("")) {
											matchingPersons.get(y).address.setStreetName(streettxt.getText());
										}
									}

								});

							}

						});

					}

				});
			}

		});

		unl.setBounds(191, 7, 58, 29);
		panel_2_1.add(unl);
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(10, 48, 69, 20);
		panel_2_1.add(lblName_1);

		name = new JTextField();
		name.setBounds(51, 47, 146, 26);
		panel_2_1.add(name);
		name.setColumns(10);
		final JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Report", null, panel_4, null);

		panel_4.setLayout(null);
		salarytxt = new JTextField();
		salarytxt.setBounds(13, 93, 146, 26);
		panel_4.add(salarytxt);
		salarytxt.setColumns(10);
		final JLabel salary_1 = new JLabel("");
		salary_1.setBounds(52, 67, 69, 20);
		panel_4.add(salary_1);
		final JButton reportbtn1 = new JButton("Report");
		reportbtn1.setBounds(179, 92, 115, 29);
		panel_4.add(reportbtn1);
		final JButton printbtn = new JButton("Print Reports");
		printbtn.setBounds(64, 396, 146, 35);
		panel_4.add(printbtn);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 143, 242, 225);
		panel_4.add(scrollPane);
		final JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		final JCheckBox employeeReport = new JCheckBox("Report Employees");
		employeeReport.setBackground(Color.white);
		employeeReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == employeeReport) {
					salary_1.setText("Salary");
					reportbtn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							final ArrayList<String> reportedEmployee = new ArrayList<String>();
							int report = Integer.parseInt(salarytxt.getText());
							if (employees.size() != 0) {
								for (int z = 0; z < employees.size(); z++) {
									if (employees.get(z).getSalary() > report) {
										reportedEmployee.add(" " + (z + 1) + ") Name: " + employees.get(z).getName()
												+ " ,Salary: " + employees.get(z).getSalary());
									} // if
								} // for

								try {

									PrintStream file = new PrintStream(new File("report.txt"));
									for (String s : reportedEmployee) {
										file.println(s);
									}

								} catch (IOException n) {
									System.out.println("couldn't write");

								}

								if (e.getSource() == reportbtn1) {

									try {

										FileReader file = new FileReader("report.txt");
										BufferedReader bf = new BufferedReader(file);
										textArea.setEditable(false);
										textArea.setVisible(true);
										textArea.read(bf, null);
										bf.close();
										textArea.requestFocus();

									} catch (IOException c) {
										System.out.println("couldn't read");
									}

								} // for
							} else {
								JOptionPane.showMessageDialog(null,
										"There are no Employees that have salary higher than " + report);
							}
						}
					});
				}
				printbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (e.getSource() == printbtn) {
							try {
								boolean complete = textArea.print();
								if (complete) {
									JOptionPane.showMessageDialog(null, "Printed");

								} else
									JOptionPane.showMessageDialog(null, "Printing.. ");
							} catch (PrinterException p) {
								System.out.println("Couldn't Print");
							} // catch
						} // if
					}
				});

			}
		});
		employeeReport.setBounds(6, 11, 153, 23);
		panel_4.add(employeeReport);
		panel_4.setBackground(Color.CYAN);

		final JCheckBox studentReport = new JCheckBox("Report Students");
		studentReport.setBackground(Color.WHITE);
		studentReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == studentReport) {
					salary_1.setText("Grade");
					reportbtn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							int grade = Integer.parseInt(salarytxt.getText());
							final ArrayList<String> reportedstudent = new ArrayList<String>();
							if (students.size() != 0) {
								for (int z = 0; z < students.size(); z++) {
									if (students.get(z).getGrade() > grade) {
										reportedstudent.add((z + 1) + ") Name: " + students.get(z).getName()
												+ " ,Salary: " + students.get(z).getGrade());
									} // if
								} // for

								try {

									PrintStream file = new PrintStream(new File("report1.txt"));
									for (String s : reportedstudent) {
										file.println(s);
									}

								} catch (IOException n) {
									System.out.println("couldn't write");

								}

								if (e.getSource() == reportbtn1) {

									try {

										FileReader file = new FileReader("report1.txt");
										BufferedReader bf = new BufferedReader(file);
										textArea.setEditable(false);
										textArea.setVisible(true);
										textArea.read(bf, null);
										bf.close();
										textArea.requestFocus();

									} catch (IOException c) {
										System.out.println("couldn't read");
									}

								} // for
							} else {
								JOptionPane.showMessageDialog(null,
										"There are no Students that have Grade higher than " + grade);
							}
						}
					});
				}

			}
		});
		studentReport.setBounds(6, 37, 153, 23);
		panel_4.add(studentReport);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * org.json.JSONObject countryObj = new org.json.JSONObject(); JSONArray
				 * listOfStates = new JSONArray(); for (Person r : persons) {
				 * listOfStates.put(r); } countryObj.put("Person2", listOfStates);
				 * 
				 * try { // Writing to a file File file = new File("OrianaFile.Json");
				 * file.createNewFile(); FileWriter fileWriter = new FileWriter(file);
				 * fileWriter.write(countryObj.toString()); fileWriter.flush();
				 * fileWriter.close();
				 * 
				 * } catch (IOException e) { e.printStackTrace(); }
				 */
				
				System.exit(0);
			}
		});

		btnExit.setBounds(683, 589, 115, 45);
		contentPane.add(btnExit);
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
