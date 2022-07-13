import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            int num = sc.nextInt();
            sb.append(upperBound(arr,num)-lowerBound(arr,num)).append(' ');
        }
        System.out.println(sb);
    }
    static int lowerBound(int[] a, int x){
    	int start = 0, end = a.length;
        while(start<end){
            int mid = (start+end)/2;
            if(a[mid]>=x){
                end = mid;
            }else{
                start = mid+1;   
            }
        }
        return start;
    }
    static int upperBound(int[] a, int x){
    	int start = 0, end = a.length;
        while(start<end){
            int mid = (start+end)/2;
            if(a[mid]>x){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}