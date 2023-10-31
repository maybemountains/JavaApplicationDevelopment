package Sample;

import java.util.Arrays;

public class PracticeExercises2pt2 {
	
//	Write a program to add the element of Array List as arguments of main
//	method(Run time) and rearrange them and print them in a new line.
	// while i am unsure how to actually test this on eclipse, this is, i think, in theory, how it would work
    public static void main(String[] args) {
        int[] array = new int[args.length]; // length of our int array will be the length of our args string array
        
        // loop over the args and get the int for each and add it to our regular int array
        for(int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        // sort the array
        Arrays.sort(array);
        
        // print the array
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d", array[i]);
            System.out.println();
        }
    }

}
