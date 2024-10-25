package com.icraft.collection;

import java.util.*;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an ArrayList of Strings
		ArrayList<String> names = new ArrayList<>();

		// Adding elements to the ArrayList
		names.add("John");
		names.add("Jane");
		names.add("Emily");
		names.add("Michael");

		// Printing the ArrayList
		System.out.println("Names: " + names);

		// Accessing an element at a specific index
		String firstName = names.get(0);
		System.out.println("First name: " + firstName);

		// Removing an element by index
		names.remove(2); // Removes "Emily"
		System.out.println("After removal: " + names);

		// Iterating over the ArrayList
		for (String name : names) {
			System.out.println(name);
		}

		// Checking the size of the ArrayList
		System.out.println("Number of names: " + names.size());

		// Checking if a particular element exists
		if (names.contains("Jane")) {
			System.out.println("Jane is in the list.");
		}

		// Clearing all elements from the ArrayList
		names.clear();
		System.out.println("Names after clearing: " + names);
	}

}
