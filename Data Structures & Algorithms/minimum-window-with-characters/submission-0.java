class Solution {
    public String minWindow(String s, String t) 
    {
    String result="";
    int start=0,formed=0;
    HashMap<Character,Integer> freqs=new HashMap<>();
    HashMap<Character,Integer> freqt=new HashMap<>();
    for(int i=0;i<t.length();i++)
    {
        char ch = t.charAt(i);
         if(freqt.containsKey(ch))
         freqt.put(ch,freqt.get(ch)+1);
         else
         freqt.put(ch,1);
    }
    int required=freqt.size(),startIndex=0,minl=s.length()+1;

    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
       if (freqt.containsKey(ch)) 
        freqs.put(ch, freqs.getOrDefault(ch, 0) + 1);
        if(freqt.containsKey(ch)&&freqs.get(ch)==freqt.get(ch))
         formed++;
        while(formed==required)
        {
           if(i-start+1<minl)
           {
            minl=i-start+1;
            startIndex=start;
           }
           char c =s.charAt(start);
           if(freqs.containsKey(c))
           freqs.put(c,freqs.get(c)-1);
           if(freqt.containsKey(c)&&freqs.get(c)<freqt.get(c))
            formed--;
           start++;
        }    
    }
    if(minl == s.length()+1)
    return "";
    else 
    return s.substring(startIndex,startIndex+minl);
    }
}
