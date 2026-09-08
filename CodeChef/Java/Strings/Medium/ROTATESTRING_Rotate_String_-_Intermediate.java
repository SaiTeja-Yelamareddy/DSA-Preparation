/*
 * Platform: CodeChef
 * Problem ID: ROTATESTRING
 * Problem: Rotate String Practice Problem in Strings - Intermediate
 * Problem Link: https://www.codechef.com/practice/course/strings-intermediate/STRINGSP02/problems/ROTATESTRING
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

public static boolean canRotate(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String doubled = s + s; // Concatenate s with itself
        return doubled.contains(goal);
    }