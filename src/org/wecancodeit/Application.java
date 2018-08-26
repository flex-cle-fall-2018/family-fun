package org.wecancodeit;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int familyCount;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the last name?");
		String lastName = input.nextLine();
		//System.out.println("The last name is: " + lastName);
		System.out.println("What is the first name? ");
		System.out.println("How many people in your family? ");
		familyCount = input.nextInt();
		FamilyMember[] familyMembers = new FamilyMember[familyCount];
		
		
		//String firstName = input.nextLine();
		//System.out.println(firstName);
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
