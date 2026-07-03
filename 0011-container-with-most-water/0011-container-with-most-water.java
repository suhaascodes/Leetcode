class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while (left < right) {
            int level = Math.min(height[left], height[right]);
            int area = (right-left) * level;
            maxArea = Math.max(maxArea, area);
            if (height[left] <= height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            }
        }
        return maxArea;
    }
}