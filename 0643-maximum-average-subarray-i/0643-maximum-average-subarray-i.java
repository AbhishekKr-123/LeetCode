class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res = 0;
        for(int i=0; i<k; i++){
            res += nums[i];
        }

        double maxSum = res;

        for(int i = k; i<nums.length; i++){
            res = res + nums[i]-nums[i-k];
            maxSum = Math.max(maxSum, res);
        }
 
        maxSum = maxSum/k;
        return maxSum;
    }
}