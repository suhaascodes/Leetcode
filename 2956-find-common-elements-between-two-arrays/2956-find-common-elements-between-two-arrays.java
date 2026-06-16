class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        for(int num:nums1) {
            n1.add(num);
        }
        for(int num:nums2) {
            n2.add(num);
        }
        int ans1 = 0;
        int ans2 = 0;
        for(int num:nums1) {
            if (n2.contains(num)) ans1++;
        }
        for(int num:nums2) {
            if (n1.contains(num)) ans2++;
        }
        return new int[]{ans1,ans2};
    }
}