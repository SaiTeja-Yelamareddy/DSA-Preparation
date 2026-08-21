/*
 * Platform: CodeChef
 * Problem ID: PREFPRO1
 * Problem: Creating Prefix Array Practice Problem in Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-new/ARRAYSP03/problems/PREFPRO1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Medium
 * Status: TIME_LIMIT_EXCEEDED
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
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] prefix=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		prefix[0]=a[0];
		for(int i=1;i<n;i++)
		{
		    prefix[i]=prefix[i-1]+a[i];
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(prefix[i]+" ");
		}
	}
}
