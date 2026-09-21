class Solution {
    public int findGCD(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        
        while(min>0 && max>0){
            if(min>max)
                min = min%max;
            else
                max = max % min;
        }
        if(min == 0){
            return max;
        }
        return min;
    }
}