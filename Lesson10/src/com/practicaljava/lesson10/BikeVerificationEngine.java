package com.practicaljava.lesson10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BikeVerificationEngine implements ActionListener {
    BikeVerificationGUI bike; // it is not good to call this variable a bike, but ...

    public BikeVerificationEngine(BikeVerificationGUI bike) {
	this.bike = bike;
    }

    private Boolean validate(BikeVerificationGUI bike) {
	int bikeQuantity = bike.getBikeQuantity();
	int bikeSize = bike.getSelectedBike().getBikeSize();
	if (bike.getBikeContainerSize() >= bikeQuantity * bikeSize && bikeQuantity != 0) {
	    return true;
	}
	return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	if (validate(bike)) {
	    System.out.println("Success");
	} else {
	    System.out.println("Failure");
	}

    }

}
