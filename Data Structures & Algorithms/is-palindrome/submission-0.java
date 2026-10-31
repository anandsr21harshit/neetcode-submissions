class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();

        int start=0;
        int end = n-1;

        while(start < end){
            
            // if char at start is not alphnumeric keep on moving
            while(start < end && !isAlphaNumeric(s.charAt(start))){
                start++;
            }

            // if char at end is not alphnumeric keep on moving
            while(start < end && !isAlphaNumeric(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) return false;
            end--;
            start++;
        }
        return true;
    }

    public boolean isAlphaNumeric(char c){
        return ( c >= 'A' && c <= 'Z' ||
                c >='a' && c <='z' ||
                c >= '0' && c <='9');
    }
}
