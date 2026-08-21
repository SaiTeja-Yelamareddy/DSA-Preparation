/*
 * Platform: GeeksforGeeks
 * Problem ID: array-of-alternate-ve-and-ve-nos1401
 * Problem: Solution
 * Problem Link: https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Medium
 * Status: COLLECTED
 */

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i:arr)
        {
            if(i>=0)
            pos.add(i);
            else
            neg.add(i);
        }
             int i = 0;
             arr.clear();
             while(i < pos.size() && i < neg.size())
             {
                 arr.add(pos.get(i));
                 arr.add(neg.get(i));

                 i++;
             }

             while(i < pos.size())
             {
                 arr.add(pos.get(i));
                 i++;
             }

             while(i < neg.size())
             {
                 arr.add(neg.get(i));
                 i++;
             }
        
        
        
    }
}