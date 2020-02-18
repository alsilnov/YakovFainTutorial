package com.practicaljava.lesson5;

public class Tax {
    double grossIncome;
    String state;
    int dependents;
    int customerCounter;

    Tax(double gi, String st, int depen) {
	grossIncome = gi;
	state = st;
	dependents = depen;
	customerCounter++;
	System.out.println("Preparing the tax data for customer #" + customerCounter);
    }

    public double calcTax() {
	double stateTax = 0;
	if (grossIncome < 30000) {
	    stateTax = grossIncome * 0.05;
	} else {
	    stateTax = grossIncome * 0.06;
	}
	return stateTax;
    }

    public static void convertUsdToEuro(double tax) {
	System.out.println("Tax in euro " + tax / 1.25);
    }

}
