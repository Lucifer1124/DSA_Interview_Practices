class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length();
        while(left < right){
            if(left != right) return false;

            left++;
            right--;
        }
        return true;
    }
}
