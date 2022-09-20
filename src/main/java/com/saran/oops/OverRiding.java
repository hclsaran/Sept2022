package com.saran.oops;

//Inheritance is "IS A" relationship
class Vehicle {
	Vehicle(int id,String name) {
		System.out.println("calling vehicle zero arg constructor");
	}

	int x = 200;

	void speed() {
		System.out.println("Vehicle speed" + x);
	}
}

class Car extends Vehicle {
	int x = 100;

	Car(int id,String name, float price) {
		super(id,name);
		System.out.println("calling car zero arg constructor");
	}

	void speed() { // override
		System.out.println(x);
		System.out.println(super.x);

	}
}

public class OverRiding extends Vehicle {
	OverRiding(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	void speed() {
		System.out.println("Overriding speed" + x);
	}

	public static void main(String[] args) {
		/*
		 * Vehicle vv = new Car(); System.out.println("Output "+vv.x);//200
		 * 
		 * OverRiding o1 = new OverRiding(); o1.speed(); Vehicle v1 = new Vehicle();
		 * v1.speed();
		 * 
		 * Vehicle v2 = new OverRiding(); v2.speed();
		 */

	//	Car c1 = new Car();
		// c1.printSpeed();

	}

}
