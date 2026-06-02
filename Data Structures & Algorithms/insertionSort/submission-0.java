public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) 
    {
        List<List<Pair>> res=new ArrayList<>();
        for (int i=0; i<pairs.size(); i++) {
            Pair p = pairs.get(i); 
            int j = i-1;
            while (j>=0&& pairs.get(j).key>p.key) {
                pairs.set(j+1,pairs.get(j));
                j--;
            }
            pairs.set(j+1,p);
            res.add(new ArrayList<>(pairs));
        }
        return res; 
    }
}