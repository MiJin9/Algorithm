import java.util.*;

class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
        int sum = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            int color = sc.nextInt();
            if(!map.containsKey(color)) {
            	ArrayList<Integer> list = new ArrayList();
            	list.add(num);
            	map.put(color, list);
            }else {
            	map.get(color).add(num);
            }
        }
        
        for (Map.Entry<Integer, ArrayList<Integer>> pair : map.entrySet()) {
            Collections.sort(pair.getValue());
            ArrayList<Integer> tmp = pair.getValue();
            for(int i=0; i<tmp.size(); i++) {
                if(i==0)
        	    sum += (Math.abs(tmp.get(i)-tmp.get(i+1)));
        	else if(i==tmp.size()-1)
        	    sum += (Math.abs(tmp.get(i)-tmp.get(i-1)));
        	else
        	    sum += Math.min(Math.abs(tmp.get(i)-tmp.get(i-1)),Math.abs(tmp.get(i)-tmp.get(i+1)));
        	}
        }
        System.out.println(sum);
    }
}