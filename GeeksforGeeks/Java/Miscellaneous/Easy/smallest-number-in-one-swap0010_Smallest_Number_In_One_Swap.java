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
        int first = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != '0' && arr[i] < arr[first]) {
                first = i;
            }
        }
        if (first != 0) {
            char temp = arr[0];
            arr[0] = arr[first];
            arr[first] = temp;

            return new String(arr);
        }
        for (int i = 0; i < n; i++) {
            int index = -1;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    if (index == -1 || arr[j] <= arr[index]) {
                        index = j;
                    }
                }
            }

            if (index != -1) {
                char temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                return new String(arr);
            }
        }

        return s;
    }
}