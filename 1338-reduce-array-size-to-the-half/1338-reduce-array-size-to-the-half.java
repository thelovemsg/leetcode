class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.stream(arr).forEach(s -> map.put(s, map.getOrDefault(s, 0) + 1));
        List<Integer> list = map.values().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int result = 0;
        int half = arr.length/2;
        int removed = 0;
        for(int i=0; i<list.size();i++){
            if(removed < half){
                result++;
                removed +=list.get(i);
            }
        }
        return result;
    }
}