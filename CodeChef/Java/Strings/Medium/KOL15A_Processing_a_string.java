/*
 * Platform: CodeChef
 * Problem ID: KOL15A
 * Problem: Processing a string Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/KOL15A
 * Language: Java
 * Concept: Strings
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
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    int sum=0;
		    
		    for(int i=0;i<s.length();i++)
		    {
		        char ch=s.charAt(i);
		        if(Character.isDigit(ch))
		        {
		            sum+=ch-'0';
		        }
		    }
		    System.out.println(sum);
		}

	}
}
