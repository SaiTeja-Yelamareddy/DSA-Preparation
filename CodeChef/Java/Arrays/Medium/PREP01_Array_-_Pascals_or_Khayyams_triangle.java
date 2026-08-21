/*
 * Platform: CodeChef
 * Problem ID: PREP01
 * Problem: Array - Pascals or Khayyams triangle Practice Problem in Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-new/ARRAYSP02/problems/PREP01
 * Language: Java
 * Concept: Arrays
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
        while(T-- > 0) {
            int N = sc.nextInt();
            long[] row = new long[N];
            row[0] = 1;
            for(int i = 1; i < N; i++) {
                row[i] = 1;
                for(int j = i - 1; j > 0; j--) {
                    row[j] = row[j] + row[j - 1];
                }
            }
            for(int i = 0; i < N; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
	}
}
