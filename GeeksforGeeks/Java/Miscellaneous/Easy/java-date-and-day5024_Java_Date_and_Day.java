/*
 * Platform: GeeksforGeeks
 * Problem ID: java-date-and-day5024
 * Problem: Java Date and Day
 * Problem Link: https://www.geeksforgeeks.org/problems/java-date-and-day5024/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */


class Solution {
    public String findDay(int date, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, date);
        String[] days = {
            "SUNDAY",
            "MONDAY",
            "TUESDAY",
            "WEDNESDAY",
            "THURSDAY",
            "FRIDAY",
            "SATURDAY"
        };

        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }
}