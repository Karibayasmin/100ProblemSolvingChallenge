/* Problem 25th #100ProblemSolvingChallenge

ProblemLink: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/

*/

class Solution {
    public int maxProfit(int[] prices) {
        
        int lowestPrice = 0;
        int highestPrice = 0;
        int profit = 0;    
        
        int foundLowesPrice = 0;

     
        for(int i = 1; i < prices.length; i++){

            
                if((prices[i-1]) < prices[i]){  // if first value is smaller than 2nd value
                    
                    if(foundLowesPrice == 0){   // lowest price not founded yet enter then
                        foundLowesPrice++; 
                        lowestPrice = (prices[i-1]);  // got my first lowest price
                    } 

                }
            
            
               if((prices[i-1]) < prices[i]){
                                                                                            
                    highestPrice = prices[i];    // highest price found
                    
                    System.out.println("highestPrice: "+highestPrice);
                    System.out.println("lowestPrice: "+lowestPrice);

                   
                   if(highestPrice != 0){   // highest price not 0
                     
                      System.out.println("Profit: "+highestPrice+","+lowestPrice);
			 
		      /* As I have now highest price, now I              
                      can earn profit*/
                                                      
                      profit += highestPrice - lowestPrice;  
                      
                      foundLowesPrice = 0; // profit found and now lowest price again made 0,
                   
                   }

               }
                
            
        }
        
        
        return profit;
        
    }
}