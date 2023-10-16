package Sample;

import java.util.Scanner;

public class Loops {
	
	Scanner scanner = new Scanner(System.in);
	
	public void reverse() {
		
		System.out.println("Please give me a number ");
		int num = scanner.nextInt();
		int rev = 0, temp = num, rem = 0;
		
		while (temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		
		System.out.println("Reversed Number: " + rev);
		
		for (; temp > 0; temp/=10) {
			rem = temp % 10;
			rev = rev * 10 + rem;
		}
		
		System.out.println("Reversed Number: " + rev);
		
	}
	
	
}
