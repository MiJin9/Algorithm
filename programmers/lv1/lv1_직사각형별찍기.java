import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[][] arrData = new int[b][a];
	        for (int i=0; i < arrData.length; i++){
	            for(int j=0; j < arrData[i].length; j++){
	                System.out.print("*");
	            }
	            System.out.println();
        }
    }
}