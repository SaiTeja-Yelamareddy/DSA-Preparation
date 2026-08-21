/*
 * Platform: CodeChef
 * Problem ID: DISTINCTCOL
 * Problem: Distinct Colors Practice Problem in Arrays, Strings & Sorting
 * Problem Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/DISTINCTCOL
 * Language: Java
 * Concept: Arrays
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int max = 0;
            for(int i = 0; i < n; i++)
            {
                int x = sc.nextInt();
                if(x > max)
                {
                    max = x;
                }
            }
            System.out.println(max);
        }
    }
}