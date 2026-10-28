/*
 * Platform: GeeksforGeeks
 * Problem ID: find-last-digit-of-ab-for-large-numbers1936
 * Problem: EASIEST PYTHON SOLUTION !
 * Problem Link: https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Status: ACCEPTED
 */

class Solution {
    public int getLastDigit(String a, String b) {
        // code here
        int n=a.size();
                 int m=b.size();

                 if(m==1 && b[0]=='0') return 1;

                 int num= a[n-1]-'0';

                 int l=b[m-1]-'0';
                 int sl=0;
                 if(m-2>=0) sl=b[m-2]-'0';

                 int mod=(sl*10+l)%4;
                 if(mod==0) mod=4;

                 int ans=num;
                 mod--;
                 while(mod--){
                     ans= (ans*num)%10;
                 }

                return ans;
    }
};