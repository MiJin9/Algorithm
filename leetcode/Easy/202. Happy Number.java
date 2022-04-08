class Solution {
    public boolean isHappy(int n) {        
        while(n!=1 && n!=4){
            n = countSum(n);
        }
        return n==1;
    }
    
    public int countSum(int n){
        int sum = 0;
        
        while(n>0){
            int num = n%10;
            sum += (num * num);
            n /= 10;
        }
        return sum;
    }
}