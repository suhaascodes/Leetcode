class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        if (n == 1) return 1;
        int maxLen = 0;
        for (int i=0; i<n; i++) {
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            int len = 1;
            for (int j=i+1; j<n; j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    len++;
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}