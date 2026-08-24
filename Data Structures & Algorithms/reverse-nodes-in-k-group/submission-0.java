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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k==1)
         return head;
        ListNode du= new ListNode(0);
        ListNode dummy=du;
        ListNode ptr=head;
        int size=0;
        while(ptr!=null)
        {
            size++;
            ptr=ptr.next;
        }
        ListNode curr=head;
        for(int i=1;i+k-1<=size;i+=k)
        {
          int a=0;ListNode temp=curr, prev=null,t=null;
          while(curr!=null&&a<k)
          {
            t=curr.next;
            curr.next=prev;
            prev=curr;
            curr=t;
            a++;
          }
          dummy.next=prev;
          dummy=temp;
        }
        dummy.next=curr;
        return du.next;       
    }
}

