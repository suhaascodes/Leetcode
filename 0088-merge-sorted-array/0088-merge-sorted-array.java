class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int[] res = new int[len];
        int ind = 0;
        int ind1 = 0;
        int ind2 = 0;
        while (ind1 < m && ind2 < n) {
            if (nums1[ind1] < nums2[ind2]) {
                res[ind++] = nums1[ind1++];
            } else {
                res[ind++] = nums2[ind2++];
            }
        }
        while (ind1 < m && ind2 >= n) {
            res[ind++] = nums1[ind1++];
        }
        while (ind1 >= m && ind2 < n) {
            res[ind++] = nums2[ind2++];
        }
        for (int i=0; i<len; i++) {
            nums1[i] = res[i];
        }
    }
}