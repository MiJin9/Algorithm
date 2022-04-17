import java.util.*;

class Main {
	static int n, m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        		n = sc.nextInt();
        		m = sc.nextInt();
        
        		arr = new int[m+1];
        
        		dfs(0);
        		System.out.print(sb);
	}
	
	static void dfs(int k) {
		if(k==m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
					
		for(int i=1; i<=n; i++) {
			arr[k] = i;
			dfs(k+1);			
		}
	}
}
