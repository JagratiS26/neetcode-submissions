class Solution {
    public int[][] kClosest(int[][] points, int k) 
    {
   List<List<Integer>> lt= new ArrayList<>();
   for(int i=0;i<points.length;i++)
   {
    List<Integer> temp=new ArrayList<>();
    temp.add(distance(points[i][0],0,points[i][1],0));
    temp.add(i);
    lt.add(temp);
   }
   lt.sort((list1, list2) -> Integer.compare(list1.get(0),list2.get(0)));
   int arr[][]=new int[k][2];
    for(int i=0;i<k;i++)
    {
        int index=lt.get(i).get(1);
        arr[i][0]=points[index][0];
        arr[i][1]=points[index][1];
    }
    return arr;

    }
    private int distance(int x1,int x2,int y1,int y2)
    {
        return(int)(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }
}
