class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        if(s == t) return true;

        HashMap<Character, Integer> check = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            check.put(c, check.getOrDefault(c,0)+ 1);
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            int count = check.getOrDefault(c,0);
            if(count == 0) return false;
            check.put(c, count - 1);
        }

        return true;
    }
}
