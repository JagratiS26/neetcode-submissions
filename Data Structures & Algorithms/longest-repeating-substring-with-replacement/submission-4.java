class Solution {
    public int characterReplacement(String s, int k)   
    {
     int maxfreq=0,length=0,n=s.length(),l=0;
     int ch[]=new int[26];
     for(int r=0;r<n;r++)
     {
        char c=s.charAt(r);
        maxfreq=Math.max(maxfreq,ch[c-'A']+1);
        ch[c-'A']++;
        while(r-l+1-maxfreq>k)
        {
            char ct=s.charAt(l);
            ch[ct-'A']--;
            l++;
        }
        length=Math.max(length,r-l+1);
     }
     return length;
    }
}
