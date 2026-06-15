class Solution {
    public int reverse(int x) {
        long rev = 0;
        boolean isNegative = x < 0;
        x = Math.abs(x);
        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x/= 10;        
        } 
        if ((isNegative && rev < Integer.MIN_VALUE) || rev > Integer.MAX_VALUE) return 0;
        if (isNegative) return (int)(0-rev);
        return (int)rev;
    }
}