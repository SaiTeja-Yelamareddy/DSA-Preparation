/*
 * Platform: CodeChef
 * Problem ID: LEADERINARAY
 * Problem: Leaders in an array Practice Problem in Intermediate Arrays and 2D Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-intermediate/ARRAYSP04/problems/LEADERINARAY
 * Language: Java
 * Concept: Arrays
 * Difficulty: Medium
 * Status: ACCEPTED
 */

class Solution {
    public List<Integer> findLeaders(int[] nums) {
        // write your code here 
        
        List<Integer> list = new ArrayList<>();
        int max = nums[nums.length - 1];
        list.add(max);
        for(int i = nums.length - 2; i >= 0; i--)
        {
            if(nums[i] > max)
            {
                list.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}

