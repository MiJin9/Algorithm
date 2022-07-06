import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
    	int cnt = 0;
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        boolean[] att = new boolean[n+3];
        List<Integer> sleep = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<k; i++){
            sleep.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<q; i++){
            int num = Integer.parseInt(st.nextToken());
            if(sleep.contains(num))
            	continue;
            if(!att[num]) {
            	for(int j=num; j<n+3; j++) {
            	    if(j%num==0) {
            	        if(!sleep.contains(j))
            		    att[j] = true;
            	    }
            	}
            }
        }
        
        int[] cumSum = new int[n + 3];
	for (int i=3; i<n+3; i++) {
	    cumSum[i] = cumSum[i - 1] + ((!att[i]) ? 1 : 0);
	}
	for (int i=0; i<m; i++) {
	    st = new StringTokenizer(br.readLine());
	    int start = Integer.parseInt(st.nextToken());
	    int end = Integer.parseInt(st.nextToken());
	    System.out.println(cumSum[end] - cumSum[start-1]);
	}
    }
}