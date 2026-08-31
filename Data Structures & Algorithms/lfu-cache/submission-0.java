class LFUCache {
    int size;
    HashMap<Integer, int[]> mp; 
    int counter = 0;
    public LFUCache(int capacity) {
        mp = new HashMap<>();
        size = capacity;
    }
    
    public int get(int key) {
        if (mp.containsKey(key)) {
            int[] data = mp.get(key);
            data[1]++;          
            data[2] = ++counter; 
            return data[0];      
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (size == 0) return; 
        if (mp.containsKey(key)) {
            int[] data = mp.get(key);
            mp.put(key, new int[]{value, data[1] + 1, ++counter});
            return;
        }
        if (mp.size() >= size) {
            int k= -1;
            int minFreq = Integer.MAX_VALUE;  
            int minTime = Integer.MAX_VALUE;  
            for (int i : mp.keySet()) {
                int[] brr = mp.get(i);
                if (brr[1] < minFreq) {
                    minFreq = brr[1];
                    minTime = brr[2];
                    k= i;
                } else if (brr[1] == minFreq) {
                    if (brr[2] < minTime) {
                        minTime = brr[2];
                        k = i;
                    }
                }
            }
            if (k!=-1) {
                mp.remove(k);
            }
        }
        mp.put(key, new int[]{value, 1, ++counter});
    }
}
