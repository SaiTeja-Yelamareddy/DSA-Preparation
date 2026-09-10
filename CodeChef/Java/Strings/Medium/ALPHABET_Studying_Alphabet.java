/*
 * Platform: CodeChef
 * Problem ID: ALPHABET
 * Problem: Studying Alphabet Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/ALPHABET
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean[] known = new boolean[26];
        for (char ch : S.toCharArray()) {
            known[ch - 'a'] = true;
        }
        int N = sc.nextInt();
        while (N-- > 0) {
            String word = sc.next();
            boolean canRead = true;
            for (char ch : word.toCharArray()) {
                if (!known[ch - 'a']) {
                    canRead = false;
                    break;
                }
            }
            if (canRead) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}