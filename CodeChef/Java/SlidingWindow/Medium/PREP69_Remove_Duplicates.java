/*
 * Platform: CodeChef
 * Problem ID: PREP69
 * Problem: Remove Duplicates Practice Problem in Two Pointers and Sliding Window Technique
 * Problem Link: https://www.codechef.com/practice/course/two-pointers-new/TWOPOINT01/problems/PREP69
 * Language: Java
 * Concept: SlidingWindow
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
            int[] a=new int[n];
            ArrayList<Integer> ans=new ArrayList<>();
            int prev=-1;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(prev!=a[i])
                {
                    ans.add(a[i]);
                    prev=a[i];
                }
            }
            System.out.println(ans.size());
            for(int i=0;i<ans.size();i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
        
        }
	}
}
