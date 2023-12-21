class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (o1, o2) -> o1[0] - o2[0]);
        
        int maxX = 0;
        for(int i=0; i<points.length-1; i++) {
            int x = points[i+1][0] - points[i][0];
            maxX = Math.max(maxX, x);
        }
                                   
       return maxX;
    }
}