class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target)
                return i;
        }
        
        int[] newNum = new int[nums.length+1];
        
        for(int i=0; i<nums.length; i++)
            newNum[i] = nums[i];
        
        newNum[newNum.length-1] = target;
		Arrays.sort(newNum);
        
        for(int i=0; i<newNum.length; i++){
            if(newNum[i]==target)
                return i;
        }
        return 0;
    }
}