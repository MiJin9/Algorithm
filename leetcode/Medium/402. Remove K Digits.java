class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length())
            return "0";
        
        int i=0;
        Stack<Character> s = new Stack<>();
        while(i<num.length()){
            while(k>0 && !s.isEmpty() && s.peek()>num.charAt(i)){
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
            i++;
        }
                
        //같은 숫자 반복인 경우
        while(k>0){
            s.pop();
            k--;            
        }

        //stack을 문자열로 옮김
        String answer = "", tmp = "";
        while(!s.isEmpty())
            tmp = s.pop() + tmp;
        
        int idx = -1;
        for(int j=0; j<tmp.length(); j++){
            if(tmp.charAt(j)!='0'){
                idx = j;
                break;
            }
        }
        if(idx>=0)
            return tmp.substring(idx,tmp.length());
        else
            return "0";
    }
}
