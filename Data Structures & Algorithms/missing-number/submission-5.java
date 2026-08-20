class Solution {
    public int missingNumber(int[] nums) {
        
        int missingNumber = nums.length;
        for(int i =0; i< nums.length; i++){
        
        missingNumber = missingNumber+(i - nums[i]);
        }
         
        return missingNumber;
        
    }
}
