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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode ptr=head;
        while(ptr!=null)
        {
            count++;
            ptr=ptr.next;
        }
        int k=count-n;
        ptr=head;
        for(int i=1;i<k;i++)
        {
            ptr=ptr.next;
        }
        if(k==0)
        return head.next;
        else if(n==1)
        ptr.next=null;
        else
         ptr.next=ptr.next.next;
        return head;

    }
}
