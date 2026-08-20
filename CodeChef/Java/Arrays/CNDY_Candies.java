/*
 * Platform: CodeChef
 * Problem ID: CNDY
 * Problem: Candies Practice Problem in Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-new/ARRAYSP02/problems/CNDY
 * Language: Java
 * Concept: Arrays
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
            int[] A = new int[2 * N];
            for(int i = 0; i < 2 * N; i++) {
                A[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map1 = new HashMap<>();
            HashMap<Integer, Integer> map2 = new HashMap<>();
            boolean possible = true;
            for(int i = 0; i < 2 * N; i++) {
                int value = A[i];
                if(!map1.containsKey(value)) {
                    map1.put(value, 1);
                }
                else if(!map2.containsKey(value)) {
                    map2.put(value, 1);
                }
                else {
                    possible = false;
                    break;
                }
            }
            if(possible) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

	}
}
