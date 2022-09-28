class Solution {
    public String[] sortPeople(String[] n, int[] h) {
     
        /*사실 그렇게 좋지 않은 방법.*/
        /*for(int i=0; i<names.length; i++){
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
        return result.toArray(new String[result.size()]);*/
        
        List<pair> A=new ArrayList<pair>();
        for(int i=0;i<n.length;i++){
            A.add(new pair(h[i],n[i]));
        }
        Collections.sort(A,(a,b)->b.first-a.first);
        for(int i=0;i<n.length;i++){
            n[i]=A.get(i).second;
        }
        return n;
    }
}

class pair{
    int first;
    String second;
    pair(int first,String second){
        this.first=first;
        this.second=second;
    }
}