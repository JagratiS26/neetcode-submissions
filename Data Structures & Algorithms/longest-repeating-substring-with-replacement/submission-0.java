class Solution {
    public int characterReplacement(String s, int k) 
    {
        if(s.length()==0)
        return 0;
       int start=0,maxl=0,answer=0;
       char ch[]= s.toCharArray();
       int freq[]=new int[26];
       for(int i=0;i<ch.length;i++)
       {
        freq[ch[i]-'A']++;
        maxl=Math.max(maxl,freq[ch[i]-'A']);
        while(i-start+1-maxl>k)
        {
        freq[ch[start]-'A']--;
        start++;
        }
        answer=Math.max(answer,i-start+1);
       }    
       return answer;
    }
}
