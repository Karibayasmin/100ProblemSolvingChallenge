Problem Link: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> arrayListOfNums1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayListOfNums2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayListOfintersect = new ArrayList<Integer>();
        
        arrayListOfNums1 = convertArrayToArrayList(nums1);
        arrayListOfNums2 = convertArrayToArrayList(nums2);
        
        Iterator<Integer> iterator = arrayListOfNums1.iterator();
        
        /**
        here 3 operation will occur
        1. update the intersect value in a arraylist
        2. remove from the running iterator that intersect value
        3. remove that intersect value from that arraylist also which one are checking for hasMatched
        */
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (hasMatched(num, arrayListOfNums2)) {
               arrayListOfintersect.add(num);
               iterator.remove();
               arrayListOfNums2.remove(Integer.valueOf(num));
            }
        }   
          
       return convertArrayListToArray(arrayListOfintersect); 
    }
    
    /**
    This method will check if this value exist in this arraylist or not
    */
    private boolean hasMatched(int checkNumber, ArrayList<Integer> CheckArrayList){
        
        boolean isMatched = false;
        
        for(int num : CheckArrayList){
            if(num == checkNumber){
                isMatched = true;
            }
        }
        
        return isMatched;
    }
    
    /**
    This method will convert Array to ArrayList
    */
    private ArrayList<Integer> convertArrayToArrayList(int[] givenArray){
        
        ArrayList<Integer> convertedArrayList = new ArrayList<Integer>();
        
        for(int k = 0; givenArray.length > k; k++){
            convertedArrayList.add(givenArray[k]);
        }
        
        return convertedArrayList;
    }
    
    /**
    This method will convert ArrayList to Array
    */
    private int[] convertArrayListToArray(ArrayList<Integer> arrayListOfintersect){
        int[] arrayOfintersect = new int[arrayListOfintersect.size()];
                
        for(int j = 0; arrayListOfintersect.size() > j; j++){
            arrayOfintersect[j] = arrayListOfintersect.get(j);
        }
        
        return arrayOfintersect;
    }
    
}