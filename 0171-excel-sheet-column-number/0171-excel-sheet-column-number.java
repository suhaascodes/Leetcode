class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length()-1;
        int ans = 0;
        for (char ch:columnTitle.toCharArray()) {
            ans += (Math.pow(26,n) * (ch - 64));
            n--;
        }
        return ans;
    }
}