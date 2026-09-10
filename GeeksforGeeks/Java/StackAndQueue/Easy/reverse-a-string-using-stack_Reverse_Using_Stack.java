/*
 * Platform: GeeksforGeeks
 * Problem ID: reverse-a-string-using-stack
 * Problem: Reverse Using Stack
 * Problem Link: https://www.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> stack = new Stack<>();
                for (int i = 0; i < s.length(); i++) {
                    stack.push(s.charAt(i));
                }

                StringBuilder result = new StringBuilder();
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }

                return result.toString();
        
    }
}