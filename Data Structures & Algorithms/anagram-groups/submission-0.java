class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<Integer>> m = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);   
            if (m.containsKey(s)) {
                m.get(s).add(i);          
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                m.put(s, list);           
            }
        }
        
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> entry : m.entrySet()) {
            List<String> l = new ArrayList<>();
            for (int i : entry.getValue()) {  
                l.add(strs[i]);               
            }
            result.add(l);                    
        }
        
        return result;
    }
}