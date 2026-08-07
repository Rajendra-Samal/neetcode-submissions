class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (frequencyMap.containsKey(num)) {
                return num;
            }
            frequencyMap.put(num, 1);
        }
        
        return -1;
    }
}