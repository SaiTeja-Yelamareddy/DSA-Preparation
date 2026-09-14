/*
 * Platform: GeeksforGeeks
 * Problem ID: print-all-palindromes-in-the-given-range
 * Problem: Palindrome Numbers in a Range
 * Problem Link: https://www.geeksforgeeks.org/problems/print-all-palindromes-in-the-given-range/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public ArrayList<Integer> palindromeNumbers(int m, int n) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            if (isPalindrome(i)) {
                result.add(i);
            }
        }

        return result;
    }
    private boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }
}