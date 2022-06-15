import java.util.*;

class Main {
    public static void main(String[] args){
        long max = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] haveLength = new long[n];
        for(int i=0; i<n; i++){
            haveLength[i] = sc.nextLong();
            max = Math.max(max, haveLength[i]);
        }
        
        long start = 1;
        long end = max;
        long mid = 0;
        while(start<=end) {
            mid = (start + end)/2;
            long cnt = 0;
            for(int i=0; i<n; i++) {
        	    cnt += haveLength[i]/mid;
        	}
        	
            if(cnt<k) {
        	    end = mid-1;        		
        	}else{
                start = mid+1;
            }
        }
        System.out.println(end);
    }
}
