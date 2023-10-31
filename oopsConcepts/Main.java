package oopsConcepts;

public class Main {

	public static void main(String[] args) {

		// i genuinely don't understand the point of this. 
//		InheritanceExample1 in = new InheritanceExample1();
//		in.inherit3();
//		in.inherit2();
//		in.inherit();
		
//		BankInheritancePart3 gay = new BankInheritancePart3();
//		gay.step1(); 
//		gay.step2();
//		gay.step4(gay.step3()); 
		
		
//		Bank b = new Bank();
//		b.customerPin();
//		b.printInfo(); // obvs gets only the one u have in the bank. u can't get the one above bc. duh.
//		
//		Queer lesbian = new Queer();
//		lesbian.printInfo();
//		lesbian.printInfo1();
		
//		ExampleInterface ex = new FuckOff();
//		ex.printInfo1();
//		ex.printInfo2();
		
		Vehicle v = new Car("gay", "250km/h", 69.69);
		System.out.println("Brand: " + v.getBrand() + " Speed: " + v.getSpeed() + " Price: " + v.getPrice());
	}

}
