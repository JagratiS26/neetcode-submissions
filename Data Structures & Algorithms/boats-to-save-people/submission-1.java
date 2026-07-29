class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        int count=0;
         int l=0,h;
         Arrays.sort(people);
        while(l<people.length)
        {
            h=people.length-1;
            while(l<h)
            {
                if(people[h]==0)
                 h--;
                else if(people[l]+people[h]<=limit)
                {
                   count++;
                   people[h]=0;
                   people[l]=0;
                   break;
                }
                else
                h--;
            }
            if(l==h&&people[l]!=0)
            {
                count++;
                people[l]=0;
            }
            l++;   
        }
        return count;
    }
}