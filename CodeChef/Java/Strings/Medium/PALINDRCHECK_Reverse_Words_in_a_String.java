/*
 * Platform: CodeChef
 * Problem ID: PALINDRCHECK
 * Problem: Reverse Words in a String Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings/STRINGS/problems/PALINDRCHECK
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */


public static String reverseWords(String s) {
    // write your code here 
    String[] sarr=s.split(" ");
    StringBuilder sb=new StringBuilder();
    for(int i=sarr.length-1;i>=0;i--)
    {
        sb.append(sarr[i]);
        sb.append(" ");
    }
    return sb.toString();
}