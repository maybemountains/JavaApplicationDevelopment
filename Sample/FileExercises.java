package Sample;

import java.io.*;
import java.util.Scanner;

public class FileExercises {
	public static void main(String[] args) throws IOException {
		File fileObj = new File("/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/SampleProject/srcProject/Sample/test2.txt");
		FileWriter fw = new FileWriter("/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/SampleProject/srcProject/Sample/test2.txt", true);
		fw.append("gayyyyyyyyyyyy");
		fw.close();
		
		System.out.println("Can I Write? " + fileObj.canWrite());
		System.out.println("Can I Read? " + fileObj.canWrite());
		System.out.println("Where am I? " + fileObj.getAbsolutePath());
		System.out.println("What is my name? " + fileObj.getName());
		System.out.println("How long am I? " + fileObj.length() + "characters!");

	}
}
