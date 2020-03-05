package com.practicaljava.lesson9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
    Calculator calculator;
    private String firstArgument;
    private String secondArgument;
    private String operation;
    private String result;

    public CalculatorEngine(Calculator calculator) {
	this.calculator = calculator;
	this.firstArgument = "";
	this.secondArgument = "";
	this.operation = "";
	this.result = "";
    }

    private void buttonClickEngine(JButton clickedButton) {
	String clickedButtonLabel = clickedButton.getText();

	switch (clickedButtonLabel) {

	case "+":
	case "-":
	case "*":
	case "/":
	    if (operation == "" && firstArgument != "") {
		operation = clickedButtonLabel;
	    }
	    break;

	case "=":
	    if (firstArgument != "" && secondArgument != "" && operation != "") {
		calculate(firstArgument, secondArgument, operation);
		calculator.setDisplayValue(result);
	    }
	    operation = "";
	    firstArgument = result;
	    secondArgument = "";
	    break;

	case "CE":
	    operation = "";
	    firstArgument = "";
	    secondArgument = "";
	    result = "";
	    calculator.setDisplayValue("");
	    break;

	default:
	    if (operation == "") {
		if (firstArgument != "") {
		    firstArgument = clickedButtonLabel;
		} else {
		    firstArgument = firstArgument.concat(clickedButtonLabel);
		}
		calculator.setDisplayValue(firstArgument);
	    } else {
		secondArgument = secondArgument.concat(clickedButtonLabel);
		calculator.setDisplayValue(secondArgument);
	    }
	    break;

	}
    }

    private void calculate(String firstArgument, String secondArgument, String operation) {
	double x = Double.parseDouble(firstArgument);
	double y = Double.parseDouble(secondArgument);
	switch (operation) {
	case "+":
	    result = Double.toString(x + y);
	    break;
	case "-":
	    result = Double.toString(x - y);
	    break;
	case "*":
	    result = Double.toString(x * y);
	    break;
	case "/":
	    result = Double.toString(x / y);
	    break;
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	JButton clickedButton = (JButton) e.getSource();
	this.buttonClickEngine(clickedButton);
    }
}
