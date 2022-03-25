import java.util.HashMap;
    class Solution {
         public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++) {
                int remainingValue = target - nums[i];
                if(map.containsKey(remainingValue)) return new int[] {map.get(remainingValue), i};
                map.put(nums[i], i);
            }
            return null;
        }
    }
