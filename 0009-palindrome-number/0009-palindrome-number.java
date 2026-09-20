class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int result =0;

        if(x<0) return false;

        while(x!=0){
            int digit = x%10;
            x/=10;
            result = result*10 + digit;
        }
        if(result == temp){
            return true;
        }
        return false;
    }
}