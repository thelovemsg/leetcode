class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        
        if(numRows == 1){
            return result;
        }
        
        List<Integer> temp2 = new ArrayList<>();        
        temp2.add(1);
        temp2.add(1);
        result.add(temp2);
        if(numRows == 2){
            return result;
        }
        
        for(int i=2; i<numRows; i++) {
            List<Integer> newList = new ArrayList<>();
            List<Integer> prevList = result.get(i-1);
            newList.add(1);
            for(int j=0; j<prevList.size()-1; j++) {
                int newInt = prevList.get(j) + prevList.get(j+1);
                System.out.println("newInt :: " + newInt);
                newList.add(newInt);
            }
            newList.add(1);
            result.add(newList);
        }

        return result;
        
        
    }
}