package com.saran.oops;

//Aggregation is used for code reusability
public class Employee {

	int id;
	String name;
	// HAS A
	Address address;

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// instance method
	void show() {
		System.out.println(id + "  " + name);
		System.out.println(address.city + " " + address.state + "  " + address.country);
	}

	public static void main(String[] args) {
		Address a1 = new Address("Santa Clara", "CA", "USA");
		Address a2 = new Address("Pit", "PA", "USA");

		Employee e1 = new Employee(111, "Caleb", a1);
		Employee e2 = new Employee(112, "Amar", a2);
		e1.show();
		e2.show();

	}

}
