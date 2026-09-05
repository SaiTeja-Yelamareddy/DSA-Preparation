/*
 * Platform: CodeChef
 * Problem ID: QUEUE06
 * Problem: Queue - To do list in Stacks and Queues
 * Problem Link: https://www.codechef.com/learn/course/stacks-and-queues/LQUEUES/problems/QUEUE06
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Stacks And Queues
 * Module: LQUEUES
 * Status: ACCEPTED
 */

import java.util.Scanner;

class CircularQueueExample {
    static final int maxSize = 101;
    static int[] a = new int[maxSize];
    static int front = 0; // Index of the front element
    static int rear = -1; // Index of the rear element
    static int currentSize = 0;

    static boolean isEmpty() {
        return currentSize == 0;
    }

    static boolean isFull() {
        return currentSize == maxSize;
    }

    static int size() {
        return currentSize;
    }

    static void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        // Write your code here
    }

    static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedItem = a[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return removedItem;
    }

    static boolean contains(int task) {
        // Write your code here
    }

    static void addTask(int task) {
        if (!contains(task)) {
            enqueue(task);
        }
    }

    static void displayToDoList() {
        // Write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        

        for (int i = 0; i < n; i++) {
            int task = scanner.nextInt();
            if (task == -1) break;
            addTask(task);
        }

        displayToDoList();
        scanner.close();
    }
}
