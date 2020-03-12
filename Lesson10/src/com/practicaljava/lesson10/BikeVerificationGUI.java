package com.practicaljava.lesson10;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BikeVerificationGUI extends JPanel {
    private FlowLayout fl;
    private JTextField quantity;
    private JButton validate;
    private JFrame frame;
    private BikeVerificationEngine bikeVerificationEngine;
    private JComboBox bikeList;
    private Bike[] bikeArray;
    private BikeContainer bikeContainer;

    Bike getSelectedBike() {
	return (Bike) this.bikeList.getSelectedItem();
    }

    int getBikeQuantity() {
	try {
	    return Integer.parseInt(this.quantity.getText());
	} catch (NumberFormatException e1) {
	    return 0;
	}
    }

    int getBikeContainerSize() {
	return this.bikeContainer.getBikeContainerSize();
    }

    BikeVerificationGUI() {
	bikeVerificationEngine = new BikeVerificationEngine(this);

	fl = new FlowLayout();
	quantity = new JTextField(10);
	validate = new JButton("Validate");
	bikeContainer = new BikeContainer(24);
	bikeArray = new Bike[4];
	bikeArray[0] = new Bike("Десна", 1);
	bikeArray[1] = new Bike("Аист", 2);
	bikeArray[2] = new Bike("Ветерок", 3);
	bikeArray[3] = new Bike("Stels", 4);

	ComboBoxRenderer renderer = new ComboBoxRenderer();
	bikeList = new JComboBox(bikeArray);
	renderer.setPreferredSize(new Dimension(100, 20));
	bikeList.setRenderer(renderer);

	validate.addActionListener(bikeVerificationEngine);
	this.setLayout(fl);
	this.add(bikeList);
	this.add(quantity);
	this.add(validate);

	frame = new JFrame("Bike order");
	frame.setContentPane(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	BikeVerificationGUI bikeOrder = new BikeVerificationGUI();
    }

}
