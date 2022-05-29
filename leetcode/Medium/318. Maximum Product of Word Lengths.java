class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        Arrays.sort(words);
        
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                boolean check = true;
                for(int k=0; k<words[i].length(); k++){
                    if(words[j].contains(words[i].charAt(k)+"")){
                        check = false;
                        break;
                    }
                }
                if(check){
                    int sum = words[i].length() * words[j].length();
                    max = Math.max(max, sum);
                }
            }
        }
        return max;
    }
}