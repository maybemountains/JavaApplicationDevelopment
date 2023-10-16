package Sample;

import java.io.*;
import java.util.Scanner;

public class FileLecturePractice {
	public static void main(String[] args) throws IOException {
		File fileObj = new File("/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/SampleProject/srcProject/Sample/test.txt");
/*		try {
			if (fileObj.createNewFile()) {
				System.out.println("New File Created!");
			}
			else {
				System.out.println("File Already Exists!");
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
*/
		
		// Method 1 - Writing to a File
		FileWriter fileWriter = new FileWriter("/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/SampleProject/srcProject/Sample/test.txt", true);
//		fileWriter.append("Java programming is easy, i think, i hope!");
//		fileWriter.close();
		
		// Method 2 - Writing to a file with User Input
//		try {
//			Scanner scanner = new Scanner(System.in);
//			String data = new String();
//			System.out.println("To start input anything, to end hit enter ");
//			while (!scanner.nextLine().isEmpty()) {
//				System.out.println("Please input something and we'll add it to the file: ");
//				data = scanner.nextLine();
//				fileWriter.write(data);
//				System.out.println("File Content updated with: " + data);
//				System.out.println("To continue input anything, to end hit enter ");
//			}
//			fileWriter.write(data);
//			fileWriter.close();
//			System.out.println("File Content updated with: " + data);
//		} 
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		

		Scanner scanner = new Scanner(System.in);
		FileWriter newFile = new FileWriter("/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/SampleProject/srcProject/Sample/test2.txt", true);
		String data1 = "";
		BufferedWriter bf1 = null;
		// Method 3
//		try {
//			System.out.println("Enter the content: ");
//			data1 = scanner.nextLine();
//			System.out.println("Enter the offset: ");
//			int offset = scanner.nextInt(); // literally just offsets where u start
//			// also this whole thing leaves u trapped until u give it an offset
//			bf1 = new BufferedWriter(newFile);
//			bf1.write(data1, offset, data1.length() - offset);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		bf1.close();
//		scanner.close();
		
		// Method 4
//		try {
//			System.out.println("Enter the content: ");
//			bf1 = new BufferedWriter(newFile);
//			while (!data1.contentEquals("/")){
//				data1 = scanner.nextLine();
//				
//				bf1.write(data1, 0, data1.length());
//				bf1.newLine();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		bf1.close();
//		scanner.close();
		
		// Reading Files Time
		char[] array = new char[100];
		try {
			FileReader read = new FileReader("/Users/sonya/Desktop/Important Stuff/School Stuff/School Subjects/Java/SampleProject/srcProject/Sample/test2.txt");
			
			read.read(array);
			System.out.println("Data in the File:");
			System.out.print(array);
			read.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		
	}
}
