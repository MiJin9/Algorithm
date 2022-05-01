class Solution {
    public boolean isPalindrome(String s) {
        int start=0, end=s.length()-1;
        s = s.toLowerCase();
        
        while(start<=end){
            char ch_start = s.charAt(start);
            char ch_end = s.charAt(end);
            
            if(!checkNumLetters(ch_start))
                start++;
            else if(!checkNumLetters(ch_end))
                end--;
            else if(ch_start != ch_end)
                return false;
            else{
               start++;
                end--;
            }
        }
        return true;
    }
    public static boolean checkNumLetters(char ch){
        return ('0'<=ch&&ch<='9') || ('a'<=ch&&ch<='z') || ('A'<=ch&&ch<='Z');
    }
}
