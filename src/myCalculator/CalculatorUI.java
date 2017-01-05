package myCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CalculatorUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUI window = new CalculatorUI();
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
	public CalculatorUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().add(textField, BorderLayout.WEST);
		textField.setColumns(10);
		
		JLabel lblMycalculator = new JLabel("myCalculator");
		lblMycalculator.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMycalculator.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblMycalculator, BorderLayout.NORTH);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().add(textField_1, BorderLayout.EAST);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("= ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().add(label, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
	}

}
