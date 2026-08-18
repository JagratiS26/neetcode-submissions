class LRUCache {
Queue<Integer> q;
HashMap<Integer,Integer> cache;
int size; 
    public LRUCache(int capacity) {
        cache= new HashMap<>(capacity);
        size=capacity;
        q=new LinkedList<>();
    }
    
    public int get(int key) 
    {
      if(cache.containsKey(key))
      {
        q.remove(key);
        q.add(key);
        return cache.get(key);
      }  
      return -1;
    }
    
    public void put(int key, int value) 
    {
      if(cache.containsKey(key))
      {
        cache.put(key,value);
        q.remove(key);
        q.add(key);
      } 
      else
      {
        if(cache.size()==size)
        {
            cache.remove(q.poll());
        }
        cache.put(key,value);
        q.add(key);
      }
    }
}
