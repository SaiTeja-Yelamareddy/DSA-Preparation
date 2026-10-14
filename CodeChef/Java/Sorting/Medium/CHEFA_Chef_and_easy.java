/*
 * Platform: CodeChef
 * Problem ID: CHEFA
 * Problem: Chef and easy problem Practice Problem in Sorting
 * Problem Link: https://www.codechef.com/practice/course/sorting-new/SORTING02/problems/CHEFA
 * Language: Java
 * Concept: Sorting
 * Difficulty: Medium
 * Status: ACCEPTED
 */


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long chef = 0;
            for (int i = n - 1; i >= 0; i -= 2) {
                chef += a[i];
            }
            System.out.println(chef);
        }
    }
}
