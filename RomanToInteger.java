/* Problem 27th #100ProblemSolvingChallenge

ProblemLink: https://leetcode.com/problems/roman-to-integer/

*/

class Solution {
    public int romanToInt(String s) {
        
        int result = romanCharToInt(s.charAt(0)); // 0 number position value first assigned.
        int nextValue = 0;
        int nextAfterValue = 0;

         for(int i = 1; i < s.length(); i++){
             
            nextValue = romanCharToInt(s.charAt(i)); // nextValue start from 1 number position

            if(i+1 == s.length()){
               nextAfterValue = 0; 
            }else{
               nextAfterValue = romanCharToInt(s.charAt(i+1)); // next after value need to check that's why taken untlil the     //position is equal to lenght;
            }

            if(nextValue < nextAfterValue){   // if nextValue small than nextAfterValue 
                result += (nextAfterValue - nextValue); 
                i++;                         // as already next and nextafter calculation completed that's why 2 times i++ need.


            }else if(result < nextValue){    // if result smaller than nextValue
               result = nextValue - result;
                
            }
            else{
                result += nextValue;        // otherwise every value will be added


            }

            
         }
        
        
        return result;

    }

    int romanCharToInt(char ch){
        if(ch == 'I'){
            return 1;
        }else if(ch == 'V'){
            return 5;
        }else if(ch == 'X'){
            return 10;
        }else if(ch == 'L'){
            return 50;
        }else if(ch == 'C'){
            return 100;
        }else if(ch == 'D'){
            return 500;
        }else if(ch == 'M'){
            return 1000;
        }else{
            return 0;
        }
    }
}