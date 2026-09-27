class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() < 1) return 0;
        int[] arr = new int[256];
        int left = 0; int max = 0; int right = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(arr[c] != -1 && arr[c] >= left){
                left = arr[c] + 1;
            }
            max = Math.max(max, right - left + 1);
            arr[c] = right;
            right++;
        }
        return max;
    }
}
