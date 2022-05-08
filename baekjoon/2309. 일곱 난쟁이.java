import java.util.*;

class Main {
	public static void main(String[] args) {
	int[] arr = new int[9];
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int target = sum-100;
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(arr[i]+arr[j]==target){
                    arr[i]=0;
                    arr[j]=0;
                }
            }
        }
        Arrays.sort(arr);
        for(int k=2; k<9; k++){
            System.out.println(arr[k]);
        }
    }
}