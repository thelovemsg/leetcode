class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        
        for(int i=1; i<numRows; i++) {
            List<Integer> newList = new ArrayList<>();
            List<Integer> prevList = result.get(i-1);
            newList.add(1);
            for(int j=0; j<prevList.size()-1; j++) {
                int newInt = prevList.get(j) + prevList.get(j+1);
                newList.add(newInt);
            }
            newList.add(1);
            result.add(newList);
        }

        return result;
        
        
    }
}