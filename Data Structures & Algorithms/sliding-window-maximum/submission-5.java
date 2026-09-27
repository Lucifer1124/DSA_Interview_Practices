class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k < 1) return new int[0];
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i = 0; i < n; i++){
            if(i % k == 0){
                left[i] = nums[i];
            } else{
                left[i] = Math.max(nums[i], left[i - 1]);
            }
            int j = n - 1 - i;
            if(j % k == 0 || j == n - 1){
                right[j] = nums[j];
            } else{
                right[j] = Math.max(right[j + 1], nums[j]);
            }
        }
        int[] res = new int[n - k + 1];
        for(int i = 0; i < n - k + 1; i++){
            res[i] = Math.max(right[i], left[i + k - 1]);
        }

        return res;
    }
}
