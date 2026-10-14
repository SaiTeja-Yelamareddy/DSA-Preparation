/*
 * Platform: CodeChef
 * Problem ID: CHANGEONE7
 * Problem: Scored
 * Problem Link: https://www.codechef.com/START260D/problems/CHANGEONE7
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
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
	    while(t-->0)
		{
		   int n=sc.nextInt();
		   int[] a=new int[n];
		   for(int i=0;i<n;i++)
		   {
		       a[i]=sc.nextInt();
		   }
		   Arrays.sort(a);
		   int max=a[n-1];
		   int ans=Integer.MAX_VALUE;
		   for(int i=0;i<n;i++)
		   {
		       ans=Math.min(ans,max-a[i]);
		   }
		   System.out.println(ans);
		}
	}
}
