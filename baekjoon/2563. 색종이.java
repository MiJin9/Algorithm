import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[101][101];
        int answer = 0;
        
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int c=x; c<x+10; c++){
                for(int r=y; r<y+10; r++){
                    arr[r][c] = 1;
                }
            }
        }
        for(int i=0; i<=100; i++){
            for(int j=0; j<=100; j++){
                if(arr[i][j]==1)
                    answer++;
            }
        }
        System.out.println(answer);
    }
}