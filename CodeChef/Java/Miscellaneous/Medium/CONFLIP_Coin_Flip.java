/*
 * Platform: CodeChef
 * Problem ID: CONFLIP
 * Problem: Coin Flip Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/CONFLIP
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
        while(T-- > 0)
        {
            int G = sc.nextInt();
            while(G-- > 0)
            {
                int I = sc.nextInt();
                int N = sc.nextInt();
                int Q = sc.nextInt();
                int answer;
                if(N % 2 == 0)
                {
                    answer = N / 2;
                }
                else
                {
                    if(I == Q)
                    {
                        answer = N / 2;
                    }
                    else
                    {
                        answer = (N + 1) / 2;
                    }
                }
                System.out.println(answer);
            }
        }

	}
}
