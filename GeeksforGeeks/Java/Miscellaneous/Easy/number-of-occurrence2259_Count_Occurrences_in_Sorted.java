/*
 * Platform: GeeksforGeeks
 * Problem ID: number-of-occurrence2259
 * Problem: Count Occurrences in Sorted
 * Problem Link: https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
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
    int countFreq(int[] arr, int target) {
        // code here
        int first=firstSearch(arr,target);
        if(first==-1)
        return 0;
        int last=lastSearch(arr,target);
        return last-first+1;
        
    }
}
