package myCalculator;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import org.eclipse.swt.internal.ole.win32.IFont;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;

public class WelcomeTitle {

	private JFrame frame;
	private JTextField txtA;
	private JTextField txtB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeTitle window = new WelcomeTitle();
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
	public WelcomeTitle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 396, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblGuest = new JLabel("myCalculator");
		lblGuest.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuest.setFont(new Font("Arial", Font.PLAIN, 26));
		lblGuest.setBounds(10, 0, 360, 34);
		frame.getContentPane().add(lblGuest);
		
		txtA = new JTextField();
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtA.setToolTipText("Insert the number");
		txtA.setText("a");
		txtA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				}
		});
		txtA.setBounds(10, 56, 78, 134);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		
		
		txtB = new JTextField();
		txtB.setHorizontalAlignment(SwingConstants.CENTER);
		txtB.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtB.setToolTipText("Insert the number");
		txtB.setText("b");
		txtB.setColumns(10);
		txtB.setBounds(175, 56, 78, 134);
		frame.getContentPane().add(txtB);
		
		JLabel label = new JLabel("=");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.PLAIN, 26));
		label.setBounds(250, 107, 40, 34);
		frame.getContentPane().add(label);
		
		JLabel lblA = new JLabel("a");
		lblA.setToolTipText("This is the anwser");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Arial", Font.PLAIN, 26));
		lblA.setBounds(285, 56, 85, 134);
		frame.getContentPane().add(lblA);
		
		JLabel lblX = new JLabel("x");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Arial", Font.PLAIN, 26));
		lblX.setBounds(98, 99, 67, 47);
		frame.getContentPane().add(lblX);
		String a = txtA.getText();
		String b = txtB.getText();
		String x = a+b;
		JButton button = new JButton("+");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblX.setText("+");
				lblA.setText(x);
			}
		});
		button.setBounds(98, 56, 67, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBounds(98, 79, 67, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblX.setText("-");
				lblA.setText(x);
			}
		});
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u00F7");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBounds(98, 167, 67, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblX.setText("+");
				lblA.setText(x);
			}
		});
		frame.getContentPane().add(button_2);
		
		JButton btnX = new JButton("x");
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX.setBounds(98, 145, 67, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblX.setText("+");
				lblA.setText(x);
			}
		});
		frame.getContentPane().add(btnX);
		
		
		JLabel lblInsertTheNumber = new JLabel("Insert number -> choose what to do -> The answer appear at the right");
		lblInsertTheNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertTheNumber.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInsertTheNumber.setBounds(10, 28, 360, 34);
		frame.getContentPane().add(lblInsertTheNumber);
	}
}
