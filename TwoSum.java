/* Problem 26th #100ProblemSolvingChallenge

ProblemLink: https://leetcode.com/problems/two-sum/

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int result = 0;
        int firstValue = 0;
        int secondValue = 0;
        int [] array = new int [2];

        for(int i = 0; i < nums.length; i++){
            firstValue = i;                       // this is first position of our first value
            
            for(int j = i; j < nums.length; j++){

                secondValue = j+1;                 // this is second position of our second value

                if(secondValue == nums.length){
                    secondValue = 0;               // this is for last and first position value calculation
                }

                   result = nums[firstValue] + nums[secondValue];   // sum of our two positioned value

                    if(result == target){                         // here we get our desired 2 positions array
                        array[0] = firstValue; 
                        array[1] = secondValue;

                        break;
                        
                    }

            }
        }

        return array;
    }
}