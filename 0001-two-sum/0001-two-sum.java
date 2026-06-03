class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            int num = nums[i];
            int required = target-num;
            if (map.containsKey(required)) {
                return new int[] {map.get(required), i};
            }
            map.put(num, i);
        }
        return new int[] {};
    }
}