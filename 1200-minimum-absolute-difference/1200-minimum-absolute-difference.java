class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            minDiff = Math.min(minDiff, arr[i+1]-arr[i]);
        }
        
        for(int i = 0; i < arr.length-1; i++){
            List<Integer> tempList = new ArrayList<>();
            int subNum = arr[i+1] - arr[i];
            if(subNum == minDiff){
                tempList.add(arr[i]);
                tempList.add(arr[i+1]);
                result.add(tempList);
            }
        }
    
        return result;
    }
}