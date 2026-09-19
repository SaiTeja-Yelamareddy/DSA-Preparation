/*
 * Platform: Code360
 * Problem ID: 1230552
 * Problem: Squares of a Sorted Array
 * Problem Link: https://www.naukri.com/code360/problems/squares-of-a-sorted-array_1230552
 * Language: Java
 * Concept: Arrays
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> sqsorted(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int leftSquare = arr.get(left) * arr.get(left);
            int rightSquare = arr.get(right) * arr.get(right);
            if (leftSquare > rightSquare) {
                ans.add(leftSquare);
                left++;
            } else {
                ans.add(rightSquare);
                right--;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}