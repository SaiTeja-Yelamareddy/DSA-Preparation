/*
 * Platform: CodeChef
 * Problem ID: ADJSUMPAR
 * Problem: Adjacent Sum Parity Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ADJSUMPAR
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
            int count = 0;
            for (int i = 0; i < N; i++) {
                int B = sc.nextInt();

                if (B == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

	}
}
