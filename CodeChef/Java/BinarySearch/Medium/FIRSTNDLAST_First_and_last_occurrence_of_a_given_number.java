/*
 * Platform: CodeChef
 * Problem ID: FIRSTNDLAST
 * Problem: First and last occurrence of a given number Practice Problem in Binary Search
 * Problem Link: https://www.codechef.com/practice/course/binary-search/INTBINS01/problems/FIRSTNDLAST
 * Language: Java
 * Concept: BinarySearch
 * Difficulty: Medium
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
    
    public int[] searchRange(int[] arr, int key) {
        // write your code here 
                // code here
        int first=firstSearch(arr,key);
        int last=lastSearch(arr,key);
        return new int[]{first,last};
    }
}
