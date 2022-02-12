class Solution {
    public int climbStairs(int n) {
        int[] f = new int[n];
        
        if(n==1) return 1;
        f[0] = 1;
        f[1] = 2;
        
        for(int i=2; i<n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n-1];
    }
}