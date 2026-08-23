/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
      HashMap<Node,Node> map=new HashMap<>();
      Node ptr=head;
      Node dummy=new Node(0);
      Node dtr=dummy;
      while(ptr!=null)
      {
        Node n=new Node(ptr.val);
        map.put(ptr,n);
        dtr.next=n;
        dtr=n;
        ptr=ptr.next;
      }
      ptr=head;
      dtr=dummy.next;
      while(ptr!=null)
      {
        if(ptr.random!=null)
        {
            dtr.random=map.get(ptr.random);
        }
        ptr=ptr.next;
        dtr=dtr.next;
      }
      return dummy.next;
    }
}
