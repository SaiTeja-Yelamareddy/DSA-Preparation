/*
 * Platform: CodeChef
 * Problem ID: WCC
 * Problem: World Chess Championship Practice Problem in Strings
 * Problem Link: https://www.codechef.com/practice/course/strings-new/STRINGSP01/problems/WCC
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            String S = sc.next();

            int carlsenWins = 0;
            int chefWins = 0;

            for (char ch : S.toCharArray()) {
                if (ch == 'C') {
                    carlsenWins++;
                } else if (ch == 'N') {
                    chefWins++;
                }
            }

            if (carlsenWins > chefWins) {
                System.out.println(60 * X);
            } 
            else if (carlsenWins == chefWins) {
                System.out.println(55 * X);
            } 
            else {
                System.out.println(40 * X);
            }
        }
    }
}