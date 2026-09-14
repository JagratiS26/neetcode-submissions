class Solution {
    public int[][] kClosest(int[][] points, int k) 
    {
    PriorityQueue<int[]> pq= new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
    for(int i=0;i<points.length;i++)
    {
        int d=distance(points[i][0],0,points[i][1],0);
        pq.add(new int[]{d,i});
        if(pq.size()>k)
          pq.poll();
    }
    int arr[][]=new int[k][2],a=0;
    while(!pq.isEmpty())
    {
        int temp[]=pq.poll();
        arr[a][0]=points[temp[1]][0];
        arr[a][1]=points[temp[1]][1];
        a++;
    }
    return arr;

    }
    private int distance(int x1,int x2,int y1,int y2)
    {
        return(int)(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }
}
