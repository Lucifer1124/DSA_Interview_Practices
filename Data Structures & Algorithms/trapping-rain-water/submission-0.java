class Solution {
    public int trap(int[] height) {
        if(height == null || height.length < 2) return 0;
        int left = 0; int right = height.length - 1;
        int leftMax = height[left]; int rightMax = height[right];
        int sum = 0;

        while(left < right){
            if(leftMax < height[left]){
                leftMax = height[left];
            }
            if(rightMax < height[right]){
                rightMax = height[right];
            }
            if(leftMax <= rightMax){
                sum = sum + leftMax - height[left];
                left++;
            } else{
                sum = sum + rightMax - height[right];
            }
        }
        return sum;
    }
}
