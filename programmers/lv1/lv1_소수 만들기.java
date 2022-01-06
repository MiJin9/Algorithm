class Solution {
    public static boolean decimal(int num) {
	for(int i=2; i<num; i++) {
		if(num % i == 0) {
			return false;
		}
	}
	return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int num = nums[i] + nums[j] + nums[k];
                    if(num>=2){
                        if(decimal(num))
                            answer++;
                    }
                }
            }
        }
        return answer;
    }
}