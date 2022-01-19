class Solution {
    public int solution(int[][] sizes) {
        int[][] newArr = new int[sizes.length][2];
        
        for(int i=0; i<sizes.length; i++){
            newArr[i][0] = Math.max(sizes[i][0], sizes[i][1]);
            newArr[i][1] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        int wid = 0, len = 0;
        
        for(int i=0; i<newArr.length; i++){
            wid = Math.max(wid, newArr[i][0]);
            len = Math.max(len, newArr[i][1]);
        }
        
        return wid*len;
    }
}