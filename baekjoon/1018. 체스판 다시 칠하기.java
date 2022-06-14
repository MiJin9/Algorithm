import java.util.*;

class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min = Integer.MAX_VALUE;
		boolean[][] arr = new boolean[n][m];
		for (int i = 0; i < n; i++) {
		    String str = sc.next();
            	    //색이 B -> true, W -> false
		    for (int j = 0; j < m; j++) {
			if(str.charAt(j)=='B')
                    	    arr[i][j] = true;
                		else
                    	    arr[i][j] = false;
		    }
		}
        		//시작점 지정
		for (int i=0; i<=n-8; i++) {
		    for (int j=0; j<= m-8; j++) {
			int cnt = 0;
                		//시작점의 색을 check에 넣어줌
                		boolean check = arr[i][j];
                		//8*8 체스판
			for (int r=i; r<i+8; r++) {
			    for (int c=j; c <j+8; c++) {
				if(arr[r][c]!=check)
                            	    cnt++;
                                  //바로 옆의 칸과 다른 색이어야 하기 때문에
                        		check = !check;
			    }
                    //마지막 칸의 색과 다음 줄의 제일 앞 칸은 같은 색이어야 하는데 앞에서 바꿔줬기 때문에 다시 바꿔줌
                    check = !check;
		}
                 //맨 앞자리가 틀릴 경우 그 자리만 바꿔도 가능하기 때문에, 둘 중 최소값을 구함
                 cnt = Math.min(cnt, 64-cnt);
                 //그 동안 구한 경우에 대해 최소값
		min = Math.min(min, cnt);
	    }
	}
	System.out.println(min);
    }
}