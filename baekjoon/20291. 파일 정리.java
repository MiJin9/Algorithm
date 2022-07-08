import java.util.*;

class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, Integer> map = new TreeMap();
        for(int i=0; i<n; i++){
            String str = sc.next();
            String[] sep = str.split("\\.");
            Arrays.toString(sep);
            if(!map.containsKey(sep[1]))
            	map.put(sep[1], 1);
            else
            	map.put(sep[1], map.get(sep[1])+1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}