class Solution {
    public double average(int[] salary) {
        double sum = 0d;
        Arrays.sort(salary);
        
        for(int i=1; i<salary.length-1; i++){
            sum += salary[i];    
        }
        sum = sum/(salary.length-2);
        
        return sum;
    }
}