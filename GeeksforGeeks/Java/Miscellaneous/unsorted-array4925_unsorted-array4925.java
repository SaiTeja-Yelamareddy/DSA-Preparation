class Solution {
    public int findElement(int[] arr) {

        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for(int i = 1; i < n; i++)
        {
            if(left[i - 1] <= arr[i])
                left[i] = arr[i];
            else
                left[i] = left[i - 1];
        }
        right[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--)
        {
            if(right[i + 1] >= arr[i])
                right[i] = arr[i];
            else
                right[i] = right[i + 1];
        }
        for(int i = 1; i < n-1; i++)
        {
            if(left[i] == arr[i] && right[i] == arr[i])
            {
                return arr[i];
            }
        }
        return -1;
    }
}