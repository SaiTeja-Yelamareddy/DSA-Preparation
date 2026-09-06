/*
 * Platform: CodeChef
 * Problem ID: PETSTORE
 * Problem: Pet Store Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/PETSTORE
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
		// your code goes here(
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++)
           {
             int x = sc.nextInt();
             map.put(x, map.getOrDefault(x, 0) + 1);
           }
           boolean possible = true;
           for(int freq : map.values())
           {
             if(freq % 2 != 0)
             {
              possible = false;
                break;
             }
           }
         if(possible)
         System.out.println("YES");
         else
         System.out.println("NO");
        }
	}
}
