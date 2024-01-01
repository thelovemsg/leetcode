class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int result = 0;
        int i=0;
        int cnt =0;
        while(i < g.length && cnt < s.length) {
            if(s[cnt] >= g[i]) {
                result++;
                i++;
            } 
            cnt++;
        }
        
        return result;
    }
}