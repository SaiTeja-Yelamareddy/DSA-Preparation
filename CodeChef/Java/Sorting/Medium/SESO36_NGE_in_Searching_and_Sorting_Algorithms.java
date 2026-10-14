/*
 * Platform: CodeChef
 * Problem ID: SESO36
 * Problem: NGE in Searching and Sorting Algorithms
 * Problem Link: https://www.codechef.com/learn/course/searching-sorting/SORTSEARCH5/problems/SESO36
 * Language: Java
 * Concept: Sorting
 * Difficulty: Medium
 * Course: Searching Sorting
 * Module: SORTSEARCH5
 * Status: ACCEPTED
 */

import java.util.Scanner;

class Codechef {

    public static void nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];

        for (int i = 0; i < n; i++) {
            nge[i] = -1;  // Initialize the next greater element to -1
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                    break; 
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nge[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        nextGreaterElements(arr);

        scanner.close();
    }
}
