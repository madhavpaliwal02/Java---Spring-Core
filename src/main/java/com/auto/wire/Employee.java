package com.auto.wire;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside employee constructor");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
}
