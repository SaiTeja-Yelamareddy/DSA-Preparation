/*
 * Platform: CodeChef
 * Problem ID: MATPAN
 * Problem: Mathison and pangrams Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/MATPAN
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int[] price = new int[26];

            for (int i = 0; i < 26; i++) {
                price[i] = sc.nextInt();
            }
            String s = sc.next();
            boolean[] present = new boolean[26];
            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';
                present[index] = true;
            }
            int answer = 0;
            for (int i = 0; i < 26; i++) {
                if (!present[i]) {
                    answer += price[i];
                }
            }
            System.out.println(answer);
        }
    }
}