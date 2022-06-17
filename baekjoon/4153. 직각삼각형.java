import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            int d3 = sc.nextInt();
            int max = 0;
            if(d1==0 && d2==0 && d3==0)
                break;
            
            d1 *= d1;
            d2 *= d2;
            d3 *= d3;
            if(d1==d2+d3 || d2==d1+d3 || d3==d1+d2)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
