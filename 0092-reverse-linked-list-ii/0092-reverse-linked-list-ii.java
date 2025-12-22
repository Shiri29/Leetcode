/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode groupPrev = new ListNode(0);
        groupPrev.next = head;
        ListNode groupNext = new ListNode(0);
        groupNext.next = head;
        ListNode tempp = head;
        for(int i=0;i<=right;i++){
            if(i<left-1)
            groupPrev = groupPrev.next;
            groupNext = groupNext.next;
            if(i==right-1)
            tempp = groupNext;
        }
        ListNode prev = groupNext;
        ListNode curr = groupPrev.next;
        while(curr!=groupNext){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        groupPrev.next = tempp;
        if(left == 1) head = prev;
        return head;
    }
}