/*
 * Platform: CodeChef
 * Problem ID: DSCPPAS278C
 * Problem: Check Square Practice Problem in Two Pointers and Sliding Window Technique
 * Problem Link: https://www.codechef.com/practice/course/two-pointers-new/TWOPOINT02/problems/DSCPPAS278C
 * Language: C++
 * Concept: SlidingWindow
 * Status: ACCEPTED
 */

import java.util.Scanner;

public class Main {
    public static boolean checkSquareSum(long c) {
        long left = 0;
        long right = (long) Math.sqrt(c);

        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long c = scanner.nextLong();

        if (checkSquareSum(c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
