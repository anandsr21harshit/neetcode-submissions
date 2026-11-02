class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // [-1,0,1,2,-1,-4]
        // -4 -> 1
        // -1 -> 2
        // 0 -> 1
        // 1 -> 1
        // 2 -> 1

        // [-4,-1,-1,0,1,2]

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            // if first number in triplet is positive in sorted array 
            // then sum of triplet cannot be 0
            if(nums[i] > 0) break; 
            if(i > 0 && nums[i-1] == nums[i]) continue; // skip duplicate

            int left=i+1;
            int right=n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0){
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    result.add(List.of(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    // if left is same as before keep on incrementing
                    while(left < right && nums[left-1] == nums[left]){
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
