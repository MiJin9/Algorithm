class Solution {
    public int[] solution(long n) {
        String str = n + "";
        int[] answer = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            answer[str.length()-i-1] = ch-'0';
        }
        return answer;
    }
}