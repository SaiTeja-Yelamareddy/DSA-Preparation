/*
 * Platform: HackerRank
 * Problem ID: pangrams
 * Problem: Solution
 * Problem Link: https://www.hackerrank.com/challenges/pangrams/problem
 * Language: Java
 * Concept: Strings
 * Difficulty: Easy
 * Tags: Algorithms, Strings
 * Status: ACCEPTED
 */

(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();
