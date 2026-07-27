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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode ptr1=l1, ptr2=l2;
        ListNode dummy=new ListNode(0);
        ListNode ptr3=dummy;
        int carry=0;
        while(ptr1!=null&&ptr2!=null)
        {
            int sum=(ptr1.val+ptr2.val+carry)%10;
            carry=(ptr1.val+ptr2.val+carry)/10;
            ListNode newN=new ListNode(sum);
            ptr3.next=newN;
            ptr3=ptr3.next;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        while(ptr1!=null)
        {
            int sum=(ptr1.val+carry)%10;
            carry=(ptr1.val+carry)/10;
            ListNode newN= new ListNode(sum);
            ptr3.next=newN;
            ptr3=ptr3.next;
            ptr1=ptr1.next;
        }
         while(ptr2!=null)
        {
            int sum=(ptr2.val+carry)%10;
            carry=(ptr2.val+carry)/10;
            ListNode newN= new ListNode(sum);
            ptr3.next=newN;
            ptr3=ptr3.next;
            ptr2=ptr2.next;
        }
        if(carry!=0)
         {
            ListNode newN= new ListNode(carry);
            ptr3.next=newN;
         }
         return dummy.next;
    }
}
