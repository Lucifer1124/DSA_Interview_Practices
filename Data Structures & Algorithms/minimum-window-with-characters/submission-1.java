class Solution {
    public String minWindow(String s, String t) {
        if(s == t) return s;
        if(s == null || t == null) return "";
        int[] arr = new int[255];
        for(int i = 0; i < t.length(); i++){
            arr[t.charAt(i)]++;
        }
        int left = 0; int right = 0; int count = 0;
        int min = Integer.MAX_VALUE;
        int idx = -1;
        while(right < s.length()){
            if(arr[s.charAt(right)] > 0){
                count++;
            }
            arr[s.charAt(right)]--;
            while(count == t.length()){
                if(right - left + 1 <= min){
                    min = right - left + 1;
                    idx = left;
                }
                arr[s.charAt(left)]++;
                if(arr[s.charAt(left)] > 0) count--;
                left++;
            }
            right++;
        }
        return idx == -1 ? "" : s.substring(idx, idx + min);
    }
}
