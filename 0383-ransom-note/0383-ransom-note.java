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
        for (int i = 0; i < 26; i++) {
            if (freqM[i] < freqR[i]) return false;
        }
        return true;
    }
}