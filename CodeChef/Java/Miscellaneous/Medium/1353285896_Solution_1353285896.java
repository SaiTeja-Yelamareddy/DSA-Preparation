/*
 * Platform: CodeChef
 * Problem ID: 1353285896
 * Problem: Solution: 1353285896
 * Problem Link: https://www.codechef.com/viewsolution/1353285896
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int G=sc.nextInt();
            while(G-->0)
            {
                int I=sc.nextInt();
                int N=sc.nextInt();
                int Q=sc.nextInt();
                int heads=N/2;
                int tails=N/2;
                if(N%2==1)
                {
                    if(I==1) tails++;
                    else heads++;
                }
                System.out.println(Q==1?heads:tails);
            }
        }
    }
}