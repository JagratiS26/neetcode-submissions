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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
    if(head==null||left==right)
     return head;
ListNode ptr, dummy=new ListNode(0);
dummy.next=head;
ptr=dummy;
for(int i=1;i<left;i++)
 ptr=ptr.next;
 ListNode prev=null;
 ListNode curr=ptr.next;
 ListNode next=null;
ListNode end=curr;
for(int i=0;i<right-left+1;i++)
{
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
 }
 end.next=curr;
  ptr.next=prev;
   return dummy.next;
    }
}
