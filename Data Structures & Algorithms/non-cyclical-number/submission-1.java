class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(true){
            int sum = 0;
            while(n != 0){
                int d = n%10;
                sum += d*d;
                n = n/10;
            }
            if(set.contains(sum)) return false;
            if(sum == 1) return true;
            set.add(sum);
            n=sum;
        }
    }
}
