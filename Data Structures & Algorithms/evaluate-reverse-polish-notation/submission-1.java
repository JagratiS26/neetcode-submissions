class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        int a=0;
        while(a<tokens.length)
        {
            char ch=tokens[a].charAt(0);
            if(Character.isDigit(ch)||(tokens[a].length() > 1 && tokens[a].charAt(0) == '-'))
            st.push(Integer.parseInt(tokens[a]));
            else
            {
        
                int y=st.pop();
                int x=st.pop();
                if(ch=='+')
                st.push(x+y);
                else if(ch=='-')
                st.push(x-y);
                else if(ch=='*')
                st.push(x*y);
                else
                st.push(x/y);

            }
            a++;

        }
        return st.pop();
    }
}
