class Solution {
    public int numberOfBeams(String[] bank) {
        List<Long> collect = Arrays.stream(bank).map(s -> s.chars().filter(c -> c == '1').count())
            .collect(Collectors.toList());
        
        int i = 0;
        int j = 1;
        int result = 0;
        while(i < collect.size() && j < collect.size()) {
            if(i == j)  {
                j++;
                continue;
            }
                
            int prev = collect.get(i).intValue();
            if(prev == 0){
                i++;
                continue;
            }
                
            int curr = collect.get(j).intValue();
            if(curr == 0){
                j++;
                continue;
            }
            result += prev * curr;
            i++;
            j++;
        }
        
        return result;
    }
}