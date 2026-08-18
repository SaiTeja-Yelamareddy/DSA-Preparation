/*
 * Platform: CodeChef
 * Problem ID: MAJORELE2
 * Problem: MAJORELE2 - Superstar Dishes Practice Problem in Intermediate Arrays and 2D Arrays
 * Problem Link: https://www.codechef.com/practice/course/arrays-intermediate/ARRAYSP04/problems/MAJORELE2
 * Language: Java
 * Concept: Arrays
 * Status: ACCEPTED
 */

public static List<Long> findSuperstarDishes(List<Long> a, int n) {
    // write your code here 
    HashMap<Long, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++)
    {
        long x = a.get(i);
        map.put(x, map.getOrDefault(x, 0) + 1);
    }
    List<Long> list = new ArrayList<>();
    for(long x : map.keySet())
    {
        if(map.get(x) > n / 3)
        {
            list.add(x);
        }
    }
    Collections.sort(list);

    return list;
}