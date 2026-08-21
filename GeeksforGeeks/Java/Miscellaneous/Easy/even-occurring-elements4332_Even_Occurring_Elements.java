/*
 * Platform: GeeksforGeeks
 * Problem ID: even-occurring-elements4332
 * Problem: Even Occurring Elements
 * Problem Link: https://www.geeksforgeeks.org/problems/even-occurring-elements4332/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.*;

class Solution {
    public ArrayList<Integer> findEvenOccurrences(int[] arr) {
        // code here
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int x:arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:map.keySet())
        {
            if(map.get(i)%2==0)
            al.add(i);
        }
        return al;
    }
}