class Solution {
    public int lastStoneWeight(int[] stones) {
        
        List<Integer> stoneList =(LinkedList)Arrays.stream(stones).sorted().boxed().collect(Collectors.toCollection(LinkedList::new));
        while(stoneList.size() != 1){
            System.out.println(stoneList);
            int max = Collections.max(stoneList);
            stoneList.remove(stoneList.indexOf(max));
             System.out.println(stoneList);
            int nextMax = Collections.max(stoneList);

            if(nextMax == max){
                stoneList.remove(stoneList.indexOf(nextMax));
            }else {
                stoneList.remove(stoneList.indexOf(nextMax));
                stoneList.add(max - nextMax);
            }
            if(stoneList.size() == 0)
                return 0;
        }
        return stoneList.get(0);
        
    }
}