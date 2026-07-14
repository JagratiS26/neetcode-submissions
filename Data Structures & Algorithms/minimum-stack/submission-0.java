class MinStack {
  Stack<Integer> minim= new Stack<>();int mini=Integer.MAX_VALUE;
  Stack<Integer> st;
    public MinStack() {
    st=new Stack<>();    
    }
    public void push(int val) {
        if(mini>=val)
        {
            minim.push(val);
            mini=val;
        }
        st.push(val);
    }
    
    public void pop() {
        int c=st.pop();
        if(c==mini)
        {
            minim.pop();
        }
        if (minim.isEmpty())
            mini = Integer.MAX_VALUE;
        else
            mini = minim.peek();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mini;
    }
}
