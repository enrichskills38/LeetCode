class Solution {
    public static void main(String[] args) {
    int[] nums = new int[] {2,7,11,15};
    int[] nums1= new int[] {3,2,4};
    int[] nums2= new int[] {3,3};
    
	twoSum(nums,9);
	twoSum(nums1,6);
	twoSum(nums2,6);
	}

	 public static int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> resultantMap = new HashMap<>();
       for(int i=0; i<nums.length; i++){
        int complement = target - nums[i];
        if (resultantMap.containsKey(complement)){
            return new int[]{resultantMap.get(complement),i};
        }
        resultantMap.put(nums[i],i);
       }
       return new int[]{-1,-1};
    }
}