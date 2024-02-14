 /*Interview Question:
 * 
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.

Open brackets must be closed in the correct order.

Every close bracket has a corresponding open bracket of the same type.

Input: s = "{} () []"

Output: true

Input: s = "(]"

Output: false

*/
package com.prowings.questions;

import java.util.Stack;

public class ValidateBrackets {

	public static void main(String[] args) {

		String s = "(),[],{}";

		boolean status = validateStringBrackets(s);
		
		System.out.println(s);
		System.out.println(status);
	}

	public static boolean validateStringBrackets(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == '}') {
				if (stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			} else if (ch == ']') {
				if (stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			} else if (ch == ')') {
				if (stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}

			} else {
				stack.push(ch);
			}
		}

		if (stack.size() == 0) {
			return true;
		}

		return false;
	}

}
