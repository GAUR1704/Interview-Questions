package com.prowings.questions;

import java.util.Arrays;

public class LargestNumber {

//	public static void main(String[] args) {
//
//		String arr[] = { "3", "30", "34", "5", "9" };
//
//		System.out.println(largestnumber(arr));
//
//	}
//
//	private static String largestnumber(String arr[]) {
//
//		Arrays.sort(arr, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));
//
//		String str = "";
//
//		for (String s : arr) {
//
//			str = str + s;
//		}
//		return str;
//	}
	
// way two to find out the largest number from given string. 

	public static void main(String[] args) {
		
        String arr[] = { "3", "30", "34", "5", "9" };
        
        System.out.println(findLargestNumber(arr));
    }
	
    public static String findLargestNumber(String arr[]) {
    	
        Arrays.sort(arr, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));

        StringBuilder result = new StringBuilder();
        
        for (String s : arr) {
        	
            result.append(s);
        }

        return result.toString();
    }
}
