package com.icraft.collection;

import java.util.*;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an ArrayList
		List<String> fruits = new ArrayList<>();

		// Adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		//replacing Orange by Grape
		fruits.set(2,"Grape");

		// Accessing elements
		System.out.println("First fruit: " + fruits.get(0));
		
		// Iterating over the list
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Removing an element
		fruits.remove("Banana");

		// Checking if the list contains an element
		if (fruits.contains("Banana")) {
			System.out.println("Banana is in the list");
		}else {
			System.out.println("Banana is not in the list");
		}

	}

}
