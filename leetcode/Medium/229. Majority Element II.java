class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
    	Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        Iterator<Integer> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            Integer key = iter.next();
            if(map.get(key)>n/3) {
            	list.add(key);
            }
        }
        return list;
    }
}