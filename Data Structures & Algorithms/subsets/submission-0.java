class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result; 
    }

    // current should be List<Integer>, not List<List<Integer>>
    private void backtrack(int[] nums, int index,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // base case
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include nums[index]
        current.add(nums[index]);
        backtrack(nums, index + 1, current, result);

        // Exclude nums[index] (backtrack)
        current.remove(current.size() - 1);
        backtrack(nums, index + 1, current, result);
    }
}