class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if (n <= 3) return s;
        int mid = n/2;
        boolean isOdd = (n%2 != 0);
        char midChar = ' ';
        if (isOdd) {
            midChar = s.charAt(mid);
        }
        StringBuilder sb = new StringBuilder();
        String s1 = s.substring(0,mid);
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        StringBuilder rev = new StringBuilder(sorted).reverse();
        if (isOdd) {
            sb.append(sorted);
            sb.append(midChar);
            sb.append(rev);
        } else {
            sb.append(sorted);
            sb.append(rev);
        }
        return sb.toString();
    }
}