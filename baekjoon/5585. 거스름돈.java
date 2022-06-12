import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();       
        money = 1000 - money;
        int[] coins = {500,100,50,10,5,1};
        int cnt = 0;
        
        for(int i=0; i<coins.length; i++){
            while(true){
                if(money-coins[i]>=0){
                    money -= coins[i];
                    cnt++;
                }else{
                    break;                    
                }
            }
        }
        System.out.println(cnt);
    }
}