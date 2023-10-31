package oopsConcepts;

public interface InterfaceConfusionBabes {
	
	void printInfo();
	default void printInfo1() { // when youre using static or default u can give it a body.
		// but there's a difference between them that I Did Not Process.
		System.out.println("babes pls (interface here reporting for duty)");
	}

}

abstract class Gay implements InterfaceConfusionBabes {
	int value = 100;
	
	@Override
	public void printInfo() {
		System.out.println("Printing from the abstract class");
	}
}

class Queer extends Gay {
	
	Queer(){
		super.printInfo();
	}
	
	int value = 200;
	
	public void printInfo() {
		System.out.println("Printing from class " + super.value);
	}
}
