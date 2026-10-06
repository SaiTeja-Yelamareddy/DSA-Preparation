/*
 * Platform: GeeksforGeeks
 * Problem ID: binary-search-1587115620
 * Problem: First Occurrence in Sorted
 * Problem Link: https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==k)
            return mid;
            else if(arr[mid]<k)
            l=mid+1;
            else
            r=mid-1;
        }
        return -1;
    }
}