class Solution {
    public int lengthOfLongestSubstring(String s) {
        char st[]=s.toCharArray();
        if(s.length()==0)
        return 0;
        int max=1,l=0;
        HashMap<Character,Integer> freq= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(freq.containsKey(st[i]))
            {
                l=Math.min(l+1,i-freq.get(st[i]));
            }
            else 
            l++;
            freq.put(st[i],i);
             max=Math.max(l,max);
        }
        return max;
    }
}
