class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                low++;
                nums[mid] = nums[low-1];
                nums[low-1] = 0;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                high--;
                nums[mid] = nums[high+1];
                nums[high+1] = 2;
            }
        }
    }
}