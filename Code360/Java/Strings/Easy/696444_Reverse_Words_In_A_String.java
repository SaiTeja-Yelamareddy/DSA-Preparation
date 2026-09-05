/*
 * Platform: Code360
 * Problem ID: 696444
 * Problem: Reverse Words In A String
 * Problem Link: https://www.naukri.com/code360/problems/reverse-words_696444
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Status: ACCEPTED
 */

public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		 str = str.trim();
         String[] arr = str.split("\\s+");
         StringBuilder sb = new StringBuilder();
         for (int i = arr.length - 1; i >= 0; i--) {
         sb.append(arr[i]);
         if (i != 0) {
            sb.append(" ");
         }
      }
      return sb.toString();
	}
}
