class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // [1,2,4,6]
        // [1,1,2,8]
        // [48,24,6,1]

        // [1,-1,0,0,0]
        // [0,6,6,3,1]

        // Logic: calculate prefix product exlcuding current
        // calculate suffic product excluding current
        // for given index you have product before it and after it
        // multiply them
        int n = nums.length;
        int product = 1;

        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];
        int[] result = new int[n];
        prefixProduct[0] = product;
        suffixProduct[n-1] = product;

        for(int i=1;i<n;i++){
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
        }

        for(int i=n-2;i>=0;i--){
            suffixProduct[i] = suffixProduct[i+1] * nums[i+1];
        }

        for(int i=0;i<n;i++){
            result[i] = prefixProduct[i] * suffixProduct[i];
        }

        return result;
    }
}  
