/*
 * Platform: CodeChef
 * Problem ID: SINGLENUM
 * Problem: Single number in multiple numbers Practice Problem in Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-new/ARRAYSP02/problems/SINGLENUM
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

class Solution {
    public int singleNumber(int[] nums) {
        // write your code here
        int ans=0;
        for(int x:nums)
        {
            ans^=x;
        }
        return ans;
    }
}