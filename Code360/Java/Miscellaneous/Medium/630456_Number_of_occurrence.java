/*
 * Platform: Code360
 * Problem ID: 630456
 * Problem: Number of occurrence
 * Problem Link: https://www.naukri.com/code360/problems/occurrence-of-x-in-a-sorted-array_630456
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

public class Solution {
     public static int firstSearch(int[] arr, int k) {
            // Code Here
            int l=0;
            int r=arr.length-1;
            int ans=-1;
            while(l<=r)
            {
                int mid=l+(r-l)/2;
                if(arr[mid]==k)
                {
                    ans=mid;
                    r=mid-1;
                }
                else if(arr[mid]<k)
                l=mid+1;
                else
                r=mid-1;
            }
            return ans;
        }
    
    public  static int lastSearch(int[] arr, int k) {
            // Code Here
            int l=0;
            int r=arr.length-1;
            int ans=-1;
            while(l<=r)
            {
                int mid=l+(r-l)/2;
                if(arr[mid]==k)
                {
                    ans=mid;
                    l=mid+1;
                }
                else if(arr[mid]<k)
                l=mid+1;
                else
                r=mid-1;
            }
            return ans;
        }
    public static int count(int arr[], int n, int x) {
        //Your code goes here
         int first = firstSearch(arr, x);
        if (first == -1) {
            return 0;
        }
        int last = lastSearch(arr, x);
        return last - first + 1;
    }
}