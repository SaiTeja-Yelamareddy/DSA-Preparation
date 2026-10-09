/*
 * Platform: GeeksforGeeks
 * Problem ID: first-and-last-occurrences-of-x3116
 * Problem: First and Last in Sorted
 * Problem Link: https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
 * Language: Java
 * Concept: Miscellaneous
 * Status: ACCEPTED
 */

class Solution {
    public int firstSearch(int[] arr, int k) {
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
    
    public int lastSearch(int[] arr, int k) {
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
    
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        al.add(firstSearch(arr,x));
        al.add(lastSearch(arr,x));
        return al;
    }
}
