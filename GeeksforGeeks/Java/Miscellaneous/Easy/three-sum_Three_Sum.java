/*
 * Platform: GeeksforGeeks
 * Problem ID: three-sum
 * Problem: Three Sum
 * Problem Link: https://www.geeksforgeeks.org/problems/three-sum/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] nums) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
                Arrays.sort(nums);
                int n = nums.length;
                for (int i = 0; i < n - 2; i++) {
                    if (i > 0 && nums[i] == nums[i - 1]) {
                        continue;
                    }
                    int l = i + 1;
                    int r = n - 1;
                    while (l < r) {
                        int sum = nums[i] + nums[l] + nums[r];
                        if (sum == 0) {

                            ans.add(Arrays.asList(
                                nums[i],
                                nums[l],
                                nums[r]
                            ));
                            l++;
                            r--;
                            while (l < r && nums[l] == nums[l - 1]) {
                                l++;
                            }
                            while (l < r && nums[r] == nums[r + 1]) {
                                r--;
                            }
                        } else if (sum < 0) {
                            l++;
                        } else {
                            r--;
                        }
                    }
                }

                return ans;
    }
}
