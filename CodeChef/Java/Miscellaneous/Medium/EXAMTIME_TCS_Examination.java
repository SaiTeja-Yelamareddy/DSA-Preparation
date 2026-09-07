/*
 * Platform: CodeChef
 * Problem ID: EXAMTIME
 * Problem: TCS Examination Practice Problem in 1000 to 1400 difficulty problems
 * Problem Link: https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/EXAMTIME
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
                Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int dragonDSA = sc.nextInt();
            int dragonTOC = sc.nextInt();
            int dragonDM = sc.nextInt();

            int slothDSA = sc.nextInt();
            int slothTOC = sc.nextInt();
            int slothDM = sc.nextInt();

            int dragonTotal = dragonDSA + dragonTOC + dragonDM;
            int slothTotal = slothDSA + slothTOC + slothDM;

            if (dragonTotal > slothTotal) {
                System.out.println("Dragon");
            } 
            else if (slothTotal > dragonTotal) {
                System.out.println("Sloth");
            } 
            else if (dragonDSA > slothDSA) {
                System.out.println("Dragon");
            } 
            else if (slothDSA > dragonDSA) {
                System.out.println("Sloth");
            } 
            else if (dragonTOC > slothTOC) {
                System.out.println("Dragon");
            } 
            else if (slothTOC > dragonTOC) {
                System.out.println("Sloth");
            } 
            else {
                System.out.println("Tie");
            }
        }
	}
}
