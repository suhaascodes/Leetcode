class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int evenInd = 0;
        int oddInd = 1;
        boolean evenInc = false;
        boolean oddInc = false;
        while (evenInd < n && oddInd < n) {
            if (nums[evenInd]%2 != 0) {
                evenInc = true;
            } else {
                evenInd+=2;
                evenInc = false;
            }
            if (nums[oddInd]%2 == 0) {
                oddInc = true;
            } else {
                oddInd+=2;
                oddInc = false;
            }
            if (evenInc && oddInc) {
                int temp = nums[oddInd];
                nums[oddInd] = nums[evenInd];
                nums[evenInd] = temp;
            }
        }
        return nums;
    }
}