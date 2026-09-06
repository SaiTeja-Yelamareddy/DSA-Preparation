/*
 * Platform: CodeChef
 * Problem ID: LAPIN
 * Problem: Lapindromes Practice Problem in Strings - Intermediate
 * Problem Link: https://www.codechef.com/practice/course/strings-intermediate/STRINGSP02/problems/LAPIN
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            String s = sc.next();
            int n = s.length();
            int mid = n / 2;
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < mid; i++)
            {
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            int start = mid;
            if(n % 2 != 0)
                start++;
            for(int i = start; i < n; i++)
            {
                char ch = s.charAt(i);
                if(map.containsKey(ch))
                    map.put(ch, map.get(ch) - 1);
                else
                    map.put(ch, -1);
            }
           boolean possible = true;
            for(int freq : map.values())
            {
                if(freq != 0)
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