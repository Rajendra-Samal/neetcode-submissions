class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0; // Keeps track of the farthest index
        for (int i = 0; i < nums.length; i++) {
            if (i > maxIndex) {
                return false;
            }
            // Update the maximum reachable index from this position if possible
            if (maxIndex < i + nums[i]) {
                maxIndex = i + nums[i];
            }
        }
        return true;
    }
}
