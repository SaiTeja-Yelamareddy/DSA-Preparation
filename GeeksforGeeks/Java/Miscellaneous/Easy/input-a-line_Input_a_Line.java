/*
 * Platform: GeeksforGeeks
 * Problem ID: input-a-line
 * Problem: Input a Line
 * Problem Link: https://www.geeksforgeeks.org/problems/input-a-line/1
 * Language: Java
 * Concept: Miscellaneous
 * Status: ACCEPTED
 */

import java.util.*;
class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void getLine() {
        String s;
        
        // Take input of 's' using nextLine()
         s=sc.nextLine();

        System.out.println(s);
    }
}