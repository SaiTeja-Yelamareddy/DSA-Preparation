class Solution {
    int unvisitedLeaves(int arr[], int k) {
        // code here
        boolean[] visit=new boolean[k+1];
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int jump=arr[i];
            int j=jump;
            while(j<=k)
            {
                visit[j]=true;
                j+=jump;
            }
        }
        int c=0;
        for(int j=1;j<visit.length;j++)
        {
            if(!visit[j])
            c++;
        }
        return c;
    }
}