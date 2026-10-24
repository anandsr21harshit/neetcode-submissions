class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        // store freq in map
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        List<List<Integer>> buckets = new ArrayList<>();

        for(int i=0;i<=n;i++){
            buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            int freq = entry.getValue();
            buckets.get(freq).add(entry.getKey());
        }
        int[] result = new int[k];
        int index = 0;
        // start from end and iterate over each bucket & add to array
        for(int freq=n;freq>=0 && index<k;freq--){
            for(int num : buckets.get(freq)){
                result[index++] = num;
                // what if one bucket has more than k, so break
                if(index == k) break;
            }
        }

        return result;
    }
}
