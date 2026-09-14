/*
 * Platform: GeeksforGeeks
 * Problem ID: time-to-words3728
 * Problem: Time to Words
 * Problem Link: https://www.geeksforgeeks.org/problems/time-to-words3728/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String timeToWords(int h, int m) {

        String[] numbers = {
            "", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine"
        };
        if (m == 0) {
            return numbers[h] + " o' clock";
        }
        if (m == 15) {
            return "quarter past " + numbers[h];
        }
        if (m == 30) {
            return "half past " + numbers[h];
        }
        if (m < 30) {
            return numbers[m] + " minutes past " + numbers[h];
        }
        int remaining = 60 - m;
        int nextHour = h + 1;
        if (remaining == 15) {
            return "quarter to " + numbers[nextHour];
        }
        return numbers[remaining] + " minutes to " + numbers[nextHour];
    }
}