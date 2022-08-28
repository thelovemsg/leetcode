class Solution {
    public String defangIPaddr(String address) {
        String result = "";
        
        for(String el : address.split("")){
            if(el.equals("."))
                result += "[.]";
            else
                result += el;
        }
        
        return result;

    }
}