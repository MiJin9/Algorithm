class Solution {
    public int majorityElement(int[] nums) {
		int max = 0;
		int key = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
        	
        	if(map.containsKey(nums[i])) {
        		map.put(nums[i], map.get(nums[i]) + 1);
        	}else {
        		map.put(nums[i], 1);
        	}
        }
                
        Set set = map.entrySet();
        Iterator it = set.iterator();
        
        while(it.hasNext()) {
        	Map.Entry e = (Map.Entry)it.next();
        	if((int)e.getValue()>max) {
        		max = (int)e.getValue();
        		key = (int)e.getKey();
        	}
        }
        return key;
    }
}