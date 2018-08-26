package org.wecancodeit;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// Create scanner to get user input
		Scanner input = new Scanner(System.in);

		// Get family last name
		System.out.println("What is the last name?");
		String lastName = input.nextLine();

		// Get number of family members
		System.out.println("How many people in your family? ");
		int familyCount = input.nextInt();
		input.nextLine(); // Empty System.in of extra "Enter" keypress

		// Initialize empty array of family members
		FamilyMember[] familyMembers = new FamilyMember[familyCount];
		System.out.println("There are " + familyCount + " Members In Your Family");

		// Get individual info for each member
		for (int i = 0; i < familyMembers.length; i++) {

			// Create new FamilyMember object
			FamilyMember member = new FamilyMember();

			// Set last name (from previous user input)
			member.lastName = lastName;

			// Set first name
			System.out.println("What is the first name? ");
			String firstName = input.nextLine();
			member.firstName = firstName;

			// Set age
			System.out.println("What is the age? ");
			int age = input.nextInt();
			input.nextLine(); // Clear System.in of extra line break
			member.age = age;
			
			// Put the family member in the array
			familyMembers[i] = member;
		}
		
		// Report on the family
		int memberAgeSum = 0;
		for (FamilyMember member : familyMembers) {
			System.out.println(member.getFullName() +
				" is " + member.age + " years old.");
			memberAgeSum += member.age;
		}
		int memberAgeAverage = memberAgeSum / familyCount;
		System.out.println("The sum of all member ages is " + memberAgeSum);
		System.out.println("The average age of members is " + memberAgeAverage);
		
	}

}
