package Sample;

import java.util.Scanner;

public class PracticeExercises {

	Scanner scanner = new Scanner(System.in);
	
	// my solutions
	public void even() {
		System.out.print("Please input a number: ");
		int x = scanner.nextInt();
		for(int i = 1; i < x; i++) { 
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

	// her solutions 
	
	// even was the same, she just starts at 1 instead of 0
	
	public void max() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the 1st value:");
		int n1 = sc.nextInt();
		System.out.printf("Enter the 2nd value:");
		int n2 = sc.nextInt();
		System.out.printf("The maximum value is: %d" , n1 > n2 ? n1 : n2);
		sc.close();
	}
	
	public void pass() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the subject:");
		String subject = sc.next();
		System.out.print("Enter the Grade:");
		char y = sc.next().charAt(0);
		switch(y) {
		case 'A' :
		case 'a':
			System.out.println("Excellent");
			break;
		case 'B':
		case 'b':
			System.out.println("Good");
			break;
		case 'C':
		case 'c':
			System.out.println("Try harder");
			break;
		default:
			System.out.println("Failed");
			break;
		}
		sc.close(); 
	}
	
	public void strings() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String[] n1 = name.split(" ");
		int n = n1[1].length();
		String reversedString = "";
		char ch; // Char to store current string character
		for (int i = n - 1; i >= 0; i--) {
			ch = n1[1].charAt(i);
			reversedString = reversedString + ch; // Append char to end
		}
		System.out.println(reversedString + " "+ n1[0]);
		sc.close();
	}

	public void mixed() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = new char[str.length()];
		
		for(int i = 0 ;i < str.length(); i ++) {
			ch[i] = str.charAt(i);
		}
		
		for(int i = 0 ;i < str.length(); i = i + 2) {
			
			// ASCII values from 97 - 122
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				ch[i] = Character.toUpperCase(str.charAt(i));
			}
			
			// ASCII values from 65 - 91
			else if(str.charAt(i) >= 65 && str.charAt(i) <= 91) {
			ch[i] = Character.toLowerCase(str.charAt(i));
			}
		}
		
		System.out.println(ch);
		sc.close(); 
	}
	
	public void concat() {
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();

		 for (int i = 0; i < str.length(); i++) {
			 char ch = str.charAt(i);
			 
			 if (Character.isAlphabetic(ch)) {
				 System.out.print(ch);
			 } 
			 else if (ch == '.' || ch == ',' || ch == ';') {
				 System.out.println();
			 }
		 }
		 sc.close();
	}
	
}
