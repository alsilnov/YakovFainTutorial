package com.practicaljava.lesson7.tryit;

public class Contractor implements Payable {
    private String name;

    public Contractor(String name) {
	this.name = name;
    }

    @Override
    public boolean increasePay(int percent) {
	if (percent < INCREASE_CAP) {
	    System.out.println("Increasing salary by " + percent + "% " + name);
	    return true;
	} else {
	    System.out.println("Can`t increse a contractor`s rate by more than 20%. " + name);
	    return false;
	}
    }
}
