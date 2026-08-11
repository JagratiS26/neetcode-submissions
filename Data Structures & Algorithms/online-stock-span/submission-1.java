class Pair
{
    int price;
    int span;
    Pair(int p,int s)
    {
        this.price=p;
        this.span=s;
    }
}
class StockSpanner {
Stack<Pair> st; 
    public StockSpanner() {
        st= new Stack<>();
    }
    
    public int next(int price) {
        int count=1;
        while(!st.isEmpty() && st.peek().price<=price)
        {
            count+=st.pop().span;
        }
        st.push(new Pair(price,count));
        return count;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */