/*
 * Platform: Code360
 * Problem ID: 1262346
 * Problem: Count Words - Naukri Code 360
 * Problem Link: https://www.naukri.com/code360/problems/count-words_1262346
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
    static int  countWords(String input) {
        // Write your code here
        String[] sarr=input.split(" ");
        return sarr.length;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
		
	}
}
