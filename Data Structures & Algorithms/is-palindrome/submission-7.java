class Solution {
    public boolean isPalindrome(String s) {
        String str =  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }
}
/*
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
} */

