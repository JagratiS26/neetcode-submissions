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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode temp;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        curr=prev;
        ListNode left=head;
        while(curr!=null&& left!=null)
        {
            temp=left.next;
            ListNode temp2=curr.next;
            left.next=curr;
            curr.next=temp;
            left=temp;
            curr=temp2;
        }
    }
}
