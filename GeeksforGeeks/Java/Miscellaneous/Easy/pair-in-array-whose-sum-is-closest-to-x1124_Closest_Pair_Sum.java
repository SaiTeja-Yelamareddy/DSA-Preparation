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
    public ArrayList<Integer> sumClosest(int[] arr, int target) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (arr.length < 2) {
            return ans;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int minDiff = Integer.MAX_VALUE;
        int maxDiff = -1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);
            int pairDiff = arr[right] - arr[left];

            if (diff < minDiff) {

                minDiff = diff;

                ans.clear();
                ans.add(arr[left]);
                ans.add(arr[right]);

                maxDiff = pairDiff;
            }

            else if (diff == minDiff && pairDiff > maxDiff) {

                ans.clear();
                ans.add(arr[left]);
                ans.add(arr[right]);

                maxDiff = pairDiff;
            }

            if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return ans;
    }
}