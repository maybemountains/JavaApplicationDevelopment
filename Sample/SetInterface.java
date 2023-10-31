package Sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public void hashSetExample() {
		Set<String> set = new HashSet<String>();
		set.add("cat");
		set.add("bat");
		set.add("rat");
		
//		Iterator<String> i = set.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		for (String st : set) {
//			System.out.println(st);
//		}
		
		System.out.println(set);

	}

	public void linkedHashSetExample() {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("cat");
		set.add("bat");
		set.add("rat");
		
		System.out.println(set);
	}
	
	public void treeSetExample() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("apple");
		set.add("mango");
		set.add("orange");
		
		System.out.println(set.last());
	}
	
	public void listExample() {
		System.out.println("Hash set: ");
		Set<String> set = new HashSet<String>();
		set.add("cat");
		System.out.println(set.hashCode());
	}
	
	public static void main(String[] args) {
		SetInterface gay = new SetInterface();
//		gay.hashSetExample();
//		gay.linkedHashSetExample();
//		gay.treeSetExample();
		gay.listExample();

	}

}
