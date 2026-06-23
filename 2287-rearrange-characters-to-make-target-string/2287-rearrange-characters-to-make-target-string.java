class Solution {
    public int rearrangeCharacters(String s, String target) {
       int[] freqS = new int[26];
       int[] freqTarget = new int[26];
        for (char ch:s.toCharArray()) {
            freqS[ch-'a']++;
        }
        for (char ch:target.toCharArray()) {
            freqTarget[ch-'a']++;
        }
        int min = Integer.MAX_VALUE;
        for (char ch:target.toCharArray()) {
            min = Math.min(min, freqS[ch-'a'] / freqTarget[ch-'a']);
        }
        return min;
    }
}