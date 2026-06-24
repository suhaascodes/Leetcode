class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i=0; i<n-2; i++) {
            int left = i+1;
            int right = n-1; 
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) return target;
                int diff = Math.abs(sum-target);
                if (diff < minDiff) {
                    minDiff = diff;
                    res = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}