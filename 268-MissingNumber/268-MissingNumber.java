class Solution {
    public int missingNumber(int[] nums) {
      int end=nums.length;
      int start=0;
      int mid=(start+end)/2;
      Arrays.sort(nums);
      while(start<end){
        mid=(start+end)/2;
        if(nums[mid]>mid) end=mid;
        else start=mid+1;
      }
      return start;
    }
   
}