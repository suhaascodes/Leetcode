class Solution {
    public String largestGoodInteger(String num) {
        int len = num.length();
        int max = Integer.MIN_VALUE;
        for (int i=0; i<len-2; i++) {
            int curr = num.charAt(i) - '0';
            if (curr == num.charAt(i+1) - '0' && curr == num.charAt(i+2) - '0') {
                max = Math.max(max, curr);
            }
        }
        if (max < 0) return "";
        return String.valueOf(max).repeat(3);
    }
}