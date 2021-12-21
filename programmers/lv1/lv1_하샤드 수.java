class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int copy = x;
        int sum = 0;
        
        while(x != 0){
            int num = x % 10;
            sum += num;
            x /= 10;
        }
        
        if(copy%sum==0){
            answer = true;
        }
            
        return answer;
    }
}