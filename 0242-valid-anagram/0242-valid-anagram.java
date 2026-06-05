class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        int n = s.length();
        for(int i=0; i<n; i++) {
            char c1 = s.charAt(i);
            int ind1 = c1 - 'a';
            freq[ind1]++;
            char c2 = t.charAt(i);
            int ind2 = c2 - 'a';
            freq[ind2]--;
        }
        for (int num: freq) {
            if (num != 0) return false;
        }
        return true;
    }
}