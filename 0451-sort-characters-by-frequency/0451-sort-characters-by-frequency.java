class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.merge(c, 1, Integer::sum);
        }
        
        List<Bunch> list = new ArrayList<>();
        
        for(char c : map.keySet()) {
            list.add(new Bunch(c,map.get(c)));
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for(Bunch b : list) {
            int cnt = b.getCnt();
            char c = b.getC();
            for(int i=0; i<cnt; i++) {
                sb.append(b.getC());
            }
        }
        
        return sb.toString();
        
    }
    
    public static class Bunch implements Comparable<Bunch>{
        private char c;
        private int cnt;
        public Bunch(char c, int cnt) {
            this.c = c;
            this.cnt = cnt;
        }
        
        
        public int getCnt() {
            return cnt;
        }
        
        public char getC() {
            return c;
        }
        
        
        @Override
        public int compareTo(Bunch b) {
            return b.getCnt() - this.cnt;
        }
    }
    
}