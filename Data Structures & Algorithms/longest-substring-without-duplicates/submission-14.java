class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
    HashMap<Character,Integer> map=new HashMap<>();
    char ch[]=s.toCharArray();
    int l=0,n=s.length(),max=0;
    for(int r=0;r<n;r++)
    {
        if(map.containsKey(ch[r]))
        {
          l=Math.max(l,map.get(ch[r])+1);
        }
        map.put(ch[r],r);
        max=Math.max(max,r-l+1);
    }    
    return max;
    }
}
