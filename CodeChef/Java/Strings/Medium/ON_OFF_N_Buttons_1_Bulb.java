/*
 * Platform: CodeChef
 * Problem ID: ON_OFF
 * Problem: N Buttons 1 Bulb Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/ON_OFF
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
            int N = sc.nextInt();
            String S = sc.next();
            String R = sc.next();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) != R.charAt(i)) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}