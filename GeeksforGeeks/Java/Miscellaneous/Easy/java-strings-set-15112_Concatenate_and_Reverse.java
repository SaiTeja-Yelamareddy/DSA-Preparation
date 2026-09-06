/*
 * Platform: GeeksforGeeks
 * Problem ID: java-strings-set-15112
 * Problem: Concatenate and Reverse
 * Problem Link: https://www.geeksforgeeks.org/problems/java-strings-set-15112/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        StringBuilder sb=new StringBulider(s1);
        sb.append(s2);
        sb.reverse();
        return sb.toString();
    }
}