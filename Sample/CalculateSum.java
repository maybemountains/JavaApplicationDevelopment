package Sample;
import java.util.Scanner;
public class CalculateSum {
	
	private int value1;
	public int value2;
	protected String name;
	Scanner scanner = new Scanner(System.in);
	
	public void Calculate() {
//		name = scanner.next(); // scanner.nextLine(); as string
		System.out.println("Enter the input");
		value1 = scanner.nextInt(); //getting input as integer
		System.out.println("Enter the second input");
		value2 = scanner.nextInt();
		System.out.println("sum: "+(value1+value2));
	}
}