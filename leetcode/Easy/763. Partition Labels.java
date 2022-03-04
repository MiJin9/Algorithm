class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] index = new int[26];
        for (int i = 0; i < S.length(); i++)
            index[S.charAt(i)-'a'] = i;
        
        int last = 0, start = 0;
        List<Integer> list = new ArrayList();
        for (int i = 0; i < S.length(); i++) {
            last = Math.max(last, index[S.charAt(i)-'a']);
            if (last == i) {
                list.add(last - start + 1);
                start = last + 1;
            }
        }
        return list;
    }
}