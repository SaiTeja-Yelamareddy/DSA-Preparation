/*
 * Platform: CodeChef
 * Problem ID: DSAC29D
 * Problem: Check Palindrome using stack in Data Structures using C
 * Problem Link: https://www.codechef.com/learn/course/college-data-structures-c/CPDSC02/problems/DSAC29D
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: College Data Structures C
 * Module: CPDSC02
 * Status: ACCEPTED
 */

#include <stdio.h>
#include <string.h>

int  MAX = 101;
char stack[101];
int top = 0;

void push(char val)
{
    if(top==MAX)
    {
        printf("Overflow\n");
    }
    else{
        stack[top] = val;
        top++;
    }
}
void pop()
{
    if(top==0)
    {
        printf("Underflow\n");
    }
    else {
        top--;
    }
}
char check()
{
    if(top==0)
    {
        printf("Stack Empty\n");
    }
    else
    {
        return (stack[top-1]);
        printf("%d\n", stack[top-1]);  
    }
    
}

int main(void) {
    int t;
    scanf("%d", &t);
    while(t--){
        int n;
        char word[101];
        scanf("%d", &n);
        scanf("%s", word);
        for(int i=0; i<n; i++)
        {
            push(word[i]);
        }
        int flag = 1;
        for(int i=0; i<n; i++)
        {
            if(word[i]!=check())
            {
                flag = 0;
            }
            pop();
        }
        if(flag==1)
        {
            printf("Yes\n");
        }
        else{
            printf("No\n");
        }
        
        
    }
	return 0;
}

