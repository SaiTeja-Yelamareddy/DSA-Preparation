/*
 * Platform: GeeksforGeeks
 * Problem ID: product-is-even-or-odd3020
 * Problem: Array Product Even or Odd
 * Problem Link: https://www.geeksforgeeks.org/problems/product-is-even-or-odd3020/1
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public boolean isProductEven(ArrayList<Integer> arr) {
        // code here.
        int pro=1;
        for(int x:arr)
        {
            pro*=x;
        }
        if(pro%2==0)
        return true;
        return false;
    }
}