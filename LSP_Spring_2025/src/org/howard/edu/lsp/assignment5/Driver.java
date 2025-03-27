package org.howard.edu.lsp.assignment5;

public class Driver {
	public static void main(String[] args) {
		// Test clear and add
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(3);
		System.out.println("Set1 after adds: " + set1);
		set1.clear();
		System.out.println("Set1 after clear: " + set1);
		
		
		// Test length
		set1.add(4);
		set1.add(5);
		System.out.println("Set1: " + set1);
		System.out.println("Length of Set1: " + set1.length());
		
		// Test equals
		IntegerSet set2 = new IntegerSet();
		set2.add(5);
		set2.add(4);
		System.out.println("Set1 equals Set2? " + set1.equals(set2));

		// Test contains
		System.out.println("Set1 contains 4? " + set1.contains(4));
		System.out.println("Set1 contains 10? " + set1.contains(10));

		// Test largest and smallest
		System.out.println("Largest in Set1: " + set1.largest());
		System.out.println("Smallest in Set1: " + set1.smallest());

		// Test add and remove
		set1.add(6);
		System.out.println("Set1 after adding 6: " + set1);
		set1.remove(5);
		System.out.println("Set1 after removing 5: " + set1);

		// Test union
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(7);
		System.out.println("Set1: " + set1);
		System.out.println("Set3: " + set3);
		set1.union(set3);
		System.out.println("Set1 after union with Set3: " + set1);

		// Test intersect
		IntegerSet set4 = new IntegerSet();
		set4.add(4);
		set4.add(6);
		System.out.println("Set1 before intersection: " + set1);
		System.out.println("Set4: " + set4);
		set1.intersect(set4);
		System.out.println("Set1 after intersecting with Set4: " + set1);

		// Test diff
		IntegerSet set5 = new IntegerSet();
		set5.add(4);
		set5.add(1);
		System.out.println("Set1 before difference: " + set1);
		System.out.println("Set5: " + set5);
		set1.diff(set5);
		System.out.println("Set1 after diff with Set5: " + set1);

		// Test complement
		IntegerSet set6 = new IntegerSet();
		set6.add(2);
		set6.add(3);
		set6.add(4);
		System.out.println("Set1: " + set1);
		System.out.println("Set6: " + set6);
		set1.complement(set6);
		System.out.println("Set1 after complement with Set6: " + set1);

		// Test isEmpty
		System.out.println("Is Set1 empty? " + set1.isEmpty());
		set1.clear();
		System.out.println("Set1 after clear: " + set1);
		System.out.println("Is Set1 empty now? " + set1.isEmpty());

		// Test toString
		System.out.println("Set1 toString: " + set1.toString());
	}
}
