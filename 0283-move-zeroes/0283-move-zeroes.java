class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nextPos = 0;
        for (int i=0; i<n; i++) {
            if (nums[i] != 0) {
                nums[nextPos++] = nums[i]; 
            }
        }
        while (nextPos < n) {
            nums[nextPos++] = 0;
        }
    }
}