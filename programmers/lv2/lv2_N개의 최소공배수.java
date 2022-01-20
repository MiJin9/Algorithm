class Solution {
    public int solution(int[] arr) {
        int LCM = 1;
        
        for(int i=0; i<arr.length; i++){
            int GCD = 1;
            if(arr[i]==0)
                continue;
            for(int j=2; j<=Math.min(LCM, arr[i]); j++){
                if(LCM%j==0 && arr[i]%j==0){
                    GCD = j;
                }
            }
            LCM = LCM*arr[i]/GCD;
        }
        return LCM;
    }
}