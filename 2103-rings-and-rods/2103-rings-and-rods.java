class Solution {
    public int countPoints(String rings) {
        
        /*
            내 풀이
            
            -- 문제점 --
            매번 배열에 접근해서 데이터를 가져와서 새로운 데이터를 넣어준다.
       
        int count = 0;
        String[] result = {"","","","","","","","","","",""};
        for (int i=0; i<rings.length(); i+=2){
            result[rings.charAt(i+1)-'0'] = result[rings.charAt(i+1)-'0'] + String.valueOf(rings.charAt(i));
        }
        return (int) Arrays.asList(result).stream().filter(s -> s.contains("R") && s.contains("B") && s.contains("G")).count();
         */
        int r[] = new int[10];
        int g[] = new int[10];
        int b[] = new int[10];
        
        int n = rings.length();
        
        for(int i=0; i<n; i+=2){
            int a = rings.charAt(i+1)-'0';
            if(rings.charAt(i) == 'R'){
                r[a]++;
            }else if(rings.charAt(i) == 'G'){
                g[a]++;
            }else if(rings.charAt(i) == 'B'){
                b[a]++;
            }
        }
        
        int count = 0;
        for(int j=0; j<10; j++){
            if(r[j]>0 && g[j] > 0 && b[j] > 0){
                count++;
            }
        }
        return count;
    }
}