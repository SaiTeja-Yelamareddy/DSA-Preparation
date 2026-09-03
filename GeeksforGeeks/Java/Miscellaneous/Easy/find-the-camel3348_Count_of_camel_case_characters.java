/*
 * Platform: GeeksforGeeks
 * Problem ID: find-the-camel3348
 * Problem: Count of camel case characters
 * Problem Link: https://www.geeksforgeeks.org/problems/find-the-camel3348/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Sol {
    int countCamelCase(String s) {
        // your code here
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            count++;
        }
        return count;
    }
}