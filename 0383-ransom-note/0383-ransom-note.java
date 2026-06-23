class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqR = new int[26];
        int[] freqM = new int[26];
        for (char ch:magazine.toCharArray()) {
            freqM[ch-'a']++;
        }
        for (char ch:ransomNote.toCharArray()) {
            freqR[ch-'a']++;
        }
        for (char ch:ransomNote.toCharArray()) {
            if (freqM[ch-'a'] / freqR[ch-'a'] < 1) return false;
        }
        return true;
    }
}