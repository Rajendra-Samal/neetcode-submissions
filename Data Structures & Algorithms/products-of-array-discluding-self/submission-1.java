class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr  =  new int[nums.length];
        int left =1; 
        int right = 1;

        for(int i=nums.length-1; i>=0; i--){
            arr[i] = right;
            right = right * nums[i];
        }

        for(int i=0; i<nums.length; i++){
            arr[i] = arr[i] * left;
            left = left * nums[i];
        }
        return arr;
    }
}  
