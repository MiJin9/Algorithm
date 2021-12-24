class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        int num = price;
        
        for(int i=0; i<count; i++){
            num = price + i * price;
            sum += num;
        }
        
        if(sum < money){
            return 0;
        }
        
        sum -= money;

        return sum;
    }
}