class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int daySum = 0;

        int[] endOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] DAY_OF_WEEK = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        for(int i=1; i<=a; i++){
            daySum += endOfMonth[i-1];
        }
        daySum += b -1;
                
        answer = DAY_OF_WEEK[daySum%7];
        
        return answer;
    }
}