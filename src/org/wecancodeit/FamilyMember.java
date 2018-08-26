package org.wecancodeit;

public class FamilyMember {
	String lastName;
	String firstName;
	int age;
	
	FamilyMember() {
		//
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
}