class KthLargest {
    private static int k;
    private PriorityQueue<Integer> heap;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();
        
        for (int num: nums) {
            add(num);
        }
        
    }
    
    public int add(int val) {
        heap.add(val);
        if (heap.size() > k) {
            heap.poll();
        }

        return heap.peek();
    }
}