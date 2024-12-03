class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = -1;
        int count = 0;

        // Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Validate the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
    
          // If count is greater than n / 2, return the candidate; otherwise, return -1
        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}