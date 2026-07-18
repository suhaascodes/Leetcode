class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int len = strs[0].length();
        int j=0;
        for (int i=0; i<len; i++) {
            char ch = strs[0].charAt(i);
            for (String str:strs) {
                if (i >= str.length() || str.charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}