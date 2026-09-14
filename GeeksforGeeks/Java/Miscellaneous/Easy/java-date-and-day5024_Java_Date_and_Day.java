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
    static String findDay(int Day, int Month, int Year) {
        // Code Here
        Calendar cal = Calendar.getInstance();

             cal.set(Year, Month - 1, Date);

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