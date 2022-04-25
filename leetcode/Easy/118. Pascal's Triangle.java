class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i){
                    list.add(1);
                }else{
                    int a = answer.get(i-1).get(j-1);
                    int b = answer.get(i-1).get(j);
                    list.add(a+b);
                }
            }
            answer.add(list);
        }
        return answer;
    }
}