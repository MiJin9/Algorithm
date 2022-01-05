class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean check = false;
        
        for(int i=1; i<10; i++){
            for(int j=0; j<numbers.length; j++){
                check = false;
                if(numbers[j] == i){
                    check = true;
                    break;
                }
            }
            
            if(!check){
                answer += i;
            }
        }
        return answer;
    }
}