class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            
            if(map.containsKey(str)){
                map.get(str).add(s);
            }else{
                map.put(str, new ArrayList<>());
                map.get(str).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}