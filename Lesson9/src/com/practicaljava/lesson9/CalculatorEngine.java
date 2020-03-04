package com.practicaljava.lesson9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
    Calculator calculator;
    private Argument firstArgument;
    private Argument secondArgument;
    private String operation;
    private String result;

    class Argument {
	private String argument;
	private boolean argumentSetStatus;

	private boolean getArgumentSetStatus() {
	    return this.argumentSetStatus;
	}

	private void setArgumentSetStatus(boolean argumentSetStatus) {
	    this.argumentSetStatus = argumentSetStatus;
	}

	private String getArgument() {
	    return this.argument;
	}

	public Argument() {
	    this.argument = "";
	    this.argumentSetStatus = false;
	}

	private void resetArgument() {
	    this.argument = "";
	}

	private void additionArgument(String addition) {
	    this.argument.concat(addition);
	}

    }

    private String getResult() {
	return this.result;
    }

    private void setResult(String result) {
	this.result = result;
    }

    private String getOperation() {
	return this.operation;
    }

    private void setOperation(String operation) {
	this.operation = operation;
    }

    public CalculatorEngine(Calculator calculator) {
	this.calculator = calculator;
	this.firstArgument = new Argument();
	this.secondArgument = new Argument();
	this.result = "";
    }

    private void buttonClickEngine(JButton clickedButton) {
	String clickedButtonLabel = clickedButton.getText();

	switch (clickedButtonLabel) {
	case "+":
	case "-":
	case "*":
	case "/":

	    if (this.firstArgument.getArgumentSetStatus() == false) {
		this.firstArgument.setArgumentSetStatus(true);
		this.setOperation(clickedButtonLabel);
	    }
	    break;

	case "=":

	    if (this.secondArgument.getArgumentSetStatus() == false) {
		this.secondArgument.setArgumentSetStatus(true);
		calculate(this.firstArgument.getArgument(), this.secondArgument.getArgument(), this.getOperation());
		calculator.setDisplayValue(this.getResult());
		this.secondArgument.setArgumentSetStatus(false);
		this.firstArgument.setArgumentSetStatus(false);
		this.firstArgument.resetArgument();
		this.secondArgument.resetArgument();
		this.result = "";
	    }
	    break;

	default:

	    if (this.firstArgument.getArgumentSetStatus() == true) {
		this.secondArgument.additionArgument(clickedButtonLabel);
		calculator.setDisplayValue(firstArgument.getArgument());
	    } else {
		this.firstArgument.additionArgument(clickedButtonLabel);
		calculator.setDisplayValue(secondArgument.getArgument());
	    }
	    break;

	}
    }

    private void calculate(String firstArgument, String secondArgument, String operation) {
	double x = Double.parseDouble(firstArgument);
	double y = Double.parseDouble(secondArgument);
	switch (operation) {
	case "+":
	    this.result = Double.toString(x + y);
	    break;
	case "-":
	    this.result = Double.toString(x - y);
	    break;
	case "*":
	    this.result = Double.toString(x * y);
	    break;
	case "/":
	    this.result = Double.toString(x / y);
	    break;
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	JButton clickedButton = (JButton) e.getSource();
	this.buttonClickEngine(clickedButton);
    }
}
