package BrowniesData.BrowniesData;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUI {

	private JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;
	public static String ID;
	public static String key;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI window = new LoginUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		username = new JTextField();
		username.setBounds(172, 64, 133, 31);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JLabel Username = new JLabel("Username");
		Username.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Username.setBounds(87, 64, 81, 28);
		frame.getContentPane().add(Username);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Password.setBounds(89, 120, 60, 28);
		frame.getContentPane().add(Password);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 120, 133, 31);
		frame.getContentPane().add(passwordField);
		
		JButton Submitbutton = new JButton("Submit button");
		Submitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ID=username.getText();				
				key=passwordField.getText();			}
			    
		});
		Submitbutton.setBounds(172, 209, 97, 31);
		frame.getContentPane().add(Submitbutton);
	}
}
