package com.practicaljava.lesson8;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {
    JButton[] buttons;
    JPanel calcPanel;
    JFrame frame;

    Calculator() {
	calcPanel = new JPanel();
	calcPanel.setLayout(new GridBagLayout());
	String[] buttonsNames = { "MC", "MR", "MS", "M+", "M-", "\u2190", "CE", "C" };
	buttons = new JButton[buttonsNames.length];
	for (int i = 0; i < buttonsNames.length; ++i) {
	    buttons[i] = new JButton(buttonsNames[i]);
	}

	for (int i = 0; i < buttons.length; ++i) {
	    calcPanel.add(buttons[i]);
	}

	frame = new JFrame();
	frame.setContentPane(calcPanel);
	frame.setVisible(true);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
	Calculator calcul = new Calculator();
    }

}
