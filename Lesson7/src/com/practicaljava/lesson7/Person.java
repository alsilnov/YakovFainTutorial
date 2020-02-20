package com.practicaljava.lesson7;

public abstract class Person {
    private String name;
    private String address;
    final int INCREASE_CAP = 20;

    public Person(String name) {
	this.name = name;
    }

    public String getName() {
	return "Person`s name is " + name + ".";
    }

    public void changeAddress(String adress) {
	this.address = address;
	System.out.println("New address");
    }

    private void giveDayOff() {
	System.out.println("Giving a day off to " + name);
    }

    public void promote(int persent) {
	System.out.println("Promouting a worker...");
	giveDayOff();
	increasePay(persent);
    }

    public abstract boolean increasePay(int percent);
}
