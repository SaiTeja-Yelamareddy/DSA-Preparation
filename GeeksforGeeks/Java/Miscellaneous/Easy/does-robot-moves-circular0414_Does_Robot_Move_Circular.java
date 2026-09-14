/*
 * Platform: GeeksforGeeks
 * Problem ID: does-robot-moves-circular0414
 * Problem: Does Robot Move Circular
 * Problem Link: https://www.geeksforgeeks.org/problems/does-robot-moves-circular0414/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
     public boolean isCircular(String s) 
     {
         int x = 0;
         int y = 0;
         int direction = 0;
         for (int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
             if (ch == 'G') {
                 if (direction == 0) {
                     y++;
                 } else if (direction == 1) {
                     x++;
                 } else if (direction == 2) {
                     y--;
                 } else {
                     x--;
                 }
             }
             else if (ch == 'L') {
                 direction = (direction + 3) % 4;
             }
             else if (ch == 'R') {
                 direction = (direction + 1) % 4;
             }
         }

         return x == 0 && y == 0;
     }
 }