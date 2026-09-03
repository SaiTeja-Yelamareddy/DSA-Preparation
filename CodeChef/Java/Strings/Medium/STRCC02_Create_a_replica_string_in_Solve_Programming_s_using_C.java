/*
 * Platform: CodeChef
 * Problem ID: STRCC02
 * Problem: Create a replica string in Solve Programming problems using C
 * Problem Link: https://www.codechef.com/learn/course/c-beginner/BC01BC21/problems/STRCC02
 * Language: Java
 * Concept: Strings
 * Difficulty: Medium
 * Course: C Beginner
 * Module: BC01BC21
 * Status: ACCEPTED
 */

// Update the code below to solve this problem

#include <stdio.h>
#include <string.h>

int main() 
{
  int t;
  scanf("%d", &t); 
  while(t--)
  {
   char S[100], A[100], B[100];
   scanf("%s", S);
// Write the code below this line to generate String A


// Write the code below this line to generate String A
  

  for(int i=0; i<strlen(S);i++)
       {
         printf("%c",A[i]);
       }
   printf("\n");
   for(int i=0; i<strlen(S);i++)
       {
         printf("%c",B[i]);
       }
   printf("\n");
  }
 return 0;
}