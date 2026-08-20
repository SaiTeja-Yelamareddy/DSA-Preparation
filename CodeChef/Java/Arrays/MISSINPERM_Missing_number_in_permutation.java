/*
 * Platform: CodeChef
 * Problem ID: MISSINPERM
 * Problem: Missing number in permutation Practice Problem in Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-new/ARRAYSP02/problems/MISSINPERM
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

class Solution {
    public int missingNumber(int[] nums) {
        // write your code here
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        return (n*(n+1))/2-sum;
    }
}

