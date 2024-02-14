package com.prowings.questions;

public class Demo {

	public static void main(String[] args) {

		Integer num1 = 100;
		Integer num2 = 100;
		Integer num3 = 500;
		Integer num4 = 500; // -127 to 128

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hiii");
		String s4 = new String("Hiii");

		if (num1 == num2) {

			System.out.println("num1 == num2");

		} else

			System.out.println("num1 != num2");

		if (num3 == num4) {

			System.out.println("num3 == num4");
		} else
			System.out.println("num3 != num4");
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		if (s1 == s2) {

			System.out.println("s1 == s2");

		} else

			System.out.println("s1 != s2");
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		
		if (s3 == s4) {
			
			System.out.println("s3 == s4");
			
		} else
			
			System.out.println("s3 != s4");

	}

}
