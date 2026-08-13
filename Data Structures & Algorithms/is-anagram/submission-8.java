class Solution {
    public boolean isAnagram(String s, String t) {
       /* char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1, a2)) return true;

        return false;
    */
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
/**/
