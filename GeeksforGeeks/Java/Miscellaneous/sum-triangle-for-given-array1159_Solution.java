/*
 * Platform: GeeksforGeeks
 * Problem ID: sum-triangle-for-given-array1159
 * Problem: Solution
 * Problem Link: https://www.geeksforgeeks.org/problems/sum-triangle-for-given-array1159/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

class Solution {
    ArrayList<Integer> gettri(ArrayList<Integer> arr)
    {
        
         int n=arr.size();
         if(n==1)
         return arr;
         ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            int sum=arr.get(i)+arr.get(i+1);
            res.add(sum);
        }
        return res;
    }
    public ArrayList<Integer> getTriangle(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            ans.add(arr[i]);
        }
        int count=0;
        ArrayList<ArrayList<Integer>> row= new ArrayList<>();
        row.add(ans);
        while(count<=n-2)
        {
            ans=gettri(ans);
            row.add(ans);
            count++;
        }
        for(int i = row.size() - 2; i >= 0; i--)
        {
            ans.addAll(row.get(i));
        }
        
        return ans;
        
    }
}