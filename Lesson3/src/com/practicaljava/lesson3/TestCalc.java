package com.practicaljava.lesson3;

public class TestCalc {
	public static void main(String[] args) {
		NJTax t = new NJTax();
		t.grossIncome = 50000;
		t.dependents = 2;
		t.stste = "NJ";
		double yourTax = t.calcTax();
		System.out.println("Your tax is " + yourTax);
	}

}
