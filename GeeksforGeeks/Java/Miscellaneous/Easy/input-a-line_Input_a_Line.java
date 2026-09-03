/*
 * Platform: GeeksforGeeks
 * Problem ID: input-a-line
 * Problem: Input a Line
 * Problem Link: https://www.geeksforgeeks.org/problems/input-a-line/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.*;
class Solution {
    
    public static void getLine() {
        String s;
        
        // Take input of 's' using nextLine()
         Scanner sc = new Scanner(System.in);
         s=sc.nextLine();

        System.out.println(s);
    }
}