class Solution {
    public int firstUniqChar(String s) {
        
        if(s.length()==1) return 0;
        
        for(int i=0; i<s.length(); i++){
            boolean check = false;
            for(int j=0; j<s.length(); j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    check = true;
                    break;
                }
            }
            if(!check)
                return i;
        }
        return -1;
    }
}