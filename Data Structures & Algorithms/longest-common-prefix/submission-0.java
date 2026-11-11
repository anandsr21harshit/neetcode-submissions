class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int n = strs.length;
        for(int i=1;i<n;i++){
            String current = strs[i];
            int j=0;
            while( j < Math.min(prefix.length(),current.length())){
                if(prefix.charAt(j) != current.charAt(j)){
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0,j);
        }

        return prefix;
    }
}