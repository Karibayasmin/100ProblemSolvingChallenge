class Solution {
    
    int temp = 0;
    
    public void rotate(int[] nums, int k) {
        
        /**
        The modulo operator (%) calculates the remainder of the division k/nums.length. This remainder tells us how many steps are actually needed.
        This step necessery because after every 6 steps, the array returns to its original state.
        
        if k > nums.length then k % nums.length = k
        if k < nums.length then k % nums.length = reminder of the division k/nums.length
        
        */
        k = k % nums.length; 
        
        
        reverse(nums, 0, nums.length - 1);
         
        reverse(nums, 0, k-1);
        
        reverse(nums, k, nums.length - 1);
        
    }
    
    private void reverse(int[] nums, int start, int end){
        
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
}