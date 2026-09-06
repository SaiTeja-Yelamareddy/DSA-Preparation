/*
 * Platform: CodeChef
 * Problem ID: RPD
 * Problem: Easy Math Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/RPD
 * Language: Java
 * Concept: Math
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    static int digitSum(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = i + 1; j < n; j++)
                {
                    int product = arr[i] * arr[j];

                    int sum = digitSum(product);
                    if(sum > max)
                    {
                        max = sum;
                    }
                }
            }
            System.out.println(max);
        }
    }
}