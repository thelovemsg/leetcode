class RandomizedSet {
    List<Integer> list;
    public RandomizedSet() {
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        return !list.contains(val) ? list.add(val) : false;
    }
    
    public boolean remove(int val) {
        int index = list.indexOf(val);
        if(index != -1) {
            list.remove(index);
            return true;
        }
        return  false;
    }
    
    public int getRandom() {
        return list.get((int)(Math.random() * list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */