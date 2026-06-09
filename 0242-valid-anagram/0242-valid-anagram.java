class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i=0; i<s.length(); i++) {
            char ch1 = s.charAt(i);
            int ind1 = ch1 - 'a';
            freq[ind1]++;
            char ch2 = t.charAt(i);
            int ind2 = ch2 - 'a';
            freq[ind2]--;
        }
        for (int num:freq) {
            if (num != 0) return false;
        }
        return true;
    }
}