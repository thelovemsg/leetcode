class Solution {
    public String toLowerCase(String s) {
        String result = "";
        for(Character c : s.toCharArray()){
            if(c < 91 && c>64)
                result += (char)(c+32)+"";
            else 
                result += c+"";
        }
        
        return result;
    }
}

// class Solution {
//     public String toLowerCase(String s) {
//         return s.toLowerCase();
//     }
// }