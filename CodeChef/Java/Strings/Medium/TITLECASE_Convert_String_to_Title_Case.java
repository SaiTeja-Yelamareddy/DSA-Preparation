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

import java.util.Scanner;

class CodeChef {

    public static String toTitleCase(String input) {
        String[] words = input.split(" ");
        StringBuilder titleCase = new StringBuilder(input.length());
        for (String word : words) {
            if (word.isEmpty()) continue;
            boolean isAcronym = true;
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isUpperCase(word.charAt(i))) {
                    isAcronym = false;
                    break;
                }
            }
            if (isAcronym) {
                titleCase.append(word);
            } else {
                titleCase.append(Character.toUpperCase(word.charAt(0)));
                titleCase.append(word.substring(1).toLowerCase());
            }
            titleCase.append(" ");
        }
        return titleCase.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine()); // Read the number of test cases

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            System.out.println(toTitleCase(input));
        }

        scanner.close();
    }
}
