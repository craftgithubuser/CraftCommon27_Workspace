package com.icraft.StringHandling;

public class StringHandlingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		String name = "James";
//		
//		name.concat(" Bond"); //alter, TO CHANGE THE CONTENT OF THE name variable
//
//		System.out.println(name);
//		
//		String strNew = "I" + "Like" + "Java" + "Language";
//		
//		System.out.println(strNew);
//		
//		int strLen = strNew.length();
//		
//		System.out.println(strLen);
//		
//		String str1 = "Jamie";
//		
//		char ch1 = str1.charAt(4);
//		
//		System.out.println(ch1);

//		String name1 = "ISmail";
//		String name2 = "Ismail";
//
//		if (name1.equals(name2)) {
//
//			System.out.println("The strings are equals");
//		} else {
//			System.out.println("They are not equal");
//		}
//		
//		if (name1.equalsIgnoreCase(name2)) {
//
//			System.out.println("The strings are equals");
//		} else {
//			System.out.println("They are not equal");
//		}
		
//		String str1 = "                   Today is holiday. Tomorrow is working day                       ";
		
		//indexOf, subString, split
		
//		System.out.println(str1.indexOf("holiday"));
//		
//		System.out.println(str1.substring(9,16));

//		String[] arr = str1.split(" ");
//		
//		for(String elt: arr) {
//			System.out.println(elt);
//		}
//		System.out.println(str1.trim());
//		System.out.println(str1.trim().toLowerCase());
//		
//		System.out.println(str1.trim().toUpperCase());
		
		StringBuffer str1 = new StringBuffer("Hello");
		str1.insert(5, " World");
		System.out.print(str1);

	}

}
