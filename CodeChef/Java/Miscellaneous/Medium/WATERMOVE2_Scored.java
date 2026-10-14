/*
 * Platform: CodeChef
 * Problem ID: WATERMOVE2
 * Problem: Scored
 * Problem Link: https://www.codechef.com/START260D/problems/WATERMOVE2
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
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int sum=0;
		   if(k<n-1)
		   {
		        for(int i=n-1;i>=n-k-1;i--)
		       {
		        sum+=a[i];
		       }
		   }
		   else
		   {
		       for(int i=0;i<n;i++)
		       {
		           sum+=a[i];
		       }
		   }
		   System.out.println(sum);
		}

	}
}
