/*
 * Platform: GeeksforGeeks
 * Problem ID: rock-paper-scissors2830
 * Problem: Rock Paper Scissors!
 * Problem Link: https://www.geeksforgeeks.org/problems/rock-paper-scissors2830/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int[] solveRPS(String a, String b, int k) {
        int winsA = 0;
        int winsB = 0;
        int n = a.length();
        int m = b.length();
        int cycle = lcm(n, m);
        int cycleA = 0;
        int cycleB = 0;
        for (int i = 0; i < cycle; i++) {
            char x = a.charAt(i % n);
            char y = b.charAt(i % m);

            if (wins(x, y)) {
                cycleA++;
            } else if (wins(y, x)) {
                cycleB++;
            }
        }
        int fullCycles = k / cycle;
        winsA += fullCycles * cycleA;
        winsB += fullCycles * cycleB;
        int remaining = k % cycle;
        for (int i = 0; i < remaining; i++) {
            char x = a.charAt(i % n);
            char y = b.charAt(i % m);
            if (wins(x, y)) {
                winsA++;
            } else if (wins(y, x)) {
                winsB++;
            }
        }

        return new int[]{winsA, winsB};
    }

    private boolean wins(char a, char b) {
        return (a == 'R' && b == 'S') ||
               (a == 'S' && b == 'P') ||
               (a == 'P' && b == 'R');
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}