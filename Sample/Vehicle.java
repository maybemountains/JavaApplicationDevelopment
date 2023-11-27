package Sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vehicle {

	 int id;
	 String brand;
	 double price;
	
	public Vehicle(int id, String brand, double price) {
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	
	public static void main(String[] args) {
		List<Vehicle> cars = new ArrayList<Vehicle>();
		cars.add(new Vehicle(1, "Chevy", 200.00));
		cars.add(new Vehicle(5, "dkjghjkdfg", 100000.00));
		cars.add(new Vehicle(8, "Ch4iuio5evy", 10000.00));
		cars.add(new Vehicle(2, "Toyota", 1000.00));
		cars.add(new Vehicle(3, "bruh idk cars", 1111.00));


		List<Vehicle> carPrice = cars.stream().filter(a -> a.price < 10000.00).collect(Collectors.toList());
		for (Vehicle ex : carPrice) {
			System.out.println(ex.brand + " - " + ex.price);
		}
		
		System.out.println("|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|\n"
				+ "| The above was filtered,"
				+ "the following is sorted |\n"
				+ "|＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿|\n"
				+ "                     \\ (•◡•) /");
		
		List<Vehicle> carBrand = cars.stream().sorted((id1, id2) -> id1.id - id2.id).collect(Collectors.toList());
		for (Vehicle ex : carBrand) {
			System.out.println(ex.id + " -- " + ex.brand);
		}
		
	}
	
}
