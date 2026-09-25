class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count =0, maxCount =0;
        for(int num:nums){
            if(num==1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            if(num == 0)
                count=0;
        }
        return maxCount;
    }
}