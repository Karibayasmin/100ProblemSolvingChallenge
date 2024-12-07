Problem Link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

class Solution {
    public int singleNumber(int[] nums) {
        
        /**
        Though The time complexity of this solution is O(n^2)
        */
        
        int singleNumber = 0;
        
        for(int num : nums){
            
            if(checkSingleNumber(num, nums) == true){
                singleNumber = num;
            }
            
        }     
        
        
        return singleNumber;
    }
    
    /**
    this method checks each value of array, is that single or not.
    */
    private boolean checkSingleNumber(int checkNum, int[] checkArray){
        
        boolean isSingle = false;
        int count = 0;
        
        for(int iterationNum : checkArray){
            if(iterationNum == checkNum){
                count++;
            }
        }
        
        if(count == 1){
            
            isSingle = true;
        }else{
            count = 0;
        }
        
        return isSingle;
    }
}