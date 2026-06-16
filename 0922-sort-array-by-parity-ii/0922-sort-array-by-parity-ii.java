class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int evenInd = 0;
        int oddInd = 1;
        while (evenInd < n && oddInd < n) {
            if (nums[evenInd]%2 == 0) {
                evenInd+=2;
            }
            else if (nums[oddInd]%2 != 0) {
                oddInd+=2;
            }
            else {
                int temp = nums[oddInd];
                nums[oddInd] = nums[evenInd];
                nums[evenInd] = temp;
                oddInd+= 2;
                evenInd+= 2;
            }
        }
        return nums;
    }
}