package com.practicaljava.lesson10;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

class ComboBoxRenderer extends JLabel implements ListCellRenderer<Bike> {

    public ComboBoxRenderer() {
	setOpaque(true);
	setHorizontalAlignment(LEFT);
	setVerticalAlignment(CENTER);
    }

    /*
     * This method finds the image and text corresponding to the selected value and
     * returns the label, set up to display the text and image.
     */
    public Component getListCellRendererComponent(JList list, Bike bike, int index, boolean isSelected,
	    boolean cellHasFocus) {
//Get the selected index. (The index param isn't
//always valid, so just use the value.)
	if (isSelected) {
	    setBackground(list.getSelectionBackground());
	    setForeground(list.getSelectionForeground());
	} else {
	    setBackground(list.getBackground());
	    setForeground(list.getForeground());
	}
	setText(bike.getBikeType());
	return this;
    }
}