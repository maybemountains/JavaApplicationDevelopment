package oopsConcepts;

import java.util.Scanner;

abstract class AbstractExample {

	abstract void customerPin(); // template
	void printInfo() {
		System.out.println("gay");
	}
	
}

class Bank extends AbstractExample {
	
	Bank(){
		super.printInfo(); // will just run it when u make it 
	}
	
	@Override // actual content 
	void customerPin() {
		System.out.print("Enter your pin: ");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		System.out.print("Enter amount: ");
		float amt = sc.nextFloat();
		System.out.print("Please take your cash and your card! ");
	}
	
	void printInfo() {
		System.out.println("also gay");
	}
}