package org.wecancodeit;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the last name?");
		String lastName = input.nextLine();
		System.out.println("The last name is: " + lastName);
	}
	
	class FamilyMember {
		String lastName;
		String firstName;
		int age;
		
		public String getFullName() {
			return firstName + " " + lastName;
		}
	}
}
