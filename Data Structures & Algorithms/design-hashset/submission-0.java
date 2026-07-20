class MyHashSet {
    List<Integer> arr;

    public MyHashSet() {
        arr=new ArrayList<>();
    }
    
    public void add(int key) 
    {
        if(!contains(key))
          arr.add(key);
    }
    
    public void remove(int key) 
    {
       if(contains(key))
          arr.remove(Integer.valueOf(key));  
    }
    
    public boolean contains(int key)
    {
        for(int x:arr)
         if(x==key)
          return true;
        return false;        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */