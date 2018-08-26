package org.wecancodeit;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int familyCount;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the last name?");
		String lastName = input.nextLine();

		System.out.println("How many people in your family? ");
		familyCount = input.nextInt();
		FamilyMember[] familyMembers = new FamilyMember[familyCount];
System.out.println("There are "+familyCount+ " Members In Your Family");
		for (int i = 0; i < familyMembers.length; i++) {
			FamilyMember member = new FamilyMember();
			// grab first name last name age
		}

		// String firstName = input.nextLine();
		// System.out.println(firstName);
	}

}
