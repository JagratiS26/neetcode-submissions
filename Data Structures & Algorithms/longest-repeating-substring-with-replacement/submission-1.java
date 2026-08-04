class Solution {
    public int characterReplacement(String s, int k) 
    {
    int start=0,max=0,ans=0;
    char ch[]=s.toCharArray();
    int freq[]=new int[26];
    for(int i=0;i<ch.length;i++)
    {
        freq[ch[i]-'A']++;
        for(int j:freq)
        {
        max=Math.max(j,max);
        }
        while(i-start+1-max>k)
        {
            freq[ch[start]-'A']--;
            start++;
        }
        ans=Math.max(ans,i-start+1);
    }    
    return ans;
    }
}
