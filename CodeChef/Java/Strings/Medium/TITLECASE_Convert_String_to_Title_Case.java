/*
 * Platform: CodeChef
 * Problem ID: TITLECASE
 * Problem: Convert String to Title Case Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/TITLECASE
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String s = sc.nextLine();
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                boolean acronym = true;
                for (char ch : word.toCharArray()) {
                    if (!Character.isUpperCase(ch)) {
                        acronym = false;
                        break;
                    }
                }
                if (!acronym) {
                    word = Character.toUpperCase(word.charAt(0))
                           + word.substring(1).toLowerCase();
                }

                words[i] = word;
            }
            System.out.println(String.join(" ", words));
        }

        sc.close();
    }
}