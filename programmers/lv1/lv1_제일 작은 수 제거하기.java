import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] arr2 = new int[arr.length-1];
        int[] temp = new int[arr.length];
        int index = 0;
        
        //배열에 숫자가 1개일 때
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        //원래 배열 순서 복사
        System.arraycopy(arr, 0, temp, 0, arr.length);
        
        //배열값 작은 순으로 정렬
        Arrays.sort(arr);
        //최소값 구하기
        int min = arr[0];
        //복사해둔 배열(원래 배열)에서 최소값의 위치 구하기
        for (int i = 0; i < temp.length; i++) {
			if(temp[i] == min) {
				index = i;
			}
		}
        
        //배열 복사
        for(int i=0; i<temp.length; i++) {
			if(i==index) {
				continue;
			} else if(i<index){
				arr2[i] = temp[i];
			} else {
				arr2[i-1] = temp[i];
			}
		}
        return arr2;
    }
}