class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        int ind = 0;
        for (int num:nums1) {
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i=m-1; i>=0; i--) {
                if (num == nums2[i]) break;
                else if (nums2[i] > num) {
                    stack.push(nums2[i]);
                }
            }
            if (stack.isEmpty()) {
                ans[ind++] = -1;
            } else {
                ans[ind++] = stack.peek();
            }
        }
        return ans;
    }
}