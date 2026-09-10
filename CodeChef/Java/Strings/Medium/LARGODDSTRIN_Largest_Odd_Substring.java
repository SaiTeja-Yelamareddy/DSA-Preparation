/*
 * Platform: CodeChef
 * Problem ID: LARGODDSTRIN
 * Problem: Largest Odd Substring Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/LARGODDSTRIN
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

public static String findLargestOddSubstring(String num) {

    for (int i = num.length() - 1; i >= 0; i--) {
        char ch = num.charAt(i);
        if (ch == '1' || ch == '3' || ch == '5' ||
            ch == '7' || ch == '9') {
            return num.substring(0, i + 1);
        }
    }

    return "-1";
}