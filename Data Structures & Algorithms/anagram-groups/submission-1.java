class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }

            String key = Arrays.toString(freq);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        result.addAll(map.values());
        return result;
    }

    
}
