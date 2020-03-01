package com.practicaljava.lesson8;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator {
	
	private JButton[] buttons;
	private JPanel calcPanel;
	private JFrame frame;
	private GridBagLayout gb;
	private GridBagConstraints constraints;
	private JTextArea displayArea;
	
	public String getDisplayValue() {
		return this.displayArea.getText();
	}
	
	public void setDisplayValue(String value) {
		this.displayArea.setText(value);
	}
	
	Calculator() {

		calcPanel = new JPanel();
		GridBagLayout gb = new GridBagLayout();
		constraints = new GridBagConstraints();
		calcPanel.setLayout(gb);
		displayArea = new JTextArea();
		CalculatorEngine calcEngine = new CalculatorEngine(this);

		String[] buttonsNames = { "MC", "MR", "MS", "M+", "M-", "\u2190", "CE", "C", "\u00B1", "\u221A", "7", "8", "9",
				"/", "%", "4", "5", "6", "*", "1/x", "1", "2", "3", "-", "=", "0", ".", "+" };
		buttons = new JButton[buttonsNames.length];
		for (int i = 0; i < buttonsNames.length; ++i) {
			buttons[i] = new JButton(buttonsNames[i]);
		}
		
		
		addComponent(calcPanel, displayArea, 0, 0, 5, 1);
		int width = 1, height = 1, row = 1, col = 0;
		for (int i = 0; i < buttons.length; ++i) {
			if ((i % 5 == 0) && (i != 0)) {
				++row;
				col = 0;
			}
			if (buttons[i].getText() == "=") {
				height = 2;
			}
			if (buttons[i].getText() == "0") {
				width = 2;
			}
			addComponent(calcPanel, buttons[i], row, col, width, height);
			col += width;
			width = 1;
			height = 1;
			
			buttons[i].addActionListener(calcEngine);
		}

		frame = new JFrame();
		frame.setContentPane(calcPanel);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void addComponent(JPanel jPanel, JComponent jComponent, int row, int col, int width, int height) {
		constraints.fill = GridBagConstraints.BOTH;
		constraints.gridx = col;
		constraints.gridy = row;
		constraints.gridheight = height;
		constraints.gridwidth = width;
		constraints.weightx = 0.5;
		constraints.weighty = 0.5;
		constraints.insets = new Insets(2, 2, 2, 2);
		jPanel.add(jComponent, constraints);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}
}