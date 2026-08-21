/*
 * Platform: LeetCode
 * Problem ID: 2
 * Problem: Add Two Numbers
 * Problem Link: https://leetcode.com/problems/add-two-numbers/
 * Language: Java
 * Concept: LinkedList
 * Difficulty: Medium
 * Tags: Linked List, Math, Recursion
 * Status: ACCEPTED
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    ListNode rev(ListNode head)
    {
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if(l1==null||l2==null)
    {
        return null;
    }
    ListNode l1head=rev(l1);
    ListNode l2head=rev(l2);
    ListNode temp1=l1head;
    ListNode temp2=l2head;

    int list1=0,list2=0;
    while(temp1!=null)
    {
        list1=(list1*10)+temp1.val;
        temp1=temp1.next;
    } 
    while(temp2!=null)
    {
        list2=(list2*10)+temp2.val;
        temp2=temp2.next;
    } 
    int c;
    if(list1>list2)
    {
        c=list2+list1;
    }
    else
    c=list1+list2;
   
    int num=c;
    ListNode dummy=new ListNode(0);
    ListNode tail=dummy;
    while(num!=0)
    {
        
        int rem=Math.abs(num)%10;
        tail.next=new ListNode(rem);
        tail=tail.next;
        num=num/10;
    }
    return dummy.next;
    }
}*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;                  
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
        }

        return dummy.next;
    }
}
