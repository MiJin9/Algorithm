class Solution {
    public int reverse(int x) {
        int answer = 0;
        int sign = x>0 ? 1 : -1;
        x = Math.abs(x);
                
        if(x==0) return 0;
        
        while(x!=0){
            if (Integer.MAX_VALUE/10 < answer || (Integer.MAX_VALUE-x%10) < answer*10) return 0;
            answer = answer*10 + x%10;
            x /= 10;            
        }
        
        return sign*answer;
    }
}