/*
 * Platform: CodeChef
 * Problem ID: ATM2
 * Problem: ATM Machine Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ATM2
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
            int K = sc.nextInt();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                if (K >= A) {
                    ans.append("1");
                    K = K - A;
                } else {
                    ans.append("0");
                }
            }
            System.out.println(ans);
        }

	}
}
