import java.util.*;

class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();  
            int[] a = new int[n+1];
            int[] b = new int[m+1];
            int cnt = 0;
            for(int j=1; j<=n; j++)
                a[j] = sc.nextInt();
            for(int j=1; j<=m; j++)
                b[j] = sc.nextInt();
            
            Arrays.sort(b);
            for(int j=1; j<=n; j++) {
            	cnt += search(b,1,m,a[j]);
            }
            System.out.println(cnt);
        }
    }
	static int search(int[] arr, int start, int end, int x) {
	    int res = 0;
	    while(start<=end) {
		int mid = (start+end)/2;
		if(arr[mid]<x) {
		    res = mid;
    		    start = mid + 1;
    		}else {
    		    end = mid - 1;
    		}
	    }
	    return res;
	}
}
