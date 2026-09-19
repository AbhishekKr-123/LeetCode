class Solution {
    public int subtractProductAndSum(int n) {
        int prdt = 1;
        int sum=0;
        int temp = n;
        while(n>0){
            int digit = n%10;
            sum += digit;
            prdt *= digit;
            n /= 10;
        }

        return prdt-sum;
    }
}