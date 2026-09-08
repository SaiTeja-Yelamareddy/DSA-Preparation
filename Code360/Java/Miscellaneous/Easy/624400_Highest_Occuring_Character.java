/*
 * Platform: Code360
 * Problem ID: 624400
 * Problem: Highest Occuring Character
 * Problem Link: https://www.naukri.com/code360/problems/highest-occuring-character_624400
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.*;
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		int n=str.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char ans='a';
        int max=0;
        for(char ch:map.keySet())
        {
            int x=map.get(ch);
            if(x>max)
            {
                max=x;
                ans=ch;
            }
            

        }
        return ans;
	}

}