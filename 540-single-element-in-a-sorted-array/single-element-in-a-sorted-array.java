class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Edge cases
            if (mid == 0 && nums[mid] != nums[mid + 1]) return nums[mid];
            if (mid == n - 1 && nums[mid] != nums[mid - 1]) return nums[mid];
            
            // If mid is the single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            
            // Binary search pattern
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Should never happen for valid input
    }
}
