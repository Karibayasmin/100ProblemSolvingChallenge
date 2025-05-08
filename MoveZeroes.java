Problem Link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/

class Solution {
    public void moveZeroes(int[] nums) {
        
        long zeroCount = Arrays.stream(nums)              // Turns nums into a stream
                               .filter(num -> num == 0)   // Keeps only 0s
                               .count();                  // Counts remaining items
        
        for(int j = 0; j != zeroCount; j++ ){
            
            for(int i = 1; i < nums.length; i++){
            
            
                if(nums[i-1] == 0){
                    nums[i-1] = nums[i];
                    nums[i] = 0;
                    
                }
            }
        }
        
        
    }
}
