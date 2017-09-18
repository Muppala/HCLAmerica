package com.hcl.programmingchallenge2;

import java.util.ArrayList;

class PersonData {
	private String id;
	private String name;
	private String phone;
	private String address;
	
	public PersonData(String id, String name, String phone, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	/**
	 * Method that returns Person data
	 * @return
	 */
	public String getPersonData() {
		return new StringBuilder("Id: ")
				.append(this.id)
				.append(" Name: " )
				.append(this.name)
				.append(" Phone: ")
				.append(this.phone)
				.append(" Address: ")
				.append(this.address)
				.toString();
	}
}

public class Person {
	public static void main(String args[]) {
		ArrayList<PersonData> personList = new ArrayList<PersonData>();
		personList.add(new PersonData("P1001", "Alice", "617234567", "22 Sweetwater way, Boston"));
		personList.add(new PersonData("P1002", "Sam", "617456789", "36 Chocolate street, Cambridge"));
		personList.add(new PersonData("P1003", "Jessie", "508123456", "2 Windsong way, Chicago"));
		//Print the details
		personList.forEach((person) -> { System.out.println(person.getPersonData()); });
	}
}
