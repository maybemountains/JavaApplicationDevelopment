package Sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeExercises2 {

//	Write a program to sort the element of One-Dimensional Array in
//	Ascending order and print “*” in between the array values when you print
//	them.
	
	public void arraySortAndPrint(int[] gay) { // give the method an array and sort it
		Arrays.sort(gay);
		for (int i = 0; i < gay.length; i++) {
			System.out.print(gay[i] + " * "); // from there print each element in the array followed by an *
		}
	}
	
//	Write a program to create a file and add the given contents in it and display
//	them using the Buffered Reader.
	public void writingTime() throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("What would you like your file to be called? ");
		
		String fileName = scanner.nextLine();
		
		FileWriter newFile = new FileWriter("/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/SampleProject/srcProject/Sample/" + fileName + ".txt", true);
		
		System.out.println(fileName + " File created!");
		
		newFile.write("Hello Java Programming Users!");
		
		
		newFile.flush(); // basically the equivalent of "save changes" and allows us to then read the new changes from the file
		
		BufferedReader reader = new BufferedReader(new FileReader("/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/SampleProject/srcProject/Sample/" + fileName + ".txt"));
		System.out.println(reader.readLine());
		
		scanner.close();
		newFile.close();
		reader.close();
	}
	
//	Write a program to check if the file can read the content of it or not using
//	.canRead() function and print only ‘Object-oriented programming language’
//	using the BufferedReader ‘Offset’ concept and use the given contents to a
//	new file to read them.
	public void readingTime() throws IOException {
		String filePath = "/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/SampleProject/srcProject/Sample/gay.txt";
		File file = new File(filePath);

		if (file.canRead()) {
			System.out.println("This file can read!");
		}
		
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		var thing = "Object-oriented programming language.".length();
		char[] content = new char[thing];
		reader.skip(35); // this is how you skip to the index/character you want to start at
		reader.read(content, 0, thing); // put all the characters in an array, we've made our array the exact length
										// we want it to be.
		System.out.print(content);
	}

	public void tryCatchTime() {
		int d = 42;
		int a = 0;
		try {
			int c = d / a;
			System.out.println("The value of c :" + c);
		} catch (ArithmeticException e) { // just the error if u divide by 0
			System.out.println("Division by zero error");
		}
	}
	
	
	public static void main(String[] args) throws IOException {
//		PracticeExercises2 test = new PracticeExercises2();
//		test.arraySortAndPrint(new int[] {4, 3, 21, 1});
//		test.writingTime();
//		test.readingTime();
//		test.tryCatchTime();

		Employee lesbian = new Employee();
		lesbian.setInfo();
		lesbian.printInfo();

	}

}

class Employee {
	public int employeeID;
	public String employeeName;
	public int totalDuration;
	
	public void setInfo() {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		this.employeeID = scan.nextInt();
		System.out.print("Enter Total Duration: ");
		this.totalDuration = scan.nextInt();
		System.out.print("Enter Employee Name: ");
		this.employeeName = scan2.nextLine();
		scan.close();
		scan2.close();
	}
	
	public void printInfo() {
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Wages: " + new Company(123, "Gay", 20.23, 52, totalDuration).wagesCalculation());
	}
	
}

class Company extends Employee {
	public int companyID;
	public String companyName;
	public double wagesPerHour;
	public int noOfWeeks;
	public int totalDuration;
	
	Company(int companyID, String companyName, double wagesPerHour, int noOfWeeks, int totalDuration){
		this.companyID = companyID;
		this.companyName = companyName;
		this.wagesPerHour = wagesPerHour;
		this.noOfWeeks = noOfWeeks;
		this.totalDuration = totalDuration;

	}
	
	public double wagesCalculation() {
		return wagesPerHour * noOfWeeks * totalDuration;
	}
	
}
