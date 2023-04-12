/* Problem 28th #100ProblemSolvingChallenge

ProblemLink: https://leetcode.com/problems/longest-common-prefix/

*/

class Solution {
    public String longestCommonPrefix(String[] strs) {

    StringBuilder sb = new StringBuilder();
    String firstValue = strs[0];
    String secondValue = "";

    if(strs.length == 1){
        return strs[0];      // if there is no another value to compare then it itself is the answer.
    }

     for(int i = 1; i < strs.length; i++){

         secondValue = strs[i];               // every time we will get here our second value.

         System.out.println("secondValue: "+(secondValue));

         int length = getSmallerLengthWord(firstValue.length(), secondValue.length());  // checking which values length is smaller.

        System.out.println("1 secondValue: "+(length));

         sb.setLength(0);                // making our String builder empty.
        
        for(int j = 0; j < length; j++){         

            System.out.println("1 value: "+(firstValue.charAt(j)));
            System.out.println("2 value: "+(secondValue.charAt(j)));

            if(firstValue.charAt(j) == secondValue.charAt(j)){
                sb.append(firstValue.charAt(j));               // if equal equal same then add it to our string builder.
            }else{
                break;                                         // otherwise break the loop.
            }

        }

        firstValue = sb.toString();   // now replace my current commonprefix to our first value
         
     }

      return sb.toString();
    }

    int getSmallerLengthWord(int firstValue, int secondValue){
        int smallerLengthWord = 0;

        if (firstValue > secondValue){
              smallerLengthWord = secondValue;
              System.out.println("smallerLengthWord:"+smallerLengthWord);
         }else{
             smallerLengthWord = firstValue;
         }

        return smallerLengthWord;
    }
}