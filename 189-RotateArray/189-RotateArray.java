public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
        //(1) new array; 
        int[] oldNums = nums.clone();
        for(int i = 0; i< nums.length;i++){
            nums[(i+k)%nums.length] = oldNums[i]; 
        }
        
        //(2) reverse 3 times 
        // reverse(nums, 0, nums.length-1); 
        // reverse(nums, 0, k-1);
        // reverse(nums, k, nums.length-1); 
        
        //(3) move k times
        // while(k-->0){
        //     int tmp = nums[nums.length-1];
        //     for(int i = nums.length-1; i>0; i--){
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0] = tmp; 
        // }
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start]; 
            nums[start] = nums[end]; 
            nums[end]=temp; 
            start++; end--; 
        }
    }
}