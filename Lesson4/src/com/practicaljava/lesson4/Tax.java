package com.practicaljava.lesson4;

public class Tax {
	double grossIncome;
	String state;
	int dependents;
	static int  customerCounter;
	
	Tax( double gi, String st, int depen) {
		grossIncome = gi;
		state = st;
		dependents = depen;
		customerCounter++;
		System.out.println("Preparing the tax data for customer #" + customerCounter);
	}
	public double calcTax() {
		return (grossIncome * 0.33 - dependents * 100);
	}
	public static void convertUsdToEuro(double tax) {
		System.out.println("Tax in euro " + tax / 1.25);
	}
}
