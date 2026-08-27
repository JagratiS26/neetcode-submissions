class Solution {

    public int calPoints(String[] operations) 
    {
    Stack<Integer> st= new Stack<>();
    int total=0;
    for(String s:operations)
    {
        if(s.equals("+"))
        {
         int first=st.pop();
         int ans=st.peek()+first;
         st.push(first);
         st.push(ans);
        }
        else if(s.equals("D"))
        {
         st.push(2*st.peek());
        }
        else if(s.equals("C"))
         st.pop();
        else
         st.push(Integer.parseInt(s));
    }
    for(int i:st)
     total+=i;
    return total;  
    }
}