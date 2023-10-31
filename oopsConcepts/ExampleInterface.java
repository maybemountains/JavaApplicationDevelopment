package oopsConcepts;

public interface ExampleInterface {
	
	void printInfo1();
	
	default void printInfo2() {
		System.out.println("Default Interface Class");
	}
	
	static void printInfo3() {
		System.out.println("Static Interface Class");
	}
	
}

abstract class AbstractExample2 {
	
	abstract void printInfo1();
	
	void print() {
		System.out.println("Abstract Class");
	}
	
}

interface ExampleInterface2 {
	
	abstract void printInfo1();
	
	default void printInfo() {
		System.out.println("Interface2 Class");
	}
	
}

class Child implements ExampleInterface, ExampleInterface2{
	@Override
	public void printInfo1() {
//		super.print();
		System.out.println("Class Child");
	}
}

class FuckOff extends AbstractExample2 implements ExampleInterface{
	@Override
	public void printInfo1() {
		super.print();
		System.out.println("Class Child");
	}
}