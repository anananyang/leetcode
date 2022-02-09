import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < length; i++) {
            int val = target - nums[i];
            Integer idx = map.get(val);
            if(idx != null) {
                return new int[]{i, idx};
            }
            map.put(nums[i], i);
        }


        return null;
    }
}
// @lc code=end

