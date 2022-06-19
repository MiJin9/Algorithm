import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int PLUS = 6;
        int tmp=0, cnt=1;
        int pass = 2;
        while(true){
            if(pass>n)
                break;
            tmp += PLUS;
            pass += tmp;
            cnt++;
        }
        System.out.println(cnt);
    }
}