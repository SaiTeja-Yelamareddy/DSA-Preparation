/*
 * Platform: CodeChef
 * Problem ID: VOWANX
 * Problem: Vowel Anxiety Practice Problem in Two Pointers and Sliding Window Technique
 * Problem Link: https://www.codechef.com/practice/course/two-pointers-new/TWOPOINT02/problems/VOWANX
 * Language: Java
 * Concept: SlidingWindow
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

class Codechef {
    static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    static String rearrangeString(String s) {
        int n = s.length();
        char[] t = new char[n];
        int l = 0, r = n - 1;
        boolean start = false;
        for (int i = n - 1; i >= 0; i--) {
            if (start)
                t[l++] = s.charAt(i);
            else
                t[r--] = s.charAt(i);
            if (isVowel(s.charAt(i)))
                start = !start;
        }
        return new String(t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next(); 
            System.out.println(rearrangeString(s));
        }
    }
}