//seth mcfarland worked on 5/12 final proect

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class GUIProgram {

	private JFrame frame;
	private JTextField PhoneNumber;
	private JTextField Name;
	private JTextField Email;
	private JTextField Movie;
	private JTextField ReturnDate;
	private JTextField Cost;
	private JLabel lblNewLabel_1;
	private JLabel lblDateToReturn;
	private JLabel lblCost;
	private JLabel lblLateFee;
	private JLabel lblPerDay;
	private JButton btnSave;

	String s;
	String Name1;
	String Email1;
	String Movie1;
	String Return1;
	String Cost1;
	String Cash1;
	String Credit1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIProgram window = new GUIProgram();
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
	public GUIProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 658, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCustomerInformation = new JLabel("Customer Information:");
		lblCustomerInformation.setBounds(10, 11, 128, 14);
		frame.getContentPane().add(lblCustomerInformation);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 35, 46, 14);
		frame.getContentPane().add(lblName);

		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(10, 60, 98, 14);
		frame.getContentPane().add(lblPhoneNumber);

				JLabel lblNewLabel = new JLabel("Email:");
				lblNewLabel.setBounds(10, 85, 46, 14);
				frame.getContentPane().add(lblNewLabel);

		PhoneNumber = new JTextField();
		PhoneNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = PhoneNumber.getText();   //receive input from text field
				 System.out.println("Phone number is: " + s);
			}
		});
		PhoneNumber.setBounds(103, 57, 86, 20);
		frame.getContentPane().add(PhoneNumber);
		PhoneNumber.setColumns(10);

		Name = new JTextField();
		Name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Name1 = Name.getText();   //receive input from text field
				 System.out.println("Name is: " + Name1);
			}
		});
		Name.setBounds(52, 32, 137, 20);
		frame.getContentPane().add(Name);
		Name.setColumns(10);

		Email = new JTextField();
		Email.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Email1 = Email.getText();   //receive input from text field
				 System.out.println("Email is: " + Email1);
			}
		});
		Email.setBounds(52, 82, 137, 20);
		frame.getContentPane().add(Email);
		Email.setColumns(10);

		Movie = new JTextField();
		Movie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Movie1 = Movie.getText();   //receive input from text field
				 System.out.println("Movie Checkout is: " + Movie1);
			}
		});
		Movie.setBounds(52, 107, 137, 20);
		frame.getContentPane().add(Movie);
		Movie.setColumns(10);

		ReturnDate = new JTextField();
		ReturnDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Return1 = ReturnDate.getText();   //receive input from text field
				 System.out.println("Return Date is: " + Return1);
			}
		});
		ReturnDate.setBounds(103, 138, 137, 20);
		frame.getContentPane().add(ReturnDate);
		ReturnDate.setColumns(10);

		Cost = new JTextField();
		Cost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Cost1 = Cost.getText();   //receive input from text field
				 System.out.println("The total cost is: " + Cost1);
			}
		});
		Cost.setBounds(52, 166, 46, 20);
		frame.getContentPane().add(Cost);
		Cost.setColumns(10);

				JRadioButton Cash = new JRadioButton("Cash");
				Cash.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Cash1 = Cash.getText();   //receive input from text field
						 System.out.println("Selected payment: " + Cash1);

					}
				});
				Cash.setBounds(363, 81, 109, 23);
				frame.getContentPane().add(Cash);

				JRadioButton Credit = new JRadioButton("Credit");
				Credit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Credit1 = Credit.getText();   //receive input from text field
						 System.out.println("Selected payment: " + Credit1);
					}
				});
				Credit.setBounds(363, 106, 109, 23);
				frame.getContentPane().add(Credit);

				btnSave = new JButton("Save");
				btnSave.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						try{
				            BufferedWriter bw = new BufferedWriter(new FileWriter("asdf.txt"));
				            bw.write(PhoneNumber.getText());
				            bw.write(Name.getText());
				            bw.write(Email.getText());
				            bw.write(Movie.getText());
				            bw.write(ReturnDate.getText());
				            bw.write(Cost.getText());
				            bw.write(Cash1);
				            bw.write(Credit1);
				            bw.close();
				        }catch(Exception ex){
				            ex.printStackTrace();
				        }
				    }});
				btnSave.setBounds(376, 195, 89, 23);
				frame.getContentPane().add(btnSave);

		lblNewLabel_1 = new JLabel("Movie:");
		lblNewLabel_1.setBounds(10, 110, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		lblDateToReturn = new JLabel("Date To Return:");
		lblDateToReturn.setBounds(10, 141, 161, 14);
		frame.getContentPane().add(lblDateToReturn);

		lblCost = new JLabel("Cost: ");
		lblCost.setBounds(10, 169, 46, 14);
		frame.getContentPane().add(lblCost);

		lblLateFee = new JLabel("Late fee:");
		lblLateFee.setBounds(10, 199, 59, 14);
		frame.getContentPane().add(lblLateFee);

		lblPerDay = new JLabel("$1.50 Per Day");
		lblPerDay.setBounds(62, 199, 98, 14);
		frame.getContentPane().add(lblPerDay);
	}
}
