package com.icraft.collection;

import java.util.*;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<Integer>();

		// Add elements to the list
		numbers.add(11);
		numbers.add(22);
		numbers.add(0, 10);
		numbers.set(1, 20);
		numbers.add(1,100);		

		Iterator it = numbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
