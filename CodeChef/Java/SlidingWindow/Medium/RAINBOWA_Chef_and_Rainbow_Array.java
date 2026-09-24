/*
 * Platform: CodeChef
 * Problem ID: RAINBOWA
 * Problem: Chef and Rainbow Array Practice Problem in Two Pointers and Sliding Window Technique
 * Problem Link: https://www.codechef.com/practice/course/two-pointers-new/TWOPOINT02/problems/RAINBOWA
 * Language: Java
 * Concept: SlidingWindow
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            int[] a = new int[N];

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            boolean israinbow = true;

            int l = 0;
            int r = N - 1;

            while (l <= r) {

                if (a[l] != a[r]) {
                    israinbow = false;
                    break;
                }

                l++;
                r--;
            }

            l = 0;
            int num = 1;

            while (israinbow && l < N) {

                if (a[l] != num) {
                    israinbow = false;
                    break;
                }

                while (l < N && a[l] == num) {
                    l++;
                }

                num++;

                if (num == 8) {
                    break;
                }
            }

            if (num != 8) {
                israinbow = false;
            }

            System.out.println(israinbow ? "yes" : "no");
        }

        sc.close();
    }
}