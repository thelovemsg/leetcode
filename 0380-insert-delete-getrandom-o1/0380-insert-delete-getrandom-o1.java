class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random rand = new Random();

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int lastElement = list.get(list.size() - 1);
        int idx = map.get(val);
        
        list.set(idx, lastElement);
        map.put(lastElement, idx);
        
        list.remove(list.size() - 1);
        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}