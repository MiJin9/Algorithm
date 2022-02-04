class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        boolean check = false;
        
        Arrays.sort(nums);
		
		for(int i=0; i<nums.length-1; i+=2) {
			if(nums[i]!=nums[i+1]) {
				answer = nums[i];
                check = true;
                break;
			}
		}
        if(!check)
            answer = nums[nums.length-1];
        
        return answer;
    }
}