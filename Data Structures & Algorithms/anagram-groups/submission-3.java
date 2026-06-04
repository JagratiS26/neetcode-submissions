class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> result = new ArrayList<>();
        HashMap<List<Integer>,List<Integer>>m=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            List<Integer> list= new ArrayList<>(Collections.nCopies(26,0));
            for(int j=0;j<strs[i].length();j++)
            { 
               char ch =strs[i].charAt(j);
               int in=ch-'a';
               list.set(in,list.get(in)+1);
            }
            if(m.containsKey(list))
            m.get(list).add(i);
            else
            {
            List<Integer> ls =new ArrayList<>();
            ls.add(i);
            m.put(list,ls);
            }
        }
        for(Map.Entry<List<Integer>, List<Integer>> entry : m.entrySet())
        {
            List<String> list= new ArrayList<>();
            for(int i=0;i<entry.getValue().size();i++)
            list.add(strs[entry.getValue().get(i)]);
            result.add(list);
        }

     return result;
        

    }
}