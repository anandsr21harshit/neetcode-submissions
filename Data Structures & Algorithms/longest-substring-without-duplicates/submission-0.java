class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        boolean[] visited = new boolean[256];

        int start = 0;
        int end = 0;
        int maxLength = 0;

        while(end < n){
            char c = s.charAt(end);
            while(visited[c]){
                visited[s.charAt(start)] = false;
                start++;
            }
            visited[c] = true;
            maxLength = Math.max(maxLength,end-start+1);
            end++;
        }

        return maxLength;
    }
}
