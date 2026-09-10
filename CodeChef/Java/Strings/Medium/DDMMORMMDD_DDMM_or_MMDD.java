/*
 * Platform: CodeChef
 * Problem ID: DDMMORMMDD
 * Problem: DDMM or MMDD Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/DDMMORMMDD
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
            String S = sc.next();

            int first = Integer.parseInt(S.substring(0, 2));
            int second = Integer.parseInt(S.substring(3, 5));

            if (first <= 12 && second <= 12) {
                System.out.println("BOTH");
            }
            else if (first <= 12 && second > 12) {
                System.out.println("MM/DD/YYYY");
            }
            else {
                System.out.println("DD/MM/YYYY");
            }
        }
    }
}