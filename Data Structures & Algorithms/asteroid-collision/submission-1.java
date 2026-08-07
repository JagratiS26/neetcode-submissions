class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st= new Stack<Integer>();
        for(int i=0;i<a.length;i++)
        {
            int as=a[i];
           while(!st.isEmpty()&&as<0&&st.peek()>0)
           {
               int diff=as+st.peek();
               if(diff==0)
               {
                as=0;
                st.pop();
               }
               else if(diff<0)
                {
                    st.pop();
                }
                else
                {
                    as=0;
                }
               
            }
            if(as!=0)
             st.push(as);
        }
        return st.stream().mapToInt(i -> i).toArray();
    }
}