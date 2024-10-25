package com.icraft.collection;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		// Creating a LinkedList of Integers
		LinkedList<Integer> numbers = new LinkedList<>();

		// Adding elements to the LinkedList
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.addFirst(5); // Adding an element to the start
		numbers.addLast(40); // Adding an element to the end

		// Printing the LinkedList
		System.out.println("Numbers: " + numbers);

		// Accessing elements by index
		System.out.println("First number: " + numbers.get(0)); // Get the first element
		System.out.println("Last number: " + numbers.getLast()); // Get the last element

		// Removing elements
		numbers.remove(2); // Removes the element at index 2
		System.out.println("After removal: " + numbers);

		// Using LinkedList as a Queue (FIFO)
		numbers.pollFirst(); // Retrieves and removes the first element
		System.out.println("After polling first: " + numbers);

		// Iterating over the LinkedList
		for (Integer number : numbers) {
			System.out.println(number);
		}

		// Checking the size of the LinkedList
		System.out.println("Number of elements: " + numbers.size());

		// Checking if a particular element exists
		if (numbers.contains(20)) {
			System.out.println("20 is in the list.");
		}
	}
}
