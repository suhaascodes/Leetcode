class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        ArrayList<String> words = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (char ch:s.toCharArray()) {
            if (ch == ' ') {
                if (word.length() != 0) words.add(word.toString());
                word.setLength(0);
            } else {
                word.append(ch);
            }
        }
        words.add(word.toString());
        for (int i=words.size()-1; i>=0; i--) {
            ans.append(words.get(i));
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}