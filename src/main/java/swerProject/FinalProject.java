package swerProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import swerProject.framee1;

public class FinalProject extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	public static FinalProject frame;
	private JPasswordField password;
	private ImageIcon image;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new FinalProject();
					frame.setVisible(true);
					frame.pack();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public FinalProject() {
		setTitle("Login Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		username = new JTextField();
		username.setBounds(388, 175, 146, 26);
		contentPane.add(username);
		username.setColumns(10);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(281, 171, 106, 34);
		contentPane.add(lblUsername);

		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(281, 255, 92, 20);
		contentPane.add(lblpassword);

		JButton btnNext = new JButton("login");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname = username.getText();
				String pass = password.getText();

				Adminstrator admin = new Adminstrator("oriana", "sabat");

				Boolean exist = false;
				for (String a1 : admin.getAdmin()) {
					if (uname.concat(pass).equals(a1)) {
						framee1 y = new framee1();
						y.setVisible(true);
					} // if
				} // for
				if (!exist) {
					JOptionPane.showMessageDialog(frame, "Invalid username or password");
				}

			}
		});
		btnNext.setBounds(404, 346, 130, 34);
		contentPane.add(btnNext);

		password = new JPasswordField();
		password.setBounds(388, 252, 146, 26);
		contentPane.add(password);

		JLabel lblNewLabel_1 = new JLabel("Welcome..");
		lblNewLabel_1.setBounds(27, 252, 79, 48);
		contentPane.add(lblNewLabel_1);

		JLabel lblPleaseUse = new JLabel("use a valid username and");
		lblPleaseUse.setBounds(27, 291, 197, 34);
		contentPane.add(lblPleaseUse);

		JLabel lblPasswordToGain = new JLabel("password to gain an access");
		lblPasswordToGain.setBounds(27, 316, 238, 39);
		contentPane.add(lblPasswordToGain);

		JLabel lblToTheProgram = new JLabel("to the program");
		lblToTheProgram.setBounds(32, 353, 179, 20);
		contentPane.add(lblToTheProgram);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FinalProject.class.getResource("/swerProject/download.jpg")));
		lblNewLabel.setBounds(27, 34, 210, 189);
		contentPane.add(lblNewLabel);

	}
}