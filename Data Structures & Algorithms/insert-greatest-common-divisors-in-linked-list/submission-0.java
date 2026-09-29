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
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode ptr=head;
        while(ptr.next!=null)
        {
            ListNode first=ptr;
            ListNode second=ptr.next;
            int g=gcd(first.val,second.val);
            ListNode n=new ListNode(g);
            first.next=n;
            n.next=second;
            ptr=second;
        }
        return head;
    }
    int gcd(int a,int b)
    {
        if(b==0)
         return a;
        return gcd(b,a%b);
    }
}