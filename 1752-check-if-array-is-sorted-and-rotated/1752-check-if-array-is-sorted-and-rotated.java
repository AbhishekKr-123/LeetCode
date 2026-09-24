class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=1; i<n;i++){
            if(nums[i-1]>nums[i])
                count++;
            else if(nums[i-1]==nums[i]){
                count =1;
            }
        }
        if(nums[n-1]>nums[0])
            count++;
        else if(nums[n-1] == nums[0]){
            count =1;
        }
            // System.out.print(count);
        return count==1;
    }
}