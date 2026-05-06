class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;
        sort(nums, 0, nums.length - 1);  //Call the sort method
        return nums;
    }
    
    private void sort(int[] arr, int low, int high) {  
        if (low >= high) {
            return;
        }
        
        int left = low;   
        int right = high;  
        int pivot = arr[(low + high) / 2];

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        if (low < right) {
            sort(arr, low, right);
        }
        if (left < high) {
            sort(arr, left, high);
        }
    } 
}