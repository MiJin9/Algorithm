import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] tmp = new String[n];
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            tmp[i] = sc.next();
        }
        Arrays.sort(tmp);
        int idx = 0;
        for(int i=1; i<=50; i++){
            for(int j=0; j<n; j++){
                if(tmp[j].length()==i){
                    answer[idx++] = tmp[j];
                }
            }
        }
        for(int i=0; i<n; i++){
            if(i!=0 && answer[i].equals(answer[i-1]))
            	continue;
            else
                System.out.println(answer[i]);
        }  
    }
}