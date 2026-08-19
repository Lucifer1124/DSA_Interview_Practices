class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i < n+1; i++){
            int temp = i % 2;
            ans[i] = ans[i/2] + temp;
        }
        return ans;
        /*for(int i = 0; i < n+1; i++){
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;*/
    }
}
