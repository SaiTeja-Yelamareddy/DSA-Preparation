/*
 * Platform: CodeChef
 * Problem ID: MAJORELEM
 * Problem: Find the majority element Practice Problem in Intermediate Arrays and 2D Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-intermediate/ARRAYSP04/problems/MAJORELEM
 * Language: Java
 * Concept: Arrays
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

class Solution
{
    public int majorityElement(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int x : map.keySet())
        {
            if(map.get(x) > n / 2)
            {
                return x;
            }
        }
        return -1;
    }
}