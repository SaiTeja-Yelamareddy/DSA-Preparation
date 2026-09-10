/*
 * Platform: CodeChef
 * Problem ID: ERROR
 * Problem: Chef and Feedback Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/ERROR
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
            boolean good = false;
            for (int i = 0; i <= s.length() - 3; i++) {
                String sub = s.substring(i, i + 3);
                if (sub.equals("010") || sub.equals("101")) {
                    good = true;
                    break;
                }
            }
            if (good) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }
}