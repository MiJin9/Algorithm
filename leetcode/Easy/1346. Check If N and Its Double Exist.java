class Solution {
    public boolean checkIfExist(int[] arr) {
        int[] arr2 = new int[arr.length];
        
        for(int i=0; i<arr2.length; i++)
            arr2[i] = arr[i]*2;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr2[j]==arr[i]&&i!=j)
                    return true;
            }
        }
        return false;
    }
}