class Solution {
    public boolean isPathCrossing(String path) {
        Set<Point> set = new HashSet<>();
        set.add(new Point(0,0));
        int x=0;
        int y=0;
        for(int i=0; i<path.length(); i++) {
            char target = path.charAt(i);
            if(target == 'N'){
                y++;
            }
            if(target == 'S'){
                y--;
            }
            if(target == 'E'){
                x++;
            }
            if(target == 'W'){
                x--;
            }
            
            
            
            if(set.contains(new Point(x,y)))
                return true;
            
            set.add(new Point(x,y));
        }
        
        return false;
    }
    
    public class Point{
        int x;
        int y;
        
        Point (int x, int y){
            this.x=x;
            this.y=y;
        }
         @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    
}