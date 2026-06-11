class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String str = s.replace("-","");
        StringBuilder res = new StringBuilder();
        int n = str.length();
        int diff = n % k;
        int c = 0;
        for(int i = n-1; i>=0; i--) {
            if (c == k) {
                res.append('-');
                c = 0;
            }
            res.append(Character.toUpperCase(str.charAt(i)));
            c++;
        }
        return res.reverse().toString();
    }
}