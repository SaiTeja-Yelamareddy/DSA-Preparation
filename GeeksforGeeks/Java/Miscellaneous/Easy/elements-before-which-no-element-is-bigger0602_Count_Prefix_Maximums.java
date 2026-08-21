/*
 * Platform: GeeksforGeeks
 * Problem ID: elements-before-which-no-element-is-bigger0602
 * Problem: Count Prefix Maximums
 * Problem Link: https://www.geeksforgeeks.org/problems/elements-before-which-no-element-is-bigger0602/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int countElements(int[] arr) {
        // code here
        int count=1;
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                count++;
                max=arr[i];
            }
        }
        return count;
    }
}
