/*
 * Platform: GeeksforGeeks
 * Problem ID: count-type-of-characters3635
 * Problem: Count Types of Characters
 * Problem Link: https://www.geeksforgeeks.org/problems/count-type-of-characters3635/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Sol {
    int[] count(String s) {
        // your code here
        int[] arr = new int[4];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
               arr[0]++;
            else if (Character.isLowerCase(ch))
               arr[1]++;
            else if (Character.isDigit(ch))
               arr[2]++;
            else
               arr[3]++;
           }
           return arr;
    }
}