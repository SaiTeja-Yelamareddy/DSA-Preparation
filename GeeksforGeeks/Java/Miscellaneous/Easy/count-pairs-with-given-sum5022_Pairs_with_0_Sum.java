/*
 * Platform: GeeksforGeeks
 * Problem ID: count-pairs-with-given-sum5022
 * Problem: Pairs with 0 Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);

                result.add(pair);
                int leftValue = arr[left];
                int rightValue = arr[right];
                while (left < right && arr[left] == leftValue) {
                    left++;
                }
                while (left < right && arr[right] == rightValue) {
                    right--;
                }
            }
            else if (sum < 0) {
                left++;
            }
            else {
                right--;
            }
        }

        return result;
    }
}