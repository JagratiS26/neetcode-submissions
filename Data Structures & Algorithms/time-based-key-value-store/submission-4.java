class Pair
{
    int time=0;
    String value=null;
    Pair(int time,String value)
    {
        this.time=time;
        this.value=value;
    }
}
class TimeMap {
HashMap<String,List<Pair>>time;
    public TimeMap() 
    {
        time=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
    if(!time.containsKey(key))
    {
        time.put(key,new ArrayList<>());
    }  
     time.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) 
    {
    if(time.containsKey(key))
      {
        List<Pair> temp=time.get(key);
        int l=0,h=temp.size()-1;
        String ans="";
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            int curr =temp.get(mid).time;
             if(curr<=timestamp)
            {
               ans=temp.get(mid).value;
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
