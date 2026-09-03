/*
 * Platform: CodeChef
 * Problem ID: 1352007765
 * Problem: Alternate Adding
 * Problem Link: https://www.codechef.com/viewsolution/1352007765
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
		    long ans=0;
		    long n1=0;
		    for(int i=0;i<n;i++)
		    {
		        long x=sc.nextLong();
		        if(i%2==0)
		        {
		        x=-x;
		        }
		        ans+=Math.abs(x-n1);
		        n1=x;
		    }
		    ans+=Math.abs(n1);
		    System.out.println(ans/2);
		}

	}
}
