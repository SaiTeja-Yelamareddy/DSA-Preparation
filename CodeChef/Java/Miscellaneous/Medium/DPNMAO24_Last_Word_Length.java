/*
 * Platform: CodeChef
 * Problem ID: DPNMAO24
 * Problem: Last Word Length Practice Problem in Accenture Interview Questions
 * Problem Link: https://www.codechef.com/practice/course/accenture-interview-questions/ACCNTRE05/problems/DPNMAO24
 * Language: Java
 * Concept: Miscellaneous
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        System.out.println(length);
        sc.close();
    }
}