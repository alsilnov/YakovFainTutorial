package com.practicaljava.lesson8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorEngine  implements ActionListener {
	Calculator calculator;
	public CalculatorEngine(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		String clickedButtonLabel = clickedButton.getText();
		calculator.setDisplayValue(clickedButtonLabel);
		
	}

}
