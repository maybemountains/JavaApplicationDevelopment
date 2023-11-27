package Sample;

public class Main {

	public static void main(String[] args) {
/*		CalculateSum sum = new CalculateSum();
		sum.Calculate();
		
		ConditionalStatement eligible = new ConditionalStatement();
		eligible.elgibileToVote();
		
		ConditionalStatement dayOfWeek = new ConditionalStatement();
		dayOfWeek.dayOfWeek();
		
		Loops loopTest = new Loops();
		loopTest.reverse();
		
		StringsPractice test = new StringsPractice();
		test.upperAndLower();
		test.upperOrLower();
		
		PracticeExercises practice = new PracticeExercises();
		practice.even();
		practice.maxxed();
		practice.passed();
		practice.nameTriangle();
		practice.reverso();
		practice.spongebob();
		practice.itsAllOneWord(); */
		
		 FunctionalInterfaceExample fin = (name, value) -> {
	            System.out.printf("Hello lambda expression%n %s %s", name, value);
	        };
	        fin.test("Abcd", 0);
		
		
	}

}