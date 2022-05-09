class Solution {
    public int countPrimes(int n) {
        int cnt = 0;
        boolean[] check = new boolean[n];
        if(n==0 || n==1) return 0;
        
        for(int i=2 ; i<n; i++){
            for(int j = 2*i; j<n; j+=i) 
                check[j] = true;
        }
        
        for(int i=2; i<check.length; i++)
            if (!check[i])
                cnt++;
        
        return cnt;
    }
}