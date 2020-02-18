package com.practicaljava.lesson6;

public class Contractor extends Person implements Payable {
    public Contractor(String name) {
	super(name);
    }

    @Override
    public boolean increasePay(int percent) {
	if (percent < INCREASE_CAP) {
	    System.out.println("Increasing salary by " + percent + "% " + getName());
	} else {
	    System.out.println("Can`t increse a contractor`s rate by more than 20%. " + getName());
	}
	return false;
    }

}
