package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import org.w3c.dom.Text;

import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 297, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton.getText();
				textField.setText(number);
			}
		});
		btnNewButton.setBounds(10, 275, 58, 40);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 266, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton(".");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(78, 275, 58, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("+");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(146, 274, 58, 40);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("-");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_2.setBounds(214, 274, 58, 40);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("*");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_2_1.setBounds(215, 223, 58, 40);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("%");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_2_2.setBounds(215, 172, 58, 40);
		frame.getContentPane().add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_2_2_1 = new JButton("/");
		btnNewButton_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_2_2_1.setBounds(215, 121, 58, 40);
		frame.getContentPane().add(btnNewButton_1_2_2_1);
		
		JButton btnNewButton_1_3 = new JButton("1");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_3.setBounds(10, 224, 58, 40);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("2");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_4.setBounds(78, 224, 58, 40);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("3");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_5.setBounds(146, 224, 58, 40);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("4");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_6.setBounds(10, 173, 58, 40);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("5");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_7.setBounds(78, 173, 58, 40);
		frame.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("6");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_8.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_8.setBounds(146, 173, 58, 40);
		frame.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("7");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_9.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_9.setBounds(10, 122, 58, 40);
		frame.getContentPane().add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("8");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_10.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_10.setBounds(78, 122, 58, 40);
		frame.getContentPane().add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("9");
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_11.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_11.setBounds(146, 122, 58, 40);
		frame.getContentPane().add(btnNewButton_1_11);
		
		JButton btnNewButton_1_2_2_1_1 = new JButton("=");
		btnNewButton_1_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				switch(operation) {
				case "+":
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					break;
				case "-":
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					break;
				case "*":
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					break;
				case "/":
					result = first / second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					break;
				case "%":
					result = first % second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					break;
				}
			}
		});
		btnNewButton_1_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_2_2_1_1.setBounds(10, 70, 104, 41);
		frame.getContentPane().add(btnNewButton_1_2_2_1_1);
		
		JButton btnNewButton_1_2_2_1_2 = new JButton("C");
		btnNewButton_1_2_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_1_2_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_2_2_1_2.setBounds(215, 70, 58, 40);
		frame.getContentPane().add(btnNewButton_1_2_2_1_2);
		
		JButton btnNewButton_1_10_1 = new JButton("B");
		btnNewButton_1_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnNewButton_1_10_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_10_1.setBounds(134, 71, 58, 40);
		frame.getContentPane().add(btnNewButton_1_10_1);
	}
}
