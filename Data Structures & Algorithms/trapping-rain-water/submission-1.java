class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // we can track leftMax and rightMax in two variables

        int left = 0;
        int right = n-1;
        int leftMax = 0;
        int rightMax = 0;

        int water = 0;
        while(left <= right){
            if(leftMax < rightMax){
                // use left pointer
                leftMax = Math.max(leftMax,height[left]);
                water += leftMax - height[left];
                left++;
            }else{
                // use right pointer
                rightMax = Math.max(rightMax,height[right]);
                water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }
}
