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
		input.nextLine();
		FamilyMember[] familyMembers = new FamilyMember[familyCount];
		System.out.println("There are " + familyCount + " Members In Your Family");
		for (int i = 0; i < familyMembers.length; i++) {
			FamilyMember member = new FamilyMember();
			member.lastName = lastName;
			System.out.println("What is the first name? ");
			String firstName = input.nextLine();
			member.firstName = firstName;
			System.out.println("What is the age? ");
			int age = input.nextInt();
			input.nextLine();
			member.age = age;
		}
System.out.println(familyMembers);
		// String firstName = input.nextLine();
		// System.out.println(firstName);
	}

}
