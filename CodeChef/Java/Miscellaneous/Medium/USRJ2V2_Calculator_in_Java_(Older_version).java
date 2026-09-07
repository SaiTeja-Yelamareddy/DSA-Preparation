/*
 * Platform: CodeChef
 * Problem ID: USRJ2V2
 * Problem: Calculator in Java (Older version)
 * Problem Link: https://www.codechef.com/learn/course/java-previous/LTJPP11/problems/USRJ2V2
 * Language: Java
 * Concept: Miscellaneous
 * Course: With Java Previous
 * Module: LTJPP11
 * Status: ACCEPTED
 */

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// Solution as follows
		Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
		int sum = a + b;
		int diff = a - b;
		System.out.println("Sum is: " + sum);
		System.out.println("Difference is: " + diff);
	}
}