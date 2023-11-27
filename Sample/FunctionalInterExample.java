package Sample;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterExample {

	public static void main(String[] args) {
		Addition add = (int a, int b) -> (a + b);
		System.out.println(add.add(100, 200));
		
		Addition add2 = (a, b) -> {
			return(a+b);
		};
		
		System.out.println(add2.add(200, 200));
		
		List<String> names = new ArrayList<String>();
		names.add("abcd");
		names.add("efgh");
		names.add("ijkl");
		
		names.forEach((n) -> System.out.println(n));
	}

}

interface Addition {
	int add(int a, int b);
}