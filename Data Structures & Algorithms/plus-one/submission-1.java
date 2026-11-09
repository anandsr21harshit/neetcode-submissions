class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // start from last digit
        // if the ith digit is not 9
        // then adding 1 to it will have same 
        // number of digits

        for(int i=n-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // if all digits are 9
        int[] result = new int[n+1];
        result[0] = 1;
        return result;

    }
}
