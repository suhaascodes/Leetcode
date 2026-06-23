class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for (char ch:text.toCharArray()) {
            freq[ch - 'a']++;
        }
        int b = freq['b'-'a'];
        int a = freq['a'-'a'];
        int n = freq['n'-'a'];
        int l = freq['l'-'a'] / 2;
        int o = freq['o'-'a'] / 2;
        return Math.min(b, Math.min(a, Math.min(n, Math.min(l, o))));
    }
}