class Solution {

    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // add positive numbers
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                set.add(nums[i]);
            }
        }

        // find first missing positive
        int ans = 1;

        while (set.contains(ans)) {
            ans++;
        }

        return ans;
    }
}