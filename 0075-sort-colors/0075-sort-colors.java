class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for (int num:nums) {
            if (num == 0) c1++;
            else if (num == 1) c2++;
            else c3++;
        }
        int ind = 0;
        while (c1-- > 0) nums[ind++] = 0;
        while (c2-- > 0) nums[ind++] = 1;
        while (c3-- > 0) nums[ind++] = 2;
    }
}