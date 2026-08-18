class Solution {
    public String convertToTitle(int columnNumber) 
    {
    StringBuilder sb= new StringBuilder();
    int temp=columnNumber;
    while(temp!=0)
    {
        int mod=(--temp)%26;
        temp/=26;
        sb.append((char)('A'+mod));

    } 
    return (sb.reverse()).toString();   
    }
}