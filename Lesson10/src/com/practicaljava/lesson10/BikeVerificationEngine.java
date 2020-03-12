package com.practicaljava.lesson10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BikeVerificationEngine implements ActionListener {
    BikeVerificationGUI bike; // it is not good to call this variable a bike, but ...

    public BikeVerificationEngine(BikeVerificationGUI bike) {
	this.bike = bike;
    }

    private void validate(BikeVerificationGUI bike) throws TooManyBikeException {
	int bikeQuantity = bike.getBikeQuantity();
	int bikeSize = bike.getSelectedBike().getBikeSize();
	if (bike.getBikeContainerSize() < bikeQuantity * bikeSize && bikeQuantity != 0) {
	    throw new TooManyBikeException(
		    "Cannot ship " + bikeQuantity + " bikes of the model " + bike.getSelectedBike().getBikeType());
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	try {
	    validate(bike);
	    System.out.println("Success");
	} catch (Exception e1) {
	    System.out.println(e1.getMessage());
	}
    }
}
