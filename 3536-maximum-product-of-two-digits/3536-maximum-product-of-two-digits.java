class Solution {
    public int maxProduct(int n) {
        int ans = 1;
        int[] freq = new int[10];
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
        int i = 9;
        int c = 0;
        while (i>=0 && c < 2) {
            if (freq[i] > 0) {
                ans *= i;
                freq[i]--;
                c++;
            } else {
                i--;
            }
        }
        return ans;
    }
}