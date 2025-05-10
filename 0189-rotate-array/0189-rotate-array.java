class Solution {
   public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n; // In case k > n
    int[] rotated = new int[n];
    for (int i = 0; i < n; i++) {
        rotated[(i + k) % n] = nums[i];
    }
    // Copy rotated array back to nums
    for (int i = 0; i < n; i++) {
        nums[i] = rotated[i];
    }
}
}