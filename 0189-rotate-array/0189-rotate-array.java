class Solution {
    public void reverse(int[] nums, int i, int j) {
        while (i<j) {
            int temp = nums [i];
            nums [i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int i = 0;
        int j = n-1;
        reverse(nums, i, j);
        i = 0;
        j = k-1;
        reverse(nums, i, j);
        i = k;
        j = n-1;
        reverse(nums, i, j);
    }
}