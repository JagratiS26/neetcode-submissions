class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for (int i=0;i<strs.size();i++)
        {
            int n=strs.get(i).length();
            sb.append(n+"#"+strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) 
    {
        List<String> res= new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            StringBuilder num= new StringBuilder();
            while(i<str.length() && str.charAt(i)!='#')
            {
                num.append(str.charAt(i));
                i++;
            }
            int n=Integer.parseInt(num.toString());
            i++; 
            String word = str.substring(i,i+n);
            res.add(word);
            i += n;
        }
        return res;
    }
}