/*
 * Platform: CodeChef
 * Problem ID: DSCPPAS265
 * Problem: Counting sort Practice Problem in Sorting
 * Problem Link: https://www.codechef.com/practice/course/sorting/SORTINGPRO/problems/DSCPPAS265
 * Language: C++
 * Concept: Sorting
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

public class Main {
    public static void frequencyBasedSort(int n, List<Integer> arr) {
        // Write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arr.add(scanner.nextInt());
        }
        // Function call to perform frequency-based sorting
        frequencyBasedSort(n, arr);
    }
}
