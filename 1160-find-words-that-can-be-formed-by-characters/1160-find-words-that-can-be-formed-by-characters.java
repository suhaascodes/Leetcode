class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for (char ch:chars.toCharArray()) {
            freq[ch-'a']++;
        }
        int res = 0;
        for(String word:words) {
            boolean bool = true;
            int[] tempFreq = freq.clone();
            for (char ch:word.toCharArray()) {
                tempFreq[ch-'a']--;
                if (tempFreq[ch-'a'] < 0) bool = false;
            }
            if (bool) res+= word.length();
        }
        return res;
    }
}