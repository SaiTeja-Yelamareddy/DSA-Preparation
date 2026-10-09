/*
 * Platform: CodeChef
 * Problem ID: SNWTD
 * Problem: Target Digit Sum Practice Problem in Binary Search
 * Problem Link: https://www.codechef.com/practice/course/binary-search-new/BINARYSP07/problems/SNWTD
 * Language: Java
 * Concept: BinarySearch
 * Difficulty: Medium
 * Status: ACCEPTED
 */


import java.util.Scanner;
class Main {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (digitSum(arr[i]) == d) {
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
