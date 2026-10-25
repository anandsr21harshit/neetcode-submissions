class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    // "1##5#Hello"
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        
        int i=0;
        // iterate over string
        while(i < str.length()){
            // find occurrence of #
            int j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            // find the integer before #
            int len = Integer.parseInt(str.substring(i,j));
            // now move i to find the string
            i=j+1;
            result.add(str.substring(i,len+i));

            // move pointer to next segment
            i = i+len;
        }
        

        return result;
    }
}
