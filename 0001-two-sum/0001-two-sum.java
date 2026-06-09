class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i=0; i<n; i++) {
            int curr = nums[i];
            int required = target - curr;
            if (map.containsKey(required)) {
                return new int[] {i, map.get(required)};
            }
            map.put(curr, i);
        }
        return new int[] {};
    }
}