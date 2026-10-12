class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int max = Integer.MAX_VALUE;
        for(int n : prices){
            if(n < max){
                max = n;
            }
            if(n - max > min){
                min = n - max;
            }
        }
        return min;
    }
}
