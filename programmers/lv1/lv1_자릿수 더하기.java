import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int rest = 0;
        while(n != 0){
            rest = n % 10;
            answer += rest;
            n = n / 10;
        }
        return answer;
    }
}