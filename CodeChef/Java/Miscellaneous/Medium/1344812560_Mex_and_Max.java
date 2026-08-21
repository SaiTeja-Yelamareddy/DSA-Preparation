/*
 * Platform: CodeChef
 * Problem ID: 1344812560
 * Problem: Mex and Max
 * Problem Link: https://www.codechef.com/viewsolution/1344812560
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
    	static final long MOD=998244353;
	public static void main (String[] args) throws java.lang.Exception
	{
	
  Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] count=new int[n+2];
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                count[x]++;
            }

            long[] power=new long[n+2];
            power[0]=1;
            for(int i=1;i<=n+1;i++)
            {
                power[i]=(power[i-1]*2)%MOD;
            }

            long ans=0;
            long product=1;

            for(int mex=1;mex<=n+1;mex++)
            {
                if(count[mex-1]==0)
                    break;

                product=(product*(power[count[mex-1]]-1))%MOD;
                ans=(ans+product)%MOD;
            }

            product=1;

            for(int mex=0;mex<n;mex++)
            {
                if(mex>0)
                {
                    if(count[mex-1]==0)
                        break;

                    product=(product*(power[count[mex-1]]-1))%MOD;
                }

                if(count[mex+1]>0)
                {
                    long ways=(power[count[mex+1]]-1)%MOD;
                    ans=(ans+product*ways)%MOD;
                }
            }

            System.out.println(ans);
        }

	}
}
