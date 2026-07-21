class MyHashMap {
int SIZE=1000001;
   int arr[][];

    public MyHashMap() {
        arr= new int[SIZE][2];
        for(int i=0;i<SIZE;i++)   
        Arrays.fill(arr[i],-1);
    }
    
    public void put(int key, int value)
    {
       int bucket=key%SIZE;
       arr[bucket][0]=key;
       arr[bucket][1]=value;    
    }
    
    public int get(int key) {
        int bucket=key%SIZE;
       return arr[bucket][1];
    }
    
    public void remove(int key)
    {
        int bucket=key%SIZE;
        arr[bucket][1]=-1;
        arr[bucket][0]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */