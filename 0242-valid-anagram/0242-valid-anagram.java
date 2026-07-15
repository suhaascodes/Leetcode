class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int n = s.length();
        int[] freq = new int[26];
        for (char ch:s.toCharArray()) {
            int ind = ch - 'a';
            freq[ind]++;
        }
        for (char ch:t.toCharArray()) {
            int ind = ch - 'a';
            freq[ind]--;
        }
        for (int num:freq) {
            if (num != 0) return false;
        }
        return true;
    }
}