class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
    int start=0, i=0;
    char ch[]= s2.toCharArray();
   int freq1[]=frequency(s1);
   int freq[]= new int[26];
   while(i<s2.length())
   {

    freq[ch[i]-'a']++;
      if(i-start+1>s1.length())
      {
        freq[ch[start]-'a']--;
        start++;
      }
      else if(i-start+1==s1.length())
      {
        if(Arrays.equals(freq1,freq))
         return true;
         else 
        freq[ch[start]-'a']--;
        start++;
      }
      i++;
   }
   return false;
    }
    public int[] frequency(String s)
    {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        return arr;
        
    }
}
