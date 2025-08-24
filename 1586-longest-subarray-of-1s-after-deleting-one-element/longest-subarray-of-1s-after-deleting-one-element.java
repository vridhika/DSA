class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeros = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            while (zeros > 1) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            // window size is (right - left + 1), but we must delete one element
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen - 1; // because one deletion is mandatory
    }
}
