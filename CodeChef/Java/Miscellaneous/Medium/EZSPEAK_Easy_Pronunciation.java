/*
 * Platform: CodeChef
 * Problem ID: EZSPEAK
 * Problem: Easy Pronunciation Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/EZSPEAK
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		       Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int count = 0;
            boolean hard = false;

            for (int i = 0; i < N; i++) {
                char ch = S.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    count = 0;
                } else {
                    count++;

                    if (count >= 4) {
                        hard = true;
                        break;
                    }
                }
            }

            if (hard) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

	}
}
