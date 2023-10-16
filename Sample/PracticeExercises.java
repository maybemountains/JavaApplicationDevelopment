package Sample;

import java.util.Scanner;

public class PracticeExercises {

	Scanner scanner = new Scanner(System.in);
	
	public void even() {
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void maxxed() {
		System.out.print("Please input number 1: ");
		int x = scanner.nextInt();
		System.out.print("Please input number 2: ");
		int y = scanner.nextInt();
		System.out.print("The max between these two numbers is: " + Math.max(x, y));
	}
	
	public void passed() {
		System.out.print("Please tell me the subject: ");
		String subject = scanner.nextLine();
		System.out.print("Please tell me the grade the student got: ");
		String grade = scanner.nextLine();
		switch (grade.toUpperCase()) {
		case "A":
			System.out.println("Excellent! Subject: " + subject + " and Grade: " + grade);
			break;
		case "B":
			System.out.println("Good! Subject: " + subject + " and Grade: " + grade);
			break;
		case "C":
			System.out.println("Try Harder! Subject: " + subject + " and Grade: " + grade);
			break;
		case "D":
			System.out.println("Try Harder! Subject: " + subject + " and Grade: " + grade);
			break;
		case "F":
			System.out.println("Failder! Subject: " + subject + " and Grade: " + grade);
			break;
		default: 
			System.out.println("This is not a valid grade.");
		}
	}

	public void nameTriangle() {
		System.out.print("Please tell me your name: ");
		String name = scanner.nextLine();
		int row = name.length();
		for (int i = 0 ; i < row; i++) {
			for (int j = row - i; j > 1; j--) {
				System.out.print(" ");
				
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(name.charAt(j) + " ");
			}
			System.out.println();
		}
	}
	
	public void reverso() {
		System.out.print("Please tell me your first word: ");
		String first = scanner.nextLine();
		System.out.print("Please tell me your second word: ");
		String second = scanner.nextLine();
		String temp = new String();
		for (int i = second.length(); i > 0; i--) {
			temp += second.charAt(i - 1);
		}
		System.out.print(temp + " " + first);
	}
	
	public void spongebob() {
		System.out.print("Please give me a word or phrase: ");
		String input = scanner.nextLine();
		String temp = new String();
		boolean isAllLower = input.equals(input.toLowerCase());
		if (isAllLower || input.equals(input.toUpperCase())) {
			for (int i = 0; i < input.length(); i++) {
				if (i % 2 == 0) {
					
					temp += (isAllLower ? input.toLowerCase() : input.toUpperCase()).charAt(i);
				}
				else {
					temp += input.charAt(i);
				}
			}
		}
		else {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == input.toUpperCase().charAt(i)) {
					temp += input.toLowerCase().charAt(i);
				}
				else {
					temp += input.toUpperCase().charAt(i);
				}
			}
		}
		System.out.println(temp);
	}
	
	public void itsAllOneWord() {
		System.out.println("Give me a sentence and watch how I'll change it for you :D ");
		String input = scanner.nextLine();
		String temp = input.replaceAll(" ", "").replaceAll("[.;,]", "\n");
		System.out.print(temp);
	}
}
