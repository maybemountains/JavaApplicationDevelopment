package oopsConcepts;

import java.util.Scanner;

class BankInheritance {
	public void step1() {
		System.out.print("Please insert your card. ");
	}
}

class BankInheritancePart2 extends BankInheritance {
	Scanner scanner = new Scanner(System.in);
	
	public void step2() {
		System.out.print("Card inserted. Please input your pin: ");
		String pin = scanner.nextLine();
	}
	
	public double step3() {
		System.out.println("How much would you like to withdraw?");
		double amount = scanner.nextDouble();
		return amount;
	}
	
}

class BankInheritancePart3 extends BankInheritancePart2 {
	public void step4(double amount) {
		System.out.printf("You withdrew %f from your bank account", amount);
	}
}



