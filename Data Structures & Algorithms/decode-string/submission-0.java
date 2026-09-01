class Solution {
    public String decodeString(String s) {
        Stack<String> st= new Stack<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if((ch[i]+"").equals("]"))
            {
                StringBuilder sb=new StringBuilder();
                while(!st.isEmpty()&&!st.peek().equals("["))
                    sb.insert(0,st.pop());
                st.pop();
                StringBuilder n=new StringBuilder();                while(!st.isEmpty()&&Character.isDigit(st.peek().charAt(0)))
                n.insert(0,st.pop());
                int count=Integer.parseInt(n.toString());
                st.push((sb.toString()).repeat(count));
            }
            else
             st.push(ch[i]+"");
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty())
        {
            res.insert(0,st.pop());
        }
        return res.toString();
    }
}