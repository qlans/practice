package com.zhaofukai.leetcode;

/**
 * @author: by zhaofukai
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new ClimbingStairs().new Solution();
        System.out.println(solution.climbStairs(2));
    }

    public class Solution {
        public int climbStairs(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }
            int a = 1, b = 1;
            int ret = 0;
            for (int i = 2; i <= n; i++) {
                ret = a + b;
                int tmp = a;
                a = ret;
                b = tmp;
            }
            return ret;
        }
    }
}
