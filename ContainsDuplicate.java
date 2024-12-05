Problem Link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        boolean isDuplicate = false;
        
        /**
        The HashSet avoids the linear search that ArrayList requires for contains. By switching to HashSet, 
        the function can handle large inputs efficiently without  exceeding time limits.
        */
        HashSet<Integer> checklist = new HashSet<Integer>();
            
            for(int i = 0; nums.length > i; i++){
                
                if(checklist.contains(nums[i])){
                    
                    isDuplicate = true;
                    break;
                    
                }else{
                    checklist.add(nums[i]);
                }
                
            }
        return isDuplicate;
    }
}