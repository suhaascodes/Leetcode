class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int max = 1;
        int tempMax = 1;
        for (int i=0; i<n-1; i++) {
            if (nums[i] >= nums[i+1]) tempMax = 1;
            else {
                tempMax++;
                max = Math.max(max, tempMax);
            }
        }
        return max;
    }
}