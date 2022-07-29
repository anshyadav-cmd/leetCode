class Solution {
    public void moveZeroes(int[] nums) {
        int noOfZero  = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] == 0) {
                noOfZero++;
            }
            else if (noOfZero > 0) {
                nums[i-noOfZero] = nums[i];
                nums[i] = 0;
            }
        }
    }
}