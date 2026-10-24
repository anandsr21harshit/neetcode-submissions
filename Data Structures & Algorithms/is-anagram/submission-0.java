class Solution {
    public boolean isAnagram(String s, String t) {

        int[] freqMap = new int[26];

        // add freq of s
        for(char c : s.toCharArray()){
            freqMap[c-'a']++;
        }

        // substract freq of t
        for( char c : t.toCharArray()){
            freqMap[c-'a']--;
        }

        // all values in freqMap should be 0

        for(int i : freqMap){
            if(i != 0) return false;
        }

        return true;
    }
}
