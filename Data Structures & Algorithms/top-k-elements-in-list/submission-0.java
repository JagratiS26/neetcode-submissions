class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> f = new HashMap<>();
        int arr[]= new int[k];

        for(int i=0;i<nums.length;i++)
        {
            if(f.containsKey(nums[i]))
            {
                f.put(nums[i],f.get(nums[i])+1);
            }
            else
                f.put(nums[i],1);
        }

        LinkedHashMap<Integer, Integer> sortedM = f.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue,
                LinkedHashMap::new));

        int index = 0;

        for (Integer key : sortedM.keySet()) {
            if (index >= k)
                break;

            arr[index++] = key;
        }

        return arr;
    }
}