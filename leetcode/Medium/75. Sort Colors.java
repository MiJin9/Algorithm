class Solution {
    public void sortColors(int[] nums) {
        int redCnt = 0;
        int blueCnt = 0;
        int whiteCnt = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                redCnt++;
            else if(nums[i]==1)
                blueCnt++;
            else
                whiteCnt++;
        }
        int idx = 0;
        for(int j=0; j<redCnt; j++)
            nums[idx++] = 0;
        for(int j=0; j<blueCnt; j++)
            nums[idx++] = 1;
        for(int j=0; j<whiteCnt; j++)
            nums[idx++] = 2;
    }
}