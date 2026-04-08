
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sb = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];

            if (sb.containsKey(result)) {
                return new int[]{sb.get(result), i};
            }

            sb.put(nums[i], i);
        }

        return new int[]{-1, -1}; // fallback (optional)
    }
}