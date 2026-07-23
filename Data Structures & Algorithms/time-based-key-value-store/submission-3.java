class TimeMap {
    HashMap<String,List<List<String>>>time;
    public TimeMap() {
        time=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
        if(!time.containsKey(key))
        {
         List<List<String>> temp=new ArrayList<>();
         temp.add(new ArrayList<>(List.of(value,(""+timestamp))));
         time.put(key,temp);
        }
        else
        {
            String t=""+timestamp;
        time.get(key).add(new ArrayList<>(List.of(value, t)));
    }}
    
    public String get(String key, int timestamp) 
    {
      if(time.containsKey(key))
      {
        List<List<String>> temp=time.get(key);
        int l=0,h=temp.size()-1;
        String ans="";
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            int curr=Integer.parseInt(temp.get(mid).get(1));
             if(curr<=timestamp)
            {
               ans=temp.get(mid).get(0);
               l=mid+1;
            }
            else
            h=mid-1;
        }
        return ans;
      }    
      return "";
    }
}
