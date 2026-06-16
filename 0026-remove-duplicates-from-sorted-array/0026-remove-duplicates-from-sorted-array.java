class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        int prev = nums[0];
        for (int i=0; i<n; i++) {
            if (nums[i]>prev) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                prev = temp;
            }
        }
        return j;
    }
}