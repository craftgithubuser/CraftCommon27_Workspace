package com.elto2022;

import java.util.Scanner;

public class Employee2 {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("please enter your first name: ");
String firstname = in.next();
System.out.println("please enter your last name: ");
String lastname = in.next();
System.out.println("please enter your gender: ");
char gender = in.next().charAt(0);
System.out.println("please enter your age: ");
int age = in.nextInt();
System.out.println("please enter your salary: ");
Double salary = in.nextDouble();
System.out.println("please enter your bonus: ");
Double bonus = in.nextDouble();
System.out.println("please enter your totalsalary: ");
Double totalsalary = salary + bonus;

System.out.println("EmployeeName: " + firstname + " " + lastname );
System.out.println("gender: " + gender);
System.out.println("age: " + age);
System.out.println("salary: " + salary);
System.out.println("bonus: " + bonus);
System.out.println("totalsalary: " + totalsalary);
		















}
}






















