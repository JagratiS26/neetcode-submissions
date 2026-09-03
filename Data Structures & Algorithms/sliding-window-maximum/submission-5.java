class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
    int n=nums.length,a=0;
    Deque<Integer> dq= new ArrayDeque<>();
    int ans[]=new int[n-k+1];
    for(int i=0;i<n;i++)
    {
        while(!dq.isEmpty()&&dq.getFirst()<=i-k)
        {
          dq.removeFirst();
        }
        while(!dq.isEmpty()&&nums[dq.getLast()]<=nums[i])
          dq.removeLast();
        dq.addLast(i);
        if(i>=k-1)
         ans[a++]=nums[dq.getFirst()];
    }  
    return ans;
    }
}
