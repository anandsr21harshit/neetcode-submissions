class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        List<Integer> keys = freqMap.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> entry.getKey()).toList();
        
        int result[] = new int[k];
        for(int i=0;i<k;i++){
            result[i] = keys.get(i);
        }

        return result;
    }
}
