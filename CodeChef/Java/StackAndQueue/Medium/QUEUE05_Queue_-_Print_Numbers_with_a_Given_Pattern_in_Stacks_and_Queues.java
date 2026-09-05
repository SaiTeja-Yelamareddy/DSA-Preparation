/*
 * Platform: CodeChef
 * Problem ID: QUEUE05
 * Problem: Queue - Print Numbers with a Given Pattern in Stacks and Queues
 * Problem Link: https://www.codechef.com/learn/course/stacks-and-queues/LQUEUES/problems/QUEUE05
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Stacks And Queues
 * Module: LQUEUES
 * Status: ACCEPTED
 */

public class Main {
    private static final int maxSize = 101;
    private static int[] a = new int[maxSize];
    private static int front = 0; // Index of the front element
    private static int rear = -1;  // Index of the rear element
    private static int currentSize;

    private static boolean isEmpty() {
        return currentSize == 0;
    }

    private static boolean isFull() {
        return currentSize == maxSize;
    }

    private static int size() {
        return currentSize;
    }

    private static void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % maxSize; // Circular increment
        a[rear] = item;
        currentSize++;
    }

    private static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value or throw an exception
        }
        int removedItem = a[front];
        front = (front + 1) % maxSize; // Circular increment
        currentSize--;
        return removedItem;
    }

    public static void main(String[] args) {
        int n = 10;
        // write your code here
    }
}
