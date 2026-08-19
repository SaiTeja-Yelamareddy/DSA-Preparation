/*
 * Platform: CodeChef
 * Problem ID: EQUALELE
 * Problem: Equal Elements Practice Problem in Arrays, Strings & Sorting
 * Problem Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/EQUALELE
 * Language: Java
 * Concept: Arrays
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
		    int[] nums=new int[n];
		     HashMap<Integer, Integer> map = new HashMap<>();
		     int max=0;
		     for(int i=0;i<n;i++)
		     {
		         nums[i]=sc.nextInt();
		         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		         max=Math.max(max,map.get(nums[i]));
		     }
		     System.out.println(n-max);
		}

	}
}
