class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0 || n==2)
            return false;
        if(n==1)
            return true;
        
        while(true){
            if(n%3!=0)
                return false;
            else
                n = n/3;
            
            if(n==1)
                break;
        }
        return true;
    }
}