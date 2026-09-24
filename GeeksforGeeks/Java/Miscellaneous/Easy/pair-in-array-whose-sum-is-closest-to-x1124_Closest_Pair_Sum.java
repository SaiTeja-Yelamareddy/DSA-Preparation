/*
 * Platform: GeeksforGeeks
 * Problem ID: pair-in-array-whose-sum-is-closest-to-x1124
 * Problem: Closest Pair Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public ArrayList<Integer> closestPair(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length < 2) {
            return result;
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int closestDifference = Integer.MAX_VALUE;
        int maximumDifference = -1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            int difference = Math.abs(sum - target);
            int pairDifference = arr[right] - arr[left];
            if (difference < closestDifference) {
                closestDifference = difference;
                result.clear();
                result.add(arr[left]);
                result.add(arr[right]);
                maximumDifference = pairDifference;
            }
            else if (difference == closestDifference &&
                     pairDifference > maximumDifference) {
                result.clear();
                result.add(arr[left]);
                result.add(arr[right]);

                maximumDifference = pairDifference;
            }

            if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return result;
    }
}