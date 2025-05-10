class Solution {

  public int removeDuplicates(int[] nums) {
    Set<Integer> uniqueSet = new LinkedHashSet<>();
    for (int num : nums) {
        uniqueSet.add(num);
    }
    int i = 0;
    for (int num : uniqueSet) {
        nums[i++] = num;
    }
    return uniqueSet.size();
}
}