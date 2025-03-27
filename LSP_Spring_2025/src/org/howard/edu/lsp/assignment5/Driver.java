package org.howard.edu.lsp.assignment5;

public class Driver {
	public static void main(String[] args) {
		// Test clear and add
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("Set1 after adds: " + set1);
		set1.clear();
		System.out.println("Set1 after clear: " + set1);
		
		
		// Test length
		set1.add(4);
		set1.add(5);
		System.out.println("Set1: " + set1);
		System.out.println("Length of Set1: " + set1.length());
	}
}
