class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num : arr) {
            map.merge(num, 1, Integer::sum);
        }
        
        List<KeyValue> list = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new KeyValue(entry.getKey(), entry.getValue()));
        }
                     
        Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
            KeyValue kv = list.get(i);
            System.out.println(kv.getValue());
        }
                     
        for(KeyValue kv : list) {
            int value = kv.getValue();
            while(k > 0 && value > 0){
                k--;
                kv.setValue(--value);
            }
            
            if(k == 0)
                break;
        }
        
        for(int i=0; i<list.size(); i++) {
            KeyValue kv = list.get(i);
        }
        
        return (int) list.stream().filter(el -> el.getValue()!=0).count();
        
    }
    
    public static class KeyValue implements Comparable<KeyValue> {
        private Integer key;
        private Integer value;
    
        public KeyValue(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
        
        public int compareTo(KeyValue kv) {
            return this.getValue() - kv.getValue();
        }
        
        public Integer getValue() {
            return value;
        }
        
        public Integer getKey() {
            return key;
        }
        
        public void setValue(Integer value) {
            this.value = value;
        }
    }
}