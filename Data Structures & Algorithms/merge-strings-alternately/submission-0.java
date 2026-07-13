class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        char ch1[]= word1.toCharArray();
        char ch2[]= word2.toCharArray();
        StringBuilder sb= new StringBuilder();
        while(i<word1.length() && j<word2.length())
        {
            sb.append(ch1[i]);
            sb.append(ch2[j]);
            i++;
            j++;
        }
        if(i<word1.length())
         {
            String t=word1.substring(i);
            sb.append(t);
         }
         if(j<word2.length())
         {
            String t=word2.substring(j);
            sb.append(t);
         }
         return sb.toString();
        
    }
}