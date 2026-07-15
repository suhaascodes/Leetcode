class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char ch:s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
        String original = sb.toString();
        String rev = sb.reverse().toString();
        if (original.equals(rev)) return true;
        return false;
    }
}