package com.zhaofukai.leetcode;

/**
 * @author: by zhaofukai
 */
public class JumpGameII {

    public static void main(String[] args) {
        Solution solution = new JumpGameII().new Solution();
        //int[] test = {1,2,1,1,1};
        int[] test = {3,2,1,1,1};
        System.out.println(solution.jump(test));
    }

    public class Solution {
        public int jump(int[] nums) {
            int length = nums.length;
            if (length <= 1) {
                return 0;
            }
            int id = 0;
            int ans = 1;
            boolean isSuccess = false;
            while (id < length) {
                if (nums[id] == 0) {
                    break;
                }
                int tmpMax = id + nums[id];
                if (length - 1 <= tmpMax) {
                    isSuccess = true;
                    break;
                }
                int tmpId = id + 1;
                tmpMax = 0;
                int l = id + 1, r = id + nums[id];
                r = r >= length ? length - 1 : r;
                while(l <= r) {
                    if (tmpMax <= (l + nums[l])) {
                        tmpMax = l + nums[l];
                        tmpId = l;
                    }
                    l++;
                }
                ans++;
                id = tmpId;
            }
            return isSuccess ? ans : -1;
        }
    }
}
