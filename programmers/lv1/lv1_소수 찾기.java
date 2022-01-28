class Solution {
    public boolean decimal(int num){
        if(num%2==0)
            return false;
        
        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public int solution(int n) {
        int answer = 1;
        
        for(int i=3; i<=n; i++){
            if(decimal(i)){
                answer++;
            }   
        }
        
        return answer;
    }
}