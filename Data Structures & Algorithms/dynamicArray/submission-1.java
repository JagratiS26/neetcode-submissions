class DynamicArray {
    int size=0, arr[];
    public DynamicArray(int capacity) {
    if(capacity>0)
    arr= new int[capacity];
    }
    public int get(int i) {
      return arr[i];
    }

    public void set(int i, int n) {
       arr[i]=n;
    }

    public void pushback(int n) {
        if(size==arr.length)
        resize();
        arr[size]=n;
        size++;
      
    }

    public int popback() {
        --size;
        int pop=arr[size];
        arr[size]=0;
      return pop;
    }

    private void resize() 
    {
      int brr[]=new int[arr.length*2];
      for(int i=0;i<size;i++)
      brr[i]=arr[i];
      arr=brr;
    }

    public int getSize() {
     return size;
    }

    public int getCapacity() 
    {
       return arr.length;
    }
}
