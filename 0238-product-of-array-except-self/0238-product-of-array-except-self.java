class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pref[] = new int[n];
        int suf[] = new int[n];
        int ans[] = new int[n];
        int preind = 1;
        pref[0] = 1;
        int preprod = nums[0];
        while (preind < n) {
            pref[preind] = preprod;
            if (!(preind >= n)) preprod *= nums[preind];
            preind++;
        }
        int sufind = n-2;
        int sufprod = nums[n-1];
        suf[n-1] = 1;
        while (sufind >= 0) {
            suf[sufind] = sufprod;
            if (!(sufind < 0)) sufprod *= nums[sufind];
            sufind--;
        }
        int i = 0;
        while (i < n) {
            ans[i] = pref[i] * suf[i];
            i++;
        }
        return ans;
    }
}