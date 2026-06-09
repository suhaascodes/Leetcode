class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        for (int i=0; i<strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (String str:strs) {
                if (i == str.length() || str.charAt(i) != ch) {
                    return res.toString();
                }
            }
            res.append(ch);
        }
        return res.toString();
    }
}