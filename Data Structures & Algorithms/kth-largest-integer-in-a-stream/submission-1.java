class KthLargest {
Queue <Integer> q;
int size;
    public KthLargest(int k, int[] nums) 
    {
    q= new PriorityQueue<>(k);
       for(int i:nums)
       {
        q.add(i);
       }
       while(q.size()>k)
        q.poll();
        this.size=k;
    }
    
    public int add(int val) 
    {
       q.add(val);
       while(q.size()>size)
         q.poll();
        return q.peek();
    }
}
