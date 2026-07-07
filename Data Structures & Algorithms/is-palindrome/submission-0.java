class Solution {
    public boolean isPalindrome(String s) 
    {
    s=s.toLowerCase();
    char ch[]=s.toCharArray();
    int l=0,h=ch.length-1;
    while(l<=h)
    {
        if(!(Character.isLetter(ch[l])||Character.isDigit(ch[l])))
        l++;
        else if(!(Character.isLetter(ch[h])||Character.isDigit(ch[h])))
        h--;
        else if((Character.isLetter(ch[h])||Character.isDigit(ch[h]))&&(Character.isLetter(ch[l])||Character.isDigit(ch[l])))
        {
            if(ch[l]==ch[h])
            {
                l++;h--;
            }
            else
            return false;
        }
    
    } 
        return true;
    }
}
