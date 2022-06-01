class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        //deck 배열의 길이를 n에 넣음
        int len = deck.length;
        //deck 배열 정렬
        Arrays.sort(deck);
        //Queue 생성
        Queue<Integer> q= new LinkedList<>();
        //Queue에 0~n-1의 값 넣음
        for (int i=0; i<len; i++) 
            q.add(i);
        //deck 배열의 길이와 같은 새로운 배열 생성
        int[] answer= new int[len];
        
        //제일 위에 있는 값은 제거, 그 뒤의 값은 맨 뒤로 보내는 과정
        for (int i=0; i<len; i++){
            answer[q.poll()]=deck[i];
            q.add(q.poll());
        }
        return answer;
    }
}