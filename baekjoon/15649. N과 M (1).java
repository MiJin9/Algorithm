import java.util.*;

class Main {
	static int N, M;
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		visit = new boolean[N];
		dfs(N,M,0);
		
		System.out.println(sb);
	}
	public static void dfs(int N, int M, int k) {
		if(k==M) {
			for(int i=0; i<M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[k] = i+1;
				dfs(N,M,k+1);
				visit[i] = false;				
			}
		}
	}
}
