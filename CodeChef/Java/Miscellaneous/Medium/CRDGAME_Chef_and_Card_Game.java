/*
 * Platform: CodeChef
 * Problem ID: CRDGAME
 * Problem: Chef and Card Game Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/CRDGAME
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

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

            int chef = 0;
            int morty = 0;

            for(int i = 0; i < n; i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();

                int sumA = digitSum(a);
                int sumB = digitSum(b);

                if(sumA > sumB)
                {
                    chef++;
                }
                else if(sumB > sumA)
                {
                    morty++;
                }
                else
                {
                    chef++;
                    morty++;
                }
            }
            if(chef > morty)
            {
                System.out.println("0 " + chef);
            }
            else if(morty > chef)
            {
                System.out.println("1 " + morty);
            }
            else
            {
                System.out.println("2 " + chef);
            }
        }
    }
}