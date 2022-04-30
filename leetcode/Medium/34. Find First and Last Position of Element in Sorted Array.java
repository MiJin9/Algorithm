class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];
        answer[0] = firstIdx(nums, target);
        answer[1] = lastIdx(nums, target);
        return answer;
    }
    
    public static int firstIdx(int[] nums, int target){
        int mid=0, left=0, right = nums.length-1;
        int idx = -1;
        
        while(left<=right){
            mid = (left+right)/2;
            
            if(nums[mid]>=target){
                right = mid-1;
            }else{
                left = mid+1;
            }
            if(nums[mid]==target){
                idx = mid;
            }
        }
        return idx;
    }
    public static int lastIdx(int[] nums, int target){
        int mid=0, left=0, right = nums.length-1;
        int idx = -1;
        
        while(left<=right){
            mid = (left+right)/2;
            
            if(nums[mid]<=target){
                left = mid+1;
            }else{
                right = mid-1;
            }
            if(nums[mid]==target){
                idx = mid;
            }
        }
        return idx;
    }
}
