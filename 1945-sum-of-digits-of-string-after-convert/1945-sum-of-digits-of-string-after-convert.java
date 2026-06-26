class Solution {
    public int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public int getLucky(String s, int k) {
        int sum = 0;
        for (char ch: s.toCharArray()) {
            int num = ch - 'a' + 1;
            sum += digitSum(num);
        }
        for (int i=0; i<k-1; i++) {
            sum = digitSum(sum);
        }
        return sum;
    }
}