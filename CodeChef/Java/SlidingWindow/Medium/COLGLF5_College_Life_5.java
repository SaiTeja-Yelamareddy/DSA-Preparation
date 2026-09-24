/*
 * Platform: CodeChef
 * Problem ID: COLGLF5
 * Problem: College Life 5 Practice Problem in Two Pointers and Sliding Window Technique
 * Problem Link: https://www.codechef.com/practice/course/two-pointers-new/TWOPOINT02/problems/COLGLF5
 * Language: Java
 * Concept: SlidingWindow
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            solve(scanner);
        }
        
        scanner.close();
    }

    private static void solve(Scanner scanner) {
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        long[] f = new long[(int)n];
        long[] c = new long[(int)m];
        for (int i = 0; i < n; i++) {
            f[i] = scanner.nextLong(); 
        }

        for (int i = 0; i < m; i++) {
            c[i] = scanner.nextLong(); 
            }

        int l1 = 0, l2 = 0;
        int flag = 0;
        int ans = 0;

        while (l1 < n && l2 < m) {
            if (f[l1] < c[l2]) {
                if (flag == 1) {
                    ans++;
                    flag = 0;
                }
                l1++;
            } else {
                if (flag == 0) {
                    ans++;
                    flag = 1;
                }
                l2++;
            }
        }

        ans++; // Count the last segment
        System.out.println(ans); // Output the result
    }
}
