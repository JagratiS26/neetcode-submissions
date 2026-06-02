class Node
{
    int value;
    Node next;
    Node()
    {
        this.next=null;
    }
    Node(int value)
    {
        this.value=value;
        this.next=null;
    }
}
class LinkedList {
  Node l;
  int n=0;
    public LinkedList() 
    {
      l=null;
    }

    public int get(int index) 
    {   
        if(index>=n)
        return -1;
        Node pt=l;
        for(int i=0;i<index;i++)
        {
            pt=pt.next;
        }
        return pt.value;
    }

    public void insertHead(int val) 
    {
      Node nn=new Node(val);
      nn.next=l;
      l=nn;
      n++;
    }

    public void insertTail(int val) 
    {
        if(l==null)
        {
            insertHead(val);
            return;
        }
         
        Node nn = new Node(val);
        Node pt=l;
        while(pt.next!=null)
        pt=pt.next;
        pt.next=nn;
        n++;
    }

    public boolean remove(int index) 
    {
        if(index>=n)
        return false;
        if(index==0)
         l=l.next;
        else
        {
        Node pt=l;
        for(int i=0;i<index-1;i++)
         pt=pt.next;
        pt.next=pt.next.next;
        }
        n--;
        return true;

    }

    public ArrayList<Integer> getValues() 
    {
      ArrayList<Integer> lt= new ArrayList<>();
      Node pt=l;
      while(pt!=null)
      {
       lt.add(pt.value);
       pt=pt.next;
      }
      return lt;

    }
}
