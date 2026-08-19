/*
 * Platform: GeeksforGeeks
 * Problem ID: move-all-negative-elements-to-end1813
 * Problem: Solution
 * Problem Link: https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

class Solution {
    public void segregateElements(int[] arr) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i:arr)
        {
            if(i>=0)
            pos.add(i);
            else
            neg.add(i);
        }
             int i = 0;

             while(i < pos.size())
             {
                 nums.add(pos.get(i));
                 i++;
             }
             i=0;
                
             while(i < neg.size())
             {
                 nums.add(neg.get(i));
                 i++;
             }
             int k=0;
             for(int x:nums)
             {
                 arr[k]=x;
                 k++;
             }

    }
}