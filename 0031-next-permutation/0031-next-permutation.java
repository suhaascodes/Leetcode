class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int left = n-2;
        int right = n-1;
        int pivot = 0;
        boolean swapped = false;
        while (left >= 0 && right > 0) {
            if (nums[right] > nums[left]) {
                pivot = left;
                swapped = true;
                break;
            }
            left--;
            right--;
        }
        if (swapped) {
            for (int i=n-1; i>pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    int temp = nums[pivot];
                    nums[pivot] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            int low = pivot+1;
            int high = n-1;
            while (low < high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        } else {
            int low = 0;
            int high = n-1;
            while (low < high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }
    }
}