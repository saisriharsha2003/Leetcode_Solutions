class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        String longestSubstring = "";
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar)) {
                start = Math.max(start, map.get(currentChar) + 1);
            }
            if (end - start + 1 > longestSubstring.length()) {
                longestSubstring = s.substring(start, end + 1);
            }
            map.put(currentChar, end);
        }
        int l=longestSubstring.length();
        return l;        
    }
}
