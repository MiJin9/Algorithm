import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = sc.nextInt();
        boolean check = false;
        for(int i=0; i<m; i++){
            check = false;
            int num = sc.nextInt();
            int start=0, end=n-1;
            while(start<=end){
                int mid = (start+end)/2;
                if(num<arr[mid])
                    end = mid-1;
                else if(num>arr[mid])
                    start = mid+1;
                else{
                    check = true;
                    break;
                }
            }
            if(check)
            	System.out.println(1);
            else
            	System.out.println(0);
            	
        }
    }
}