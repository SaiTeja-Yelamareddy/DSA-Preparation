/*
 * Platform: GeeksforGeeks
 * Problem ID: smallest-number-in-one-swap0010
 * Problem: Smallest Number In One Swap
 * Problem Link: https://www.geeksforgeeks.org/problems/smallest-number-in-one-swap0010/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String smallestNumber(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            char smallest = arr[i];
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                if (i == 0 && arr[index] == '0') {
                    continue;
                }

                char temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                return new String(arr);
            }
        }

        return s;
    }
}