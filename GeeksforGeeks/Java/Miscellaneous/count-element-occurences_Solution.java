/*
 * Platform: GeeksforGeeks
 * Problem ID: count-element-occurences
 * Problem: count-element-occurences
 * Problem Link: https://www.geeksforgeeks.org/problems/count-element-occurences/1
 * Language: Java
 * Concept: Miscellaneous
 * Status: COLLECTED
 */

class Solution {
    public int countOccurence(int[] arr, int k) {
        // code her
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {

           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for( int x:map.keySet())
        {
            if(map.get(x)>n/k)
            count++;
        }
        return count;
    }
}