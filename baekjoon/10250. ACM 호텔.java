import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int room = 0;
            
            if(n%h==0)
            	room = h*100 + n/h;
            else
            	room = (n%h*100) + (n/h+1);
            
            System.out.println(room);
        }
    }
}