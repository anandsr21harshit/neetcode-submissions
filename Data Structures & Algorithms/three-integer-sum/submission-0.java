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
        Map<Integer,Integer> freqMap = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            // if first number in triplet is positive in sorted array 
            // then sum of triplet cannot be 0
            if(nums[i] > 0) break; 
            freqMap.put(nums[i],freqMap.get(nums[i])-1);
            if(i > 0 && nums[i-1] == nums[i]) continue; // skip duplicate

            for(int j=i+1;j<n;j++){
                freqMap.put(nums[j],freqMap.get(nums[j])-1);
                if(j > i+1 && nums[j-1] == nums[j])continue;// skip duplicate
                
                int target = -(nums[i] + nums[j]);
                
                if(freqMap.containsKey(target) && freqMap.get(target) > 0){
                    result.add(List.of(nums[i],nums[j],target));
                }
            }

            for(int j=i+1;j<n;j++){
                freqMap.put(nums[j],freqMap.get(nums[j])+1);
            }
        }

        return result;
    }
}
