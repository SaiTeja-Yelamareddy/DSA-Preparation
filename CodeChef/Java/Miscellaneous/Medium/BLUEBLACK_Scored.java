/*
 * Platform: CodeChef
 * Problem ID: BLUEBLACK
 * Problem: Scored
 * Problem Link: https://www.codechef.com/START260D/problems/BLUEBLACK
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(Math.min(a,b)==a)
		System.out.println(a*3);
        else
        System.out.println(a+b);
	}
}
