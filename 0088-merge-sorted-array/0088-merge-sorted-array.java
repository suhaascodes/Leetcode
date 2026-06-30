class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int ind = len-1;
        int ind1 = m-1;
        int ind2 = n-1;
        while (ind1>=0 && ind2>=0 && ind >= 0) {
            if (nums1[ind1] > nums2[ind2]) {
                nums1[ind--] = nums1[ind1--];
            } else {
                nums1[ind--] = nums2[ind2--];
            }
        }
        while (ind2>=0) {
            nums1[ind--] = nums2[ind2--];
        }
    }
}