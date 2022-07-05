import java.util.*;

class Main{
    static int n,min,max;
    static int[] num, operator;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num = new int[n];
        operator = new int[4];
        
        max = Integer.MIN_VALUE; 
        min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        for(int i=0; i<4; i++){
            operator[i] = sc.nextInt();
        }
        func(num[0], 1);
        System.out.println(max);
        System.out.println(min);
    }
    static void func(int number, int k){
        if(k==n){
            max = Math.max(max, number);
            min = Math.min(min, number);
            return;
        }
        
        for(int i=0; i<4; i++){
            if(operator[i]>0){
                operator[i]--;
                
                switch(i){
                    case 0:
                        func(num[k]+number, k+1);
                        break;
                    case 1:
                        func(number-num[k], k+1);
                        break;
                    case 2:
                        func(number*num[k], k+1);
                        break;
                    default:
                        func(number/num[k], k+1);
                        break;
                }
                operator[i]++;
            }
        }
    }
}