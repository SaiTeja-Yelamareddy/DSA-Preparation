/*
 * Platform: CodeChef
 * Problem ID: TWOSUMM
 * Problem: Chef and Pair of Elements Practice Problem in Intermediate Arrays and 2D Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-intermediate/ARRAYSP04/problems/TWOSUMM
 * Language: Java
 * Concept: Arrays
 * Difficulty: Medium
 * Status: ACCEPTED
 */

public static int[] findPair(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{}; 
}
