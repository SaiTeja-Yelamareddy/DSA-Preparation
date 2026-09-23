/*
 * Platform: CodeChef
 * Problem ID: NAME2
 * Problem: Your Name is Mine Practice Problem in Two Pointers and Sliding Window Technique
 * Problem Link: https://www.codechef.com/practice/course/two-pointers-new/TWOPOINT01/problems/NAME2
 * Language: Java
 * Concept: SlidingWindow
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            String m = sc.next();
            String w = sc.next();

            int n1 = m.length();
            int n2 = w.length();
            int i = 0, j = 0;

            while (i < n1 && j < n2) {
                if (m.charAt(i) == w.charAt(j)) {
                    i++;
                }
                j++;
            }
            boolean flag1 = (i == n1);

            int n3 = w.length();
            int n4 = m.length();
            int x = 0, y = 0;

            while (x < n3 && y < n4) {
                if (w.charAt(x) == m.charAt(y)) {
                    x++;
                }
                y++;
            }
            boolean flag2 = (x == n3);

            if (flag1 || flag2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}