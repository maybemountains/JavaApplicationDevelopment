package Sample;

import java.util.Scanner;

public class ConditionalStatement {

	private int age;
	private int day;
	Scanner scanner = new Scanner(System.in);

	public void elgibileToVote() {

		System.out.println("Please input your age: ");
		age = scanner.nextInt();

		if (age < 18) {
//			System.out.println("You are not eligible to vote :(");
			System.out.println("NOT ELIGIBLE");
		} else {
//			System.out.println("You are eligible to vote :D");
			System.out.println("ELIGIBLE");
		}

	}

	public void dayOfWeek() {
		
		System.out.println("Please give me a number 1 through 7");
		day = scanner.nextInt();
		
		
		switch(day) {
		case 1:
			System.out.println("It is Monday");
			break;
		case 2:
			System.out.println("It is Tuesday");
			break;
		case 3:
			System.out.println("It is Wednesday");
			break;
		case 4:
			System.out.println("It is Thursday");
			break;
		case 5:
			System.out.println("It is Friday");
			break;
		case 6:
			System.out.println("It is Saturday");
			break;
		case 7:
			System.out.println("It is Sunday");
			break;
		default:
			System.out.println("You did not give me a valid number.");
		}
	}
	
}
