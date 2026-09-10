class Solution {
    public int lastStoneWeight(int[] stones) 
    {
    Queue <Integer> q=new PriorityQueue<>(Collections.reverseOrder());
    for(int i:stones)
      q.add(i);
    while(!q.isEmpty()&&q.size()>1)
    {
        int first=q.poll();
        int second=q.poll();
        if(first!=second)
          q.add(first-second);
    }    
    if(q.isEmpty())
    return 0;
    else
    return q.poll();
    }
}
