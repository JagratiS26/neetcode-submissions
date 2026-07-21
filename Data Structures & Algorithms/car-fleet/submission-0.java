class Solution {
    public int carFleet(int target, int[] positions, int[] speed) 
    {
    List<List<Integer>> l=new ArrayList<>();
    for(int i=0;i<positions.length;i++)
    {
        List<Integer> temp=new ArrayList<>();
        temp.add(positions[i]);
        temp.add(speed[i]);
        l.add(temp);
    }
    l.sort(Comparator.comparingInt((List<Integer> row)->row.get(0)).reversed());
        Stack<Double> st= new Stack<>();
        st.push((double)(target-l.get(0).get(0))/l.get(0).get(1));
        for(int i=1;i<positions.length;i++)
        {
            double time=(double)(target-l.get(i).get(0))/l.get(i).get(1);
            if(time>st.peek())
              st.push(time);

        }
        return st.size();
     }    
    }
