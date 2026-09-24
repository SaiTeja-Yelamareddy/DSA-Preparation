/*
 * Platform: CodeChef
 * Problem ID: 1362128248
 * Problem: Smoothen
 * Problem Link: https://www.codechef.com/viewsolution/1362128248
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
while (T-- > 0) 
{
    int N = sc.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++)
        A[i] = sc.nextLong();
    boolean sorted = true;
    for (int i = 0; i < N - 1; i++) 
    {
        if (A[i] > A[i + 1])
        {
            sorted = false;
            break;
        }
    }
    if (sorted) 
    {
        System.out.println(-1);
        continue;
    }
    int lo = 1, hi = 1000000000, ans = 0;
    while (lo <= hi) 
    {
        int X = lo + (hi - lo) / 2;
        int l = 0, r = N - 1;
        while (l < N - 1 && A[l] <= A[l + 1])
            l++;
        while (r > 0 && A[r - 1] <= A[r])
            r--;

        while (l > 0 && A[l - 1] > X)
            l--;

        while (r < N - 1 && A[r + 1] < X)
            r++;

        long S = 0;
        long prev = l == 0 ? Long.MIN_VALUE : A[l - 1];
        boolean ok = true;

        for (int i = l; i <= r; i++) {
            long cur;

            if (A[i] >= X) {
                S += A[i] - X;
                cur = X;
            } else {
                long add = Math.min(S, X - A[i]);
                cur = A[i] + add;
                S -= add;
            }

            if (cur < prev) {
                ok = false;
                break;
            }

            prev = cur;
        }

        if (ok && r < N - 1 && prev > A[r + 1])
            ok = false;

        if (ok) {
            ans = X;
            lo = X + 1;
        } else {
            hi = X - 1;
        }
    }

    System.out.println(ans);
}

	}
}
