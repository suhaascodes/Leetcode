class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int minSum = nums[0];
        int currSum = nums[0];
        for (int i=1; i<n; i++) {
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        currSum = nums[0];
        for (int i=1; i<n; i++) {
            currSum = Math.min(nums[i], currSum+nums[i]);
            minSum = Math.min(minSum, currSum);
        }
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}