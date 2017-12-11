package com.example.exam.final_project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class Calc {

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
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 332, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstnumber = new JLabel("firstNumber");
		lblFirstnumber.setBounds(23, 27, 93, 15);
		frame.getContentPane().add(lblFirstnumber);
		
		JLabel lblSecondnumber = new JLabel("secondNumber");
		lblSecondnumber.setBounds(19, 54, 120, 15);
		frame.getContentPane().add(lblSecondnumber);
		
		textField = new JTextField();
		textField.setBounds(157, 25, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(223, 60, 2, -18);
		frame.getContentPane().add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 56, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(101, 141, 48, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("-");
		button.setBounds(41, 141, 48, 25);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("*");
		button_1.setBounds(161, 141, 48, 25);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.setBounds(223, 141, 48, 25);
		frame.getContentPane().add(button_2);
		
		JButton btnSin = new JButton("sin");
		btnSin.setBounds(12, 175, 55, 25);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.setBounds(81, 175, 58, 25);
		frame.getContentPane().add(btnCos);
	}
}
