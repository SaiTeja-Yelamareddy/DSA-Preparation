/*
 * Platform: CodeChef
 * Problem ID: 1356909886
 * Problem: Chef and Pair of Elements
 * Problem Link: https://www.codechef.com/viewsolution/1356909886
 * Language: Java
 * Concept: Miscellaneous
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

