class StockSpanner {
   List<Integer> lt;
    public StockSpanner() 
    {
      lt= new ArrayList<>();
    }
    public int next(int price) 
    {
      lt.add(price);
      int count=0;
      for(int i=lt.size()-1;i>=0;i--)
      {
        if(lt.get(i)>price)
          break;
        count++;
      }
      return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */