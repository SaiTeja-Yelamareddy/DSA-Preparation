/*
 * Platform: CodeChef
 * Problem ID: QUEUE08
 * Problem: Practice problem - Necklace in Stacks and Queues
 * Problem Link: https://www.codechef.com/learn/course/stacks-and-queues/LQUEUES02/problems/QUEUE08
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Stacks And Queues
 * Module: LQUEUES02
 * Status: ACCEPTED
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class NecklaceRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            Queue<Integer> necklace = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int pearl = scanner.nextInt();
                necklace.add(pearl);
            }
            for (int i = 0; i < k; i++) {
                int removed = necklace.poll();
                necklace.add(removed);
            }
            while (!necklace.isEmpty()) {
                int pearl = necklace.poll();
                System.out.print(pearl + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
