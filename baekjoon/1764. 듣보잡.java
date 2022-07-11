import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        HashSet<String> set = new HashSet();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0; i<n; i++) {
            String str = sc.next();
            set.add(str);
        }
        for(int i=0; i<m; i++){
            String str = sc.next();
            if(set.contains(str)) {
            	list.add(str);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}