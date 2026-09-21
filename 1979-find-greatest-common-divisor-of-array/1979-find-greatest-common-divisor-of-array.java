class Solution {
    public int findGCD(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        int gcd = 1;
        for(int i=1; i<=min; i++){
            if(min % i == 0 && max % i == 0) 
                gcd = i;
        }

        return gcd;
    }
}