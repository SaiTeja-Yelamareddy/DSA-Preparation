/*
 * Platform: CodeChef
 * Problem ID: ENCMSG
 * Problem: Encoding Message Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ENCMSG
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            for (int i = 0; i < N - 1; i += 2) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            for (int i = 0; i < N; i++) {
                arr[i] = (char) ('z' - (arr[i] - 'a'));
            }

            System.out.println(new String(arr));
        }
    }
}