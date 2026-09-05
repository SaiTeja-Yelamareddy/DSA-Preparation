/*
 * Platform: CodeChef
 * Problem ID: QUEUE11
 * Problem: Enqueue and Dequeue Functions in Stacks and Queues
 * Problem Link: https://www.codechef.com/learn/course/stacks-and-queues/LQUEUES/problems/QUEUE11
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Stacks And Queues
 * Module: LQUEUES
 * Status: ACCEPTED
 */

class CircularQueue {
    private static final int maxSize = 101;
    private int[] a = new int[maxSize];
    private int front = 0; // Index of the front element
    private int rear = -1;  // Index of the rear element
    private int currentSize;

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int size() {
        return currentSize;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % maxSize; // Circular increment
        a[___] = item;
        currentSize__;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value or throw an exception
        }
        int removedItem = a[front];
        front = (front + 1) % maxSize; // Circular increment
        currentSize__;
        return ___;
    }

    