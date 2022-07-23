import java.util.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int GCD = 0, LCM = 0;
        
        for(int i=Math.min(num1, num2); i>=1; i--){
            if(num1%i==0 && num2%i==0) {
            	GCD = i;
            	break;
            }
        }
        LCM = GCD * (num1/GCD) * (num2/GCD);
        System.out.println(GCD);
        System.out.println(LCM);
    }
}