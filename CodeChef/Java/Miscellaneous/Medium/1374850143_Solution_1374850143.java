/*
 * Platform: CodeChef
 * Problem ID: 1374850143
 * Problem: Solution: 1374850143
 * Problem Link: https://www.codechef.com/viewsolution/1374850143
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

// Solution as follows
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String firstNumberStr = read.nextLine();
        String secondNumberStr = read.nextLine();

        int firstNumber = Integer.parseInt(firstNumberStr);
        int secondNumber = Integer.parseInt(secondNumberStr);

        int sum = firstNumber + secondNumber;

        System.out.println("The sum of the two numbers is: " + sum);
    }
}