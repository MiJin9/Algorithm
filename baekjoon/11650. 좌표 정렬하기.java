import java.util.*;

class Main{
    static class Dis{
        int x, y;
        public Dis(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dis[] arr = new Dis[n];
        for(int i=0; i<n; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            arr[i] = new Dis(n1,n2);
        }
        Arrays.sort(arr, new Comparator<Dis>() {
	    @Override
	    public int compare(Dis o1, Dis o2) {
	        if(o1.x==o2.x)
		    return o1.y - o2.y;
				
		return o1.x - o2.x;
	    }
        	
	});
        
        for(int i=0; i<n; i++) {
        	System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}