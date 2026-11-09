class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = sumOfSquares(n);

        while( slow != fast ){
            fast = sumOfSquares(sumOfSquares(fast));
            slow = sumOfSquares(slow);
        }
        return fast == 1;
    }
    // 19
    // 19 -> 82 -> 68 -> 100 -> 1
    private int sumOfSquares(int n){
        int sum = 0;
        while( n !=0 ){
            int d = n % 10;
            sum += d*d;
            n = n/10;
        }
        return sum;
    }
}
