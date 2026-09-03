class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int merged[]=new int [n+m];
        int a=0,b=0,k=0;
        while(a<n&&b<m)
        {
            if(nums1[a]<=nums2[b])
             merged[k++]=nums1[a++];
            else
              merged[k++]=nums2[b++];
        }
        while(a<n)
         merged[k++]=nums1[a++];
        while(b<m)
          merged[k++]=nums2[b++];
        if((n+m)%2==0)
        {
            return (merged[(n+m)/2]+(double)merged[(n+m)/2-1])/2;
        }
        return merged[(n+m)/2];

    }
}
