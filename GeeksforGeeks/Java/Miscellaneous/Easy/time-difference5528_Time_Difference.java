/*
 * Platform: GeeksforGeeks
 * Problem ID: time-difference5528
 * Problem: Time Difference
 * Problem Link: https://www.geeksforgeeks.org/problems/time-difference5528/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public String timeGap(String st, String et) {
        int start = toSeconds(st);
        int end = toSeconds(et);
        int diff = end - start;
        int hours = diff / 3600;
        diff %= 3600;
        int minutes = diff / 60;
        int seconds = diff % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    priv int toSeconds(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int seconds = Integer.parseInt(time.substring(6, 8));

        return hours * 3600 + minutes * 60 + seconds;
    }
}