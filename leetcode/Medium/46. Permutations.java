class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        fuc(list, new ArrayList<Integer>(), nums);
        return list;
    }
    public static void fuc(List<List<Integer>> list, List<Integer> tempList, int[] nums){
        //갯수가 다 채워지면 list에 추가
        if(tempList.size()==nums.length){
            list.add(new ArrayList<Integer>(tempList));
        }else{
            for(int i=0; i<nums.length; i++){
                //이미 넣은 값이면 통과
                if(tempList.contains(nums[i]))
                    continue;
                
                tempList.add(nums[i]);
                fuc(list, tempList, nums);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
