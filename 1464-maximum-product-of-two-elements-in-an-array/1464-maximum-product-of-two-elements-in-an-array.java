class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int greatest = Integer.MIN_VALUE;
        int greatest2 = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            if (nums[i] > greatest) {
                greatest2 = greatest;
                greatest = nums[i];
            } else if (nums[i] > greatest2) {
                greatest2 = nums[i];
            }
        }
        return ((greatest2-1) * (greatest-1));
    }
}