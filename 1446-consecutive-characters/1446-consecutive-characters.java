class Solution {
    public int maxPower(String s) {
        int max = 1;
        int tempmax = 1;
        int n = s.length();
        for (int i=0; i<n-1; i++) {
            if (s.charAt(i) != s.charAt(i+1)) tempmax = 1;
            else {
                tempmax++;
                max = Math.max(max, tempmax);
            }
        }
        return max;
    }
}