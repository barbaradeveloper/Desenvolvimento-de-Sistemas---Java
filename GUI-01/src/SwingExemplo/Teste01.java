package SwingExemplo;

import java.util.Scanner;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste01 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	int num1, num2, soma;
	Scanner scan = new Scanner(System.in);
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste01 window = new Teste01();
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
	public Teste01() {
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
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soma = num1 + num2;
			}
		});
		btnNewButton.setBounds(277, 127, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(109, 72, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(307, 72, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton_1 = new JButton("N\u00FAmero 1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = scan.nextInt();
			}
		});
		btnNewButton_1.setBounds(10, 71, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("N\u00FAmero 2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = scan.nextInt();
			}
		});
		btnNewButton_2.setBounds(208, 71, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		textField_2 = new JTextField(soma);
		textField_2.setBounds(181, 128, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
	}
}
