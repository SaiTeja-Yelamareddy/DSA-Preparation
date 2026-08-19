/*
 * Platform: GeeksforGeeks
 * Problem ID: ceil-the-floor2802
 * Problem: Solution
 * Problem Link: https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int[] ans=new int[2];
        int floor=-1;
        int ceil=-1;
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(x>=arr[i])
            {
                if(floor==-1||arr[i]>floor)
                floor=arr[i];
            }
             if(x<=arr[i])
            {
                if(ceil==-1||arr[i]<ceil)
                ceil=arr[i];
            }
        }
        ans[0]=floor;
        ans[1]=ceil;
        return ans;
    }
}
