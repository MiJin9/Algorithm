import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        ArrayList<String> str1List = new ArrayList<>();
        ArrayList<String> str2List = new ArrayList<>();
        int kyo = 0;
        String tmp = "";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        //str1의 다중집합 원소 배열 채우기
        for(int i=0; i<str1.length()-1; i++){
            if('a'<=str1.charAt(i)&&str1.charAt(i+1)<='z'
              &&'a'<=str1.charAt(i+1)&&str1.charAt(i+1)<='z'){
                tmp = str1.substring(i,i+2);
                str1List.add(tmp);
            }
        }
        //str2의 다중집합 원소 배열 채우기
        for(int i=0; i<str2.length()-1; i++){
            if('a'<=str2.charAt(i)&&str2.charAt(i+1)<='z'
              &&'a'<=str2.charAt(i+1)&&str2.charAt(i+1)<='z'){
                tmp = str2.substring(i,i+2);
                str2List.add(tmp);
            }
        }
        
        //0으로 나누기 방지
        if(str1List.size()==0 && str2List.size()==0)
            return 65536;
        
        Collections.sort(str1List);
        Collections.sort(str2List);

        //교집합 수 구하기
        for(int i=str1List.size()-1; i>=0; i--){
            for(int j=str2List.size()-1; j>=0; j--){
                if(str2List.get(j).equals(str1List.get(i))){
                    str2List.remove(j);
                    kyo++;
                    break;
                }
            }
        }
        //교집합, 합집합 모두 0일 때 -> 1
        if(kyo==0 && str1List.size()==0 && str2List.size()==0)
            return 1;
        
        return kyo * 65536 / (str1List.size()+str2List.size());
    }
}