class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {   
    PriorityQueue<int []> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]); int start=0;
    int a[]= new int[nums.length-k+1], in=0;
    for(int i=0;i<nums.length;i++)
    {
        heap.offer(new int[]{nums[i],i});
        if(i-start+1>=k)
        {
            while(heap.peek()[1]<=i-k)
              {
                 heap.poll();
              }
              a[in++]=heap.peek()[0];
              start++;
        }
    }
    return a;

    }
}
