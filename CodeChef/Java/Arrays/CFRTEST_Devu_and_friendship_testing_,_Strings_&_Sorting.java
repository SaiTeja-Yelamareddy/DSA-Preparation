/*
 * Platform: CodeChef
 * Problem ID: CFRTEST
 * Problem: Devu and friendship testing Practice Problem in Arrays, Strings & Sorting
 * Problem Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/CFRTEST
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
                int day = sc.nextInt();
                map.put(day, map.getOrDefault(day, 0) + 1);
            }
            System.out.println(map.size());
        }
    }
}