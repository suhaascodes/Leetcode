class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        int ind = 0;
        for (int i=0; i<n; i++) {
            int num = Integer.MAX_VALUE;
            for (int j=0; j<m; j++) {
                if (nums1[i] == nums2[j]) {
                    num = nums1[i];
                }
                if (nums2[j] > num) {
                    ans[ind++] = nums2[j];
                    break;
                }
                if (j == m-1 && nums2[j] <= num) {
                    ans[ind++] = -1;
                    break;
                }
            }
        }
        return ans;
    }
}