/*
 * Platform: CodeChef
 * Problem ID: MISSP
 * Problem: Chef and Dolls Practice Problem in Arrays, Strings & Sorting
 * Problem Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/MISSP
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
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++)
            {
                int doll = sc.nextInt();
                map.put(doll, map.getOrDefault(doll, 0) + 1);
            }
            for(int x : map.keySet())
            {
                if(map.get(x) % 2 != 0)
                {
                    System.out.println(x);
                }
            }
        }
    }
}