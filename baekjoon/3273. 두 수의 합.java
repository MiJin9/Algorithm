import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        int cnt = 0;
        
        Arrays.sort(arr);
        for(int i=1; i<=n; i++){
            int target = x - arr[i];
            if(search(arr,1,n,target))
                cnt++;
        }
        System.out.println(cnt/2);
    }
    static boolean search(int[] a, int left, int right, int x){
        while(left<=right){
            int mid = (left+right)/2;
            if(a[mid]<x)
                left = mid + 1;
            else if(a[mid]>x)
                right = mid - 1;
            else
                return true;
        }
        return false;
    }
}