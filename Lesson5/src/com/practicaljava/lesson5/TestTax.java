package com.practicaljava.lesson5;

class TestTax {
    public static void main(String[] args) {

	if (args.length != 3) {
	    System.out.println("Sample usage of the programm: java TestTax 50000 NJ 2");
	    System.exit(0);
	}

	double grossIncome = Double.parseDouble(args[0]); // local variables
	String state = args[1];
	int dependents = Integer.parseInt(args[2]);

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