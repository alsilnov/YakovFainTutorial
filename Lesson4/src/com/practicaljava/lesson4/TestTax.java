package com.practicaljava.lesson4;

class TestTax {
	public static void main(String[] args) {
		double grossIncome = 50000; // local variables
		String state = "NJ";
		int dependents = 2;
		Tax t = new Tax(grossIncome, state, dependents);
		Tax t2 = new Tax(65000, "TX", 4);
		double yourTax = t.calcTax();
		double hisTax = t2.calcTax();
		System.out.println("Your tax is " + yourTax);
		Tax.convertUsdToEuro(yourTax);
		System.out.println("His tax is " + hisTax);
		Tax.convertUsdToEuro(hisTax);
	}
}
