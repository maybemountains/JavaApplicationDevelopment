package questionsOneAndTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionOne {

//	Write a program to fetch the even numbers and odd numbers from an array and store the set
//	of numbers in another array as odd = {} and even={} display them. And use both array and find
//	the number that is divisible by 3 or 5 and display them. The order of displaying result must be
//	followed by using the sub-array(even, odd).
	
	public void questionOne() {
		Scanner sc = new Scanner(System.in); // so that we can get the input
		
		System.out.print("Please enter the size of the array: ");
		int size = sc.nextInt(); // getting the size of the array from the user input
		
		int[] array = new int[size]; // this creates the array with the given size
		
		System.out.print("Please give me the numbers you would like to fill the array with: "); // asking the user for numbers
		// i found it easier to do this in a loop and set each element to the value given
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(array); // this will let us sort the array so we don't need to worry about it later
		
		// using ArrayLists from here on out to make my life easier without needing to determine the size of them.
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		
		// for every element in my initial int array
		for (int i = 0; i < size; i++) {
			// i check if it's divisible by two, and if it is i add it to the evens ArrayList
			// otherwise I will add it to the odds ArrayList
			if (array[i] % 2 == 0) {
				evens.add(array[i]);
			}
			else {
				odds.add(array[i]);
			}
		}
		
		// new ArrayList for the same reason, but this time im checking if its divisible by 3 or 5
		ArrayList<Integer> divisibleByThreeOrFive = new ArrayList<>();
		
		// while im sure there's more efficient ways to do this, the easiest way is to individually loop over my
		// evens ArrayList and then my odds ArrayList where i will then check if a value at the given index is 
		// divisible by three OR five. and add it to the relevant ArrayList
		for (int i = 0; i < evens.size(); i++) {
			if (evens.get(i) % 3 == 0 || evens.get(i) % 5 == 0) {
				divisibleByThreeOrFive.add(evens.get(i));
			}
		}
		
		for (int i = 0; i < odds.size(); i++) {
			if (odds.get(i) % 3 == 0 || odds.get(i) % 5 == 0) {
				divisibleByThreeOrFive.add(odds.get(i));
			}
		}
		
		System.out.println("The even list is: " + evens);
		System.out.println("The odd list is: " + odds);
		System.out.println("The numbers that are divisible by 3 or 5 are: " + divisibleByThreeOrFive);
		
	}
	
	public static void main(String[] args) {
		QuestionOne test = new QuestionOne();
		test.questionOne();
	}
	
}
