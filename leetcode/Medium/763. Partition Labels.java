class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] endIdx = new int[s.length()];
        List<Integer> answer = new ArrayList<>();
        int start = 0;
        
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    endIdx[i] = j;
                }
            }
        }
        
        Arrays.sort(endIdx);
        
        for(int i=0; i<endIdx.length; i++){
            if(i==endIdx[i]){
                answer.add(endIdx[i]-start+1);
                start = endIdx[i]+1;
            }
        }
        return answer;
    }
}