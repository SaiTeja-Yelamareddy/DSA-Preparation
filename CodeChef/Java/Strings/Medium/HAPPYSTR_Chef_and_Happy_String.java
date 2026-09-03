/*
 * Platform: CodeChef
 * Problem ID: HAPPYSTR
 * Problem: Chef and Happy String Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings/STRINGS/problems/HAPPYSTR
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            int count = 0;
            boolean happy = false;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    count++;
                    if (count >= 3) {
                        happy = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            if (happy)
                System.out.println("Happy");
            else
                System.out.println("Sad");
        }
    }
}