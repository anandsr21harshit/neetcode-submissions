class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLength = 0;

        int left=0;
        int right=0;
        int[] freq = new int[26];
        int maxFreq = 0;

        while(right < n){
            int index = s.charAt(right) - 'A';
            // add to freq[]
            freq[index]++;

            // find maxFreq in the freq[]
            maxFreq = Math.max(maxFreq,freq[index]);

            while((right-left+1) - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
            right++;
        }

        return maxLength;
    }
}
