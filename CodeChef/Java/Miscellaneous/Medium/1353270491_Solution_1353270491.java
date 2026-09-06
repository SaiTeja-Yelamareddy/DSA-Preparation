/*
 * Platform: CodeChef
 * Problem ID: 1353270491
 * Problem: Solution: 1353270491
 * Problem Link: https://www.codechef.com/viewsolution/1353270491
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Status: ACCEPTED
 */

public class Main {
    private static final int maxSize = 101;
    private static int[] a = new int[maxSize];
    private static int front = 0;
    private static int rear = -1;  
    private static int currentSize;

    private static boolean isEmpty() {
        if(currentSize == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean isFull()
    {
        if(currentSize == maxSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     private static int size() 
     {
        return maxSize;
    }

