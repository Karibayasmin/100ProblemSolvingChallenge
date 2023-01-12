/* Problem 23 #100ProblemSolvingChallenge

ProblemLink: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

*/

class Solution {
    public int removeDuplicates(int[] nums) {
                
        int insertIndex = 1;
        
        for(int i = 1; i < nums.length; i++){
            
            // As first value is always unique that's why i = 1 and inserIndex = 1
            
            if(nums[i-1] != nums[i]){  // if previous value is not same as present value then this value is unique
                nums[insertIndex] = nums[i]; // that immediate next unique value is inserting after the very first value.
                insertIndex++; // after inserting unique value, next array position updating here.
            }
        }
        
        return insertIndex;
        
    }
}