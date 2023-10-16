package Sample;

import java.util.Scanner;

public class StringsPractice {

	Scanner scanner = new Scanner(System.in);

	String input = new String();
	
	public void upperAndLower() {
		System.out.println("Please give me a letter, word, phrase ");
		input = scanner.nextLine();
		System.out.println("Upper Case: " + input.toUpperCase());
		System.out.println("Lower Case: " + input.toLowerCase());
	}
	
	public void upperOrLower() {
		System.out.println("Please give me a letter, word, phrase ");
		input = scanner.nextLine();
		if (input.toLowerCase().equals(input)) {
			System.out.println(input.toUpperCase());
		} else {
			System.out.println(input.toLowerCase());
		}
	}
}
