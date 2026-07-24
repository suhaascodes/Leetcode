class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        HashMap <Integer, Integer> map = new HashMap<>();
        Deque <Integer> stack = new ArrayDeque<>();
        for (int i=m-1; i>=0; i--) {
            int num = nums2[i];
            while (stack.size() > 0 && stack.peek() <= num) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                map.put(num, stack.peek());
            } else {
                map.put(num, -1);
            }
            stack.push(num);
        }
        for (int i=0; i<n; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}