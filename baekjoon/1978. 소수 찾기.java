import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(isDecimal(num))
                cnt++;
        }
        System.out.println(cnt);
    }
    static boolean isDecimal(int num){
        if(num==0 || num==1)
            return false;
        
        for(int i=2; i<num; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}