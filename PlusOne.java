Problem Link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/

import java.math.BigInteger;
class Solution {
    
    public int[] plusOne(int[] digits) {
        
        
        ArrayList<String> arrayListOfStringDigit = new ArrayList<String>();
        ArrayList<Integer> arrayListOfIntegerDigits = new ArrayList<Integer>();
        
        String digitInStringFormat = "";
        BigInteger digitInBigIntegerFormat = BigInteger.ZERO;
        
        /**
        Here each int value converted into String then added to a String type Arraylist
        */
        for(int i = 0; digits.length > i; i++){
            
            arrayListOfStringDigit.add(String.valueOf(digits[i]));
            
        }
        
        /**
        Here String value converted into BigInteger then added one with that value
        */
        try{
            
            digitInBigIntegerFormat =               convertStringToBigInteger(concatStringValue(arrayListOfStringDigit)).add(BigInteger.ONE);
            
        }catch (NumberFormatException e) {
             System.out.println("Invalid number format: " + e.getMessage());
        }
        
        /**
        Here BigInteger value converted into String value 
        */
        digitInStringFormat = String.valueOf(digitInBigIntegerFormat);
        
        /**
        Here String value converted into CharArray and each char adding in a ArrayList of Integer after converting those char in Integer
        */
        for (char ch : digitInStringFormat.toCharArray()) {
            arrayListOfIntegerDigits.add(Character.getNumericValue(ch));
        }
        
        /**
        At last Arraylist converted into Array and return it
        */
        return convertArrayListToArray(arrayListOfIntegerDigits);
        
    }
    
    private String concatStringValue(ArrayList<String> arrayListOfStringDigit){
        
        String result = String.join("", arrayListOfStringDigit);
        
        return result;
        
    }
    
    private BigInteger convertStringToBigInteger(String givenStringValue){
        BigInteger bigNumber = BigInteger.ZERO;
        try {
             bigNumber = new BigInteger(givenStringValue);

        } catch (NumberFormatException e) {
             System.out.println("Invalid number format: " + e.getMessage());
        }
        
        return bigNumber;
    }
    
    private int[] convertArrayListToArray(ArrayList<Integer> givenArrayList){
        int[] convertedArrayOfResult = new int[givenArrayList.size()];
        
        for(int j = 0; givenArrayList.size() > j; j++){
            convertedArrayOfResult[j] = givenArrayList.get(j);
        }
        
        return convertedArrayOfResult;
        
    }
}