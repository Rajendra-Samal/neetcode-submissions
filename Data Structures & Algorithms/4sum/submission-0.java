class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list =  new ArrayList<>();
         Arrays.sort(nums);
         int n = nums.length;

        // first number
        for (int i = 0; i < n - 3; i++) {

            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // second number
            for (int j = i + 1;  j < n - 2;  j++) {
                // skip duplicate j
                if (j > i + 1 &&   nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] +nums[left] + nums[right];

                    // quadruplet found
                    if (sum == target) {

                        list.add(Arrays.asList( nums[i], nums[j], nums[left], nums[right] ));

                        left++;
                        right--;

                        // skip duplicate left
                        while (left < right &&  nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // skip duplicate right
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }

                    // sum too small
                    else if (sum < target) {
                        left++;
                    }

                    // sum too large
                    else {
                        right--;
                    }
                }
            }
        }

        return list;
    }
}