/*
 * Platform: CodeChef
 * Problem ID: KITCHENCOST
 * Problem: Cost of Groceries Practice Problem in Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays/ARRAYSPRO/problems/KITCHENCOST
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

class Solution {
    public int compute(int n, int x, int[] a, int[] b) {
        // write your code here 
            int total = 0;
            for(int i = 0; i < n; i++)
            {
                if(a[i] >= x)
                {
                    total = total + b[i];
                }
            }
           return total;
    }
}
