class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0;
        int right = n-1;
        int ind = n-1;
        while (left < right) {
            if (nums[left] * nums[left] < nums[right] * nums[right]) {
                res[ind--] = nums[right] * nums[right];
                right--;
            } else {
                res[ind--] = nums[left] * nums[left];
                left++;
            }
        }
        res[0] = nums[left] * nums[left];
        return res;
    }
}