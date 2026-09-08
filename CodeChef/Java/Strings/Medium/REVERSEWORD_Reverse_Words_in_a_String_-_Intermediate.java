/*
 * Platform: CodeChef
 * Problem ID: REVERSEWORD
 * Problem: Reverse Words in a String Practice Problem in Strings - Intermediate
 * Problem Link: https://www.codechef.com/practice/course/strings-intermediate/STRINGSP02/problems/REVERSEWORD
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

 public static String reverseWords(String s) {
        
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }