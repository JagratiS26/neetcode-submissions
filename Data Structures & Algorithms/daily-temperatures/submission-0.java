class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] result=new int[n];
        for(int i=0;i<n-1;i++)
        {
            boolean found=false;
            int j=i+1;
            for(;j<n;j++)
            {
                if(temperatures[j]<=temperatures[i])
                 continue;
                else
                 {
                    found=true;
                    break;
                 }
            }
            if(found==false)
            result[i]=0;
            else
            result[i]=j-i;
        }
        result[n-1]=0;
        return result;
        
    }
}
