class Solution {
    public int solution(long num) {
        int count = 0;
        
        while(1 < num){
            if(count >= 500){
                count = -1;
                break;
            }else{
                if(num%2==0){
                    num = num / 2;
                    count++;
                } else{
                    num = num * 3 + 1;
                    count++;
                }
            }
        }
        return count;
    }
}