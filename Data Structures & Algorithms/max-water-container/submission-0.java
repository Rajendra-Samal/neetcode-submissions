class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxWater =0;
        while(left < right){
            int width = right - left;
            int ht = Math.min(heights[left], heights[right]);
            int currWater = width * ht;
            maxWater = Math.max(maxWater, currWater);

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
