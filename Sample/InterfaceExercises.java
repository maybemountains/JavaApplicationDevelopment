package Sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// shes gonna send us exercises for this and files at some point

public class InterfaceExercises {
	
	public void arrayListExample() {
		List<String> list = new ArrayList<String>();
		
		list.add("cat");
		list.add("rat");
		list.add("bat");
		
		list.set(1, "mat");
		
		for (String st : list) {
			System.out.println(st);
		}
		
	}

	public void linkedListExample() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(1, 500);
		list.removeFirst();
		
		// should help us iterator through the LinkedList, somehow?
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}

//	public void ig she gave up on vectors ? 
	
	public static void main(String[] args) {
		InterfaceExercises gay = new InterfaceExercises();
//		gay.arrayListExample();
		gay.linkedListExample();

	}

}
