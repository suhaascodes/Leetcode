class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int lsum = 0;
        int indl=1;
        for (int i=0; i<n-1; i++) {
            lsum+=nums[i];
            leftSum[indl++] = lsum;
        }
        int rsum = 0;
        int indr = n-2;
        for (int i=n-1; i>=1; i--) {
            rsum+=nums[i];
            rightSum[indr--] = rsum;
        }
        for (int i=0; i<n; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}