import java.util.*;

class Main{
    static int n,m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m+1];
        
        func(1);
        System.out.println(sb);
    }
    static void func(int k){
        if(k==m+1){
            for(int i=1; i<=m; i++)
                sb.append(arr[i] + " ");
            
            sb.append('\n');
            return;
        }
        int start = arr[k-1];
        if(start==0)
            start = 1;
        for(int i=start; i<=n; i++){
            arr[k] = i;
            func(k+1);
        }
    }
}