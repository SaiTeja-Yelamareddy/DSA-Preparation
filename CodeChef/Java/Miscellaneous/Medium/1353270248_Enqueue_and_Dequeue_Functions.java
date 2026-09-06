/*
 * Platform: CodeChef
 * Problem ID: 1353270248
 * Problem: Enqueue and Dequeue Functions
 * Problem Link: https://www.codechef.com/viewsolution/1353270248
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

class CircularQueue {
    private static final int maxSize = 101;
    private int[] a = new int[maxSize];
    private int front = 0;
    private int rear = -1;  
    private int currentSize;
    public boolean isEmpty()
    {
        return currentSize == 0;
    }
    public boolean isFull() 
    {
        return currentSize == maxSize;
    }
    public int size()
    {
        return currentSize;
    }
    public void enqueue(int item)
    {
        if (isFull())
        {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % maxSize; 
        a[rear] = item;
        currentSize++;
    }
    public int dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int removedItem = a[front];
        front = (front + 1) % maxSize; // Circular increment
        currentSize--;
        return removedItem;
    }

   
