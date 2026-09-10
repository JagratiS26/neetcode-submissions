class KthLargest {
ArrayList <Integer>l;
int k;
    public KthLargest(int k, int[] nums) 
    {
       l= new ArrayList<>();
       for(int i:nums)
       {
        l.add(i);
       }
       this.k=k;
    }
    
    public int add(int val) 
    {
    l.add(val);
    Collections.sort(l);
    return l.get(l.size()-k);    
    }
}
