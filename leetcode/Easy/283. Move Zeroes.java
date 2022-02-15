class Solution {
    public void moveZeroes(int[] nums) {
        int[] answer = new int[nums.length];
        int j = 0;
        
        for(int i=0; i<answer.length; i++)
            answer[i] = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0)
                answer[j++]=nums[i];
        }
        System.arraycopy(answer, 0, nums, 0, nums.length);
    }
}