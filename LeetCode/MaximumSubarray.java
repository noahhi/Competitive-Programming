class Solution {
    // DP solution
    public int maxSubArray(int[] nums) {
        int best = nums[0];
        int curr_sum = nums[0];
        for (int i = 1; i < nums.length; i++){
            curr_sum = Math.max(nums[i], curr_sum+nums[i]);
            if (curr_sum > best) best = curr_sum;
        }
        return best;
    }
}
