class Solution {
    public boolean isPalindrome(String s) {
        String clean = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                clean += Character.toLowerCase(ch);
            }
        }
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}

