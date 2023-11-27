package Sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	 int id;
	 String name;
	 int age;
	
	public StreamExamples(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		List<StreamExamples> students = new ArrayList<StreamExamples>();
		students.add(new StreamExamples(1, "Tom", 21));
		students.add(new StreamExamples(4, "Jazz", 21));
		students.add(new StreamExamples(3, "Peter", 20));
		students.add(new StreamExamples(2, "Harry", 22));
		students.add(new StreamExamples(5, "Jack", 23));
		
//		students.stream().filter(a -> a.age < 22).collect(Collectors.toList());
		students.stream().filter(a -> a.age < 22).forEach((n) -> System.out.println(n.name));

		List<StreamExamples> studentNames = students.stream().filter(a -> a.age < 22).collect(Collectors.toList());
		for (StreamExamples ex : studentNames) {
			System.out.println(ex.name);
		}
		
		List<StreamExamples> studentId = students.stream().sorted((id1, id2) -> id1.id - id2.id).collect(Collectors.toList());
		for (StreamExamples ex : studentId) {
			System.out.println(ex.id + " -- " + ex.name);
		}
		
	}
	
}
