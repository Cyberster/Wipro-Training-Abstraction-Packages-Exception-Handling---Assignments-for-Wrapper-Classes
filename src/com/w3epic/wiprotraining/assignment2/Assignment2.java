/*
Accept a integer number as Command line argument from the program and when the program 
is executed print the binary, octal and hexadecimal equivalent of the given number.

Sample Output:

java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14

Refer Java Documentation and look for the appropriate Wrapper class method

 * */

package com.w3epic.wiprotraining.assignment2;

public class Assignment2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		
		System.out.println("Given Number: " + num);		
		System.out.println("Binary equivalent: " + Integer.toBinaryString(num));
		System.out.println("Octal equivalent: " + Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent: " + Integer.toHexString(num));

	}

}
