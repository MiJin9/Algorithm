class Solution {
    public int lengthOfLongestSubstring(String s) {        
        int len=0, max=0;
        
        for(int i=0; i<s.length(); i++){
        	Set<Character> set = new HashSet<>();
            for(int j=i; j<s.length(); j++){
                if(!set.add(s.charAt(j))) {
                    break;
                }else {
                    set.add(s.charAt(j));
                }
            }
            len = set.size();
            max = Math.max(max, len);
        }
        return max;
    }
}