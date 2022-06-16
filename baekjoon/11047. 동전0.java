import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = sc.nextInt();
        int[] coins = new int[n];
        int cnt = 0;
        for(int i=0; i<n; i++){
            coins[i] = sc.nextInt();
        }
        
        for(int i=n-1; i>=0; i--){
            while(true){
                if(money-coins[i]>=0){
                    cnt++;
                    money = money - coins[i];
                }else{
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}