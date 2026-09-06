/*
 * Platform: CodeChef
 * Problem ID: 1353284515
 * Problem: Fit in Data Type
 * Problem Link: https://www.codechef.com/viewsolution/1353284515
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int N=sc.nextInt();
            int X=sc.nextInt();
            System.out.println(X%(N+1));
        }
    }
}