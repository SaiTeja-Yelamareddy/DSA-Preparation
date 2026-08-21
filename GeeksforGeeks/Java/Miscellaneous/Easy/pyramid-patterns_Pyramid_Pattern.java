/*
 * Platform: GeeksforGeeks
 * Problem ID: pyramid-patterns
 * Problem: Pyramid Pattern
 * Problem Link: https://www.geeksforgeeks.org/problems/pyramid-patterns/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        sc.close();
    }
}