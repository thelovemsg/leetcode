class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
     
        for(int i=0; i<names.length; i++){
            for(int j=i+1; j<names.length; j++){
                if(heights[i] > heights[j]){
                    String temp1 = names[j];
                    int temp2 = heights[j];

                    names[j] = names[i];
                    heights[j] = heights[i];
                    names[i] = temp1;
                    heights[i] = temp2;
                }
            }
        }
        
        List<String> result = Arrays.stream(names).collect(Collectors.toList());
        Collections.reverse(result);
        return result.toArray(new String[result.size()]);
    }
}