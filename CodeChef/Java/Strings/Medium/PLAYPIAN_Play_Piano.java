/*
 * Platform: CodeChef
 * Problem ID: PLAYPIAN
 * Problem: Play Piano Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/PLAYPIAN
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            boolean valid = true;
            for (int i = 0; i < s.length(); i += 2) {
                char first = s.charAt(i);
                char second = s.charAt(i + 1);
                if (first == second) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}