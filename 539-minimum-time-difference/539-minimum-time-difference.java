import java.util.*;
class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        System.out.println("timePoints :: " + timePoints);
        List<Integer> times = timePoints.stream().map(a ->
            Integer.valueOf(a.substring(0,2))*60+Integer.valueOf(a.substring(3))).collect(Collectors.toList());
        
        times.add(24*60+times.get(0));
        System.out.println("times:: " + times);
        int min = Integer.MAX_VALUE;
        for(int i=1; i<times.size(); i++){
            System.out.println("i :: " + i);
            System.out.println("i -1 :: " + (i-1));
            System.out.println("times.get(i) :: " + times.get(i));
            System.out.println("times.get(i-1) :: " + times.get(i-1));
            System.out.println("times.get(i)-times.get(i-1) :: " + (times.get(i)-times.get(i-1)));
            min = Math.min(min, times.get(i)-times.get(i-1));
            System.out.println("min :: " + min);
            System.out.println("--------------");
        }
        return min;
    }
}