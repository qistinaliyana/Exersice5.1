import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class CALC{

	private JFrame frame;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	//private JButton btnNewButton; 
	private JTextField textFieldADD;
	private JTextField textFieldMINUS;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_Answer1;
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CALC window = new CALC();
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
	public CALC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 802, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textFieldADD.getText());
					num2 = Integer.parseInt(textFieldMINUS.getText());
					
					ans = num1 + num2;
					textFieldAnswer.setText(Integer.toString(ans));
					
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid Number.");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 22));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(129, 260, 146, 54);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("MINUS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textFieldADD.getText());
					num2 = Integer.parseInt(textFieldMINUS.getText());
					
					ans = num1 - num2;
					textFieldAnswer.setText(Integer.toString(ans));
					
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid number. Please enter again.");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 22));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(521, 263, 146, 54);
		frame.getContentPane().add(btnNewButton_2);
		
		textFieldADD = new JTextField();
		textFieldADD.setFont(new Font("Arial", Font.BOLD, 22));
		textFieldADD.setBounds(109, 142, 197, 54);
		frame.getContentPane().add(textFieldADD);
		textFieldADD.setColumns(10);
		
		textFieldMINUS = new JTextField();
		textFieldMINUS.setFont(new Font("Arial", Font.BOLD, 22));
		textFieldMINUS.setBounds(494, 145, 197, 54);
		frame.getContentPane().add(textFieldMINUS);
		textFieldMINUS.setColumns(10);
		
		lblNewLabel = new JLabel("CALCULATION");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setBounds(319, 45, 168, 36);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_Answer1 = new JLabel(" Answer : ");
		lblNewLabel_Answer1.setBackground(Color.BLACK);
		lblNewLabel_Answer1.setForeground(Color.BLACK);
		lblNewLabel_Answer1.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_Answer1.setBounds(348, 364, 108, 47);
		frame.getContentPane().add(lblNewLabel_Answer1);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setFont(new Font("Arial", Font.BOLD, 22));
		textFieldAnswer.setBounds(270, 451, 274, 47);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
	}
}
