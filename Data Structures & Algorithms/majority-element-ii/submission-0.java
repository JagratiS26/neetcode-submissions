class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int n=nums.length/3;
      HashMap<Integer,Integer> m = new HashMap<>();
      for(int i:nums)
      {
        if(m.containsKey(i))
         m.put(i,m.get(i)+1);
        else m.put(i,1);
      }    
      List<Integer> ans=new ArrayList();
      for(int i:m.keySet())
      {
        if(m.get(i)>n)
         ans.add(i);
      }
      return ans;
    }
}