class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int j=-1,i=0;
        for(i=0;i<asteroids.length;i++)
        { 
            int a=asteroids[i];
            while(j>=0&&a<0&&asteroids[j]>0)
            {
                int diff=a+asteroids[j];
                if(diff==0)
                {
                    a=0;
                    j--;
                }
                else if(diff>0)
                 a=0;
                else
                 j--;
            }
            if(a!=0)
            {
              asteroids[++j]=a;
            }
        }
        int ans[]= new int[j+1];
        for(int k=0;k<=j;k++)
        ans[k]=asteroids[k];
        return ans;
    }
}