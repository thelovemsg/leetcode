class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
            
        int[] newArr = new int[2];
        
        for(int i=0; i<intervals.length; i++) {
            int[] curInterval = intervals[i];
            if (curInterval[1] < newInterval[0]) {
                result.add(curInterval);
            } else if(curInterval[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = intervals[i];
            } else if(curInterval[1] >= newInterval[0] || curInterval[0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], curInterval[0]);
                newInterval[1] = Math.max(newInterval[1], curInterval[1]);
            }
        }
            
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);

    }
}