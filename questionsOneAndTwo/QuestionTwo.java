package questionsOneAndTwo;

import java.util.Scanner;

public class QuestionTwo {

//	Write a program to implement the concept to access vehicle and car details after getting the
//	information from the user(about car details in run-time) and display only the necessary record
//	about the car brand, model, availability of it. Print only the necessary details like the output
//	example given.
	
	public static void main(String[] args) {
		Car test = new Car();
		test.vehicleInfo();
	}
	
}

abstract class Vehicle{
	void printInfo() {
		System.out.println("Vehicle Details");
	}
	abstract void vehicleInfo();
}

class Car extends Vehicle {

	@Override
	void vehicleInfo() {
		// get all of the necessary information (such as brand, price, etc) from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Car Brand: ");
		String brand = sc.nextLine();
		System.out.print("Enter Car Model: ");
		String model = sc.nextLine();
		System.out.print("Enter Car Price: ");
		String price = sc.nextLine();
		System.out.print("Enter Car Availibility: ");
		String availibility = sc.nextLine();
		
		sc.close();
		
		// use printInfo from Vehicle
		super.printInfo();
		
		// Print the relevant info that we got previously
		System.out.println("Car Brand: " + brand);
		System.out.println("Car Model: " + model);
		System.out.println("Car Availbility: " + availibility);

	}
	
}
