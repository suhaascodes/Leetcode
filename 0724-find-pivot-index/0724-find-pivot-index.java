class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int lsum = 0;
        int lind = 1;
        for (int i=0; i<n-1; i++) {
            lsum += nums[i];
            leftSum[lind++] = lsum;
        }
        int rsum = 0;
        int rind = n-2;
        for (int i=n-1; i>=1; i--) {
            rsum += nums[i];
            rightSum[rind--] = rsum;
        }
        for (int i=0; i<n; i++) {
            if (leftSum[i] == rightSum[i]) return i;
        }
        return -1;
    }
}