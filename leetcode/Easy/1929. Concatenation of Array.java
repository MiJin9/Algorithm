class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length*2];
        
        for(int i=0; i<nums.length; i++){
            answer[i] = nums[i];
            answer[answer.length/2+i] = nums[i];
        }
        return answer;
    }
}