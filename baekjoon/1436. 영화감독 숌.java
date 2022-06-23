import java.util.*;

class Main{
    public static void main(String[] args){
        int answer = 0, cnt = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 666;
        while(true){
            String changeStr = num + "";
            for(int i=0; i<=changeStr.length()-3; i++){
                if(changeStr.charAt(i)=='6' && changeStr.charAt(i+1)=='6' && changeStr.charAt(i+2)=='6'){
                    cnt++;
                    break;
                }
            }
            if(cnt==(n+1)){
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}