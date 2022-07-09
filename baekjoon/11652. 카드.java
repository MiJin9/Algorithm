import java.util.*;

class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long max = 0, cnt = 1;
        for(int i=0; i<n; i++)
            arr[i] = sc.nextLong();
        
        Arrays.sort(arr);
        long num = arr[0];
        for(int i=1; i<n; i++) {
            if(arr[i-1]==arr[i])
        	cnt++;
            else 
        	cnt = 1;

            if(cnt>max) {
        	max = cnt;
        	num = arr[i-1];
            }
        }
        System.out.println(num);
    }
}
