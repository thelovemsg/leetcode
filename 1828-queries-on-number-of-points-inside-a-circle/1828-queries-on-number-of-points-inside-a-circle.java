class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] results = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int count = 0;
            int xPoint = queries[i][0];
            int yPoint = queries[i][1];
            int radius = queries[i][2];
            for(int j=0; j<points.length; j++){
                int compareXPoint = points[j][0];
                int compareYPoint = points[j][1];
                int xCal = xPoint - compareXPoint;
                int yCal = yPoint - compareYPoint;
                if(xCal*xCal + yCal*yCal <= radius * radius)
                    count++;
            }
            results[i] = count;
        }
        
        return results;
    }
}