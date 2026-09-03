/*
 * Platform: CodeChef
 * Problem ID: ANAGRAMP
 * Problem: Check if a string is anagram of another Practice Problem in Strings - Intermediate
 * Problem Link: https://www.codechef.com/practice/course/strings-intermediate/STRINGSP02/problems/ANAGRAMP
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.Scanner;

public class Main {

    static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++)
            if (count[i] != 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(areAnagrams(str1, str2) ? "YES" : "NO");
        }
        scanner.close();
    }
}
