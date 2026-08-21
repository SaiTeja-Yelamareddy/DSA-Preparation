/*
 * Platform: CodeChef
 * Problem ID: DOMINANT2
 * Problem: Dominant Element Practice Problem in Arrays, Strings & Sorting
 * Problem Link: https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/DOMINANT2
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
    public static boolean countOccurence(int[] arr)
    {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int n = arr.length;

        for(int i = 0; i < n; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = 0;
        int count = 0;

        for(int x : map.keySet())
        {
            if(map.get(x) > max)
            {
                max = map.get(x);
                count = 1;
            }
            else if(map.get(x) == max)
            {
                count++;
            }
        }

        if(count == 1)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();

            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
            {
                nums[i] = sc.nextInt();
            }
            if(countOccurence(nums))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}