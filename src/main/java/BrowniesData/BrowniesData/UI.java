package BrowniesData.BrowniesData;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.awt.event.ActionEvent;

public class UI {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-7,4
	 */
	private final JPanel panel = new JPanel();
	private JTextField Dateoforder;
	private JTextField ShopName;
	private JTextField Noofpices;
	private JTextField message;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
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
	public UI() {
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
		
		Dateoforder = new JTextField();
		Dateoforder.setBounds(175, 57, 121, 35);
		frame.getContentPane().add(Dateoforder);
		Dateoforder.setColumns(10);
	
		
		JLabel lblNewLabel = new JLabel("Date of order");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(64, 66, 116, 13);
		frame.getContentPane().add(lblNewLabel);
		
		ShopName = new JTextField();
		ShopName.setBounds(176, 102, 120, 35);
		frame.getContentPane().add(ShopName);
		ShopName.setColumns(10);
		
		Noofpices = new JTextField();
		Noofpices.setBounds(175, 147, 121, 35);
		frame.getContentPane().add(Noofpices);
		Noofpices.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dateoforder=Dateoforder.getText();
				String shopname=ShopName.getText();
				int noofpices=Integer.parseInt(Noofpices.getText());
				Base.insertdata(shopname,noofpices,dateoforder);
				JOptionPane.showMessageDialog(null, Base.message, "", 
			            JOptionPane.INFORMATION_MESSAGE);

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(307, 208, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dateoforder.setText("");
				ShopName.setText("");
				Noofpices.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(64, 208, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Shop name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(80, 103, 85, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("No of pices");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(80, 156, 85, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		
		
	}
}
